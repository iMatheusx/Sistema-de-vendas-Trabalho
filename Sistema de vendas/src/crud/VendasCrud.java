package crud;

import repository.Repositorio;

public class VendasCrud implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvar venda");
    }

    @Override
    public void alterar() {
        System.out.println("Alterar venda");
    }

    @Override
    public void excluir() {
        System.out.println("Excluir venda");
    }

    @Override
    public void listar() {
        System.out.println("Listar venda");
    }

    @Override
    public void ler() {
        System.out.println("Ler venda");
    }
}
