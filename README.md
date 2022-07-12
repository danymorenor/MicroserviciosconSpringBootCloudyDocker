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
  Se modifica ApplicaationTests.java
  Se hacen pruebas con junit Sobre la clase anterior Run As / Junit test
  El resultado sale en la consola
  
    
  
  
  
  
  
