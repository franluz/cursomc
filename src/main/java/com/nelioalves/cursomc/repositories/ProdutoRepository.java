package com.nelioalves.cursomc.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	@Query(" SELECT distinct obj from Produto obj inner join obj.categoria cat where obj.nome like %:nome% and cat in :categorias ")
	public Page<Produto> search(@Param("nome") String nome,@Param("categorias") List<Categoria> categorias,PageRequest pagRequest );
}
