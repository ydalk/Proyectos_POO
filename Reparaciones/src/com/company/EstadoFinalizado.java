package com.company;

public class EstadoFinalizado implements Estado {

    private Reparacion articulo;

    public EstadoFinalizado(Reparacion articulo) {
        this.articulo = articulo;
    }

    @Override
    public Estado cambiarDireccion(String nuevaDireccion) {
        return new EstadoParaEnvio(articulo);
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
        return new EstadoEnPresupuesto(articulo);
    }
}
