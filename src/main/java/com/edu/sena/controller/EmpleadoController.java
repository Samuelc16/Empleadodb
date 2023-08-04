package com.edu.sena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sena.models.entity.Empleado;
import com.edu.sena.models.service.EmpleadoService;

@RestController
@RequestMapping("/api/usuarios")
public class EmpleadoController {
	
	@Autowired EmpleadoService empleadoService;
	
	@PostMapping
	public Empleado guardar(@RequestBody Empleado e) {
		
		return empleadoService.save(e);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Empleado empleado){
		String mensaje = empleadoService.login(empleado.getUsername(), empleado.getPassword());
		return ResponseEntity.ok(mensaje);
		
	}
}