package com.Dextris.demoRegistration.repo;


import com.Dextris.demoRegistration.dto.StudentForm;
import com.Dextris.demoRegistration.entity.College;
import com.Dextris.demoRegistration.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    boolean existsByEmail(String email);
    boolean existsByMobileNumber(Long mobileNumber);

}
