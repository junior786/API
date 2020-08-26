package com.junior.ApiRest.repository;

import com.junior.ApiRest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    
}
