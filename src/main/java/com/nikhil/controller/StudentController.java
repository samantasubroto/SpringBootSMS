package com.nikhil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nikhil.entity.Student;
import com.nikhil.repository.StudentRepository;
import com.nikhil.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	/**
	 * 
	 * HomePage Mapping 
	 * 
	 */
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("student", studentService.getAllStudents());		
		return "students";
	}
	
	/**
	 * 
	 * Adding new student in database basically this will redirect to 
	 * adding page
	 * 
	 */
	
	@GetMapping("/students/new")
	public String createStudentForum() {
		System.out.println("This is working");
		return "newstudent";
	}
	
	@PostMapping("/addstudent")
	public String addStudent(@ModelAttribute("Student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	/**
	 * 
	 * Update the existing the student in database just 
	 * need the id of student and we are good to go
	 * 
	 */
	
	@GetMapping("/students/update/{id}")
	public String update(@PathVariable("id") int id,Model m ) {
		Student student = (Student)studentService.findValueById(id);
		m.addAttribute("student",student);
		return "update";
	}
	
	@PostMapping("/updatestudent/{id}")
	public String updateStudent(@PathVariable("id") int id,  @ModelAttribute("Student") Student student) {
	   student.setStudentId(id);
	   studentService.saveStudent(student);
		 return "redirect:/students";
	}
	
	/**
	 * 
	 * Deleting the student from data base if only
	 * 
	 */
	
	@GetMapping("/students/delete/{id}")
	public String delete(@PathVariable("id")int id) {
		studentService.deleteById(id);
		return "redirect:/students";
	}
}
