package com.moya.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.moya.backend.models.entity.Subject;

public interface ISubject extends CrudRepository<Subject, Long> {

}
