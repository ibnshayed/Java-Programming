package bd.ac.seu.collectios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoCsvImplementation implements StudentDao{
    private List<Student> studentList;
    @Override
    public List<Student> getAllStudent() {

        studentList = new ArrayList<>();

        try(RandomAccessFile input = new RandomAccessFile("Students.csv","r")){
            input.readLine();
            String line;


            while((line = input.readLine()) != null){
                int commaIndex = line.indexOf(",");
                String id = line.substring(0,commaIndex);
                String name = line.substring(commaIndex+2,line.length() - 1);
                Student student = new Student(Integer.parseInt(id),name);
                studentList.add(student);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
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
