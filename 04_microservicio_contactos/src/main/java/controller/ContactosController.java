package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Contacto;
import service.AgendaService;

//ESTA ES LA CLASE QUE EXPONE LOS SERVICIOS

@RestController
public class ContactosController {

	@Autowired 
	AgendaService service;
	
	//OBTENER LOS CONTACTOS
	@GetMapping(value="contactos",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Contacto> recuperarContactos() {
		return service.recuperarContactos();
	}
	
	//OBTENER UN CONTACTO
	@GetMapping(value="contactos/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Contacto recuperarContactos(@PathVariable("id") int id) {
		return service.buscarContacto(id);			
	}
	
	//INSERTAR UN CONTACTO
	@PostMapping(value="contactos",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.TEXT_PLAIN_VALUE)
	public String guardarContacto(@RequestBody Contacto contacto) {
		return String.valueOf(service.agregarContacto(contacto));
	}
	
	//ACTUALIZAR CONTACTO
	@PutMapping(value="contactos",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizarContacto(@RequestBody Contacto contacto) {
		service.actualizarContacto(contacto);
	}
	
	//ELIMINAR CONTACTO
	@DeleteMapping(value="contactos/{id}")
	public void eliminarPorId(@PathVariable("id") int id) {
		service.eliminarContacto(id);
	}
	
}
