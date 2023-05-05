package com.wz.dao;

import com.wz.entity.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> selectAllStudents();
    public void  insertStudent(Student student);
    public void updateStudent(Student student);
    public  void deleteStudent(String id);
}
