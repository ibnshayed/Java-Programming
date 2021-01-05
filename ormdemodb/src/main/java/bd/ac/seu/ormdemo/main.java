package bd.ac.seu.ormdemo;

import bd.ac.seu.ormdemo.Service.StudentServices;
import bd.ac.seu.ormdemo.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class main {
    public main() {

        StudentServices studentServices = new StudentServices();

        List<Student> maleStudentList = new ArrayList<>();
        maleStudentList = studentServices.getStudentSet()
                .parallelStream()
                .filter(Student -> Student.getSex() == Sex.Female)
                .collect(Collectors.toList());
        maleStudentList.forEach(System.out::println);

        /*Student student = new Student(2001,"Asaduzzaman Chowdhury",Sex.Male,"asad1998@gmail.com",new Address(null,null,null));
        studentServices.addStudent(student);*/

/*        Student student = studentServices.getStudent(2001);
        System.out.println(student);*/
/*        List<Student> studentList = studentServices.getStudentSet();
        studentList.forEach(System.out::println);*/

/*
        for(int i = 1006; i<= 1100; i++)
        {
            Student student = new Student(i,
                    null,
                    Math.random() <0.5 ? Sex.Male : Sex.Female,
                    null,
                    new Address(null,null,null));
            studentServices.addStudent(student);
        }*/

    }

    public static void main(String[] args) {
        new main();
    }
}
