package com.mauricio.curso.springboot.webapp.springboot_web.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mauricio.curso.springboot.webapp.springboot_web.DTOs.UserDTO;
import com.mauricio.curso.springboot.webapp.springboot_web.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")//utilizando dto para retornar los datos
    public UserDTO details(){

        User user = new User("Mauricio", "Mores");
        
        UserDTO userDTO = new UserDTO("Hola Mundo Spring Boot", user);

        return userDTO;
    }

    @GetMapping("/list") 
    public List<User> list(){
        User user1  = new User("Andres", "Gomez");
        User user2  = new User("Pablo", "Perez");
        User user3  = new User("Mario", "Doe");
        
        List<User> users = Arrays.asList(user1,user2,user3);
        /*List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);*/
        
        return users;
    }

    @GetMapping("/details-map")//utilizando map para retornar los datos
    public Map<String, Object> detailsMap(){

        User user = new User("Mauricio", "Mores");
        
        Map<String, Object> body = new HashMap<>();
        body.put("title","Hola Mundo Spring Boot");
        body.put("user", user);
        
        return body;
    }
}
