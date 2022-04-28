package com.company;

public class EstadoEnReparacion  implements Estado {

    private Reparacion articulo;
    Double valorRepuestos = 15.3;

    public EstadoEnReparacion(Reparacion art) {
        this.articulo = art;
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
        articulo.setCostoProducto(valorRepuestos + articulo.getCostoProducto());
        return this;
    }

    @Override
    public Estado siguientePaso() {
        return  new EstadoParaEnvio(articulo);
    }

}
