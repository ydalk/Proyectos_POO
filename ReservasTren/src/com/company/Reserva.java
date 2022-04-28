package com.company;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private Integer codigo;
    private Recorrido recorrido;
    private Integer cantPersonas;
    private Double precioBoleto;

    public Reserva(Integer codigo, Recorrido recorrido, Integer cantPersonas) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantPersonas = cantPersonas;
        precioBoleto = 50.0;
    }

    public Double calcularPrecio(){

        System.out.println("calcular precio");
        Double totalBoleto = precioBoleto;

        return totalBoleto;
    }

    private List<String> getEstacionesHabilitadas(){
        List<String> estacionesHabilitadas = new ArrayList<>();

        estacionesHabilitadas.add("Buenos Aires");
        estacionesHabilitadas.add("Luján");
        estacionesHabilitadas.add("Mercedes");
        estacionesHabilitadas.add("Suipacha");
        estacionesHabilitadas.add("Chivilcoy");
        estacionesHabilitadas.add("Alberti");
        estacionesHabilitadas.add("Bragado");

        return estacionesHabilitadas;
    }
}
