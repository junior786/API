package com.junior.ApiRest.resources;

import com.junior.ApiRest.models.Produto;
import com.junior.ApiRest.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    @ApiOperation(value = "Retorna uma lista de produtos do banco de dados")
    public List<Produto> listaProdutos() {
        return produtoRepository.findAll();

    }

    @GetMapping("/produto/{id}")
    @ApiOperation(value = "Retorna um unico produto no banco de dados")
    public Produto listaProdutoUnico(@PathVariable(value = "id") long id) {
        return produtoRepository.findById(id);
    }

    @PostMapping("/produto")
    @ApiOperation(value = "Salva um produto no banco de dados")
    public Produto salvaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);

    }

    @DeleteMapping("/produto")
    @ApiOperation(value = "Deleta um produto no banco de dados")
    public void deletaProduto(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }

    @PutMapping("/produto")
    @ApiOperation(value = "Edita um produto no banco e dados")
    public Produto atualizaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);

    }

}
