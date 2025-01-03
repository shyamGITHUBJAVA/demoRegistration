package com.Dextris.demoRegistration.service;


import com.Dextris.demoRegistration.dto.StudentForm;
import com.Dextris.demoRegistration.entity.Student;

public interface StudentService {

    public boolean createUserAccount(StudentForm studentForm);
}
