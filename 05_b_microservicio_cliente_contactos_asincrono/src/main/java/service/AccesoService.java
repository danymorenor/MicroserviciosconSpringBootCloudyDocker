package service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import model.Persona;

public interface AccesoService {

	//ESTE METODO SE LLAMA DE FORMA ASINCRONA 
	CompletableFuture<List<Persona>> llamadaServicio(Persona persona);

}