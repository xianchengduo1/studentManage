package com.frameStudent.studentManage.service.impl;

import java.util.List;

import com.frameStudent.studentManage.beans.Room;
import com.frameStudent.studentManage.beans.Student;
import com.frameStudent.studentManage.dao.IStudentDao;
import com.frameStudent.studentManage.service.IStudentService;

public class StudentServiceImpl implements IStudentService{
	
		private IStudentDao dao;
	
		public void setDao(IStudentDao dao) {
			this.dao = dao;
		}
		
		public StudentServiceImpl() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	public StudentServiceImpl(IStudentDao dao) {
			super();
			this.dao = dao;
		}
	
	

	public void addStu(Student student) throws Exception {
		// TODO Auto-generated method stub
		dao.addStu(student);
	}

	public void delStuById(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.delStuById(id);
	}

	public void updateStu(int id, Room room) throws Exception {
		// TODO Auto-generated method stub
		dao.updateStu(id, room);
	}

	public List<Student> findAllStu() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAllStu();
	}

}
