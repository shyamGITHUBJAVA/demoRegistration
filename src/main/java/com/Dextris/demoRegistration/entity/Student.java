package com.Dextris.demoRegistration.entity;



import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value ="student")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {


    @Id
    private String id;
    @NotNull(message = "Email cannot be null")
    private String name;
    @Indexed(unique = true)
    @NotNull(message = "Email cannot be null")
    private String email;
    @NotNull(message = "Email cannot be null")
    private String pwd;
    @Indexed(unique = true)
    @NotNull(message = "Mobile number cannot be null")
    private Long mobileNumber;
    @NotNull(message = "collegeName cannot be null")
    private String collegeName;
    @NotNull(message = "state cannot be null")
    private String state;
    @NotNull(message = "Alternative Mobile number cannot be null")
    private Long alternativeMobileNumber;
    @NotNull(message = "highestQualification cannot be null")
    private String highestQualification;
    @NotNull(message = "yearOfPassedOut cannot be null")
    private Integer yearOfPassedOut;
    @NotNull(message = "domain cannot be null")
    private String domain;
    @NotNull(message = "university cannot be null")
    private String university;
    @NotNull(message = "courseOrProgramming cannot be null")
    private String courseOrProgramming;
    @NotNull(message = "tenthMarks cannot be null")
    private Float tenthMarks;
    @NotNull(message = "pucMarks cannot be null")
    private Float pucMarks;
    @NotNull(message = "engineeringMarks cannot be null")
    private Float engineeringMarks;
    @NotNull(message = "postGraduationMarks cannot be null")
    private Float postGraduationMarks;
    private Integer backlogs;
    private String  workExperience;
    private String  addlComments;

}
