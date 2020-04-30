package com.frotas.web.repository;

import java.util.List;

import com.frotas.web.domain.Categoria;

public interface CategoriaDao {
	
	void save(Categoria categoria);
	void update(Categoria categoria);
	void delete(Long id);
	Categoria findById(Long Id);
	List<Categoria> findAll();
	
}
