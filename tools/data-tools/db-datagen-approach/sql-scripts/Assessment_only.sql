/****** Script for SelectTopNRows command from SSMS  ******/
SELECT a.AssessmentTitle
      ,ast.CodeValue as AcademicSubjectType
      ,glt.CodeValue as AssessedGradeLevelType
      ,a.Version
      ,act.CodeValue as AssessmentCategoryType
      ,a.LowestAssessedGradeLevelTypeId
      ,cst.CodeValue as ContentStandardType
      ,a.AssessmentForm
      ,a.RevisionDate
      ,a.MaxRawScore
      ,a.Nomenclature
      ,apd.CodeValue as AssessmentPeriodDescriptor
  FROM EdFi.edfi.Assessment a
  LEFT JOIN EdFi.edfi.AcademicSubjectType ast ON a.AcademicSubjectTypeId = ast.AcademicSubjectTypeId
  LEFT JOIN EdFi.edfi.GradeLevelType glt ON a.AssessedGradeLevelTypeId = glt.GradeLevelTypeId
  LEFT JOIN EdFi.edfi.AssessmentCategoryType act ON a.AssessmentCategoryTypeId = act.AssessmentCategoryTypeId
  LEFT JOIN EdFi.edfi.ContentStandardType cst ON a.ContentStandardTypeId = cst.ContentStandardTypeId
  LEFT JOIN EdFi.edfi.AssessmentPeriodDescriptor apd ON a.AssessmentPeriodDescriptorId = apd.AssessmentPeriodDescriptorId
  �