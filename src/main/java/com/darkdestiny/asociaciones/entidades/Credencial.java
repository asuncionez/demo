package com.darkdestiny.asociaciones.entidades;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name = "Credencial", schema = "public")
public class Credencial implements Serializable{

	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCredencial;
	
	@Temporal(TemporalType.DATE)
	private Date fechaVencimiento;
	
	@OneToOne
	@JoinColumn(name = "idCuentaHabiente")
	private CuentaHabiente cuentaHabiente;



	public Credencial(Date fechaVencimiento, CuentaHabiente cuentaHabiente) {
		super();
		this.fechaVencimiento = fechaVencimiento;
		this.cuentaHabiente = cuentaHabiente;
	}
	
	

	
	
}
