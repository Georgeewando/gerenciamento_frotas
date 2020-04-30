package com.frotas.web.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frotas.web.domain.Veiculo;
import com.frotas.web.repository.VeiculoDao;

@Service @Transactional(readOnly = false)
public class CombustivelServiceImpl implements CombustivelService{
	
	private VeiculoDao dao;

	@Override
	public void save(Veiculo combustivel) {
		dao.save(combustivel);
		
	}

	@Override
	public void update(Veiculo combustivel) {
		dao.update(combustivel);
		
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Veiculo findById(Long id) {
		return findById(id);
	}

	@Override
	public List<Veiculo> fingdAll() {
		return dao.findAll();
	}


	

}
