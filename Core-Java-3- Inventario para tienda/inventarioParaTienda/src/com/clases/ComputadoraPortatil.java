package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico{
	//Atributos
	private String marca;
    private int memoriaRAM;
    private String numeroSerie;

    // Constructor para inicializar atributos
    public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, int memoriaRAM, String numeroSerie) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.numeroSerie = numeroSerie;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    // Sobrescribir el método mostrarInformacion() para mostrar detalles específicos de Computadora
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Mostrar los detalles de ProductoElectrodomestico
        System.out.println("Marca: " + marca);
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("Número de serie: " + numeroSerie);
    }
	
}
