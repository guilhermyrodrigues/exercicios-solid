package SOLID.DIP.ex01;

public class Interruptor {
    private LampadaIncandescente lampadaIncandescente;

    public Interruptor(LampadaIncandescente lampadaIncandescente) {
        this.lampadaIncandescente = lampadaIncandescente;
    }

    public void acionar() {
        lampadaIncandescente.acender();
    }
}
