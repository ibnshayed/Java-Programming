package bd.ac.seu.collectios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CourseDaoMysqlImplementation implements CourseDao {
    private List<Course> courseList;

    @Override
    public List<Course> getAllCourse() {
        try {
            Connection connection = JdbcConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM course";
            ResultSet resultSet = statement.executeQuery(query);

            courseList = new ArrayList<>();
            while (resultSet.next()) {
                String courseCode = resultSet.getString("courseCode");
                String courseTitle = resultSet.getString("courseTitle");
                double credits = resultSet.getDouble("credits");

                Course course = new Course(courseCode, courseTitle, credits);
                //System.out.println(student);
                courseList.add(course);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courseList;
    }
}
