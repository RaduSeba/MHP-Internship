package com.mhp.Internship.demo.service.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component
public class ProdComponent {

    public String getMessage(){
        return "producing";
    }
}
