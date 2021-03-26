package crud;

import repository.Repositorio;

public class ProdutosCrud implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvar produto");

    }

    @Override
    public void alterar() {
        System.out.println("Alterar produto");
    }

    @Override
    public void excluir() {
        System.out.println("Excluir produto");
    }

    @Override
    public void listar() {
        System.out.println("Listar produto");
    }

    @Override
    public void ler() {
        System.out.println("Ler produto");
    }
}
