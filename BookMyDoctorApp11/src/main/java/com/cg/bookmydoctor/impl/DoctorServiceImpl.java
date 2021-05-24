package com.cg.bookmydoctor.impl;

import java.util.List;    
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.bookmydoctor.dto.*;
import com.cg.bookmydoctor.exception.DoctorException;
import com.cg.bookmydoctor.repository.IDoctorRepository;
import com.cg.bookmydoctor.service.IDoctorService;

@Service
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	private IDoctorRepository doctorRepository;
	private AvailabilityDates ad;

	@Override
	public List<Doctor> getDoctorList(String speciality) {
		return doctorRepository.findBySpeciality(speciality);
	}


	//all the details doctors
	@Override
	public List<Doctor> getDoctorList() {
	
		return doctorRepository.findAll();
	}

	@Override
	public Doctor removeDoctor(Doctor doc) {
		Optional<Doctor> docdb = this.doctorRepository.findById(doc.getDoctorId());
		if(docdb.isPresent()) {
			doctorRepository.deleteById(doc.getDoctorId());			
		} else {
			throw new DoctorException("The passed object can't be null");
		}
		return null;
	}

	public Doctor getDoctor(Doctor doc) {
		Optional<Doctor> docdb = this.doctorRepository.findById(doc.getDoctorId());
		if(docdb.isPresent()) {
			return docdb.get();
		} 
		else {
			throw new DoctorException("Record not found with id : " + doc.getDoctorId());
		}

	}

	@Override
	public Doctor updateDoctorProfile(Doctor bean) {
		Optional<Doctor> docdb = this.doctorRepository.findById(bean.getDoctorId());

		if(docdb.isPresent()) {
			return docdb.get();
		} 
		else {
			throw new DoctorException("Record not found with id : " + bean.getDoctorId());
		}
	}

	@Override
	public Doctor addDoctor(Doctor dr) {
		Optional<Doctor> docdb = this.doctorRepository.findById(dr.getDoctorId());
		if(docdb.isPresent()) {
			throw new DoctorException("Doctor already exists");
		} else if(docdb.isEmpty()){
			throw new DoctorException("Passed object can't be null");
		} else {
			return doctorRepository.save(dr);
		}
	}

	/*public boolean addAvailability(AvailabilityDates bean) {
		if(bean != null) {
			doctorRepository.saveAvailabilityDates(bean);
			return true;
		}	
		return false;
	} */


	public boolean updateAvailability(AvailabilityDates bean) {
		if(bean.getAvailabilityId() == ad.getAvailabilityId()) {
			ad.setAvailabilityId(bean.getAvailabilityId());
			ad.setDoctor(bean.getDoctor());
			ad.setFromDate(bean.getFromDate());
			ad.setToDate(bean.getToDate());
			return true;		
		} 
		return false;
	}



}
