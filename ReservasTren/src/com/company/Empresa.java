package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Reserva> listaReserva;
    private List<Estacion> estacionesRecorridas;


    public Empresa(List<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
        estacionesRecorridas = new ArrayList<>();
    }

    public Double recaudacionTotal(){

        Double boleto = 50.0;

        return boleto;
    }

    public Integer cantVecesRecorrido( String estacion){

        if(!getEstacionesHabilitadas().contains(estacion)) throws EmpresaException{

            throw new EmpresaException( estacion + " no es una estacion valida");

            Integer cantidadPersonas = 0;

            for( Recorrido recorrido : estacionesRecorridas){
                if( recorrido.getEstacionDestino().equals(estacion)){
                    cantidadPersonas++;
                }
                if( recorrido.getEstacionPartida().equals(estacion)){
                    cantidadPersonas++;
                }

            }
        }


        Integer total =0;

        return total;
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
