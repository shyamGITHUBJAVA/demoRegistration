package com.Dextris.demoRegistration.service;

import com.Dextris.demoRegistration.dto.CollegeDto;
import com.Dextris.demoRegistration.entity.College;
import com.Dextris.demoRegistration.entity.Student;
import com.Dextris.demoRegistration.dto.StudentForm;
import com.Dextris.demoRegistration.repo.CollegeRepository;
import com.Dextris.demoRegistration.repo.StateRepository;
import com.Dextris.demoRegistration.repo.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {




    @Autowired
    private StateRepository stateRepository;
    @Autowired
    private CollegeRepository collegeRepository;
    @Autowired
    private StudentRepository studentRepository;



    @Override
    public boolean createUserAccount(StudentForm studentForm) {

        try {

            if (studentForm.getEmail() == null || studentForm.getEmail().isEmpty()) {
                throw new IllegalArgumentException("Email cannot be null or empty");
            }
            // Check if email exists

            if (studentRepository.existsByEmail(studentForm.getEmail())) {
                throw new IllegalArgumentException("Email already exists");
            }

            if (studentForm.getMobileNumber() == null) {
                throw new IllegalArgumentException("Mobile number cannot be null or empty");
            }
            // Check if mobile number exists
            if (studentRepository.existsByMobileNumber(studentForm.getMobileNumber())){
                throw new IllegalArgumentException("Phone number already exists");
            }

            // Create a new student object and copy properties from studentForm
            Student student = new Student();
            BeanUtils.copyProperties(studentForm, student);

            // Generate a password and set it
//            student.setPwd(generatePwd());

            // Save the student object to the database
            studentRepository.save(student);

            return true;

        } catch (IllegalArgumentException e) {
            // If there's an exception (e.g., duplicate email or mobile), return false
            System.err.println(e.getMessage());
            return false;

        } catch (Exception e) {
            // Catch any unexpected exceptions
            e.printStackTrace();
            return false;
        }
    }

    public List<CollegeDto> findByState(String state){
        List<College> colleges = collegeRepository.findByState(state);

        // Map the colleges to CollegeDTOs containing only the name
        return colleges.stream()
                .map(college -> new CollegeDto(college.getCollegeName()))  // Convert College to CollegeDTO
                .collect(Collectors.toList());
    }



//    private String generatePwd() {
//        String upperalphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String loweralphabet = "abcdefghijklmnopqrstuvwxyz";
//        String numbers = "0123456789";
//        String specialcharcters = "!@#$%^&*";
//
//        // Combine all strings to form a pool of characters
//        String alphanumeric = upperalphabet + loweralphabet + numbers + specialcharcters;
//
//        StringBuilder sb = new StringBuilder();
//
//        Random random = new Random();
//
//        int length = 9; // Password length
//
//        // Randomly pick characters from the pool
//        for (int i = 0; i < length; i++) {
//            int index = random.nextInt(alphanumeric.length());
//            char randomChar = alphanumeric.charAt(index);
//
//            sb.append(randomChar);
//        }
//
//        return sb.toString();
//    }
}
