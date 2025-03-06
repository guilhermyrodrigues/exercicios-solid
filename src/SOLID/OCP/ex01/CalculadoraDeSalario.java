package SOLID.OCP.ex01;

public class CalculadoraDeSalario {
    public double calcular(double salario, CalculoSalario porcentagem) {
        return porcentagem.calcular(salario);
    }
}
