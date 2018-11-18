package com.nelioalves.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.services.ClienteService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteResource {

	@Autowired
<<<<<<< HEAD
	private ClienteService clienteService;
=======
<<<<<<< HEAD
	private ClienteService clienteService;
=======
	ClienteService clienteService;
>>>>>>> 00b78b2c4976c96871b2723355aef8302e580cac
>>>>>>> d539a1a398fda18c56eff1dd7a00d694f39b7035

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) throws ObjectNotFoundException {
		Cliente obj = clienteService.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
