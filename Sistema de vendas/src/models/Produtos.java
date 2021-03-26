package models;

public abstract class Produtos {

    public String nome;
    public String tipo;
    public String qtdEstoque;
    public String qualidade;

    public Produtos(String nome, String tipo, String qtdEstoque, String qualidade) {
    }

    public String getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(String qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    public abstract String ligar();
    public abstract String vender();
    public abstract String comprar();
    public abstract String trocar();

}

