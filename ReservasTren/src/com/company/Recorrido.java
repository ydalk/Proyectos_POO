package com.company;

import java.util.ArrayList;
import java.util.List;

public class Recorrido {
    private String estacionPartida;
    private String estacionDestino;
    private List<Estacion> listaEstaciones;

    public Recorrido(String estacionPartida, String estacionDestino) {

        this.estacionPartida = estacionPartida;
        this.estacionDestino = estacionDestino;
    }

    public String getEstacionPartida() {
        return estacionPartida;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }
}
