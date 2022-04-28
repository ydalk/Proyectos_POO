package com.company;

public class EstadoEnPresupuesto implements Estado {

    private Reparacion articulo;
    private Double presupuesto = 230.0;

    public EstadoEnPresupuesto(Reparacion articulo) {
        this.articulo = articulo;
    }

    @Override
    public Estado siguientePaso() {
        return new EstadoEnReparacion(articulo);
    }


    @Override
    public Estado cambiarDireccion(String nuevaDireccion) {
        return new EstadoParaEnvio(articulo);
    }

    public Estado valorPresupuesto(){
        articulo.setCostoProducto(presupuesto);
        System.out.println("valor del presupuesto es " + presupuesto);
        return this;
    }

    @Override
    public Estado sumRepuestos() {
        return this;
    }


    ;
}
