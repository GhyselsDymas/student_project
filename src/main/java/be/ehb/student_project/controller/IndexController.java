package be.ehb.student_project.controller;

import be.ehb.student_project.model.Student;
import be.ehb.student_project.model.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/naam/{id}" , method = RequestMethod.GET)
    public String showStudent(@PathVariable(value = "id") Integer id, ModelMap map){

        map.addAttribute("TheID", dao.findById(id).get());
        return "naam";
    }

}
