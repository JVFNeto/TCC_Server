package com.backend.dsmovie.controllers;

import com.backend.dsmovie.dto.MovieDTO;
import com.backend.dsmovie.dto.ScoreDTO;
import com.backend.dsmovie.services.ScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping(value = "/scores")
@RestController
public class ScoreController {

    private final ScoreService scoreService;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        MovieDTO movieDTO = scoreService.saveScore(dto);
        return movieDTO;
    }
}
