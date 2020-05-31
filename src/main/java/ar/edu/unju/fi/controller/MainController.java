package ar.edu.unju.fi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.service.IUsuarioService;


@Controller
public class MainController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@RequestMapping("/Index.html")
	public String main (Model model) {
		model.addAttribute("usuario",usuarioService.mostrar().getNombre());
		return "index";
	}
	
	@RequestMapping("/fixture.html")
	public ModelAndView fixture () {
		ModelAndView model = new ModelAndView("fixture");
		model.addObject("usuario",usuarioService.mostrar().getNombre());
		return model;
	}
	
	@RequestMapping("/equipos.html")
	public ModelAndView equipos() {
		ModelAndView model = new ModelAndView("equipos");
		model.addObject("usuario",usuarioService.mostrar().getNombre());
		return model;
	}
	
}
