package com.backend.dsmovie.services;

import com.backend.dsmovie.dto.MovieDTO;
import com.backend.dsmovie.model.Movie;
import com.backend.dsmovie.repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired()))
public class MovieService {

    private final MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result= movieRepository.findAll(pageable);
        Page<MovieDTO> page= result.map(x -> new MovieDTO(x));
        return page;
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Movie result= movieRepository.findById(id).get();
        MovieDTO dto= new MovieDTO(result);
        return dto;
    }
}
