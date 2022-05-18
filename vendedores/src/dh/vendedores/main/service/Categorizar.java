package dh.vendedores.main.service;

import dh.vendedores.main.model.Vendedor;

public abstract class Categorizar {

    private String categoria;

    public String mostrarCategoria(Vendedor vendedor){
        Integer puntosTotales = calcularPuntos(vendedor);
        categorizar(puntosTotales);

        return "El vendedor " + vendedor.getNombre() + " con categoria " + categoria + " tiene " + puntosTotales + " puntos.";
    }

    protected abstract Integer calcularPuntos(Vendedor vendedor);

    public String categorizar( Integer puntosTotales){

        if( puntosTotales < 20){
            categoria = "novato";
        }else if( puntosTotales <= 20 || puntosTotales <= 30){
            categoria = "aprendiz";
        }else if( puntosTotales >30 || puntosTotales <= 40 ){
            categoria = "bueno";
        }else if( puntosTotales > 40){
            categoria = "maestro";
        }
        else{
            categoria = "No tiene categoria definida";
        }

        return categoria;
    }
}
