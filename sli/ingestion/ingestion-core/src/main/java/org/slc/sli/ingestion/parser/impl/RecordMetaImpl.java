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
package org.slc.sli.ingestion.parser.impl;

import javax.xml.stream.Location;

import org.slc.sli.common.util.logging.SecurityEvent;
import org.slc.sli.ingestion.ActionVerb;
import org.slc.sli.ingestion.ReferenceConverter;
import org.slc.sli.ingestion.parser.RecordMeta;

import java.util.Map;

/**
 * Basic implementation of RecordMeta
 *
 * @author dduran
 *
 */
public final class RecordMetaImpl implements RecordMeta {

    private final String name;
    final String type;
    private String originalType;
    final boolean isList;
    private boolean isReference = false;
    private ActionVerb action;
    private final boolean isCascade;
    Location sourceStartLocation;
    Location sourceEndLocation;
    private Map<String, String> actionAttributes;

    public RecordMetaImpl(String name, String type) {
        this.name = name;
        this.type = type;
        isList = false;
        this.isCascade = false;
        action = ActionVerb.NONE;
    }

    public RecordMetaImpl(String name, String type, boolean isList) {
        this.name = name;
        this.type = type;
        this.isList = isList;
        this.isCascade = false;
        this.action = ActionVerb.NONE;


    }

    public RecordMetaImpl( String name, String type, boolean isList, ActionVerb doWhat ) {
        this.name = name;
        this.type = type;
        this.isList = isList;
        this.action = doWhat;
        this.isCascade = ( doWhat == ActionVerb.CASCADE_DELETE ) ? true : false ;
        if( doWhat.doDelete() && ReferenceConverter.isReferenceType( name ) ) {
            this.isReference = true;
        }
    }

    public RecordMetaImpl( String name, String type, boolean isList, ActionVerb doWhat, Map<String, String> actionAttributes) {
        this(name, type, isList, doWhat);
        this.actionAttributes = actionAttributes;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean isList() {
        return isList;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        int sourceStart = -1;
        if (sourceStartLocation != null) {
            sourceStart = sourceStartLocation.getLineNumber();
        }

        int sourceEnd = -1;
        if (sourceEndLocation != null) {
            sourceEnd = sourceEndLocation.getLineNumber();
        }

        return "<name=" + name + ", type=" + type + ", isList=" + isList + ", startLoc=" + sourceStart + ", endLoc="
                + sourceEnd + ">";
    }

    @Override
    public Location getSourceStartLocation() {
        return sourceStartLocation;
    }

    @Override
    public Location getSourceEndLocation() {
        return sourceEndLocation;
    }

    public void setSourceStartLocation(Location sourceStartLocation) {
        this.sourceStartLocation = sourceStartLocation;
    }

    public void setSourceEndLocation(Location sourceEndLocation) {
        this.sourceEndLocation = sourceEndLocation;
    }

    public void setAction( String name) {
        action = ActionVerb.valueOf( name);

    }

    public void audit(SecurityEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isAction() {
        return action == ActionVerb.NONE ? false : true;
    }

    @Override
    public ActionVerb getAction() {
        return action;
    }

    @Override
    public boolean doCascade() {
        return isCascade;
    }


    @Override
    public boolean isReference() {
        return isReference;
    }

    @Override
    public String getOriginalType() {
        return originalType;
    }

    @Override
    public void setOriginalType(String originalType) {
        this.originalType = originalType;
    }

    public Map<String, String> getActionAttributes() {
        return actionAttributes;
    }

    public void setActionAttributes(Map<String, String> actionAttributes) {
        this.actionAttributes = actionAttributes;
    }
}
