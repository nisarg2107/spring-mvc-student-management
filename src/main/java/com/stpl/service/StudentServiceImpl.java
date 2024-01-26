package com.stpl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.stpl.dao.IStudentDAO;
import com.stpl.vo.Student;

@Service
@Transactional
@Rollback(false)
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private IStudentDAO studentDAO;
	
	@Override
	public void insert(Student record) {
		
		this.studentDAO.insert(record);
	}

	@Override
	public List<Student> search() {
		// TODO Auto-generated method stub
		List<Student> ls = this.studentDAO.search();
		return ls;
	}
	
	@Override
	public List<Student> searchByName(String name) {
		// TODO Auto-generated method stub
		List<Student> ls = this.studentDAO.searchByName(name);
		return ls;
	}

	@Override
	public List<Student> findById(int id) {
		// TODO Auto-generated method stub
		List<Student> ls = this.studentDAO.findById(id);
		return ls;
	}

	@Override
	public void delete(Student record) {
		// TODO Auto-generated method stub
		this.studentDAO.delete(record);
	}
	
	
}
