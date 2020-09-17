package com.minha.escola.controller;

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


import com.minha.escola.model.Turma;
import com.minha.escola.repository.TurmaRepository;

@RestController //Para falar que é um classe controller
@RequestMapping("/turma") // O caminha que precisamos para visualizar pelo Postman
@CrossOrigin("*") // Para receber qualquer tipo de ???????
public class TurmaController {
	
	@Autowired
	private TurmaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Turma>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	/*procurar por id*/
	@GetMapping("/{id}")
	public ResponseEntity<Turma> getById(@PathVariable/* VARIAVEL DE CAMINHO*/ long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	/*Procurar por nome da turma*/
	@GetMapping("/turma/{turma}")
	public ResponseEntity<List<Turma>> getByName(@PathVariable String descricao){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	/*postar*/
	@PostMapping
	public ResponseEntity<Turma> post (@RequestBody Turma descricao){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(descricao));
	}
	/*Atualizar*/
	@PutMapping
	public ResponseEntity<Turma> put (@RequestBody Turma descricao){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(descricao));
	}
	/*deletar*/
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
