package com.company;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Curso frontEnd = new Curso("FrontEnd", "curso basico", 9,2,1000.0);
    Curso backEnd = new Curso("BackEnd", "curso basico", 7,2,900.0);


    Programa fullStack = new Programa("FullStack","curso básico", 0.2);
    fullStack.agregar(frontEnd);
    fullStack.agregar(backEnd);

    Taller taller1 = new Taller("javascript", "javascript-vanilla", 5, 800.0);
    Taller taller2 = new Taller("javascipt2", "javascript React", 4, 900.0);

    Carrera desarrollo = new Carrera("Desarrollo1", "Desarrollo Basico Frontend", 8000.0);
    try {
        desarrollo.agregar(frontEnd);
    }catch (CarreraException e){
        System.out.println(e.getMessage());
    }
    try {
        desarrollo.agregar(taller1);
    }catch (CarreraException e){
        System.out.println(e.getMessage());
    }
    try {
        desarrollo.agregar(taller2);
    }catch (CarreraException e){
        System.out.println(e.getMessage());
    }

    Informe informe = new Informe();
    informe.agregarOferta(fullStack);
    informe.agregarOferta(frontEnd);
    informe.agregarOferta(backEnd);
    informe.agregarOferta(taller1);
    informe.agregarOferta(taller2);
    informe.agregarOferta(desarrollo);
    informe.generarInforme();

    }
}
