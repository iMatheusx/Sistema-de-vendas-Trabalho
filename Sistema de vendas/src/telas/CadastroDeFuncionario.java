package telas;

import crud.FuncionarioCrud;

public class CadastroDeFuncionario {
    final FuncionarioCrud funcionarioCrud;

    public CadastroDeFuncionario(FuncionarioCrud funcionarioCrud) {
        this.funcionarioCrud = funcionarioCrud;
    }

    public void cadastrarFuncionario() {
        funcionarioCrud.salvar();
    }

    public void alterarFuncionario() {
        funcionarioCrud.alterar();
    }

    public void lerFuncionario() {
        funcionarioCrud.ler();
    }

    public void listarFuncionario() {
        funcionarioCrud.listar();
    }

    public void excluirFuncionario() {
        funcionarioCrud.excluir();
    }
}
