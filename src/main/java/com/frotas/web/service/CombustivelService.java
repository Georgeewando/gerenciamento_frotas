package com.frotas.web.service;

import java.util.List;


import com.frotas.web.domain.Veiculo;;


public interface CombustivelService {
	void save(Veiculo combustivel);
	void update(Veiculo combustivel); 
	void delete(Long id); 
	Veiculo findById(Long id);
	List<Veiculo> fingdAll();

}
