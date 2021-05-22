package com.cg.bookmydoctor.dto;

import java.io.Serializable;
import java.util.Date;

public class AvailabilityDates implements Serializable{

	private static final long serialVersionUID = 1L;
	private int availabilityId;
	private Doctor doctor;
	private Date fromDate;
	private Date toDate;
	public int getAvailabilityId() {
		return availabilityId;
	}
	public void setAvailabilityId(int availabilityId) {
		this.availabilityId = availabilityId;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "AvailabilityDates [availabilityId=" + availabilityId + ", doctor=" + doctor + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + "]";
	}
	
	
}
