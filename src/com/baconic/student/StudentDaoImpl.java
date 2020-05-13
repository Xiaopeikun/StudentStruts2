package com.baconic.student;

import com.baconic.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDaoI {
    @Override
    public List<StudentEntity> findList(){
        // 获取 session 对象
        Session session = HibernateUtil.openSession();
        // 获取 Transaction 对象
        Transaction tx = session.beginTransaction();

        List<StudentEntity> list = new ArrayList<>();
        try {
            Query query = session.createQuery("from StudentEntity");
            list = query.list();
            System.out.println(list);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            session.close();
        }

        return list;

    }

    @Override
    public StudentEntity findById(Integer id) {

        // 获取 session 对象
        Session session = HibernateUtil.openSession();
        // 获取 Transaction 对象
        Transaction tx = session.beginTransaction();
        StudentEntity studentEntity = session.get(StudentEntity.class, id);
        tx.commit();
        session.close();
        return studentEntity;
    }

    @Override
    public void UpdateStudent(StudentEntity studentEntity) {
        Session session = HibernateUtil.openSession();
        // 获取 Transaction 对象
        Transaction tx = session.beginTransaction();

        studentEntity.setId(studentEntity.getId());
        studentEntity.setName(studentEntity.getName());
        studentEntity.setAge(studentEntity.getAge());
        studentEntity.setSex(studentEntity.getSex());
        session.update(studentEntity);
        tx.commit();
        session.close();
    }

    @Override
    public void AddStudent(StudentEntity studentEntity) {
        // 获取 session 对象
        Session session = HibernateUtil.openSession();
        // 获取 Transaction 对象
        Transaction tx = session.beginTransaction();

        try {
            studentEntity.setId(studentEntity.getId());
            studentEntity.setName(studentEntity.getName());
            studentEntity.setId(studentEntity.getAge());
            studentEntity.setSex(studentEntity.getSex());
            session.save(studentEntity);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public void Delete(Integer id) {
        // 获取 session 对象
        Session session = HibernateUtil.openSession();
        // 获取 Transaction 对象
        Transaction tx = session.beginTransaction();

        StudentEntity studentEntity= session.get(StudentEntity.class,id);
        session.delete(studentEntity);
        tx.commit();

        session.close();

    }
}
