package com.backend.dsmovie.model;


import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="tb_score")
public class Score {

    @EmbeddedId
   private ScorePK id = new ScorePK();

    private Double value;

    //associa o Movie com o Score
    public void setMovie (Movie movie){
        id.setMovie(movie);
    }
    //associa o Movie com o Score
    public void setUser (User user){
        id.setUser(user);
    }

}
