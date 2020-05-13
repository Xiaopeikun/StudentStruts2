package com.baconic.action;

import com.baconic.student.StudentEntity;
import com.baconic.student.StudentServiceI;
import com.baconic.student.StudentServiceImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class StudentAction {
    private StudentServiceI studentService=new StudentServiceImpl();
    HttpServletRequest request = ServletActionContext.getRequest();
    HttpServletResponse response = ServletActionContext.getResponse();

    public StudentEntity studentEntity =new StudentEntity();

    public String findList() {

        List<StudentEntity> list=studentService.findList();
        request.setAttribute("list", list);
        return "list";
    }

    public String delete() {
        int id = Integer.parseInt(request.getParameter("id"));
        studentService.Delete(id);
        return "del";
    }

    public String add() {
        Integer id= Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        String sex =request.getParameter("sex");
        StudentEntity studentEntity=new StudentEntity(id, name, age,sex);
        studentService.AddStudent(studentEntity);

        return "add";
    }

    public String toupdate() {
        int id = Integer.parseInt(request.getParameter("id"));
        StudentEntity studentEntity=studentService.findById(id);
        request.setAttribute("studentEntity", studentEntity);
        return "toupdate";

    }

    public String update() {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        String sex =request.getParameter("sex");
        StudentEntity studentEntity=new StudentEntity(id, name, age, sex);
        studentService.UpdateStudent(studentEntity);
        return "update";

    }
}
