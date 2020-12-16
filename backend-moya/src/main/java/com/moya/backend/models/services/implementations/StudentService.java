package com.moya.backend.models.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.moya.backend.models.dao.IStudent;
import com.moya.backend.models.entity.Student;
import com.moya.backend.models.services.interfaces.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired //Inyección de dependencias
	private IStudent dao;
	
	@Override
	@Transactional
	public void save(Student student) {
		try {
			dao.save(student);
		}
		catch(Exception ex) {
			throw ex;
		}
	}

	@Override
	@Transactional(readOnly=true)
	public Student findById(Long id) {
		
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		try {
			
			dao.deleteById(id);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return (List<Student>) dao.findAll();
	}

}
