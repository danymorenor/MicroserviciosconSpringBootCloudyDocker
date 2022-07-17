# MicroserviciosconSpringBootCloudyDocker
Del curso de UDEMY Microservicios con SpringBoot Cloud y Docker

8. Creacion de un primer microservicio
  Se crea el proyectito microservicio_ejemplo
  File / New / Other / Spring Boot / Spring Starter Project
  Se creo un SaludoController que solo da la bienvenida
  Se modifico el application.properties para apuntar a otro puerto y especificar el context path
  Se ejecuta con Boton derecho, Run As / Spring Boot App
  Corre sobre localhost:4000/saludo
              localhost:4000/saludo/Danyboy

12.Ejercicio practico mapeado a de objetos a JSON 
  Se crea el proyecto 02_microservicio_cursos
  Se crea el bean Curso
  Se cera CursosController el cual devuelve varios cursos o un curso en especifico
  Se ejecuta con Boton derecho, Run As / Spring Boot App
  Corre sobre http://localhost:8080/cursos
              http://localhost:8080/curso
              http://localhost:8080/curso/Spring
  Si se abre con firefox se ve mas padre            

13.Ejercicio practico mapeando a objetos XML
  Se utiliza el proyecto 02microservicio_cursos
  Se agreaga una dependency al pon.xml
	    <dependency>
			<groupId>com.fasterxml.jackson.dataformat</groupId>
			<artifactId>jackson-dataformat-xml</artifactId>
		</dependency>
   Se cambia una etiqueta en el CursoController.xml
    MediaType.APPLICATION_XML_VALUE

15.Desarrollo de un servicio completo
  Se crea una copia del proyecto anterio y se renombra 03_microservicio_cursos_crud
    Se implementan metodos: GET -> recuperar
                            POST -> insertar
                            PUT -> actualizar
                            DELETE -> eliminar
16.Testing de servicios
  Trabaja con el proyecto 03_microservicio_cursos_crud con JUNIT
  Se modifica ApplicaationTests.java y se crean metodos para probar el borrado, mostrar los cursos, actualizar , e insertar
  Para probar con junit sobre la clase ApplicaationTests Run As / Junit test
  Y el resultado sale en la consola, mostrando los cursos , el que se agrega  y luego ya modificado
  
19.Desarrollo de un pmicroservicio de contactos I
			----------------------------
	Se crea proyecto 04_microservicio_contactos
			----------------------------
    	Se implementa JPA y Spring Data JPA , MySql Driver, Spring Web
	Se setea project facets seleccionando JPA y Java
	Boton derecho sobre el proyecto JPA Tools/ Generate Entities from Tables
	Se ponen el driver y los datos de conexion de la base
	Se genera una entiti seleccionado cotactos y genera Contacto.java
20.Desarrollo de un pmicroservicio de contactos II
	Se crea la capa DAO
	Se crea AgendaDao
	Se crea AgendaJpaSpring  (se usa JPQL)
	Se crea AgendaDaoImp 
21.Desarrollo de un pmicroservicio de contactos III	
	Se crea la capa de servicio	
	Se crea interface AgendaService.java
	Se crea AgendaServiceImpl.java (Se agrega @Service)
22.Desarrollo de un pmicroservicio de contactos IV	
	Se crea el controlador ContactosController.java (@Restcontroller)
	Se implementan metodos: GET -> recuperar
                            	POST -> insertar
                            	PUT -> actualizar
                            	DELETE -> eliminar
	Se ingresan datos de conexion en application.properties
	Se hacen pruebas con postman
	
23.Ejemplo de cliente front
	Se descarga un proyecto que se tiene en angular / javascript
	Se ejecuta y se obtiene un listado de cursos y en cada uno un link para eliminar
24.Empaquetado y despliegue
	Boton derecho sobre el proyecto Run As / Maven build...
	En Goals se pone deploy
	Clic en run  y genera un archivo jar en el workspace / nombre del proyecto
	Ese jar se puede copiar a otro equipo y en ese equipo se ejecuta desde linea de comandos
		java -jar nombredeljar.jar
	Se ejecuta y se puede probar accediendo a locahltos:8080\cursos
	
	
	
	
	
    	    
  
  
  
  
  
