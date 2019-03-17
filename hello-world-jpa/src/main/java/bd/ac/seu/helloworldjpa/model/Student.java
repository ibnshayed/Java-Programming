package bd.ac.seu.helloworldjpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private String studentId;
    private String studentName;
    private double cgpa;

    public Student() {
    }

    public Student(String studentId, String studentName, double cgpa) {
        this.setStudentId(studentId);
        this.setStudentName(studentName);
        this.setCgpa(cgpa);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
