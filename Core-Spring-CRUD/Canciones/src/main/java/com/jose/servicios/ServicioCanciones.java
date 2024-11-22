package com.jose.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.jose.modelos.Cancion;
import com.jose.repositorios.RepositorioCanciones;

import jakarta.validation.Valid;

@Service
public class ServicioCanciones {
	
	@Autowired
	private RepositorioCanciones repositorioCanciones;
	
	public List<Cancion> obtenerTodasLasCanciones(){
		return repositorioCanciones.findAll();
	}
	
	public Cancion obtenerCancionPorId(Long id) {
		Optional<Cancion> cancion = repositorioCanciones.findById(id);
		return cancion.orElse(null);
	}
	
	public Cancion agregarCancion(Cancion cancion) {

        return repositorioCanciones.save(cancion);
    }
	
	public Cancion actualizaCancion(Cancion cancion) {
		
		return repositorioCanciones.save(cancion);
	}
	
	public void eliminarCancion(Long idCancion) {
		this.repositorioCanciones.deleteById(idCancion);
	}
	
}
