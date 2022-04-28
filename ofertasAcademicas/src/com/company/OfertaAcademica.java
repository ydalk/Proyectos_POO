package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class OfertaAcademica {

    private String nombre;
    private String descripcion;


    public OfertaAcademica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

}
