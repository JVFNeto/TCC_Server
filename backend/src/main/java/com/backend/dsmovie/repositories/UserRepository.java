package com.backend.dsmovie.repositories;

import com.backend.dsmovie.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);//Busca no User por email
}
