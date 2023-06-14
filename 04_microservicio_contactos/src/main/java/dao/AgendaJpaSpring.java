package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import model.Contacto;

public interface AgendaJpaSpring  extends JpaRepository<Contacto, Integer>{
	Contacto findByEmail(String email);
	@Transactional
	@Modifying
	@Query("Delete from Contacto c Where c.email=?1")
	void eliminarPorEmail(String email);
<<<<<<< HEAD
	
	
	//METODO CON QUERY ANOTATION
	@Query( "from  Contacto  where nombre=?1")
	public List<Contacto> buscaXNombre(String nombre);
	
	
	//METODO CON QUERY ANOTATION
	@Query( "from  Contacto  where edad=?1")
	public List<Contacto> buscaXedad(Integer edad);
	
}
=======
} 
>>>>>>> 90382e8db7bb9098da8e2f055cfebe534b0611c5
