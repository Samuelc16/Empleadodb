package com.edu.sena.models.service;

import com.edu.sena.models.entity.Empleado;

public interface EmpleadoService {
	
	public Empleado save(Empleado e);
	public String login(String user, String ctr);
}
