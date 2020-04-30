package com.frotas.web.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
public class Fipe extends AbstractEntity<Long>{
	
	@Column(nullable = false, unique = true, length = 80)
	private String marca;
	@Column(nullable = false, length = 80)
	private String modelo;
	
	@OneToMany(mappedBy = "fipe")
	private List<Veiculo> veiculos;
	
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
