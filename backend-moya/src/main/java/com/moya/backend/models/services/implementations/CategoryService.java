package com.moya.backend.models.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.moya.backend.models.dao.ICategory;
import com.moya.backend.models.entity.Category;
import com.moya.backend.models.services.interfaces.ICategoryService;

@Service
public class CategoryService implements ICategoryService {
	
	@Autowired //Inyección de dependencias
	private ICategory dao;
	


	@Override
	@Transactional(readOnly=true)
	public Category findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}



	@Override
	public List<Category> findAll() {
		return (List<Category>) dao.findAll();
	}

}
