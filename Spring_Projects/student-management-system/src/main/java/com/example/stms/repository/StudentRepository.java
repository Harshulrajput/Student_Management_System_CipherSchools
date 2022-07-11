package com.example.stms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
