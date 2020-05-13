package com.baconic.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    // 使用静态代码块来创建 SessionFactory 对象，保证单例
    private static SessionFactory sessionFactory;

    static {
        // 创建 Configuration 对象
        Configuration cfg = new Configuration();
        // 加载 Hibernate 默认配置文件，如果配置文件不在 src 目录下，则需要填写配置文件地址
        cfg.configure();
        // 根据配置文件，创建 SessionFactory 对象
        sessionFactory = cfg.buildSessionFactory();
    }

    public static Session openSession() {
        // 获取 session 对象
        return sessionFactory.openSession();
    }

    public static Session getCurrentSession() {
        // 获取与当前线程绑定的 session 对象
        return sessionFactory.getCurrentSession();
    }
}
