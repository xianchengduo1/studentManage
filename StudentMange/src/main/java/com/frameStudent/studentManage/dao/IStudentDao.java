package com.frameStudent.studentManage.dao;

import java.util.List;

import com.frameStudent.studentManage.beans.Room;
import com.frameStudent.studentManage.beans.Student;

public interface IStudentDao {
	
	/**
	 * 添加学生信息
	 * 
	 * @param student 需要添加的学生对象
	 *            
	 */
	public void addStu(Student student) throws Exception;
	/**
	 * 删除学生信息
	 * @param id  通过学生id，删除学生信息
	 * @return
	 */
	public void delStuById(int id) throws Exception;
	/**
	 * 修改学生的信息
	 * @param id  通过学生id,修改学生信息
	 * @return
	 */
	public void updateStu(int id,Room room) throws Exception;
	
	/**
	 * 查看所有学生信息
	 * @return  返回一个学生的List集合(三表联查，但是仍然是一对一，一对多是，采用Set集合来接受）
	 */
	public List<Student> findAllStu() throws Exception;
	

}
