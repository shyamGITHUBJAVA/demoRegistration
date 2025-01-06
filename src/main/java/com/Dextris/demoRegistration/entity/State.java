package com.Dextris.demoRegistration.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "states")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class State {
    private String value;
    private String region;
    @Id
    private Integer stateCode;
    @DBRef
    private List<College> colleges;

}
