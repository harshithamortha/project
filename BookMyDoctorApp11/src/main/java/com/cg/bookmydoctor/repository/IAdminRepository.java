package com.cg.bookmydoctor.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.bookmydoctor.dto.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Integer> {
	
}