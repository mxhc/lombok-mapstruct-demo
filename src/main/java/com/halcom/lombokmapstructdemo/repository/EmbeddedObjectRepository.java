package com.halcom.lombokmapstructdemo.repository;

import com.halcom.lombokmapstructdemo.entity.EmbeddedObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EmbeddedObjectRepository implements Repository<EmbeddedObject, String> {
    
    @Override
    public EmbeddedObject getOne(String id) {
        return EmbeddedObject.builder().id(id).someValue("some-value").build();
    }
}
