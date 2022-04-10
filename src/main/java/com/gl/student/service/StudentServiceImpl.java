package com.gl.student.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.student.entity.Student;
import com.gl.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRespository;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> students = studentRespository.findAll();
		return students;
	}

	@Override
	public Student findById(int Id) {
		// TODO Auto-generated method stub
		Student student = studentRespository.findById(Id).get();
		return student;
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentRespository.save(student);
	}

	@Override
	public void deleteById(int Id) {
		// TODO Auto-generated method stub
		studentRespository.deleteById(Id);
	}

	@Override
	public List<Student> searchBy(String name, String department) {
		// TODO Auto-generated method stub
		return studentRespository.findByNameContainsAndDepartmentContainsAllIgnoreCase(name, department);
	}

}