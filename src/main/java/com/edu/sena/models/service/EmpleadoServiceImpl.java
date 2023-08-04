package com.edu.sena.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Empleado;
import com.edu.sena.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Override
	public Empleado save(Empleado e) {
		
		return empleadoRepository.save(e);
	}
	
	@Override
	public String login(String user, String ctr) {
		
		Empleado empleado = empleadoRepository.findByUsername(user);
		
		if (empleado == null) {
			
			return "Empleado no encontrado";
		}
		
		if (!empleado.getPassword().equals(ctr)) {
			
			return "Contraseña incorrecta";
		}
		
		return "Inicio de sesion exitoso";
		
						
	}
	
	
	
	
	
}
