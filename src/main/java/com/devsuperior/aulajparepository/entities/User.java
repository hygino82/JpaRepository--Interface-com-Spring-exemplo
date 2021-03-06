package com.devsuperior.aulajparepository.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//marca a classe como uma entidade
@Table(name = "tb_users")//marca a tabela tb_users para guardar elementos desta classe
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//faz o id ser gerado automaticamente
	private Long id;//id tipo Long
	private String name;
	private String email;
	private Double salary;

	public User() {
	}

	public User(Long id, String name, String email, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
