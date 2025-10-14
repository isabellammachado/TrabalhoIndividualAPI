package org.serratec.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import org.serratec.biblioteca.domain.Livro;
import org.serratec.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {

		
		@Autowired 
	private LivroRepository livroRepository;
		
		@GetMapping
		public ResponseEntity <List<Livro>> listar() {
			return ResponseEntity.ok(livroRepository.findAll());
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Livro> pesquisar(@PathVariable Long id) {
			
			Optional<Livro> LivroOpt = livroRepository.findById(id);
			if (LivroOpt.isPresent()) {
				return ResponseEntity.ok(LivroOpt.get());
			}
			return ResponseEntity.notFound().build();
		}

		@PostMapping
		@ResponseStatus(HttpStatus.CREATED)
		public Livro inserir(@Validated @RequestBody Livro livro) {
			livro = livroRepository.save(livro);
			return livro;
		}

		@PutMapping("/{id}")
		public ResponseEntity<Livro> atualizar(@PathVariable Long id, @Validated @RequestBody Livro livro) {
			boolean existsById = livroRepository.existsById(id);
			if (!existsById) {
				return ResponseEntity.notFound().build();
			}
			livro.setId(id);
			livro = livroRepository.save(livro);
			return ResponseEntity.ok(livro);
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<Void> remover(@PathVariable Long id) {
			boolean existsById = livroRepository.existsById(id);
			if (!existsById) {
				return ResponseEntity.notFound().build();
			}
			livroRepository.deleteById(id);
			return ResponseEntity.noContent().build();
		}

	}
		

