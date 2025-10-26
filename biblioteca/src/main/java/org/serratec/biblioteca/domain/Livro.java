package org.serratec.biblioteca.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
public class Livro {

		
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Long id;
		
	
		@NotBlank(message = "O título não pode ultrapassar 40 caracteres")
		@Size(max=40)
		@Column(length = 40 , nullable =false)
		private String titulo;
		
		@Positive
		@NotNull(message = "Insira um valor válido")
		private Integer qntPaginas;

		@Embedded
		private Publicacao publicacao;

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

		public Publicacao getPublicacao() {
			return publicacao;
		}

		public void setPublicacao(Publicacao publicacao) {
			this.publicacao = publicacao;
		}

		
		
}

