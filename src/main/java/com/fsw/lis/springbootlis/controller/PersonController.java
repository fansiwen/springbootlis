package com.fsw.lis.springbootlis.controller;

import com.fsw.lis.springbootlis.pojo.Person;
import com.fsw.lis.springbootlis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;
    @RequestMapping(value = "/person/{id}",method = RequestMethod.GET)
    Person getPersonByID(@PathVariable int id){
        return  personService.getPersonByID(id);
    }

}
