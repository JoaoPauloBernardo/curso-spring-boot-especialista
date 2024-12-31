package io.github.JoaoPauloBernardo.produtosapi.repository;

import io.github.JoaoPauloBernardo.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// os parâmetros do JPARepository são o tipo da entidade e o tipo do ID respectivamente
public interface ProdutoRepository extends JpaRepository<Produto, String> {
    List<Produto> findByNome(String nome);
}
