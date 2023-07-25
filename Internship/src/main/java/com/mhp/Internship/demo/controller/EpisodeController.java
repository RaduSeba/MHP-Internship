package com.mhp.Internship.demo.controller;

import com.mhp.Internship.demo.dto.EpisodeDto;
import com.mhp.Internship.demo.entity.EpisodeEntity;
import com.mhp.Internship.demo.service.EpisodeService;
import liquibase.util.StringUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/episode")
public class EpisodeController {

    private final EpisodeService episodeService;


    public EpisodeController(EpisodeService episodeService) {
        this.episodeService = episodeService;
    }


    @GetMapping("/get-episodes")
    public ResponseEntity<List<EpisodeDto>> getEpisodes(){

        List<EpisodeDto> dtos = episodeService.getEpisodes();

        return ResponseEntity.ok(dtos);

    }

    @GetMapping("/filter")
    public ResponseEntity<List<EpisodeDto>> filter(@RequestParam(name="country" ,required=false) String country,@RequestParam(name="platform", required = false) String platform  ){


        if(StringUtil.isEmpty(platform) && StringUtil.isNotEmpty(country)){

            List<EpisodeDto> dtos = episodeService.findCountry(country);
            return ResponseEntity.ok(dtos);

        }
        else if(StringUtil.isEmpty(country) && StringUtil.isNotEmpty(platform)){
            List<EpisodeDto> dtos = episodeService.findPlatform(platform);
            return ResponseEntity.ok(dtos);

        }else
        {
            List<EpisodeDto> dtos = episodeService.findPlatformAndCountry(platform,country);

            return ResponseEntity.ok(dtos);
        }

    }



    @PostMapping("/post-episode")
    public ResponseEntity<EpisodeDto> addEpisode(@RequestBody EpisodeDto dto){



        EpisodeDto episode = episodeService.addEpisode(dto);

        return new ResponseEntity<>(episode,HttpStatus.OK );

    }



    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        String hello = "Say hello";
        return new ResponseEntity<>(hello, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        episodeService.deleteById(id);
        return  new ResponseEntity<>(HttpStatus.OK);

    }
    @PutMapping("/{id}")
    public ResponseEntity<EpisodeDto> update(@PathVariable Long id, @RequestBody EpisodeDto dto){

         episodeService.update(dto);

        return new ResponseEntity<>(HttpStatus.OK );

    }

}
