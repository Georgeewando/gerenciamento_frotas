package com.frotas.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.frotas.web.domain.Fipe;
import com.frotas.web.repository.FipeDao;


@Service @Transactional(readOnly = false)
public class FipeServiceImpl implements FipeService {
	
	@Autowired
	private FipeDao dao;
	

	@Override
	public void save(Fipe fipe) {
		dao.save(fipe);
		
	}

	@Override
	public void update(Fipe fipe) {
		dao.update(fipe);
		
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Fipe findById(Long id) {
		return findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Fipe> fingdAll() {
		return dao.findAll();
	}
	
	
	
	

}
