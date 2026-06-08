package Concessionaria;
import java.util.ArrayList;

public class Concessionaria {

    ArrayList<Carro> carros;

    public Concessionaria() {
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        for (Carro c : carros) {
            if (c.placa.equalsIgnoreCase(carro.placa)) {
                System.out.println("Já existe um carro cadastrado com a placa: " + carro.placa);
                return;
            }
        }
        carros.add(carro);
        System.out.println("Carro adicionado com sucesso!");
    }

    public void listarCarros() {
        if (carros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
            return;
        }
        System.out.println("\n===== LISTA DE CARROS (" + carros.size() + ") =====");
        for (int i = 0; i < carros.size(); i++) {
            System.out.println("\n--- Carro " + (i + 1) + " ---");
            System.out.println(carros.get(i));
        }
    }

    public void buscarPlaca(String placaProcurada) {
        boolean encontrado = false;

        for (Carro carro : carros) {
            if (carro.placa.equalsIgnoreCase(placaProcurada)) {
                System.out.println("\n===== CARRO ENCONTRADO =====");
                System.out.println(carro);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum carro encontrado com a placa: " + placaProcurada);
        }
    }

    public void removerPlaca(String placaProcurada) {
        boolean removido = false;

        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).placa.equalsIgnoreCase(placaProcurada)) {
                System.out.println("\n===== CARRO REMOVIDO =====");
                System.out.println(carros.get(i));
                carros.remove(i);
                removido = true;
                break;
            }
        }

        if (!removido) {
            System.out.println("Nenhum carro encontrado com a placa: " + placaProcurada);
        }
    }
}