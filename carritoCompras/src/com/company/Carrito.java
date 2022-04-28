package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> listaProductos;
    private Estado estadoActual;

    public Carrito(){
        listaProductos = new ArrayList<>();
        estadoActual = new EstadoVacio();
    }

    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
        estadoActual = estadoActual.agregar();
    }

    public void cancelarCarrito(){
        estadoActual = estadoActual.cancelar();
        listaProductos = new ArrayList<>();
    }

    public void Volver(){
        estadoActual = estadoActual.volver();
    }

    public void pasarSiguienteEstado(){
        estadoActual = estadoActual.pasar();
    }

}
