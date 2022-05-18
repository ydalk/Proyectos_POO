package dh.vendedores.main.service;

import dh.vendedores.main.model.Afiliado;
import dh.vendedores.main.model.Vendedor;

public class CategorizarAfiliado extends Categorizar{

    @Override
    protected Integer calcularPuntos(Vendedor vendedor) {

        Integer totalPuntos = 0;

        if( vendedor instanceof Afiliado){
            Afiliado afiliado = (Afiliado) vendedor;

            totalPuntos = afiliado.getCantVentas() * 15;
        }
        return totalPuntos;
    }
}
