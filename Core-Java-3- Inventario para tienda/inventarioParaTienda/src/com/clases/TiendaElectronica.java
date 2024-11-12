package com.clases;

import java.util.ArrayList;
import java.util.Iterator;

public class TiendaElectronica {
	//Atributos
	public ArrayList<ProductoElectrodomestico> listaDeProductos;
	
	//Constreuctor inicializar inventario
	public TiendaElectronica() {
		this.listaDeProductos = new ArrayList<>();
	}
	
	//Metodo agregar Producto
	public void agregarProducto(ProductoElectrodomestico producto) {
		listaDeProductos.add(producto);
	}
	
	//Metodo mostrar todos los productos
	public void mostrarProductos() {
		for(ProductoElectrodomestico producto : listaDeProductos) {
			producto.mostrarInformacion();
			System.out.println("---------------");
		}
	}
	
	//Metodo buscar producto por nombre
	public ProductoElectrodomestico buscarProductoPorNombre(String nombre) {
		for(ProductoElectrodomestico producto : listaDeProductos) {
			if(producto.getNombre().equalsIgnoreCase(nombre)) {
				return producto;
			}
		}
		return null; // Si no se encuentra el producto
	}
	
	//Método para realizar una venta
	public void realizarVenta(String nombreProducto, int cantidad) {
		ProductoElectrodomestico producto = buscarProductoPorNombre(nombreProducto);
		if(producto != null) {
			int cantidadDisponible = producto.getCantidadDisponible();
			if(cantidadDisponible >= cantidad) {
				producto.setCantidadDisponible(cantidadDisponible - cantidad);
				System.out.println("Venta Realizada: " + cantidad + "uds.- " + nombreProducto);
			}else {
				System.out.println("Agotado. Sin Stock.");
			}
		}else {
			System.out.println("Producto no encontrado.");
		}
	}
	
	
	
	
	
	

	
}
