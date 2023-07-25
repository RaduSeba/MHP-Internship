package com.mhp.Internship.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Qualifier("fancyService")
@Service
public class FancyMessageServiceImpl implements MessageService{
    @Override
    public String returnMessage() {
        return "greetings frate";
    }
}
