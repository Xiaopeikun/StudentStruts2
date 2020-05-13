package com.baconic.student;

import java.util.List;

public interface StudentServiceI {
    List<StudentEntity> findList();

    StudentEntity findById(Integer id);

    void UpdateStudent(StudentEntity studentEntity);

    void AddStudent(StudentEntity studentEntity);

    void Delete(Integer id);
}
