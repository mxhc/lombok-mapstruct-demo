package com.halcom.lombokmapstructdemo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    
    private UUID id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String address;
    private String randomField;
    private String controlDtoField;
    private Date createdAt;
    private String someField2;
    
    public String getFirstName() {
        return firstName.toUpperCase();
    }
    
}
