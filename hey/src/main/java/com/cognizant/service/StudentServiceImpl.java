package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.StudentDao;
import com.cognizant.model.Student;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
    private StudentDao studentDao;
	
	/*public StudentDao getStudentDao() {
		return studentDao;
	}*/

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public int create(Student student) {
		// TODO Auto-generated method stub
		return studentDao.create(student);
	}

	@Override
	public int update(Student student) {
		return studentDao.update(student);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return studentDao.delete(id);
	}

	@Override
	public List<Student> findAll() {
		 return studentDao.findAll();
	}

	@Override
	public List<Student> findByName(String name) {
		// TODO Auto-generated method stub
		return studentDao.findByName(name);
	}

	@Override
	public int countStudent() {
		// TODO Auto-generated method stub
		return studentDao.countStudent();
	}

}
