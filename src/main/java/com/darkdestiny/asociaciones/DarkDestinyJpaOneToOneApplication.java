package com.darkdestiny.asociaciones;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.darkdestiny.asociaciones.entidades.Credencial;
import com.darkdestiny.asociaciones.entidades.CuentaHabiente;
import com.darkdestiny.asociaciones.repositorios.CredencialRepository;
import com.darkdestiny.asociaciones.repositorios.CuentaHabienterepository;

@SpringBootApplication
public class DarkDestinyJpaOneToOneApplication  implements CommandLineRunner{
	@Autowired
	CuentaHabienterepository cuentaHabienterepository;
	
	@Autowired
	CredencialRepository credencialRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DarkDestinyJpaOneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		CuentaHabiente c1 = new CuentaHabiente("Asunción", "Enríquezz", "Zárate");
		//CuentaHabiente c1 = new CuentaHabiente();
		//c1.setIdCuentaHabiente(1L);
		//c1 = cuentaHabienterepository.findById(c1.getIdCuentaHabiente()).orElse(null);
		//c1.setNombre("jose");
		//c1.setPaterno("jose");
		Credencial cred1 = new Credencial();//Credencial(new Date(), c1);
		cred1.setIdCredencial(1L);
		//buscar credencial existente
		cred1 = credencialRepository.findById(1L).orElse(null);
		
		c1.setCredencial(cred1);
		
		cuentaHabienterepository.save(c1);
		
		/*cuentaHabienterepository.findAll().forEach(
				x -> {System.out.println(x.getNombre() + " - " + x.getCredencial().getIdCredencial());}
				);
				*/
	}

}
