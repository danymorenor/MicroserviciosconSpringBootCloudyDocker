package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AgendaDao;
import model.Contacto;

@Service
public class AgendaServiceImpl implements AgendaService {

	@Autowired
	AgendaDao dao;
	
	@Override
	public boolean agregarContacto(Contacto contacto) {
		//SE VALIDA SI EL CONTACTO NO EXISTE, SE AGREGA Y SI YA EXISTE NO SE HACE NADA
		if(dao.recuperarContacto(contacto.getIdContacto())==null) {			
			dao.agregarContacto(contacto);
			return true;
		}
		return false;		
	}

	@Override
	public List<Contacto> recuperarContactos() {
		//SE AGREGA UN TIEMPO PARA VER EL EFECTO EN EL MICROSERVICIO 05_B
		/*try {
			Thread.sleep(8000); //8 SEGUNDOS
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		return dao.devolverContactos();
	}

	@Override
	public void actualizarContacto(Contacto contacto) {
		//VALIDA SI HAY CONTACTO QUE ACTUALIZAR, SINO PUES NO HACE NADA
		if(dao.recuperarContacto(contacto.getIdContacto())!=null) {			
			dao.agregarContacto(contacto);
		}
	}

	@Override
	public boolean eliminarContacto(int idContacto) {
		//VALIDA SI EXISTE, ENTONCES LO ELIMINA
		if(dao.recuperarContacto(idContacto)!=null) {			
			dao.eliminarContacto(idContacto);
			return true;
		}
		return false;	
	}

	@Override
	public Contacto buscarContacto(int idContacto) {
		return dao.recuperarContacto(idContacto);
	}

	@Override
	public List<Contacto> recuperarContactosXnombre(String nombre) {
		return dao.devolverContactoXnombre(nombre);
	}
	
	@Override
	public List<Contacto> recuperarContactosXedad(Integer edad) {
		return dao.devolverContactoXedad(edad);
	}
}
