package com.asparts.reactdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asparts.reactdemo.model.Meetup;
import com.asparts.reactdemo.repository.MeetupRepository;


@Service
@Transactional
public class MeetupService {

	
	@Autowired
	private MeetupRepository meetupRepository;
	
	public List<Meetup> listAllMeetup(){
		return meetupRepository.findAll();
	}
	public void saveMeetup(Meetup meetup) {
		meetupRepository.save(meetup);
		
	}
	public Meetup getMeetup(Integer id) {
		return meetupRepository.findById(id).get();
	}
	public void deleteMeetup(Integer id) {
		meetupRepository.deleteById(id);
	}
	
}
