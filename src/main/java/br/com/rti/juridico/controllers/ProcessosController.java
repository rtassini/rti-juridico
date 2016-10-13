package br.com.rti.juridico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rti.juridico.daos.ProcessoDAO;
import br.com.rti.juridico.models.Processo;

@Controller
public class ProcessosController {
	
	@Autowired
	private ProcessoDAO processoDao;

	@RequestMapping("/processos/form")
	public String form(){
		return "processos/form";
	}
	
	@RequestMapping("/processos")
	public String gravar(Processo processo){
		System.out.println(processo);
		processoDao.gravar(processo);
		return "processos/ok";
	}
}
