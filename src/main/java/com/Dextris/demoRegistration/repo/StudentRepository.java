package com.Dextris.demoRegistration.repo;


import com.Dextris.demoRegistration.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    boolean existsByEmail(String email);
    boolean existsByMobileNumber(Long mobileNumber);
}
