package com.example.demo.controller;


///La definimos como servicio REST , servicio rest bajo enfoque anotaciones

import com.example.demo.model.Jugador;
import com.example.demo.repository.IJugadorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/jugadores") //endPoint
public class JugadorController {

    private static final Logger log = LoggerFactory.getLogger(JugadorController.class);

    @Autowired // para obtener una instancia a traves de la inyeccion de dependencias
    private IJugadorRepository repository;

    //OPERACIONES PARA MANEJAR UN SERVICIO REST

    @GetMapping
    public Flux<Jugador> listar() {

        return repository.listar(); //listamos lo que retorna el repository
    }

    @GetMapping("/{id}")
    public Mono<Jugador> listarPorId(@PathVariable("id") Integer id) {
        return repository.listarPorId(id);
    }


}
