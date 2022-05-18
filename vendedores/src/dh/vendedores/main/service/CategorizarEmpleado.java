package dh.vendedores.main.service;

import dh.vendedores.main.model.Empleado;
import dh.vendedores.main.model.Vendedor;

public class CategorizarEmpleado extends Categorizar{


    @Override
    protected Integer calcularPuntos(Vendedor vendedor) {
        Integer totalPuntos = 0;
        Integer totalPuntosAfiliados = 0;
        Integer totalPuntosVentas = 0;
        Integer totalPuntosXAnnio = 0;

        if( vendedor instanceof Empleado){
            Empleado empleado = (Empleado) vendedor;

            totalPuntosAfiliados = empleado.getCantAfiliados() * 10;
            totalPuntosVentas = vendedor.getCantVentas() * 5;
            totalPuntosXAnnio =  empleado.getAnioAntiguedad() * 5;

        }

        return totalPuntos = totalPuntosAfiliados + totalPuntosVentas + totalPuntosXAnnio;
    }
}
