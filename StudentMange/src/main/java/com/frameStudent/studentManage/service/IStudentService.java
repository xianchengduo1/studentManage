package com.frameStudent.studentManage.service;

import java.util.List;

import com.frameStudent.studentManage.beans.Room;
import com.frameStudent.studentManage.beans.Student;

public interface IStudentService {
	

public void addStu(Student student) throws Exception;

public void delStuById(int id) throws Exception;

public void updateStu(int id,Room room) throws Exception;


public List<Student> findAllStu() throws Exception;
}
