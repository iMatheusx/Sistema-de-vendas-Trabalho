package telas;

import crud.ClienteCrud;

public class CadastroDeCliente {
    final ClienteCrud clienteCrud;

    public CadastroDeCliente(ClienteCrud clienteCrud) {
        this.clienteCrud = clienteCrud;
    }
    public void cadastrarCliente() {
        clienteCrud.salvar();
    }

    public void alterarCliente() {
        clienteCrud.alterar();
    }

    public void listarCliente() {
        clienteCrud.listar();
    }

    public void lerCliente() {
        clienteCrud.ler();
    }

    public void excluirCliente() {
        clienteCrud.excluir();
    }
}
