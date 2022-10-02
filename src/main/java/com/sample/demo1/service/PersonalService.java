package com.sample.demo1.service;

import com.sample.demo1.entity.PersonalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalService {
@Autowired
PersonalEntity personalEntity;

    public  PersonalEntity data(){
        personalEntity.setCourse("ITNS");
        personalEntity.setLanguage("Java");
        return personalEntity;
    }
}
