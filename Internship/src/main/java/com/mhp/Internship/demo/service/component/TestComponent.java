package com.mhp.Internship.demo.service.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Profile("test")
@Component
public class TestComponent {

    public String getMessage(){
        return "testing";
    }
}
