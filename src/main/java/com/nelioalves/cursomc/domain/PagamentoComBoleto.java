package com.nelioalves.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;
=======
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;
=======
>>>>>>> 00b78b2c4976c96871b2723355aef8302e580cac
>>>>>>> d539a1a398fda18c56eff1dd7a00d694f39b7035
import com.nelioalves.cursomc.domain.enums.EstadoPagamento;
@Entity
public class PagamentoComBoleto extends Pagamento  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d539a1a398fda18c56eff1dd7a00d694f39b7035
	@JsonFormat(pattern="dd/mm/yyy HH:mm")
	private Date dataVencimento;
	@JsonFormat(pattern="dd/mm/yyy HH:mm")
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/mm/yyy HH:mm")
=======
	private Date dataVencimento;
	@Temporal(TemporalType.DATE)
>>>>>>> 00b78b2c4976c96871b2723355aef8302e580cac
	private Date dataPagamento;
	/**
	 * 
	 */
	public PagamentoComBoleto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param id
	 * @param estado
	 * @param pedido
	 * @param dataVencimento
	 * @param dataPagamento
	 */
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento,
			Date dataPagamento) {
		super(id, estado, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
