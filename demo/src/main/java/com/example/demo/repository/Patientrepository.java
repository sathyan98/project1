package com.example.demo.repository;


import com.example.demo.model.Patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component

public interface Patientrepository extends JpaRepository<Patient, Long> {


}
