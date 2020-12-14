package com.cenfotec.exam3GraphQL.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cenfotec.exam3GraphQL.entities.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.exam3GraphQL.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepo;
	
	public List<Cliente> getAllClientes(int count) {
	return this.clienteRepo.findAll().stream().limit(count).collect(Collectors.toList());
	}
	
	public Optional<Cliente> getCliente(int id) {
	return this.clienteRepo.findById(id);
	}
	
	public Cliente createCliente(String nombre, String apellidoUno, String apellidoDos, String lugarResidencia, String direccionCobro, String numTarjeta, int mesVencimiento, int anioVencimiento) {
		
		Cliente cliente = new Cliente();
		cliente.setNombre(nombre);
		cliente.setApellidoUno(apellidoUno);
		cliente.setApellidoDos(apellidoDos);
		cliente.setLugarResidencia(lugarResidencia);
		cliente.setDireccionCobro(direccionCobro);
		cliente.setNumTarjeta(numTarjeta);
		cliente.setMesVencimiento(mesVencimiento);
		cliente.setAnioVencimiento(anioVencimiento);
		
		return this.clienteRepo.save(cliente);
	}
	
	public boolean deleteCliente(int id) {
		this.clienteRepo.deleteById(id);
		return true;
	}
	
	public Cliente updateCliente(int id, String nombre, String apellidoUno, String apellidoDos, String lugarResidencia, String direccionCobro, String numTarjeta, int mesVencimiento, int anioVencimiento){
	    Optional<Cliente> opCliente = clienteRepo.findById(id);

	    Cliente cliente = opCliente.get();
	    
	    if (opCliente.isPresent()) {
	    	
	      if (nombre != null)
	    	  cliente.setNombre(nombre);
	      if (apellidoUno != null)
	    	  cliente.setApellidoUno(apellidoUno);
	      if (apellidoDos != null)
	    	  cliente.setApellidoDos(apellidoDos);
	      if (lugarResidencia != null)
	    	  cliente.setLugarResidencia(lugarResidencia);
	      if (direccionCobro != null)
	    	  cliente.setDireccionCobro(direccionCobro);
	      if (numTarjeta != null)
	    	  cliente.setNumTarjeta(numTarjeta);
	      if (mesVencimiento != 0) 
	    	  cliente.setMesVencimiento(mesVencimiento);
	      if (anioVencimiento != 0)
	    	  cliente.setAnioVencimiento(anioVencimiento);

	      clienteRepo.save(cliente);
	      
	    }
	    return cliente;
	    
	    
	}

}
