package SOLID.SRP.ex02;

public class Venda {
    private double valor;
    private String produto;

    public Venda(double valor, String produto) {
        this.valor = valor;
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public String getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "valor=" + valor +
                ", produto='" + produto + '\'' +
                '}';
    }
}
