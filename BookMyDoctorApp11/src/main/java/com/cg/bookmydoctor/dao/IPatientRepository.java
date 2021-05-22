package com.cg.bookmydoctor.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.bookmydoctor.dto.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Integer> {

	
}
