package bd.ac.seu.helloworldjpa;

import bd.ac.seu.helloworldjpa.model.Student;
import bd.ac.seu.helloworldjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloWorldJpaApplication {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(){
        return args -> {

           /* Student student = new Student("1002","Akram Chowdhury",3.87);
            studentRepository.save(student);*/

           //studentRepository.findAll().forEach(System.out::println);
           //System.out.println(studentRepository.findById("1001"));
           System.out.println(studentRepository.findByStudentName("Shakila Chowdhury"));


        };
    }

}

