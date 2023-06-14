package service;

import java.util.List;

import model.Contacto;

public interface AgendaService {
	boolean agregarContacto(Contacto contacto);
	List<Contacto> recuperarContactos();
	void actualizarContacto(Contacto contacto);
	boolean eliminarContacto(int idContacto);
	Contacto buscarContacto(int idContacto);
<<<<<<< HEAD
	void actualizarContacto(Contacto contacto);
	List<Contacto> recuperarContactosXnombre(String nombre);
	List<Contacto> recuperarContactosXedad(Integer edad);
}
=======
} 
>>>>>>> 90382e8db7bb9098da8e2f055cfebe534b0611c5
