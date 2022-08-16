package com.example.demo.repository;

import com.example.demo.model.Jugador;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IJugadorRepository {


    Mono<Jugador> inscribir(Jugador j);
    Mono<Jugador> cambiar(Jugador j);
    Flux<Jugador> listar();
    Mono<Jugador> listarPorId(Integer id);
    Mono<Void> eliminar (Integer id);



}
