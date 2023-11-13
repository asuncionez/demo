package com.darkdestiny.asociaciones.entidades;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CuentaHabiente", schema = "public")
public class CuentaHabiente implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCuentaHabiente;
	
	private String nombre;
	private String paterno;
	private String materno;
	
	@OneToOne(mappedBy = "cuentaHabiente", cascade = CascadeType.ALL)
	private Credencial credencial;

	
	public CuentaHabiente(String nombre, String paterno, String materno) {
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
	} 
	
	
	

}
