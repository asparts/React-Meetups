package com.asparts.reactdemo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asparts.reactdemo.model.Meetup;
import com.asparts.reactdemo.service.MeetupService;

@RestController
@RequestMapping("/meetups")
public class MeetupController {

	
	@Autowired
	MeetupService meetupService;
	
	@CrossOrigin(origins = {"http://localhost:3000","http://localhost:8080","http://localhost:1"})
	@GetMapping("")
	public List<Meetup> list(){
		return meetupService.listAllMeetup();
	}
	@GetMapping("/meetup/{id}")
	public ResponseEntity<Meetup> get(@PathVariable Integer id){
		try {
			Meetup meetup = meetupService.getMeetup(id);
			return new ResponseEntity<Meetup>(meetup, HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<Meetup>(HttpStatus.NOT_FOUND);
		}
	}
	@CrossOrigin(origins = {"http://localhost:3000","http://localhost:3000/new-meetup","http://localhost:8080","http://localhost:8080/meetups/post/","http://localhost:1"})
	@PostMapping("/post/")
	public void add(@RequestBody Meetup meetup) {
		

		meetupService.saveMeetup(meetup);
		
	}
	
	
	@PutMapping("/put/meetup/{id}")
	public ResponseEntity<?> update(@RequestBody Meetup meetup, @PathVariable Integer id){
		try {
			//TODO: THIS DOESNT MAKE MUCH SENSE HERE.. 
			Meetup existMeetup = meetupService.getMeetup(id);
			meetup.setId(id);
			meetupService.saveMeetup(meetup);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/delete/meetup/{id}")
    public void delete(@PathVariable Integer id) {

        meetupService.deleteMeetup(id);
    }
	
}
