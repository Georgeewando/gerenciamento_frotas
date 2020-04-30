package com.frotas.web.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.frotas.web.domain.Fipe;

@Repository
public interface FipeDao{
	
	void save(Fipe fipe);	
	void update(Fipe fipe);
	void delete(Long id);
	Fipe findById(Long Id);
	List<Fipe> findAll();
	
}
