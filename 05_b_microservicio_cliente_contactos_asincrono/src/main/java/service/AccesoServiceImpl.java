package service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import model.Persona;

@Service
public class AccesoServiceImpl implements AccesoService {
	@Autowired
	RestTemplate template;
	
	String url = "http://localhost:8080";
	
	//ESTE METODO SE LLAMA DE FORMA ASINCRONA 
	@Override
	@Async
	public CompletableFuture<List<Persona>> llamadaServicio(Persona persona){
		template.postForLocation(url+"/contactos", persona);
		//RECUPERAR LA LISTA DE CONTACTOS
		Persona[] personas=template.getForObject(url+"/contactos", Persona[].class);
		return CompletableFuture.completedFuture(Arrays.asList(personas));
	}
	
}
