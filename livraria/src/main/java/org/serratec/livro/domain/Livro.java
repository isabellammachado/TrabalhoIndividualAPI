package org.serratec.livro.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O título não pode ulrapassar 40 caracteres")
	@Size(max=40)
	private String titulo;
	
	@NotNull
	private Integer qntPaginas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getQntPaginas() {
		return qntPaginas;
	}

	public void setQntPaginas(Integer qntPaginas) {
		this.qntPaginas = qntPaginas;
	}
	
	
	
	

}
