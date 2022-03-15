package com.backend.dsmovie.repositories;

import com.backend.dsmovie.dto.MovieDTO;
import com.backend.dsmovie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<MovieDTO> findByTitle(String title);
    
}
