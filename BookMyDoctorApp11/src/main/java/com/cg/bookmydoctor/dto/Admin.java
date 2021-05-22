package com.cg.bookmydoctor.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADMIN")
public class Admin {
    
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="ADMIN_ID", unique=true, nullable=false, precision=10, scale=0)
	private int adminId;
	
	@Column(name = "PHONE_NO")
	private String contactnumber;
	
	@Column(name = "EMAIL",nullable=false, length=200)
	private String email;
	
	@Column(name = "PASSWORD")
	private String password;
	
	public Admin() {
		
	}
	
	public Admin(int adminId, String contactnumber, String email, String password) {
		super();
		this.adminId = adminId;
		this.contactnumber = contactnumber;
		this.email = email;
		this.password = password;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
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

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", contactnumber=" + contactnumber + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	
	
	
	
}
