package com.jose.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jose.modelos.Artista;
import com.jose.modelos.Cancion;
import com.jose.repositorios.RepositorioArtistas;

@Service
public class ServicioArtistas {
	
	@Autowired
	private RepositorioArtistas repositorioArtistas;
	
	public List<Artista> obtenerTodosLosArtistas(){
		return (List<Artista>) repositorioArtistas.findAll();
	}
	
	public Artista obteArtistaPorId(Long id) {
		return repositorioArtistas.findById(id).orElse(null);
	}
	
	public Artista agregarArtista(Artista artista) {
		return repositorioArtistas.save(artista);
	}
	
	public List<Cancion> obtenerCancionesPorArtista(Long idArtista){
		Artista artista = obteArtistaPorId(idArtista);
		return (artista != null) ? artista.getListaCanciones() : null;
	}
}
