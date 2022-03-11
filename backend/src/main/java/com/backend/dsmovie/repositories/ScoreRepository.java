package com.backend.dsmovie.repositories;

import com.backend.dsmovie.model.Score;
import com.backend.dsmovie.model.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
