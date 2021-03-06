package com.backend.dsmovie.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_movie")

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Double score;
    private Integer count;
    private String image;

    //como conseguir acessar todas as avaliações de um certo filme, a partir do objeto de filme

    @OneToMany(mappedBy = "id.movie")//um filme tem varias avaliações
    private Set<Score> scores = new HashSet<>();

}
