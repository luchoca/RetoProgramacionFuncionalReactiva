package com.example.demo.model;

public class Jugador {

    private Integer idJugador;
    private Integer numero;
    private String nombre;
    private Boolean estaJugando;

    public Jugador(Integer idJugador, Integer numero, String nombre, Boolean estaJugando) {
        this.idJugador = idJugador;
        this.numero = numero;
        this.nombre = nombre;
        this.estaJugando = estaJugando;
    }

    public Integer getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstaJugando() {
        return estaJugando;
    }

    public void setEstaJugando(Boolean estaJugando) {
        this.estaJugando = estaJugando;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "idJugador=" + idJugador +
                ", numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", estaJugando=" + estaJugando +
                '}';
    }
}
