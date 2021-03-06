package com.cg.bookmydoctor.dto;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "APPOINTMENT")
public class Appointment {
	
	@Id
	@Column(name = "appointmentId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int appointmentId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Doctor doctor;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Patient patient;
	
	@Column(name="appointmentDate")
	private LocalDateTime appointmentDate;
	
	@Column(name="appointmentStatus")
	private String appointmentStatus;//approved ,cancelled,completed	
	
	public Appointment() {
		
	}
	
	public Appointment(int appointmentId, LocalDateTime appointmentDate, String appointmentStatus) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentDate =  appointmentDate;
		this.appointmentStatus = appointmentStatus;
	}
	
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDateTime appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentStatus() {
		return appointmentStatus;
	}
	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", doctor=" + doctor + ", patient=" + patient
				+ ", appointmentDate=" + appointmentDate + ", appointmentStatus=" + appointmentStatus + "]";
	}
}