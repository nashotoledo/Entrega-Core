package com.jose.modelos;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="canciones")
public class Cancion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "El título no puede estar vacío.")
    @Size(min = 5, message = "El título debe tener al menos 5 caracteres.")
	private String titulo;
	
	
	@ManyToOne
	@JoinColumn(name = "id_artista")
	private Artista artista;
	
	@NotBlank(message = "El álbum no puede estar vacío.")
    @Size(min = 3, message = "El álbum debe tener al menos 3 caracteres.")
	private String album;
	
	@NotBlank(message = "El género no puede estar vacío.")
    @Size(min = 3, message = "El género debe tener al menos 3 caracteres.")
	private String genero;
	
	@NotBlank(message = "El idioma no puede estar vacío.")
    @Size(min = 3, message = "El idioma debe tener al menos 3 caracteres.")
	private String idioma;
	
	@Column(name = "fecha_creacion", updatable = false)
	private LocalDateTime fecha_creacion;
	
	@Column(name = "fecha_actualizacion", insertable = false)
	private LocalDateTime fecha_actualizacion;
	
	
	public Cancion(Long id,String titulo,Artista artista,String album,String genero,String idioma,
			LocalDateTime fecha_creacion, LocalDateTime fecha_actualizacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.artista = artista;
		this.album = album;
		this.genero = genero;
		this.idioma = idioma;
		this.fecha_creacion = fecha_creacion;
		this.fecha_actualizacion = fecha_actualizacion;
	}
	
	public Cancion() {
		super();
		this.id = 0l;
		this.titulo = "";
		this.artista = new Artista();
		this.album = "";
		this.genero = "";
		this.idioma = "";
		this.fecha_creacion = LocalDateTime.now();
		this.fecha_actualizacion = LocalDateTime.now();
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public LocalDateTime getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(LocalDateTime fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public LocalDateTime getFecha_actualizacion() {
		return fecha_actualizacion;
	}

	public void setFecha_actualizacion(LocalDateTime fecha_actualizacion) {
		this.fecha_actualizacion = fecha_actualizacion;
	}
	
	

	
	
	
	
}
