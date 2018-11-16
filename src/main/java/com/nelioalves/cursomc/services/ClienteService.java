package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.repositories.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired
<<<<<<< HEAD
	private ClienteRepository clienteRepository;
=======
	ClienteRepository clienteRepository;
>>>>>>> 00b78b2c4976c96871b2723355aef8302e580cac
	
	public Cliente buscar(Integer id) throws ObjectNotFoundException {
		Optional<Cliente> obj= clienteRepository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Cliente nao encontrado com o ID"+id));
	}
	
}
