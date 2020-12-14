package com.cenfotec.exam3GraphQL.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cenfotec.exam3GraphQL.entities.Cliente;
import com.cenfotec.exam3GraphQL.services.ClienteService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;


@Component
public class ClienteMutation implements GraphQLMutationResolver{
	
	@Autowired
	private ClienteService clienteService;
	
	public Cliente createCliente(String nombre, String apellidoUno, String apellidoDos, String lugarResidencia, String direccionCobro, String numTarjeta, int mesVencimiento, int anioVencimiento) {
	return this.clienteService.createCliente(nombre, apellidoUno, apellidoDos, lugarResidencia, direccionCobro, numTarjeta, mesVencimiento, anioVencimiento);
	}
	
	public boolean deleteCliente(int id) {
		return this.clienteService.deleteCliente(id);
	}
	
	 public Cliente updateCliente(int id, String nombre, String apellidoUno, String apellidoDos, String lugarResidencia, String direccionCobro, String numTarjeta, int mesVencimiento, int anioVencimiento) {
		 return this.clienteService.updateCliente(id, nombre, apellidoUno, apellidoDos, lugarResidencia, direccionCobro, numTarjeta, mesVencimiento, anioVencimiento);
	 }

}
