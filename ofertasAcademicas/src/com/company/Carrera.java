package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrera extends OfertaAcademica implements Empaquetable{

    private Double valorBasico;
    private List<Empaquetable> carreras;
    private Double precioCarrera;


    public Carrera(String nombre, String descripcion, Double valorBasico) {
        super(nombre, descripcion);
        this.valorBasico = valorBasico;
        carreras = new ArrayList<>();
        precioCarrera = 0.0;
    }


    public void agregar( Empaquetable empaquetable) throws CarreraException{

        if( empaquetable instanceof Curso){

            Integer horas = ((Curso)empaquetable).getCargaHoraria();

            if(horas > 10){
                carreras.add(empaquetable);
            }
            throw new CarreraException("No se pueden agregar cursos que tengan menos de 10 horas.");
        }else{
            carreras.add(empaquetable);
        }

    }

    @Override
    public Double calcularPrecio() {

        Double sumaCursosTalleres = 0.0;

        for (Empaquetable carrera : carreras) {

            sumaCursosTalleres += carrera.calcularPrecio();
        }

        precioCarrera = sumaCursosTalleres + valorBasico;

        return precioCarrera;
    }

    public String toString(){
        return "Carrera: " + getNombre() + ", precio =  " + precioCarrera + " pesos.";
    }


}
