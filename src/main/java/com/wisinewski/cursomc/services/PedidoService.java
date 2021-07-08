package com.wisinewski.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisinewski.cursomc.domain.Pedido;
import com.wisinewski.cursomc.repositories.PedidoRepository;
import com.wisinewski.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoaRepository;

	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = pedidoaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id
				+ ", Tipo: " + Pedido.class.getName()));
	}
	
}
