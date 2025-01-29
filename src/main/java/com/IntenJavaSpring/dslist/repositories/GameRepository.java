package com.IntenJavaSpring.dslist.repositories;

import com.IntenJavaSpring.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long>{

}
