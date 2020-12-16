package com.moya.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.moya.backend.models.entity.Category;

public interface ICategory extends CrudRepository<Category, Long>{

}
