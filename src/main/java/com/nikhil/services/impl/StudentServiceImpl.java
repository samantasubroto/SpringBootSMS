package com.nikhil.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nikhil.entity.Student;
import com.nikhil.repository.StudentRepository;
import com.nikhil.services.StudentService;

@Component
public class StudentServiceImpl implements StudentService {

	//Autowired
	
	@Autowired
	StudentRepository studentRepository;
	
	
	public List<Student> getAllStudents() {
	    List<Student> list = (List<Student>) studentRepository.findAll();	
		return list;
	}


	@Override
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
	
	public Student findValueById(int id) {
		return studentRepository.findById(id);
	}
	
	public void updateStudent(Student student) {
		studentRepository.save(student);	
	}


	@Override
	public void deleteById(int id) {
		studentRepository.deleteById(id);
	}

}
