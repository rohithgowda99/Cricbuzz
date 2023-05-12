package com.cricbuzz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cricbuzz.Model.cricbuzz;
import com.cricbuzz.exception.ResourceNotFoundException;
import com.cricbuzz.service.cricbuzzService;

public class cricbuzzController {

	
	@RestController
	public class MatchController {

	    @Autowired
	    private cricbuzzService cricbuzzService;

	    @GetMapping(path = "/matches")
	    public ResponseEntity<List<cricbuzz>> getAllMatches() {
	        List<cricbuzz> cricbuzz = cricbuzzService.getAllMatches();
	        return new ResponseEntity<>(cricbuzz, HttpStatus.OK);
	    }

	   
	    @GetMapping("/matches/{formname}")
	    public List<cricbuzz> getMatchesByTeam1(@PathVariable String form) {
	        return cricbuzzService.getMatchesByForm(form);
	    }

	   
	}
}
