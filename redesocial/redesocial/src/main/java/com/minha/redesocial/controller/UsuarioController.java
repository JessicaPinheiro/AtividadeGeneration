package com.minha.redesocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.minha.redesocial.model.Usuario;
import com.minha.redesocial.repository.UsuarioRepository;


@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> getById(){
		
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> GetById(@PathVariable long id){
		
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/usuario/{nome}")
	public ResponseEntity<List<Usuario>> GetByDescricao(@PathVariable String Nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(Nome));
	}
	

	@PostMapping
	public ResponseEntity<Usuario> post (@RequestBody Usuario nome){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(nome));
	}
	
	@PutMapping
	public ResponseEntity<Usuario> put (@RequestBody Usuario nome){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(nome));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
}
