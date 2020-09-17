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

import com.minha.redesocial.model.Tema;
import com.minha.redesocial.repository.TemaRepository;


@RestController
@RequestMapping("/tema")
@CrossOrigin("*")
public class TemaController {

	
	@Autowired
	private TemaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Tema>> getById(){
		
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tema> GetById(@PathVariable long id){
		
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/tema/{descricao}")
	public ResponseEntity<List<Tema>> GetByDescricao(@PathVariable String Descricao){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(Descricao));
	}
	
	@PostMapping
	public ResponseEntity<Tema> post (@RequestBody Tema descricao){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(descricao));
	}
	
	@PutMapping
	public ResponseEntity<Tema> put (@RequestBody Tema descricao){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(descricao));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
