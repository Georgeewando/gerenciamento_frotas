package com.frotas.web.service;

import java.util.List;

import com.frotas.web.domain.Categoria;
import com.frotas.web.domain.Veiculo;

public interface VeiculoService {
	void save(Veiculo veiculo);
	void update(Veiculo veiculo); 
	void delete(Long id); 
	Categoria findById(Long id);
	List<Veiculo> fingdAll();

}
