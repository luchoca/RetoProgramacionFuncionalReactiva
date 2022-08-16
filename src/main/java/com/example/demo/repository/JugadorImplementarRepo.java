package com.example.demo.repository;

import com.example.demo.controller.JugadorController;
import com.example.demo.model.Jugador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;


@Repository
public class JugadorImplementarRepo implements IJugadorRepository {

    private static final Logger log = LoggerFactory.getLogger(JugadorController.class);


    @Override
    public Mono<Jugador> inscribir(Jugador j) {
        log.info(j.toString());
        Mono<Jugador> inscripcion = Mono.just(j);
        return inscripcion;
    }

    @Override
    public Mono<Jugador> cambiar(Jugador j) {
        log.info(j.toString());
        Mono<Jugador> cambio = Mono.just(j);
        return cambio;
    }

    @Override
    public Flux<Jugador> listar() {
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador(1, 12, "Kevin", true));
        jugadores.add(new Jugador(2, 4, "Da Silveira", true));
        jugadores.add(new Jugador(3, 3, "Menosse", true));
        jugadores.add(new Jugador(4, 44, "Rak", true));
        jugadores.add(new Jugador(5, 23, "Mota", true));
        jugadores.add(new Jugador(6, 5, "Cristoforo", true));
        jugadores.add(new Jugador(7, 7, "El Huevo", true));
        jugadores.add(new Jugador(8, 17, "LaKingol", true));
        jugadores.add(new Jugador(9, 10, "KM 10", true));
        jugadores.add(new Jugador(10, 9, "Tanque", true));
        jugadores.add(new Jugador(11, 22, "Cavanito", true));


        return Flux.fromIterable(jugadores);
    }

    @Override
    public Mono<Jugador> listarPorId(Integer id) {//simulamos operacion de base de datos
        Mono<Jugador> listarPorId = Mono.just(new Jugador(1, 12, "Kevin", true));
        return listarPorId;
    }

    @Override
    public Mono<Void> eliminar(Integer id) {//devuelve un flujo vacio
        Mono<Void> eliminar = Mono.empty();

        return eliminar;
    }
}


//crear paquete services para la logica de negocio