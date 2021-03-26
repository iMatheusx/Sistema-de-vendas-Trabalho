package telas;

import crud.VendasCrud;

public class CadastroDeVendas {
    final VendasCrud vendasCrud;

    public CadastroDeVendas(VendasCrud vendasCrud) {
        this.vendasCrud = vendasCrud;
    }

    public void cadastrarVendas(){
        vendasCrud.salvar();
    }
    public void listarVendas(){
        vendasCrud.listar();
    }
    public void excluirVendas(){
        vendasCrud.excluir();
    }
    public void lerVendas(){
        vendasCrud.ler();
    }
    public void alterarVendas(){
        vendasCrud.alterar();
    }
}
