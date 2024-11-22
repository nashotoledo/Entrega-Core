package com.jose.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.jose.modelos.Cancion;
import com.jose.servicios.ServicioArtistas;
import com.jose.servicios.ServicioCanciones;

import jakarta.validation.Valid;

@Controller
public class ControladorCanciones {
	
	
	@Autowired
	private ServicioCanciones servicioCanciones;
	
	@Autowired ServicioArtistas servicioArtistas;
	
	@GetMapping("/canciones")
	public String desblegarCanciones(Model modelo) {
		modelo.addAttribute("canciones", servicioCanciones.obtenerTodasLasCanciones());
		return "canciones.jsp";
	}
	
	@GetMapping("/canciones/detalle/{idCancion}")
	public String desplegarDetalleCancion(@PathVariable Long idCancion, Model modelo) {
		Cancion cancion = servicioCanciones.obtenerCancionPorId(idCancion);
		modelo.addAttribute("cancion", cancion);
		return "detalleCancion.jsp";
	}
	
	@GetMapping("/canciones/formulario/agregar")
	public String formularioAgregarCancion(Model modelo) {
		modelo.addAttribute("cancion", new Cancion());
		modelo.addAttribute("listaArtistas", servicioArtistas.obtenerTodosLosArtistas());
		return "agregarCancion.jsp";
	}
	
	@PostMapping("/canciones/procesa/agregar")
	public String procesarAgregarCancion(@Valid @ModelAttribute("cancion") Cancion cancion,
                                         BindingResult validaciones, Model modelo) {
		if (validaciones.hasErrors()) {
			return "agregarCancion.jsp";  
		}
		servicioCanciones.agregarCancion(cancion);
		return "redirect:/canciones";  
	}
	
	@GetMapping("canciones/formulario/editar/{idCancion}")
	public String formularioEditarCancion(@PathVariable("idCancion") Long idCancion, Model modelo) {
	    Cancion cancion = servicioCanciones.obtenerCancionPorId(idCancion);
	    modelo.addAttribute("cancion", cancion); 
	    return "editarCancion.jsp"; 
	}
	
	@PutMapping("/canciones/procesa/editar/{idCancion}")
	public String procesaEditarCancion(@Valid @ModelAttribute("cancion") Cancion cancion,
			                           BindingResult validaciones, Model modelo,
			                           @PathVariable("idCancion") Long idCancion) {
		if(validaciones.hasErrors()) {
			return "editarCancion.jsp";
		}
		cancion.setId(idCancion);
		this.servicioCanciones.actualizaCancion(cancion);
		return "redirect:/canciones";
	}
	
	@DeleteMapping("/canciones/procesa/eliminar/{idCancion}")
	public String procesaEliminarDirector(@PathVariable("idCancion") Long idCancion) {
		this.servicioCanciones.eliminarCancion(idCancion);
		return "redirect:/canciones";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
