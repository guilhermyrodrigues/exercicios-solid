package SOLID.OCP.ex01;

public class CalculadoraDeSalario {
    public double calcular(double salario, CalculoSalario calculoSalario) {
        return calculoSalario.calcular(salario);
    }
}
