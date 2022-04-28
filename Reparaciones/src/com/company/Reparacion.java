package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Reparacion {

    private String nombreArticulo;
    private Double costoProducto;
    private String direccionEntrega;
    private Estado estadoActual;

    public Reparacion(String nombreArticulo, String direccionEntrega) {
        this.nombreArticulo = nombreArticulo;
        this.direccionEntrega = direccionEntrega;
        costoProducto = 0.0;
        estadoActual = new EstadoEnPresupuesto(this);
    }


    public void cambiarDireccion(String nuevaDireccion){
        estadoActual = estadoActual.cambiarDireccion(nuevaDireccion);
    };
    public void darValorPresupuesto(){
        estadoActual = estadoActual.valorPresupuesto();
    };
    public void agregarRepuesto(){
        estadoActual = estadoActual.sumRepuestos();
    };
    public void pasarAlSiguientePaso(){
        estadoActual = estadoActual.siguientePaso();
    };


    public Double getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(Double costoProducto) {
        this.costoProducto = costoProducto;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    @Override
    public String toString() {
        return "Reparacion " + '\n' +
                "nombre: " + nombreArticulo + '\n' +
                "costo: " + costoProducto + '\n' +
                "direccionEntrega: " + direccionEntrega + '\n' +
                "estadoActual: " + estadoActual;
    }

}
