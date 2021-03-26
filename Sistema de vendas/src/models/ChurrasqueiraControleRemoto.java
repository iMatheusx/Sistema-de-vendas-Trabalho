package models;

public class ChurrasqueiraControleRemoto extends Produtos{

    private String cor;
    private String codigoDeBarra;

    public ChurrasqueiraControleRemoto(String nome, String tipo, String qtdEstoque, String qualidade) {
        super(nome, tipo="Eletrodomestico", qtdEstoque="", qualidade);
    }

    @Override
    public String ligar() {
        return "Ta pegando fogo bixo! E agora pra desligar essa merda ai????";
    }

    @Override
    public String vender() {
        return null;
    }

    @Override
    public String comprar() {
        return null;
    }

    @Override
    public String trocar() {
        return "O produto precisa ser trocado pois não está funcionando direito";
    }
}
