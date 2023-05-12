package com.cricbuzz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricbuzz.Model.cricbuzz;
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

@Repository
public interface cricbuzzRepository extends JpaRepository<cricbuzz, Long> {

	List<cricbuzz> findByForm(String form);
}


