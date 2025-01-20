package com.mauricio.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import com.mauricio.curso.springboot.webapp.springboot_web.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Mauricio", "Mores");
        user.setEmail("mauri.f.mores@gmail.com");
        model.addAttribute("title","Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        
        return "details";
    }

/*  @GetMapping("/details")
    public String details(Map<String, Object> model) {
        model.put("title","Hola Mundo Spring Boot");
        model.put("name", "Mauricio");
        model.put("lastname", "Mores");
        return "details";
    }*/

    @GetMapping("/list")
    public String  list(ModelMap model){
        List<User> users = Arrays.asList(new User("Pepito", "Gonzalez","pepito22@gmail.com"),
                                        new User("Pablo", "Reyes","pablo22@gmail.com"),
                                        new User("Raul","Reinoso","raul22@gmail.com"));

        model.addAttribute("users",users);
        model.addAttribute("title","Listado de usuarios!");

        return "list";
    }
}
