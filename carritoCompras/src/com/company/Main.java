package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Carrito carrito = new Carrito();

        carrito.agregarProducto( new Producto("camiseta", 530.0));
        carrito.agregarProducto( new Producto("pantalon", 750.0));
        carrito.pasarSiguienteEstado();
        carrito.Volver();
        carrito.cancelarCarrito();

        carrito.agregarProducto( new Producto("camiseta", 530.0));
        carrito.agregarProducto( new Producto("camiseta", 530.0));
        carrito.pasarSiguienteEstado();
        carrito.cancelarCarrito();
        carrito.pasarSiguienteEstado();
        //carrito.agregarProducto( new Producto("camiseta", 530.0));
        //carrito.agregarProducto( new Producto("camiseta", 530.0));
        //carrito.agregarProducto( new Producto("camiseta", 530.0));

    }
}
