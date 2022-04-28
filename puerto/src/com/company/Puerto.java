package com.company;

import java.util.ArrayList;
import java.util.List;

public class Puerto {

    private List<Contenedor> contenedores;

    public Puerto() {
        contenedores = new ArrayList<>();
    }

    public void agregarContenedor( Contenedor contenedor){
        contenedores.add(contenedor);
    }

    public Integer cantContenedoresPeligrosos(){
        Integer contenedoresPeligrosos = 0;
        for (Contenedor contenedor : contenedores) {
            if( contenedor.getPais() == "Desconocido" ){
                contenedoresPeligrosos ++;
            }
        }
        return contenedoresPeligrosos;
    }


}
