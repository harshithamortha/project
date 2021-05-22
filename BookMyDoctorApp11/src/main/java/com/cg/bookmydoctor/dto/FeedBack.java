package com.cg.bookmydoctor.dto;

public class FeedBack {
	
	private int ratingId;
	private Patient patient;
	private Doctor doctor;
	private int rating;
	private String feedback;
	
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	@Override
	public String toString() {
		return "FeedBack [ratingId=" + ratingId + ", patient=" + patient + ", doctor=" + doctor + ", rating=" + rating
				+ ", feedback=" + feedback + "]";
	}
	

}
