package com.stpl.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stpl.vo.Student;

@Repository
public class StudentDAOImpl implements IStudentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insert(Student record) {

		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	@SuppressWarnings(value = "unchecked")
	public List<Student> search() {
		List<Student> ls = new ArrayList<Student>();
		try {

			Session session = sessionFactory.getCurrentSession();
			ls = session.createQuery("From Student").list();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	@Override
	@SuppressWarnings(value = "unchecked")
	public List<Student> searchByName(String name) {
		List<Student> ls = new ArrayList<Student>();
		try {

			Session session = sessionFactory.getCurrentSession();
			ls = session.createQuery("From Student where Firstname like '"+name+"%' or lastname like '"+name+"%'").list();
			System.out.println(ls);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	@Override
	@SuppressWarnings(value = "unchecked")
	public List<Student> findById(int id) {
		List<Student> ls = new ArrayList<Student>();
		try {

			Session session = sessionFactory.getCurrentSession();
			ls = session.createQuery("From Student where Id='"+id+"'").list();
			System.out.println(ls);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	@Override
	public void delete(Student record) {

		try {
			Session session = sessionFactory.getCurrentSession();
			session.delete(record);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
