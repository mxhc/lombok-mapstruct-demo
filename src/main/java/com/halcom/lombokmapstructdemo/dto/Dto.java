package com.halcom.lombokmapstructdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dto {
    
    private UUID id;
    private String embeddedObjectId;
    private String someField;
    
}
