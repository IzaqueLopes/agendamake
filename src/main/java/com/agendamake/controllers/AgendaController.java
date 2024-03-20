package com.agendamake.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.agendamake.models.Evento;
import com.agendamake.repository.AgendaRepository;

@Controller
public class AgendaController {
	
	@Autowired
	private AgendaRepository er;
	
    @RequestMapping(value="/cadastroAtendimento", method=RequestMethod.GET)
	public String form(){
    	return "agenda/formAgenda";	
    }
    	
    @RequestMapping(value="/cadastroAtendimento", method=RequestMethod.POST)
    public String form(Evento evento){
    	
    	
        er.save(evento);
    
    	return "redirect:/cadastroAtendimento";	
    			
    }
}
