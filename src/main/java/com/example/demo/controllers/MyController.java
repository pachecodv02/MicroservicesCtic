package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.Greeting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;





/**
 * MyController
 */
@RestController
@RequestMapping(path = "world")
public class MyController {

    //Regresar un string
    @RequestMapping(value="hello", method=RequestMethod.GET)
    public String  hello() {
         return "hola mundo";
    }

    //implementar path variable
    @RequestMapping(value = "helloList/{id}", method = RequestMethod.GET)
    public Greeting Hellopv(@PathVariable String id){
        return new Greeting("Hola Mundo "+id);
    }
    
    //Regresar una lista de objetos como json
    @RequestMapping(value="helloList", method=RequestMethod.GET)
    public List<Greeting> Hello() {
        List<Greeting> greetings = new ArrayList<>();
        greetings.add(new Greeting("Hola Mundo"));
        greetings.add(new Greeting("Hola Mundo"));

        return greetings;
    }
    
    
    
}