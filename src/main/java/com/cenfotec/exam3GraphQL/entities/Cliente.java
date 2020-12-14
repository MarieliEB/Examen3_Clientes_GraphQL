package com.cenfotec.exam3GraphQL.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidoUno")
	 private String apellidoUno;
	
	@Column(name = "apellidoDos")
	 private String apellidoDos;
	
	@Column(name = "lugarResidencia")
	 private String lugarResidencia;
	
	@Column(name = "direccionCobro")
	 private String direccionCobro;
	
	@Column(name = "numTarjeta")
	 private String numTarjeta;
	
	@Column(name = "mesVencimiento")
	 private int mesVencimiento;
	
	@Column(name = "anioVencimiento")
	 private int anioVencimiento;
	
	
	 public String getNombre() {
			return nombre;
		}
		
	 public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	 
	 public String getApellidoUno() {
			return apellidoUno;
		}
		
	 public void setApellidoUno(String apellidoUno) {
			this.apellidoUno = apellidoUno;
		}
	 
	 public String getApellidoDos() {
			return apellidoDos;
		}
		
	 public void setApellidoDos(String apellidoDos) {
			this.apellidoDos = apellidoDos;
		}
	 
	 public String getLugarResidencia() {
			return lugarResidencia;
		}
		
	 public void setLugarResidencia(String lugarResidencia) {
			this.lugarResidencia = lugarResidencia;
		}
	 
	 public String getDireccionCobro() {
			return direccionCobro;
		}
		
	 public void setDireccionCobro(String direccionCobro) {
			this.direccionCobro = direccionCobro;
		}
	 
	 public String getNumTarjeta() {
			return numTarjeta;
		}
		
	 public void setNumTarjeta(String numTarjeta) {
			this.numTarjeta = numTarjeta;
		}
	
	 public int getMesVencimiento() {
			return mesVencimiento;
		}
		
	 public void setMesVencimiento(int mesVencimiento) {
			this.mesVencimiento = mesVencimiento;
		}
	 
	 public int getAnioVencimiento() {
			return anioVencimiento;
		}
		
	 public void setAnioVencimiento(int anioVencimiento) {
			this.anioVencimiento = anioVencimiento;
		}
}
