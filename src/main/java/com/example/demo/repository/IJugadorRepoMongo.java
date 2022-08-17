package com.example.demo.repository;

import com.example.demo.model.Jugador;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IJugadorRepoMongo extends ReactiveMongoRepository<Jugador,Integer> {


}
