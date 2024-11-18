package com.jose.controllers;

import java.util.HashMap;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ControladorPeliculas {
	// Atributos
	private static HashMap<String, String> listaPeliculas = new HashMap<String, String>();
	
	// Constructor que llena la lista con datos de prueba
    public ControladorPeliculas() {
        listaPeliculas.put("Winnie the Pooh", "Don Hall");
        listaPeliculas.put("El zorro y el sabueso", "Ted Berman");
        listaPeliculas.put("Tarzán", "Kevin Lima");
        listaPeliculas.put("Mulán", "Barry Cook");
        listaPeliculas.put("Oliver", "Kevin Lima");
        listaPeliculas.put("Big Hero 6", "Don Hall");
    }
    
    // Método para obtener todas las películas
    
    @GetMapping("/peliculas")
    public String obtenerTodasLasPeliculas() {
    	return listaPeliculas.keySet().stream().collect(Collectors.joining(", "));
    }
    
    // Método para obtener una película por su nombre
    
    @GetMapping("/{nombre}")
    public String obtenerPeliculaPorNombre(@PathVariable String nombre) {
    	for(String key : listaPeliculas.keySet()) {
    		if(key.equalsIgnoreCase(nombre)) {
    			return "Pelicula: " + key + ", Director: " + listaPeliculas.get(key);
    		}
    	}
    	return "La película no se encuentra en nuestra lista.";
    }
    
 // Método para obtener películas por el nombre del director
    
    @GetMapping("/director/{nombre}")
    public String obtenerPeliculasPorDirector(@PathVariable String nombre) {
        String peliculasPorDirector = listaPeliculas.entrySet().stream()
        		.filter(entry -> entry.getValue().equalsIgnoreCase(nombre))
        		.map(entry -> entry.getKey())
        		.collect(Collectors.joining(", "));
        
        if(!peliculasPorDirector.isEmpty()) {
        	return "Peliculas dirigidas por " + nombre + ":" + peliculasPorDirector;
        }else {
        	return "No contamos con peliculas con ese director. ";
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
