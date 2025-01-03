package com.Dextris.demoRegistration.entity;



import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value ="student")
@NoArgsConstructor
@AllArgsConstructor
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

    private Long alternativeMobileNumber;
    @NotNull(message = "collegeName cannot be null")
    private String collegeName;
    @NotNull(message = "state cannot be null")
    private String state;
    @NotNull(message = "highestQualification cannot be null")
    private String highestQualification;
    @NotNull(message = "yearOfPassedOut cannot be null")
    private int yearOfPassedOut;
    @NotNull(message = "domain cannot be null")
    private String domain;
    @NotNull(message = "university cannot be null")
    private String university;
    @NotNull(message = "courseOrProgramming cannot be null")
    private String courseOrProgramming;
    @NotNull(message = "tenthMarks cannot be null")
    private float tenthMarks;
    @NotNull(message = "pucMarks cannot be null")
    private float pucMarks;
    @NotNull(message = "engineeringMarks cannot be null")
    private float engineeringMarks;
    @NotNull(message = "postGraduationMarks cannot be null")
    private float postGraduationMarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
