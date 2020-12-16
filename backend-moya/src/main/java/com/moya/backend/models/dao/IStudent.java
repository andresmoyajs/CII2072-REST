package com.moya.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.moya.backend.models.entity.Student;

public interface IStudent extends CrudRepository<Student, Long>{

}
