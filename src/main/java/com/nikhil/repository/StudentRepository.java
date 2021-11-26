package com.nikhil.repository;

import org.springframework.data.repository.CrudRepository;

import com.nikhil.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
        public Student findById(int id);
}
