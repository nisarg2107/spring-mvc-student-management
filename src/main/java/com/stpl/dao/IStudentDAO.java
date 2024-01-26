package com.stpl.dao;

import java.util.List;

import com.stpl.vo.Student;

public interface IStudentDAO {

	public void insert(Student record);
	
	public List<Student> search();
	
	public List<Student> searchByName(String name);
	
	public List<Student> findById(int id);
	
	public void delete(Student record);
	
}
