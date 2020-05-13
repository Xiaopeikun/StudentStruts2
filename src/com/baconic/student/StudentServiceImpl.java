package com.baconic.student;

import java.util.List;

public class StudentServiceImpl implements StudentServiceI {
    private StudentDaoI studentDao=new StudentDaoImpl();
    @Override
    public List<StudentEntity> findList() {
        return studentDao.findList();
    }

    @Override
    public StudentEntity findById(Integer id) {
        return studentDao.findById(id);
    }

    @Override
    public void UpdateStudent(StudentEntity studentEntity) {
        studentDao.UpdateStudent(studentEntity);
    }

    @Override
    public void AddStudent(StudentEntity studentEntity) {
        studentDao.AddStudent(studentEntity);
    }

    @Override
    public void Delete(Integer id) {
        studentDao.Delete(id);
    }
}
