package com.halcom.lombokmapstructdemo.mapper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonMappingsTest {
    
    @Test
    void toDate() {
        var date = CommonMappings.toDate("25x02x2020");
        System.out.println(date);
    }
}