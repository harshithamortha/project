package com.cg.bookmydoctor.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookmydoctor.dao.IAdminRepository;
import com.cg.bookmydoctor.dto.Admin;
import com.cg.bookmydoctor.exception.AdminException;
import com.cg.bookmydoctor.service.IAdminService;


@Service
public class AdminServiceImpl  implements IAdminService{
	@Autowired
	private IAdminRepository adminRepository;
	
	@Override
	public Admin addAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	
	@Override
	public Admin removeAdmin(Admin admin) {
		return adminRepository.
	}
	
	@Override
	public Admin viewAdmin(Admin admin) {
		Optional<Admin> adminDb = this.adminRepository.findById(admin.getAdminId());
		if(adminDb.isPresent()) {
			return adminDb.get();
		}
		else {
			throw new AdminException("Record not found with id : " + admin.getAdminId());
		}
		
	}
	
	@Override
	public Admin updateAdmin(Admin admin) {
		Optional<Admin> adminDb = this.adminRepository.findById(admin.getAdminId());
		if(adminDb.isPresent()) {
			Admin existingAdmin = adminDb.get();		
			existingAdmin.setContactnumber(admin.getContactnumber());
			existingAdmin.setEmail(admin.getEmail());
			existingAdmin.setPassword(admin.getPassword());
			return adminRepository.save(existingAdmin);
		}
		else {
			throw new AdminException("Record not found with id : " + admin.getAdminId());
		}
		
	}
		
	}

