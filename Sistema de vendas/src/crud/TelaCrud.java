package crud;

import repository.Repositorio;

public class TelaCrud {

    private final Repositorio repositorio;

    public TelaCrud(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void salvarAlterarExcluirListar() {
        this.repositorio.salvar();
        this.repositorio.alterar();
        this.repositorio.excluir();
        this.repositorio.listar();
    }
}
