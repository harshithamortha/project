package com.cg.bookmydoctor.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.bookmydoctor.dto.*;
import com.cg.bookmydoctor.exception.DoctorException;
import com.cg.bookmydoctor.exception.FeedBackException;
import com.cg.bookmydoctor.repository.IFeedbackRepository;
import com.cg.bookmydoctor.service.IFeedbackService;

@Service
public class FeedbackServiceImpl implements IFeedbackService {
	
	@Autowired
	private IFeedbackRepository feedbackRepository;


	@Override
	public FeedBack addFeedback(FeedBack fdb) {
		Optional<FeedBack> feedbackDb = this.feedbackRepository.findById(fdb.getRatingId());
		if(feedbackDb.isPresent()) {
			throw new FeedBackException("Already exists");
		} else if(feedbackDb.isEmpty()){
			throw new DoctorException("Passed object can't be null");
		} else {
			return feedbackRepository.save(fdb);
		}

	}

	@Override
	public FeedBack getFeedback(FeedBack fdb) {
		Optional<FeedBack> feedbackDb = this.feedbackRepository.findById(fdb.getRatingId());
		if(feedbackDb.isPresent()) {
			return feedbackDb.get();
		} 
		else {
			throw new FeedBackException("Record not found with id : " + fdb.getRatingId());
		}
	}
	
	@Override
	public List<FeedBack> getAllFeedback(Doctor doc) {
		return  feedbackRepository.findAll();

	}
}
