package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiguraGeometricaTest {

    FiguraGeometrica circulo;
    FiguraGeometrica cuadrado;

    @BeforeEach void doBefore(){
        circulo = new FiguraGeometrica( "circulo");
        cuadrado = new FiguraGeometrica("cuadrado");
   }

   @Test void getTipoFigura(){
        assertEquals("circulo", circulo.getFigura());
        assertEquals("cuadrado", cuadrado.getFigura());
   }

   @Test void getEsMayorCero(){
        assertEquals(cuadrado.esMayorCero(15.0), true);
        assertEquals(circulo.esMayorCero(20.0), true);
        assertEquals(circulo.esMayorCero(0), false);

   }
}
