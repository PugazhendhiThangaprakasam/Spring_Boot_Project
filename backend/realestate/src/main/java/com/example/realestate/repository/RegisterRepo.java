package com.example.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.realestate.model.RegisterModel;

@Repository
public interface RegisterRepo extends JpaRepository<RegisterModel,String>
{
    
}
