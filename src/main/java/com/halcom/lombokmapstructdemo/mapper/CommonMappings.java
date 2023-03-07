package com.halcom.lombokmapstructdemo.mapper;

import org.mapstruct.Named;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonMappings {
    
    public static Date toDate(String dateString) {
        dateString = dateString.replace("x", "");
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        try {
            return sdf.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Named("someFieldMapper")
    public static String toSomeField2(String someField) {
        return someField.toLowerCase();
    }

}
