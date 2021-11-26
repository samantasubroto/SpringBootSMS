package com.nikhil.services;

import java.util.*;

import com.nikhil.entity.Student;

public interface StudentService {

	public List<Student> getAllStudents();
	
	public void saveStudent(Student student);
	
	public void updateStudent(Student student);
	
	public Student findValueById(int id);
	
	public void deleteById(int id);
}
