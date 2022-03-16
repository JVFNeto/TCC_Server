package com.backend.dsmovie.controllers;

import com.backend.dsmovie.dto.MovieDTO;
import com.backend.dsmovie.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/movies")
@RestController
public class MovieController {

    @Autowired
    private final MovieService movieService;
    @Autowired
    private final PasswordEncoder encoder;

    public MovieController (MovieService movieService, PasswordEncoder encoder){
        this.movieService = movieService;
        this.encoder = encoder;
    }


    @GetMapping
    public Page<MovieDTO> findAll(Pageable pageable) {
        return movieService.findAll(pageable);
    }

    @GetMapping(value= "/{id}")
    public MovieDTO findById(@PathVariable Long id) {
        return movieService.findById(id);
    }

    @GetMapping(value= "/search")
    public List<MovieDTO> findByTitle (@PathVariable String title){return movieService.findByTitle(title);}

}
