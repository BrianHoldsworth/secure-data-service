/*
 * Copyright 2012-2013 inBloom, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.slc.sli.api.security.context.validator;

import java.util.Set;

import org.springframework.stereotype.Component;

import org.slc.sli.common.constants.EntityNames;
import org.slc.sli.common.constants.ParameterConstants;
import org.slc.sli.domain.NeutralCriteria;
import org.slc.sli.domain.NeutralQuery;

/**
 * Validates Write context to a global session.
 */
@Component
public class GenericToGlobalSessionWriteValidator extends AbstractContextValidator {

    @Override
    public boolean canValidate(String entityType, boolean isTransitive) {
        return isTransitive && EntityNames.SESSION.equals(entityType) && !isStudentOrParent();
    }

    @Override
    public boolean validate(String entityType, Set<String> ids) throws IllegalStateException {
        if (!areParametersValid(EntityNames.SESSION, entityType, ids)) {
            return false;
        }

        /*
         * Grab all the Sesssions that are being requested AND contain a
         * reference to a edorg in your edorg hierarchy. Counts should be equal
         * if you can see all the sessions you asked for
         */
        Set<String> edOrgLineage = getEdorgDescendents(getDirectEdorgs());
        NeutralQuery query = new NeutralQuery(new NeutralCriteria(ParameterConstants.ID, NeutralCriteria.CRITERIA_IN, ids, false));
        query.addCriteria(new NeutralCriteria(ParameterConstants.SCHOOL_ID, NeutralCriteria.CRITERIA_IN, edOrgLineage));

        return ids.size() == getRepo().count(entityType, query);
    }
}
