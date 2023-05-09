package com.estudospring.ds.services;

import com.estudospring.ds.DTO.GameMinDTO;
import com.estudospring.ds.entities.Games;
import com.estudospring.ds.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        List<Games> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
