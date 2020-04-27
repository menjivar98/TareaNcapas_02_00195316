package com.uca.capas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {

	/*@RequestMapping("/ingresar")
	public String index() {
		return "ingresar";
	}*/
	
	
	/*@RequestMapping("/form")
	public ModelAndView ingresar(@Valid HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String fecha = request.getParameter("fecha");
		String nacimiento = request.getParameter("nacimiento");
		String telefono = request.getParameter("telefono");
		String movil = request.getParameter("movil");
		
		
		
		return mav;
	
	}*/
	
	@GetMapping({"/ingresar","/form"})
	public String getUsuForm(@ModelAttribute("usa") Usuario usa) {return "ingresar";}
	
	@PostMapping("/form")
	public String saveUsa( @Valid @ModelAttribute("usa") Usuario usa,BindingResult result,RedirectAttributes ra) {
		
		if(result.hasErrors()) {
			return "ingresar";
		}
		
		ra.addFlashAttribute("saveUsuario", usa);
		return "redirect:/Exito";
	}
	
	@GetMapping("/Exito")
	public String exito() {
		return "Exito";
	}
}
