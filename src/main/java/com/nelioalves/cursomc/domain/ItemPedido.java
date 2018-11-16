package com.nelioalves.cursomc.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Entity
public class ItemPedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
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
	public Pedido getPedido() {
		return id.getPedido();
	}
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