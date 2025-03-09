package SOLID.SRP.ex02;

public class CalculaImposto {

    public void calcularTotalComImposto(Venda venda) {
        double imposto = venda.getValor() * 0.1;
        System.out.println("Total com imposto: " + (venda.getValor()) + imposto);
    }
}
