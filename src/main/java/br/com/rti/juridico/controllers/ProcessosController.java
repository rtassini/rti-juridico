package br.com.rti.juridico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.rti.juridico.daos.ProcessoDAO;
import br.com.rti.juridico.models.Processo;
import br.com.rti.juridico.models.TipoParte;

@Controller
public class ProcessosController {
	
	@Autowired
	private ProcessoDAO processoDao;

	@RequestMapping("/processos/form")
	public ModelAndView form(){
		ModelAndView modelAndView = new ModelAndView("processos/form");
		modelAndView.addObject("tipos", TipoParte.values());
		
		return modelAndView;
	}
	
	@RequestMapping("/processos")
	public String gravar(Processo processo){
		System.out.println(processo);
		processoDao.gravar(processo);
		return "processos/ok";
	}
}
