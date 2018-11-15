package com.nelioalves.cursomc.domain;

import java.io.Serializable;

import com.nelioalves.cursomc.domain.enums.EstadoPagamento;

public class PagamentoComCartao extends Pagamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer numeroParcelas;

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	/**
	 * @param id
	 * @param estado
	 * @param pedido
	 * @param numeroParcelas
	 */
	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroParcelas) {
		super(id, estado, pedido);
		this.numeroParcelas = numeroParcelas;
	}

	/**
	 * 
	 */
	public PagamentoComCartao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}
}
