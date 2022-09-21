package mapa.demo;

import java.security.Principal;
import java.util.ArrayList;

public class Reserva {
    private ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
    private Suite suite;
    private int quatidadePessoa;
    private int quatidadeDias;

    public Reserva(Suite suite, int quatidadePessoa, int quatidadeDias) {

        this.suite = suite;
        this.quatidadePessoa = quatidadePessoa;
        this.quatidadeDias = quatidadeDias;
    }

    public Reserva() {

    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public int getQuatidadePessoa() {
        return quatidadePessoa;
    }

    public void setQuatidadePessoa(int quatidadePessoa) {
        this.quatidadePessoa = quatidadePessoa;
    }

    public int getQuatidadeDias() {
        return quatidadeDias;
    }

    public void setQuatidadeDias(int quatidadeDias) {
        this.quatidadeDias = quatidadeDias;
    }

    public boolean verificarCapacidade() {
        int hospedesDef = 0;

        for (Hospede h : this.hospedes) {
            if (h.getIdade() > 2) {
                hospedesDef++;
            }
        }
        return hospedesDef >= this.suite.getCapacidade();
    }

    public double calcularDiaria() {
        double vfinal = this.suite.getValorDiaria() * this.quatidadeDias;
        if (this.getQuatidadeDias() > 7) {
            vfinal -= vfinal * 0.10;
        }
        return vfinal;
    }

    public void inserirHospede(Hospede h) {
        if (this.suite instanceof Suite) {
            if (!this.verificarCapacidade()) {

                this.hospedes.add(h);
            } else {
                System.out.println("capacidade maxima atingida");
            }
        } else {
            System.out.println("Não foi valido");
        }
    }

    public Hospede getHospede(int indice) {
        return this.hospedes.get(indice);
    }

    @Override
    public String toString() {
        return "Reserva [hospedes=" + hospedes + ", quatidadeDias=" + quatidadeDias + ", quatidadePessoa="
                + quatidadePessoa + ", suite=" + suite + "]";
    }

}
