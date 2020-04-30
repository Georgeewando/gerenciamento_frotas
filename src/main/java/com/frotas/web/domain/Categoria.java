package com.frotas.web.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
public class Categoria extends AbstractEntity<Long>{

	@Column(nullable = false, unique = true, length = 80)
	private String categoria;
	
	@OneToMany(mappedBy = "categoria")
	private List<Veiculo> veiculos;
	
	
	
		public List<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
		public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
