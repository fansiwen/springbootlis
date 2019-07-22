package com.fsw.lis.springbootlis.service.serviceImpl;

import com.fsw.lis.springbootlis.dao.PersonMapper;
import com.fsw.lis.springbootlis.pojo.Person;
import com.fsw.lis.springbootlis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper personMapper;
    @Override
    public Person getPersonByID(int id) {
        return personMapper.getPersonByID(id);
    }
}
