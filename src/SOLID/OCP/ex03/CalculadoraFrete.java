package SOLID.OCP.ex03;

public class CalculadoraFrete {
    public double calcular(Double peso, Calculadora calculadora) {
        return calculadora.calcular(peso);
    }
}
