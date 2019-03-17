package bd.ac.seu.springboot.controller;

import bd.ac.seu.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value = "/home")
    public String getSomething(){
        return "Welcome Bangladesh";
    }

    @RequestMapping(value = "/students")
    public String getAllStudents(Model model){
        model.addAttribute("studentCount",studentRepository.count());
        model.addAttribute("students",studentRepository.findAll());
        return "students";
    }

    /*@RequestMapping(value = "/student")
    public Student getOneStudent(@RequestParam String id, Model model)
    {
        return model.addAttribute(studentRepository.findById("id").orElse(null));
    }*/

}
