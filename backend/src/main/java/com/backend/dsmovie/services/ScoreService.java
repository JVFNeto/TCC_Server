package com.backend.dsmovie.services;


import com.backend.dsmovie.dto.MovieDTO;
import com.backend.dsmovie.dto.ScoreDTO;
import com.backend.dsmovie.model.Movie;
import com.backend.dsmovie.model.Score;
import com.backend.dsmovie.model.User;
import com.backend.dsmovie.repositories.MovieRepository;
import com.backend.dsmovie.repositories.ScoreRepository;
import com.backend.dsmovie.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired()))
public class ScoreService {

    private final UserRepository userRepository;//busca por email
    private final MovieRepository movieRepository; //busca o id do filme
    private final ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO dto){
        User user = userRepository.findByEmail(dto.getEmail());//pega o email do BD e guarda na variavel user
        if(user == null){
            user = new User();
            user.setEmail(dto.getEmail());//seta o email, sendo o emial que veio do ScoreDto
            user = userRepository.saveAndFlush(user);
        }
        Movie movie = movieRepository.findById(dto.getMovieId()).get();//pega o id do filme do BD e salva na variavel movie

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getScore());

        score = scoreRepository.saveAndFlush(score);

        double soma= 0.0;
        for(Score s : movie.getScores()){//para cada Score movie.GetScores
            soma += s.getValue(); //some com o valor de cada Score
        }
        double media = soma / movie.getScores().size(); //e divida pela quantidade de scores

        movie.setScore(media); //score recebe a media
        movie.setCount(movie.getScores().size()); //e count recebe a quantidadde

        movie =movieRepository.save(movie);

        return new MovieDTO(movie);//loucura
    }

}
