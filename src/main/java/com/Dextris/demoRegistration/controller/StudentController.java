package com.Dextris.demoRegistration.controller;

import com.Dextris.demoRegistration.dto.StudentForm;
import com.Dextris.demoRegistration.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<String> createAccount(@Valid @RequestBody StudentForm studentForm)
    {
        boolean status= studentService.createUserAccount(studentForm);

        if (status)
        {
            return new ResponseEntity<>("Registration Success", HttpStatus.CREATED);

        }
        else {
            return  new ResponseEntity<>("Registration Failed",HttpStatus.INTERNAL_SERVER_ERROR);

        }


    }
}