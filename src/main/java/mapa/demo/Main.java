package mapa.demo;

public class Main {
    public static void main(String[] args) {

        Hospede h = new Hospede(1, "Pablo Soares", "teresópolis - rio ", 14);
        Suite s = new Suite(1, 130.02, "luxo", 2);

        Reserva r = new Reserva(s, 12, 11);

        r.inserirHospede(h);

        System.out.println(r);
    }
}