package com.mhp.Internship.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Qualifier("normalService")
@Service
public class MessageServiceImpl implements MessageService{

    @Override
     public String returnMessage(){
        return "hello frate";
    }
}
