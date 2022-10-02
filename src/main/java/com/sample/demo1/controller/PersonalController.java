package com.sample.demo1.controller;

import com.sample.demo1.entity.PersonalEntity;
import com.sample.demo1.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app/v1")
public class PersonalController {
    @Autowired
    PersonalService personalService;

    @GetMapping("/get")
    public PersonalEntity data() {
        PersonalEntity Pe = personalService.data();
        return Pe;
    }

}
