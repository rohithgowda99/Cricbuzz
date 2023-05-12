package com.cricbuzz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricbuzz.Model.cricbuzz;
import com.cricbuzz.exception.ResourceNotFoundException;
import com.cricbuzz.repository.cricbuzzRepository;
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

@Service
	public class cricbuzzService {

	    @Autowired
	    private cricbuzzRepository cricbuzzRepository;

	    public List<cricbuzz> getAllMatches() {
	        return cricbuzzRepository.findAll();
	    }

	    public cricbuzz addMatch(cricbuzz cricbuzz) {
	        return cricbuzzRepository.save(cricbuzz);
	    }
		

		public List<cricbuzz> getMatchesByForm(String form) {
			 return cricbuzzRepository.findByForm(form);
		}
	   
}
