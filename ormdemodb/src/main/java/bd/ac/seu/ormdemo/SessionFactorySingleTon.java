package bd.ac.seu.ormdemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactorySingleTon {
    private final static SessionFactorySingleTon instance = new SessionFactorySingleTon();
    private static SessionFactory sessionFactory;

    private SessionFactorySingleTon() {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
