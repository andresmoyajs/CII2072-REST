package com.moya.backend.models.services.interfaces;

import java.util.List;

import com.moya.backend.models.entity.Student;

public interface IStudentService {
	public void save(Student student);
	public Student findById(Long id);
	public void delete(Long id);
	public List<Student> findAll();
}
