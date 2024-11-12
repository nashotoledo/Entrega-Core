package com.clases;

public class ProductoElectrodomestico {
	//Atributos
	public String nombre;
	public double precio;
	public int cantidadDisponible;

	public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}
		
	public ProductoElectrodomestico(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
	public void mostrarInformacion() {
		System.out.println("Producto: " + this.nombre);
		System.out.println("Precio: " + this.precio);
		System.out.println("Cantidad disponible: " + this.cantidadDisponible);
	}
}
