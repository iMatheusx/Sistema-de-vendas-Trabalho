package crud;

import repository.Repositorio;

public class ClienteCrud implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvar o cliente");
    }

    @Override
    public void alterar() {
        System.out.println("Alterar o cliente");
    }

    @Override
    public void excluir() {
        System.out.println("Excluir o cliente");
    }

    @Override
    public void listar() {
        System.out.println("Listar o cliente");
    }

    @Override
    public void ler() {
        System.out.println("Ler o cliente");
    }
}
