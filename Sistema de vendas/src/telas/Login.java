package telas;

import crud.ClienteCrud;
import crud.FuncionarioCrud;
import crud.ProdutosCrud;
import crud.VendasCrud;

import java.util.Scanner;

public class Login {

    public static void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você quer cadastrar/alterar/ler/exluir/listar um cliente, funcionário, produto ou venda? Informe: \nC - cliente; \nF - funcionário; \nP - produto;  \nV - venda.");
        String choose = sc.next();
        if (choose.equals("C")) {
            System.out.println("--------------------------------------");
            System.out.println("-----CADASTRAR CLIENTE-----");
            CadastroDeCliente cadastroDeCliente = new CadastroDeCliente(new ClienteCrud());
            cadastroDeCliente.cadastrarCliente();
            cadastroDeCliente.alterarCliente();
            cadastroDeCliente.excluirCliente();
            cadastroDeCliente.lerCliente();
            cadastroDeCliente.listarCliente();
            System.out.println("--------------------------------------");
        }
        else if (choose.equals("F")) {
            System.out.println("--------------------------------------");
            System.out.println("-----CADASTRAR FUNCIONARIO-----");
            CadastroDeFuncionario cadastroDeFuncionario = new CadastroDeFuncionario(new FuncionarioCrud());
            cadastroDeFuncionario.cadastrarFuncionario();
            cadastroDeFuncionario.alterarFuncionario();
            cadastroDeFuncionario.excluirFuncionario();
            cadastroDeFuncionario.lerFuncionario();
            cadastroDeFuncionario.listarFuncionario();
            System.out.println("--------------------------------------");
        }
        else if (choose.equals("P")){
            System.out.println("--------------------------------------");
            System.out.println("-----CADASTRAR PRODUTOS-----");
            CadastroDeProdutos cadastroDeProdutos = new CadastroDeProdutos(new ProdutosCrud());
            cadastroDeProdutos.cadastrarProduto();
            cadastroDeProdutos.alterarProduto();
            cadastroDeProdutos.excluirProduto();
            cadastroDeProdutos.lerProduto();
            cadastroDeProdutos.listarProduto();
            System.out.println("--------------------------------------");
        }
        else if (choose.equals("V")) {
            System.out.println("--------------------------------------");
            System.out.println("-----CADASTRAR VENDA-----");
            CadastroDeVendas cadastroDeVendas = new CadastroDeVendas(new VendasCrud());
            cadastroDeVendas.cadastrarVendas();
            cadastroDeVendas.alterarVendas();
            cadastroDeVendas.excluirVendas();
            cadastroDeVendas.lerVendas();
            cadastroDeVendas.listarVendas();
            System.out.println("--------------------------------------");
        }
        else {
            System.out.println("Isso não é uma opção");
        }

    }
}
