package com.nelioalves.cursomc.domain;

import java.io.Serializable;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d539a1a398fda18c56eff1dd7a00d694f39b7035
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
<<<<<<< HEAD
=======
=======
>>>>>>> 00b78b2c4976c96871b2723355aef8302e580cac
>>>>>>> d539a1a398fda18c56eff1dd7a00d694f39b7035
public class ItemPedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
	@JsonIgnore
	@EmbeddedId
=======
<<<<<<< HEAD
	@JsonIgnore
	@EmbeddedId
=======
>>>>>>> 00b78b2c4976c96871b2723355aef8302e580cac
>>>>>>> d539a1a398fda18c56eff1dd7a00d694f39b7035
	private ItemPedidoPK id = new ItemPedidoPK();
	private Double disconto;
	private Integer quantidade;
	private Double preco;
	/**
	 * 
	 */
	public ItemPedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param disconto
	 * @param quantidade
	 * @param preco
	 */
	public ItemPedido(Pedido pedido, Produto produto,Double disconto, Integer quantidade, Double preco) {
		super();
		this.id.setPedido(pedido);
		this.id.setProduto(produto);
		this.disconto = disconto;
		this.quantidade = quantidade;
		this.preco = preco;
	}
<<<<<<< HEAD
	@JsonIgnore
	public Pedido getPedido() {
		return id.getPedido();
	}
	@JsonIgnore
=======
<<<<<<< HEAD
	@JsonIgnore
	public Pedido getPedido() {
		return id.getPedido();
	}
	@JsonIgnore
=======
	public Pedido getPedido() {
		return id.getPedido();
	}
>>>>>>> 00b78b2c4976c96871b2723355aef8302e580cac
>>>>>>> d539a1a398fda18c56eff1dd7a00d694f39b7035
	public Produto getProduto() {
		return id.getProduto();
	}
	public ItemPedidoPK getId() {
		return id;
	}
	public void setId(ItemPedidoPK id) {
		this.id = id;
	}
	public Double getDisconto() {
		return disconto;
	}
	public void setDisconto(Double disconto) {
		this.disconto = disconto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedido other = (ItemPedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
