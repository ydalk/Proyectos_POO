package com.company;

public class FiguraGeometrica {

    private double valor;
    private double area;
    private String figura;

    public FiguraGeometrica(String figura) {
        this.figura = figura;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public boolean esMayorCero(double valor){
        if( valor != 0){
            calcularArea(valor);
            return true;
        }else{
            System.out.println("El valor del radio o lado debe ser mayor que cero");
            return false;
        }
    }

    public void calcularArea(double valor ){

        if( figura.equals("circulo")){
            area = (Math.PI) * Math.pow(valor, 2);
            System.out.println("El área del " + figura + " es: " + area + " unidades");
        }else if( figura.equals("cuadrado")){
            area = Math.pow(valor,2);
            System.out.println("El área del " + figura + " es: " + area + " unidades");
        }

    }
}
