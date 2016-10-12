package br.com.rti.juridico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rti.juridico.models.Processo;

@Controller
public class ProcessosController {

	@RequestMapping("/processos/form")
	public String form(){
		return "processos/form";
	}
	
	@RequestMapping("/processos")
	public String grava(Processo processo){
		System.out.println(processo);
		
		return "processos/ok";
	}
}
