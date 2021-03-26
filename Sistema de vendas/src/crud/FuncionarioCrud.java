package crud;

import repository.Repositorio;

public class FuncionarioCrud implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvar funcionário");
    }

    @Override
    public void alterar() {
        System.out.println("Alterar funcionário");
    }

    @Override
    public void excluir() {
        System.out.println("Excluir funcionário");
    }

    @Override
    public void listar() {
        System.out.println("Listar funcionário");
    }

    @Override
    public void ler() {
        System.out.println("Ler o funcioário");

    }
}
