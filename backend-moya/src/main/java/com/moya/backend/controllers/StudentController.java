package com.moya.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.moya.backend.models.entity.Student;
import com.moya.backend.models.services.interfaces.IStudentService;


@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private IStudentService service;
	
	@GetMapping("/{id}")
	public Student retrive(@PathVariable(value="id") Long id){
		return service.findById(id);
	};
	
	@GetMapping("")
	public List<Student> list(){
		return service.findAll();
	};
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Student create(@RequestBody Student student) {
		service.save(student);
		return student;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Student update(@RequestBody Student student, @PathVariable Long id) {
		service.save(student);
		return student;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
		
	}
}
