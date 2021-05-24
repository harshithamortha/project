package com.cg.bookmydoctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.bookmydoctor.dto.Appointment;

public interface IAppointmentRepository extends JpaRepository<Appointment, Integer> {
	
}
