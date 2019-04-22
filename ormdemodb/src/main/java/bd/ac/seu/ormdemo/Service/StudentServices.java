package bd.ac.seu.ormdemo.Service;

import bd.ac.seu.ormdemo.SessionFactorySingleTon;
import bd.ac.seu.ormdemo.model.Sex;
import bd.ac.seu.ormdemo.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class StudentServices {
    SessionFactory sessionFactory;

    public StudentServices() {
        sessionFactory = SessionFactorySingleTon.getSessionFactory();
    }

    //creat
    public void addStudent(Student student) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.save(student);
        session.getTransaction().commit();
    }

    //read
    public List<Student> getStudentSet() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Student ");
        return query.getResultList();
    }

    //a single student
    public Student getStudent(int studentId) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Student student = session.get(Student.class, studentId);
        session.getTransaction().commit();
        return student;
    }

    //delete
    public void deleteStudent() {

    }

    //update
    public Student updateStudent() {
        return null;
    }

}
