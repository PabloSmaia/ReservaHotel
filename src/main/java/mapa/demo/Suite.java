package mapa.demo;

public class Suite {
    private int numero;
    private double valorDiaria;
    private String tipo;
    private int capacidade;

    public Suite(int numero, double valorDiaria, String tipo, int capacidade) {
        this.numero = numero;
        this.valorDiaria = valorDiaria;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public String toString() {
        return "Suite [capacidade=" + capacidade + ", numero=" + numero + ", tipo=" + tipo + ", valorDiaria="
                + valorDiaria + "]";
    }
}
