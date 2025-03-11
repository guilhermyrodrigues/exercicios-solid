package SOLID.exerciciofinal;

// Classe Pedido (SRP: Responsável apenas por armazenar dados)
public class Pedido {
    private String produto;
    private double preco;
    private Desconto desconto;

    public Pedido(String produto, double preco, Desconto desconto) {
        this.produto = produto;
        this.preco = preco;
        this.desconto = desconto;
    }

    public double calcularPrecoFinal() {
        return desconto.aplicar(preco);
    }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }
}
