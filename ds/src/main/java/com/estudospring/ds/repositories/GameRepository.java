package com.estudospring.ds.repositories;

import com.estudospring.ds.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;

//Aqui onde vai ocorrer consultas no SQL H2
public interface GameRepository extends JpaRepository<Games, Long> {

}
