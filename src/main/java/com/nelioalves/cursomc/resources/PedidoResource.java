package com.nelioalves.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
=======
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
=======
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> 00b78b2c4976c96871b2723355aef8302e580cac
>>>>>>> d539a1a398fda18c56eff1dd7a00d694f39b7035
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.services.PedidoService;

import javassist.tools.rmi.ObjectNotFoundException;
<<<<<<< HEAD

=======
<<<<<<< HEAD

@RestController
@RequestMapping(value = "/pedido")
public class PedidoResource {

	@Autowired
	private PedidoService pedidoService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) throws ObjectNotFoundException{
=======
>>>>>>> d539a1a398fda18c56eff1dd7a00d694f39b7035
@RestController
@RequestMapping(value = "/pedido")
public class PedidoResource {

	@Autowired
<<<<<<< HEAD
	private PedidoService pedidoService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) throws ObjectNotFoundException{
=======
	PedidoService pedidoService;
	@RequestMapping("/{id}")
	public ResponseEntity<?> find(Integer id) throws ObjectNotFoundException{
>>>>>>> 00b78b2c4976c96871b2723355aef8302e580cac
>>>>>>> d539a1a398fda18c56eff1dd7a00d694f39b7035
		if(id==null) {
			return null;
		}
		return ResponseEntity.ok().body(pedidoService.buscar(id));
		
	}
	
}
