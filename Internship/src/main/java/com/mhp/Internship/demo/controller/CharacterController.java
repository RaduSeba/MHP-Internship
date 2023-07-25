package com.mhp.Internship.demo.controller;

import com.mhp.Internship.demo.dto.CharacterDto;
import com.mhp.Internship.demo.dto.CharacterSimpleDto;
import com.mhp.Internship.demo.service.CharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/character")
public class CharacterController {

    private CharacterService characterService;


    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping("/add-character")
    public ResponseEntity<CharacterDto> saveCharacter(@RequestBody CharacterDto dto){

        return ResponseEntity.ok(characterService.save(dto));
    }

    @GetMapping("/get-characters")
    public ResponseEntity<List<CharacterDto>> getCharacters()
    {
        return ResponseEntity.ok(characterService.getAllCharacters());
    }

    @GetMapping("/sort")
    public ResponseEntity<List<CharacterDto>> Sort(){

        return ResponseEntity.ok(characterService.getSorted());
    }

    @GetMapping("/get-simplified")
    public ResponseEntity<List<CharacterSimpleDto>> getSimplified(){

        return ResponseEntity.ok(characterService.getAllSimplifiedList());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){


       if( !characterService.deleteById(id))
       {
           return  new ResponseEntity<>("Character doesn't exist",HttpStatus.OK);
       }


        return  new ResponseEntity<>("Deleted",HttpStatus.OK);

    }

    @PutMapping("/{id}")
    public ResponseEntity<CharacterDto> update(@PathVariable Long id, @RequestBody CharacterDto dto)
    {
        dto.setId(id);

        characterService.updateCharacter(dto);

        return new ResponseEntity<>(HttpStatus.OK );
    }

}
