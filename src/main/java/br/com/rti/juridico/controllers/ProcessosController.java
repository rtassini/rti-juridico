package br.com.rti.juridico.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.rti.juridico.daos.ProcessoDAO;
import br.com.rti.juridico.models.Processo;
import br.com.rti.juridico.models.TipoParte;
import br.com.rti.juridico.validation.ProcessoValidation;

@Controller
@RequestMapping("/processos")
public class ProcessosController {
	
	@Autowired
	private ProcessoDAO processoDao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.addValidators(new ProcessoValidation());
	}

	@RequestMapping("/form")
	public ModelAndView form(Processo processo){
		ModelAndView modelAndView = new ModelAndView("processos/form");
		modelAndView.addObject("tipos", TipoParte.values());
		
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar(MultipartFile sumario, @Valid Processo processo, BindingResult result, 
			RedirectAttributes redirectAttributes){
		
		System.out.println(sumario.getOriginalFilename());
		
		if(result.hasErrors()){
			return form(processo);
		}
		
		processoDao.gravar(processo);
		redirectAttributes.addFlashAttribute("sucesso", "Processo cadastrado com sucesso");
		
		return new ModelAndView("redirect:processos");
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar(){
		List<Processo> processos = processoDao.listar();
		ModelAndView modelAndView = new ModelAndView("processos/lista");
		modelAndView.addObject("processos", processos);
		
		return modelAndView;
	}
}
