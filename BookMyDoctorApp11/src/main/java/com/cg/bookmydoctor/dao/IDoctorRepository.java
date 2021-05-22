package com.cg.bookmydoctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.bookmydoctor.dto.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer> {

}
