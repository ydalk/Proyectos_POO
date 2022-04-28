package com.company;

public class EstadoParaEnvio implements Estado {

    private Reparacion articulo;

    public EstadoParaEnvio(Reparacion art) {
        this.articulo = art;
    }

    @Override
    public Estado cambiarDireccion( String nuevaDireccion) {
        articulo.setDireccionEntrega(nuevaDireccion);
        System.out.println("cambio direccion de Estado Envio" + nuevaDireccion);
        return this;
    }

    @Override
    public Estado valorPresupuesto() {
        return new EstadoEnPresupuesto(articulo);
    }

    @Override
    public Estado sumRepuestos() {
        return new EstadoEnReparacion(articulo);
    }

    @Override
    public Estado siguientePaso() {
        return new EstadoFinalizado(articulo);
    }



}
