package com.Dextris.demoRegistration.repo;

import com.Dextris.demoRegistration.dto.CollegeDto;
import com.Dextris.demoRegistration.entity.College;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollegeRepository extends MongoRepository<College, String> {
    List<College> findByState(String state);
}
