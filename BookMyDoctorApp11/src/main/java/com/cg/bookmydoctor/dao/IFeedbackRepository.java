package com.cg.bookmydoctor.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.bookmydoctor.dto.FeedBack;

public interface IFeedbackRepository extends JpaRepository<FeedBack, Integer>{
	
}
