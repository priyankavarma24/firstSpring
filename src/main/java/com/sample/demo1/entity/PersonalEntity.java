package com.sample.demo1.entity;

import org.springframework.stereotype.Component;

@Component
public class PersonalEntity {


    private String course;

    private String language;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
