package com.mhp.Internship.demo.controller;

import com.mhp.Internship.demo.dto.ActorDto;
import com.mhp.Internship.demo.service.ActorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/actor")
public class ActorController {

    private ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @PostMapping("/add-actor")
    public ResponseEntity<ActorDto> addActor(@RequestBody ActorDto dto){

         return  ResponseEntity.ok(actorService.save(dto));
    }
}
