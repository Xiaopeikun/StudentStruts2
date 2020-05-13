package com.baconic.student;

import java.util.List;

public interface StudentDaoI {
    List<StudentEntity> findList();

    StudentEntity findById(Integer id);

    void UpdateStudent(StudentEntity studentEntity);

    void AddStudent(StudentEntity studentEntity);

    void Delete(Integer id);
}
