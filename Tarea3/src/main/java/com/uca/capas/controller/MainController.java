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

import com.uca.capas.domain.Articulo;

@Controller
public class MainController {

		@RequestMapping("/producto")
		public ModelAndView ingresar() {
			ModelAndView mav = new ModelAndView();
			mav.addObject("articulo", new Articulo());
			mav.setViewName("producto");
			return mav;
		}
		
		@RequestMapping("/form")
		public ModelAndView form(@Valid @ModelAttribute Articulo art, BindingResult result) {
			ModelAndView mav = new ModelAndView();
			
			if(result.hasErrors()) {
				mav.setViewName("producto");
			}
			else {
				mav.addObject("codigo", art.getCodigo());
				mav.addObject("nombre", art.getNombre());
				mav.addObject("marca", art.getMarca());
				mav.addObject("descripcion", art.getDescripcion());
				mav.addObject("existencias", art.getExistencias());
				mav.addObject("date", art.getDate() );
				mav.setViewName("Exito");
			}
			
			return mav;
		}
}
