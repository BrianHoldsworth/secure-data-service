/****** Script for SelectTopNRows command from SSMS  ******/
SELECT c.EducationOrganizationId
	  ,c.EducationOrganizationId as StateOrganizationId
      ,c.IdentityCourseCode
      ,c.CourseTitle
      ,c.NumberOfParts
--      ,c.CourseLevelTypeId
      ,clt.CodeValue as CourseLevel
--      ,c.SubjectAreaTypeId
      ,ast.CodeValue as SubjectArea
      ,c.CourseDescription
      ,c.DateCourseAdopted
      ,c.HighSchoolCourseRequirement
--      ,c.CourseGPAApplicabilityTypeId
      ,cgpaat.CodeValue as CourseGPAApplicability
      ,c.CourseDefinedByTypeId as CourseDefinedBy
      ,c.MinimumAvailableCreditTypeId as MiniCreditType
      ,null as MiniCreditType
      ,c.MinimumAvailableCredit as MiniCredit
      ,c.MaximumAvailableCreditTypeId as MaxCreditType
      ,null as MaxCreditConversion
      ,c.MaximumAvailableCredit as MaxCredit
      ,c.CareerPathwayTypeId as CareerPathway
--      ,c.CompetencyLevelDescriptorId
      ,cld.CodeValue as CompetencyLevelsCodeValue
  FROM EdFi.edfi.Course c
  LEFT JOIN EdFi.edfi.CourseLevelType clt ON c.CourseLevelTypeId = clt.CourseLevelTypeId
  LEFT JOIN EdFi.edfi.AcademicSubjectType ast ON c.SubjectAreaTypeId = ast.AcademicSubjectTypeId
  LEFT JOIN EdFi.edfi.CourseGPAApplicabilityType cgpaat ON c.CourseGPAApplicabilityTypeId = cgpaat.CourseGPAApplicabilityTypeId
  LEFT JOIN EdFi.edfi.CompetencyLevelDescriptor cld ON c.CompetencyLevelDescriptorId = cld.CompetencyLevelDescriptorId
  ORDER BY c.EducationOrganizationId, c.IdentityCourseCode