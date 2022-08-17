package com.example.demo.services;

import com.example.demo.model.Jugador;
import com.example.demo.repository.IJugadorRepoMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class IJugadorImplementarService implements IJugadorService {

    //logica de servicio

    @Autowired
    private IJugadorRepoMongo serviceMongo;

    @Override
    public Mono<Jugador> crear(Jugador j) {

        return null;
    }


}
