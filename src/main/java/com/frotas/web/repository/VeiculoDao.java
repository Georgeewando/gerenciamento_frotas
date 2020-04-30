package com.frotas.web.repository;

import java.util.List;

import com.frotas.web.domain.Categoria;
import com.frotas.web.domain.Veiculo;

public interface VeiculoDao {
	void save(Veiculo veiculo);
	void update(Veiculo veiculo);
	void delete(Long id);
	Veiculo findById(Long Id);
	List<Veiculo> findAll();

}
