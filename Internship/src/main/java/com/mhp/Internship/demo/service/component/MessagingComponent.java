package com.mhp.Internship.demo.service.component;

import com.mhp.Internship.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessagingComponent {

    private MessageService messageService;
    @Autowired
    public MessagingComponent(@Qualifier("normalService") MessageService messageService) {
        this.messageService = messageService;
    }


    public void displayMessage(){
        System.out.println( messageService.returnMessage());

    }
}
