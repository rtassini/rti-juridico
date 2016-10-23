package br.com.rti.juridico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.rti.juridico.daos.ProcessoDAO;
import br.com.rti.juridico.models.Processo;
import br.com.rti.juridico.models.TipoParte;

@Controller
@RequestMapping("/processos")
public class ProcessosController {
	
	@Autowired
	private ProcessoDAO processoDao;

	@RequestMapping("/form")
	public ModelAndView form(){
		ModelAndView modelAndView = new ModelAndView("processos/form");
		modelAndView.addObject("tipos", TipoParte.values());
		
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar(Processo processo){
		System.out.println(processo);
		processoDao.gravar(processo);
		return listar();
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar(){
		List<Processo> processos = processoDao.listar();
		ModelAndView modelAndView = new ModelAndView("processos/lista");
		modelAndView.addObject("processos", processos);
		
		return modelAndView;
	}
}
