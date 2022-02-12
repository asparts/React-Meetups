package com.asparts.reactdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asparts.reactdemo.model.Meetup;

@Repository
public interface MeetupRepository extends JpaRepository<Meetup, Integer> {

}
