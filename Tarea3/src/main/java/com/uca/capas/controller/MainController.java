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

		@RequestMapping("/ingresar")
		public ModelAndView ingresar() {
			ModelAndView mav = new ModelAndView();
			mav.addObject("usuario", new Usuario());
			mav.setViewName("ingresar");
			return mav;
		}
		
		@RequestMapping("/form")
		public ModelAndView form(@Valid @ModelAttribute Usuario user, BindingResult result) {
			ModelAndView mav = new ModelAndView();
			
			if(result.hasErrors()) {
				mav.setViewName("Error");
			}
			else {
				mav.addObject("user",user.getNombre());
				mav.addObject("apel",user.getApellido());
				mav.addObject("fecha",user.getFecha());
				mav.addObject("naci",user.getNacimiento());
				mav.addObject("ins",user.getInstuto());
				mav.addObject("tel",user.getTelefono());
				mav.addObject("mol",user.getMovil());
				mav.setViewName("Exito");
			}
			
			return mav;
		}
}
