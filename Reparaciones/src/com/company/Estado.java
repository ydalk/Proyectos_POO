package com.company;

public interface Estado {

    public Estado cambiarDireccion(String nuevaDireccion);
    public Estado valorPresupuesto();
    public Estado sumRepuestos();
    public Estado siguientePaso();

}
