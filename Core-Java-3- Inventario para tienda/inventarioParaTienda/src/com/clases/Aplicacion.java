package com.clases;

public class Aplicacion {
	public static void main(String[] args) {
		//Crear la tienda electronica
		TiendaElectronica tienda = new TiendaElectronica();
		
		// Crear productos
        Televisor televisor = new Televisor("Samsung 55 pulgadas", 2000.00, 10, 55, "4K");
        ComputadoraPortatil computadora = new ComputadoraPortatil("HP Spectre x360", 5000.00, 5, "HP", 16, "SN123456");

        // Agregar productos al inventario
        tienda.agregarProducto(televisor);
        tienda.agregarProducto(computadora);

        // Mostrar todos los productos
        System.out.println("Inventario de la tienda:");
        tienda.mostrarProductos();

        // Realizar algunas ventas
        System.out.println("Venta:");
        tienda.realizarVenta("Samsung 55 pulgadas", 3);  // Debería reducir la cantidad disponible
        System.out.println("Venta:");
        tienda.realizarVenta("HP Spectre x360", 6);     // Debería mostrar mensaje de agotado
        System.out.println("---------------");

        // Mostrar inventario después de las ventas
        System.out.println("Inventario actualizado:");
        tienda.mostrarProductos();
    }
	
}
