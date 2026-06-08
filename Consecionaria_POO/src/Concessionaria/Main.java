package Concessionaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Concessionaria concessionaria = new Concessionaria();
        int opcao;

        do {
            System.out.println("\n===== CONCESSIONÁRIA =====");
            System.out.println("1 - Adicionar carro");
            System.out.println("2 - Listar carros");
            System.out.println("3 - Buscar por placa");
            System.out.println("4 - Remover por placa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Placa: ");
                    String placa = sc.nextLine();

                    System.out.print("Tipo: ");
                    String tipo = sc.nextLine();

                    Carro carro = new Carro(modelo, ano, marca, valor, placa, tipo);
                    concessionaria.adicionarCarro(carro);
                    System.out.println("Carro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n===== LISTA DE CARROS =====");
                    concessionaria.listarCarros();
                    break;

                case 3:
                    System.out.print("Digite a placa: ");
                    String placaBusca = sc.nextLine();
                    System.out.println("\n===== RESULTADO DA BUSCA =====");
                    concessionaria.buscarPlaca(placaBusca);
                    break;

                case 4:
                    System.out.print("Digite a placa para remover: ");
                    String placaRemover = sc.nextLine();
                    concessionaria.removerPlaca(placaRemover);
                    System.out.println("Carro removido com sucesso!");
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
