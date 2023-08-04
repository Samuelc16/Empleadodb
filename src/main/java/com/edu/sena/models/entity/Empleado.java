package com.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "usuarios")
public class Empleado {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_emple")
	private Long id;
	
	@Column(name = "nomb_emple") 
	private String username;
	
	@Column(name = "cont_emple")
	private String password;
	
	public Empleado() {
		
	}
	
	public Empleado(Long id, String username, String password) {
		
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	
	
	
}