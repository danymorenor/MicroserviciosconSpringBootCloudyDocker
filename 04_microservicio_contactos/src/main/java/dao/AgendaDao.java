package dao;

import java.util.List;

import model.Contacto;

public interface AgendaDao {

	void agregarContacto(Contacto contacto);

	Contacto recuperarContacto(String email);

	void eliminarContacto(String email);

	List<Contacto> devolverContactos();
	
	void eliminarContacto(int idContacto);
	
	Contacto recuperarContacto(int idContacto);
	
	void actualizarContacto(Contacto contacto);
	
<<<<<<< HEAD
	List<Contacto> devolverContactoXnombre(String nombre);
	
	List<Contacto> devolverContactoXedad(Integer edad);
	
}
=======
} 
>>>>>>> 90382e8db7bb9098da8e2f055cfebe534b0611c5
