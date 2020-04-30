package com.frotas.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frotas.web.domain.Categoria;
import com.frotas.web.repository.CategoriaDao;

@Service @Transactional(readOnly = false)
public class CategoriaServiceImpl implements CategoriaService {
	
	@Autowired
	private CategoriaDao dao;

	@Override
	public void save(Categoria categoria) {
		dao.save(categoria);
		
	}

	@Override
	public void update(Categoria categoria) {
		dao.update(categoria);
		
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Categoria findById(Long id) {
		return findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Categoria> fingdAll() {
		return dao.findAll();
	}
	
	
	

}
