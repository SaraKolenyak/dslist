package com.sarakolenyak.dslist.repositories;

import com.sarakolenyak.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
