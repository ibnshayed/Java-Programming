package bd.ac.seu.springboot;

import bd.ac.seu.springboot.model.Student;
import bd.ac.seu.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            /*List<Student> studentList = studentRepository.findAll();
            studentList.forEach(System.out::println);*/
            System.out.println(studentRepository.findById("1002").orElse(null));
        };
    }

}

