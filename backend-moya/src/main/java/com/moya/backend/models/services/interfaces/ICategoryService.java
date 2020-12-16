package com.moya.backend.models.services.interfaces;

import java.util.List;

import com.moya.backend.models.entity.Category;

public interface ICategoryService {
	
	
	public Category findById(Long id);
	public List<Category> findAll();
}
