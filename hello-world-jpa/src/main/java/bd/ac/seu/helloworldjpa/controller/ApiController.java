package bd.ac.seu.helloworldjpa.controller;

import bd.ac.seu.helloworldjpa.model.Student;
import bd.ac.seu.helloworldjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1")
public class ApiController {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value = "student/{id}")
    public Student getOneStudent(@PathVariable String id) {
        return studentRepository.findById(id).orElse(null);
    }
}
