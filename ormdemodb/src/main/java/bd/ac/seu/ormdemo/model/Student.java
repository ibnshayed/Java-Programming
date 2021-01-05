package bd.ac.seu.ormdemo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Student {
    @Id
    private int studentId;
    private String studentName;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    private String emailAddress;
    @Embedded
    private Address address;
    @ManyToMany
    @JoinTable(name = "Registration",
            joinColumns = {@JoinColumn(name = "studentId")},
            inverseJoinColumns = {@JoinColumn(name = "courseCode")})
    private Set<Course> courseSet;

    public Student() {
        courseSet = new HashSet<>();
    }

    public Student(int studentId, String studentName, Sex sex, String emailAddress, Address address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.emailAddress = emailAddress;
        this.setAddress(address);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Set<Course> getCourseSet() {
        return courseSet;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", sex=" + sex +
                ", emailAddress='" + emailAddress + '\'' +
                ", address=" + getAddress() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
