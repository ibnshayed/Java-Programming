package bd.ac.seu.helloworldjpa.controller;

import bd.ac.seu.helloworldjpa.model.Student;
import bd.ac.seu.helloworldjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value = "/")
    public String handleIndex() {
        return "Hello";
    }

    @RequestMapping(value = "/test")
    public String hanldeIndexWithName(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    @RequestMapping(value = "/students")
    public String getAllStudent(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "students";
    }

    @RequestMapping(value = "/student")
    public Student getOneStudent(@RequestParam String id) {
        return studentRepository.findById(id).orElse(null);
    }

    @RequestMapping(value = "insert_student")
    public String addAStudent(@RequestParam String id,
                              @RequestParam String name,
                              @RequestParam double cgpa) {
        Student student = new Student(id, name, cgpa);
        studentRepository.save(student);
        return "Successfully inserted a new Student = " + name;
    }

}
