package com.cg.bookmydoctor.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.bookmydoctor.dto.Appointment;
import com.cg.bookmydoctor.dto.Doctor;
import com.cg.bookmydoctor.exception.AppointmentException;
import com.cg.bookmydoctor.repository.IAppointmentRepository;
import com.cg.bookmydoctor.service.IAppointmentService;


@Service
public class AppointmentServiceImpl implements IAppointmentService {
	
	@Autowired
	private IAppointmentRepository appointmentrepository;
	
	private Appointment appointment;
	
	@Override
	public List<Appointment> getAllAppointments() {
		return appointmentrepository.findAll();
	}

	@Override
	public Appointment getAppointment(int appointmentId) {
        Optional<Appointment> appointmentDb = this.appointmentrepository.findById(appointmentId);
		if(appointmentDb.isPresent()) {
			return appointmentDb.get();
		}else {
			throw new AppointmentException("Record not found with id : " + appointmentId);
		}
	}
	
	
	@Override
	public boolean deleteAppointment(int appointmentId) {
		if(appointmentId == appointment.getAppointmentId()) {
			appointmentrepository.deleteById(appointmentId);
			return true;		
		} 
		return false;
		
	}

	@Override
	public boolean updateAppointment(Appointment bean) {
		
		if(bean.getAppointmentId() == appointment.getAppointmentId()) {
			appointment.setAppointmentId(bean.getAppointmentId());
			appointment.setDoctor(bean.getDoctor());
			appointment.setPatient(bean.getPatient());
			appointment.setAppointmentDate(bean.getAppointmentDate());
			appointment.setAppointmentStatus(bean.getAppointmentStatus());
			return true;		
		}
		return false;
	}
    

	@Override
	public List<Appointment> getAppointments(Doctor doc) {
		List<Appointment> appt  = new ArrayList<>();
		if(appointment.getDoctor() == doc) {
			appt.add(appointment);
		}
		return appt;
	}

	@Override
	public List<Appointment> getAppointments(LocalDate doc) {
		LocalDate localDate = appointment.getAppointmentDate().toLocalDate();
		List<Appointment> appt  = new ArrayList<>();
		if(localDate == doc) {
			appt.add(appointment);	
		}
		return appt;
	}
}