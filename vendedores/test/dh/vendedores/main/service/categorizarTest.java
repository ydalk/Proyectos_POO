package dh.vendedores.main.service;

import dh.vendedores.main.model.Afiliado;
import dh.vendedores.main.model.Empleado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class categorizarTest {

    @Test
    public void categorizarAfiliado(){
        Categorizar cat1 = new CategorizarAfiliado();
        Afiliado afiliado = new Afiliado("Luis");
        afiliado.vender();
        afiliado.vender();

        String resEsperada = "El vendedor Luis con categoria aprendiz tiene 30 puntos.";
        String resulado = cat1.mostrarCategoria( afiliado );

        assertEquals(resEsperada, resulado);

    }

    @Test
    public void categorizarEmpleado(){
        Categorizar cat1 = new CategorizarEmpleado();
        Empleado empleado = new Empleado("Miguel",2,3);
        empleado.vender();
        empleado.vender();

        String resEsperada = "El vendedor Miguel con categoria maestro tiene 50 puntos.";
        String resulado = cat1.mostrarCategoria( empleado );

        assertEquals(resEsperada, resulado);

    }






}