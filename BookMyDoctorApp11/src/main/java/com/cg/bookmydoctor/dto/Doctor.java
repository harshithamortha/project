package com.cg.bookmydoctor.dto;

public class Doctor {

	private int doctorId;
	private String doctorName;
	private String speciality;
	private String location;
	private String hospitalName;
	private long mobileNo;
	private String email;
	private String password;
	private double chargesPerVisit;
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getChargesPerVisit() {
		return chargesPerVisit;
	}
	public void setChargesPerVisit(double chargesPerVisit) {
		this.chargesPerVisit = chargesPerVisit;
	}
	
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", speciality=" + speciality
				+ ", location=" + location + ", hospitalName=" + hospitalName + ", mobileNo=" + mobileNo + ", email="
				+ email + ", password=" + password + ", chargesPerVisit=" + chargesPerVisit + "]";
	}
	
	
}
