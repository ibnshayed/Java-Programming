package bd.ac.seu.collectios;

import java.util.List;

public interface StudentDao {

    public List<Student> getAllStudent();

    public default Student getStudent(int studentId) {
        List<Student> studentList = getAllStudent();

        for (Student student : studentList) {
            if (studentId == student.getId())
                return student;
        }
        return null;
    }

}
