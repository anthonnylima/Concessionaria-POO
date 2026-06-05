package Concessionaria;

import java.util.ArrayList;

public class Vendedor {
    String nome;
    ArrayList<Carro> carros;

    public Vendedor(String nome) {
        this.nome = nome;
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void listarCarros() {
        for (Carro carro : carros) {
            System.out.println(carro.modelo);
        }
    }
}
