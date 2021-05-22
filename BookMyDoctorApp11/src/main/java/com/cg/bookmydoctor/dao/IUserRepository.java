package com.cg.bookmydoctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookmydoctor.dto.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
