package com.frotas.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.frotas.web.domain.Categoria;
import com.frotas.web.domain.Veiculo;
import com.frotas.web.repository.VeiculoDao;

public class VeiculoServiceImpl implements VeiculoService {
	
	@Autowired
	private VeiculoDao dao;

	@Override
	public void save(Veiculo veiculo) {
		dao.save(veiculo);
		
	}

	@Override
	public void update(Veiculo veiculo) {
		dao.update(veiculo);
		
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Categoria findById(Long id) {
		return findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Veiculo> fingdAll() {
		return dao.findAll();
	}

}
