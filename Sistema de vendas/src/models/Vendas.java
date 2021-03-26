package models;

import repository.Repositorio;

import java.time.LocalDate;
import java.util.List;

public class Vendas {
    private LocalDate dataVenda;
    private Cliente cliente;
    private Funcionário funcionario;
    private List<Produtos> produtos;

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionário getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionário funcionario) {
        this.funcionario = funcionario;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }
}



