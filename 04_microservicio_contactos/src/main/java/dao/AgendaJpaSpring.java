package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import model.Contacto;

public interface AgendaJpaSpring extends JpaRepository<Contacto, Integer>{

	//METODO PARA HACER UNA BUSQUEDA POR EMAIL
	Contacto findByEmail(String email);
	
	//METODO PARA ELIMINAR UN CONTACTO DE ACUERDO A SU EMAIL, CON UNA INSTRUCCION JPQL
	@Transactional
	@Modifying
	@Query("Delete from Contacto c where c.email=?1")
	void eliminarPorEmail(String email);
	
	
	//METODO CON QUERY ANOTATION
	@Query( "from  Contacto  where nombre=?1")
	public List<Contacto> buscaXNombre(String nombre);
	
	
	//METODO CON QUERY ANOTATION
	@Query( "from  Contacto  where edad=?1")
	public List<Contacto> buscaXedad(Integer edad);
	
}
