package com.clases;

public class Televisor extends ProductoElectrodomestico {
	//Atributos
	private int tamañoPantalla;
    private String resolución;

    // Constructor para inicializar atributos
    public Televisor(String nombre, double precio, int cantidadDisponible, int tamañoPantalla, String resolución) {
        super(nombre, precio, cantidadDisponible);
        this.tamañoPantalla = tamañoPantalla;
        this.resolución = resolución;
    }

    // Getters y Setters
    public int getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(int tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getResolución() {
        return resolución;
    }

    public void setResolución(String resolución) {
        this.resolución = resolución;
    }

    // Sobrescribir método mostrarInformacion() para mostrar detalles específicos de Televisor
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Mostrar los detalles de ProductoElectrodomestico
        System.out.println("Tamaño de pantalla: " + tamañoPantalla + " pulgadas");
        System.out.println("Resolución: " + resolución);
    }
	
	
}
