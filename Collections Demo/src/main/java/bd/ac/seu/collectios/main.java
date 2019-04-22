package bd.ac.seu.collectios;

import java.util.List;

public class main {
    private List<Student> studentList;
    private List<Course> courseList;

    public main() {
        StudentDao studentDao = new StudentDaoMysqlImplementation();
        //StudentDao studentDao = new StudentDaoCsvImplementation();
        studentList = studentDao.getAllStudent();

        //studentList.forEach(System.out::println);
        Student student = studentDao.getStudent(1007);
        System.out.println(student);

        CourseDao courseDao = new CourseDaoMysqlImplementation();
        courseList = courseDao.getAllCourse();
        //courseList.forEach(System.out::println);

/*
        int maxNameLength = studentList.get(0).getName().length();
        String maxName = "";

        for(Student student : studentList){
            if(maxNameLength < student.getName().length()){
                maxNameLength = student.getName().length();
                maxName = student.getName();
            }
        }

        System.out.println(maxName + "has the maximum length = " + maxNameLength);
*/


    }

    public static void main(String[] args) {
        new main();
    }

}
