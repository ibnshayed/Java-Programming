package bd.ac.seu.helloworldjpa.repository;

import bd.ac.seu.helloworldjpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {
    public Student findByStudentName(String StudentName);
}
