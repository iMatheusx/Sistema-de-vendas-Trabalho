package telas;

import crud.ProdutosCrud;

public class CadastroDeProdutos {
    final ProdutosCrud produtosCrud;

    public CadastroDeProdutos(ProdutosCrud produtosCrud) {
        this.produtosCrud = produtosCrud;
    }
    public void cadastrarProduto() {
        produtosCrud.salvar();
    }

    public void alterarProduto() {
        produtosCrud.alterar();
    }

    public void lerProduto() {
        produtosCrud.ler();
    }
    public void listarProduto() {
        produtosCrud.listar();
    }

    public void excluirProduto() {
        produtosCrud.excluir();
    }
}
