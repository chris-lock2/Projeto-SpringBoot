package com.estudospring.ds.repositories;

import com.estudospring.ds.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

//Aqui onde vai ocorrer consultas no SQL H2
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
