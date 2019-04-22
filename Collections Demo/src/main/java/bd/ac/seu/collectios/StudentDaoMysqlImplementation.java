package bd.ac.seu.collectios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoMysqlImplementation implements StudentDao {
    private List<Student> studentList;

    @Override
    public List<Student> getAllStudent() {
        try {
            Connection connection = JdbcConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM student";
            ResultSet resultSet = statement.executeQuery(query);

            studentList = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("studentId");
                String name = resultSet.getString("studentName");
                //System.out.println(id + " , " + name);
                Student student = new Student(id, name);
                //System.out.println(student);
                studentList.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    /*@Override
    public Student getStudent(int studentId) {
        studentList = getAllStudent();

        for(Student student : studentList){
            if(studentId == student.getId())
                return student;
        }
        return null;
    }*/


}
