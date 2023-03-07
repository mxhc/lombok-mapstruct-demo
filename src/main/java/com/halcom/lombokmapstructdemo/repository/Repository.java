package com.halcom.lombokmapstructdemo.repository;

public interface Repository <T, R>{
    
    T getOne(R id);
    
}
