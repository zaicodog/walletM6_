package com.monedero.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.monedero.modelo.Cliente;
import com.monedero.servicios.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired 
	private ClienteService clienteService;
	
	@GetMapping("/nuevo")
	public String mostrarFormularioCrearCliente(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "cliente/crear";
	}
	
	@GetMapping("/guardar")
	public String guardarCliente(@ModelAttribute("cliente") Cliente cliente) {
		clienteService.guardar(cliente);
		return "redirect:/cliente";
	}
	
	@GetMapping
	public String listarClientes(Model model) {
		model.addAttribute("clientes", clienteService.obtenerTodosLosClientes());
		return "cliente/listar";
	}

}
