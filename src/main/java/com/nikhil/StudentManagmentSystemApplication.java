package com.nikhil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nikhil.entity.Student;
import com.nikhil.repository.StudentRepository;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) { 
		 SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}

	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
	     
		/*
		 * Student s1 = new Student("Ramesh","Solanki","ramesh@gmail.com");
		 * studentRepository.save(s1); Student s2 = new
		 * Student("Bishwanath","Banerjee","bishwanath@gmail.com");
		 * studentRepository.save(s2);
		 */
		
		
	}

}
