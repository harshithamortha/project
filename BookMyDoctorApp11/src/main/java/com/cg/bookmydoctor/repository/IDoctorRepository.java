package com.cg.bookmydoctor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookmydoctor.dto.AvailabilityDates;
import com.cg.bookmydoctor.dto.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer> {

	List<Doctor> findBySpeciality(String speciality);

	//void saveAvailabilityDates(AvailabilityDates bean);



}
