package com.wz.dao;

import com.wz.entity.Student;
import com.wz.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao{
    @Override
    public List<Student> selectAllStudents() {
        SqlSession sqlSession =  MybatisUtils.getSqlSession();
        List<Student> studentList = sqlSession.selectList("com.wz.dao.StudentDao.selectAllStudents");
        sqlSession.close();
        return studentList;
    }

    @Override
    public void insertStudent(Student student) {
        SqlSession sqlSession =  MybatisUtils.getSqlSession();
        int rows = sqlSession.insert("com.wz.dao.StudentDao.insertStudent",student);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void updateStudent(Student student) {
        SqlSession sqlSession =  MybatisUtils.getSqlSession();
        int rows = sqlSession.update(
                "com.wz.dao.StudentDao.updateStudent", student);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteStudent(String id) {
        SqlSession sqlSession =  MybatisUtils.getSqlSession();
        int rows = sqlSession.delete(
                "com.wz.dao.StudentDao.deleteStudent",id);
        sqlSession.commit();
        sqlSession.close();

    }
}
