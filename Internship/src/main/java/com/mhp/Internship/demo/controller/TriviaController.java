package com.mhp.Internship.demo.controller;

import com.mhp.Internship.demo.dto.TriviaDto;
import com.mhp.Internship.demo.service.EpisodeService;
import com.mhp.Internship.demo.service.TriviaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trivia")
public class TriviaController {


    private final TriviaService triviaService;

    public TriviaController(TriviaService triviaService) {
        this.triviaService = triviaService;
    }

    @GetMapping("/get-trivias")
    public ResponseEntity<List<TriviaDto>> getTrivias(){

        List<TriviaDto> dtos = triviaService.getAll();

        return ResponseEntity.ok(dtos);

    }

    @PostMapping("/post-trivia")
    public ResponseEntity<TriviaDto> addTrivia(@RequestBody TriviaDto dto){

        TriviaDto t= triviaService.addTrivia(dto);

        return new ResponseEntity<>(t, HttpStatus.OK );

    }

    @PatchMapping("/{id}/description")
    public ResponseEntity<TriviaDto> updateDescription(@PathVariable Long id, @RequestBody String description){

        triviaService.updateDescription(id,description);

        return new ResponseEntity<>(HttpStatus.OK );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTrivia(@PathVariable Long id){

        triviaService.delete(id);

        return new ResponseEntity<>(HttpStatus.OK );
    }

    @PutMapping("/{id}")
    public ResponseEntity<TriviaDto> updateTrivia(@PathVariable Long id, @RequestBody TriviaDto dto){

        dto.setId(id);

        triviaService.update(dto);

        return new ResponseEntity<>(HttpStatus.OK );
    }
}
