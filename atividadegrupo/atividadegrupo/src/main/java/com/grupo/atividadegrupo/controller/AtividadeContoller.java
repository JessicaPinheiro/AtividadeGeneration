package com.grupo.atividadegrupo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade")
public class AtividadeContoller {
	
//Que papel seus grupos organizados têm em sua vida? São importantes? Você gosta de se reunir com eles?
//Por que? "Alegria compartilhada é alegria em dobro. Tristeza compartilhada é tristeza pela metade." O QUE VOCÊS ACHAM QUE
//ESSE DITADO SIGNIFICA?
//EM SEUS GRUPOS DO ZOOM,PENSEM SOBRE O MELHOR MOMENTO DE SUAS VIDAS E PENSEM SOBRE A PESSOA QUE MAIS MOLDOU SUAS VIDAS
//O MELHOR LUGAR QUE JÁ VISITARAM, OU UM LUGAR QUE GOSTARIAM MUITO DE VISITAR*//
	
	@GetMapping
	public String getatividade()
	{
		return "Sem sombra de duvidas o melhor dia da minha vida sempre é aquele que eu volto para casa, que revejo a minha"
			+ " familia o pricipal grupo de pessoas da minha vida <3. Hoje e sempre la é o lugar que eu mais gostaria de visitar";
	}
	

}
