package com.gl.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.student.entity.*;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByNameContainsAndDepartmentContainsAllIgnoreCase(String name, String department);
}
