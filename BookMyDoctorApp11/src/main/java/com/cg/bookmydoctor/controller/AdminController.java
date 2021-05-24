package com.cg.bookmydoctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookmydoctor.dto.Admin;
import com.cg.bookmydoctor.service.IAdminService;

@RestController
@RequestMapping(value = "/api/admin")
public class AdminController {
	@Autowired
	private IAdminService adminService;
	
	
	@GetMapping("/admins")
	public ResponseEntity<Admin> viewAdmin(@RequestBody Admin admin){
		return ResponseEntity.ok().body(adminService.viewAdmin(admin));
	}
	
	@PostMapping("/addAdmin")
	public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin){
		return ResponseEntity.ok().body(adminService.addAdmin(admin));
	}
	
	@PutMapping("/admins")
	public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin){
		return ResponseEntity.ok().body(adminService.updateAdmin(admin));
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Admin> removeAdmin(@RequestBody Admin admin){
		return ResponseEntity.ok().body(adminService.updateAdmin(admin));
	}
	
	

}
