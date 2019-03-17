package bd.ac.seu.springboot.repository;

import bd.ac.seu.springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {

}
