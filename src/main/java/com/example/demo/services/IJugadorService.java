package com.example.demo.services;

import com.example.demo.model.Jugador;
import org.springframework.data.mongodb.repository.MongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IJugadorService  {


    Mono<Jugador> crear(Jugador j);

}
