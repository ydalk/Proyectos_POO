package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Persona persona = new Persona("Caro", "Porras", 1234, 37);
    TituloTerciario titulo = new TituloTerciario(persona, 8, "21/03/2006", "11/11/2011", true, true, "Nacional");
        System.out.println(persona.getNombre() + " puede ejercer: " + titulo.puedeEjercer());
        System.out.println(persona.getNombre() + " tiene " + titulo.validar());

   Persona persona2 = new Persona("Luis", "Lopez", 5421, 28);
   TituloTerciario titulo2 = new TituloTerciario(persona2, 11, "21/03/2008", "11/11/2015", true, false, "Provincial");
        System.out.println(persona2.getNombre() + " puede ejercer: " + titulo2.puedeEjercer());
        System.out.println(persona2.getNombre() + " tiene " + titulo2.validar());

    TituloLicenciatura titulo1 = new TituloLicenciatura(persona, 7, "24/09/2012", "10/12/2017", true, false,"BaseDatos", "09/10/2018", 15 );
    TituloLicenciatura titulo3 = new TituloLicenciatura(persona2, 15, "24/09/2018", "10/12/2021", false, true,"POO", "09/10/2022", 8 );

        System.out.println( persona.getNombre() + " puede ejercer: " +titulo1.puedeEjercer());
        System.out.println( persona.getNombre() + " su titulo de licenciatura es " + titulo3.compareTo(titulo1));
        System.out.println( persona2.getNombre() + " su titulo de licenciatura es " + titulo1.compareTo(titulo3));

    }
}
