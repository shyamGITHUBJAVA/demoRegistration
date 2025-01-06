package com.Dextris.demoRegistration.service;


import com.Dextris.demoRegistration.dto.CollegeDto;
import com.Dextris.demoRegistration.dto.StudentForm;
import com.Dextris.demoRegistration.entity.College;
import com.Dextris.demoRegistration.entity.Student;

import java.util.List;

public interface StudentService {

    public boolean createUserAccount(StudentForm studentForm);

    public List<CollegeDto> findByState(String state);


}
