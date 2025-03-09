package SOLID.SRP.ex02;

public class GerarRecibo {

    public void gerarRecibo(Venda venda) {
        System.out.println("Recibo - Produto: " + venda.getProduto() + ", Valor: " + venda.getValor());
    }

}
