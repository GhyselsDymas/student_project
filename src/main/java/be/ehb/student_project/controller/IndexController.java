package be.ehb.student_project.controller;

import be.ehb.student_project.model.Student;
import be.ehb.student_project.model.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @Autowired
    StudentDAO dao;

    @ModelAttribute(value = "all")
    public Iterable<Student> findAll(){
        return dao.findAll();
    }

    @RequestMapping(value = {"/" , "/index"} , method = RequestMethod.GET)
    public String showIndex(ModelMap map){
        return "index";
    }
}
