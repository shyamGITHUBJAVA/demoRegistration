package com.Dextris.demoRegistration.entity;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "collages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class College {
    @Id
    private String collegeName;
    private String state;
    private String district;

}
