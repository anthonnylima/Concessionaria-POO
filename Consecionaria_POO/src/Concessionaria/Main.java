import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da concessionária: ");
        String nomeConcessionaria = sc.nextLine();

        Concessionaria concessionaria = new Concessionaria(nomeConcessionaria);

        int opcao;

        do {
            System.out.println("\n===== " + concessionaria.nome.toUpperCase() + " =====");
            System.out.println("1  - Adicionar carro");
            System.out.println("2  - Listar todos os carros");
            System.out.println("3  - Buscar carro por placa");
            System.out.println("4  - Remover carro por placa");
            System.out.println("5  - Buscar carros por marca");
            System.out.println("6  - Listar carros por faixa de valor");
            System.out.println("7  - Exibir resumo do estoque");
            System.out.println("8  - Listar carros novos");
            System.out.println("9  - Aplicar desconto por placa");
            System.out.println("0  - Sair");
            System.out.print("\nEscolha uma opção: ");
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
                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Placa: ");
                    String placa = sc.nextLine();
                    System.out.print("Tipo (Sedan/SUV/Hatch/Pickup...): ");
                    String tipo = sc.nextLine();

                    Carro novoCarro = new Carro(modelo, marca, ano, valor, placa, tipo);
                    concessionaria.adicionarCarro(novoCarro);
                    break;

                case 2:
                    concessionaria.listarCarros();
                    break;

                case 3:
                    System.out.print("Informe a placa: ");
                    String placaBusca = sc.nextLine();
                    Carro encontrado = concessionaria.buscarPorPlaca(placaBusca);
                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Carro não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Informe a placa para remover: ");
                    String placaRemover = sc.nextLine();
                    concessionaria.removerPorPlaca(placaRemover);
                    break;

                case 5:
                    System.out.print("Informe a marca: ");
                    String marcaBusca = sc.nextLine();
                    concessionaria.buscarPorMarca(marcaBusca);
                    break;

                case 6:
                    System.out.print("Valor mínimo: ");
                    double min = sc.nextDouble();
                    System.out.print("Valor máximo: ");
                    double max = sc.nextDouble();
                    sc.nextLine();
                    concessionaria.listarPorFaixaDeValor(min, max);
                    break;

                case 7:
                    concessionaria.exibirResumo();
                    break;

                case 8:
                    int anoAtual = java.time.Year.now().getValue();
                    concessionaria.listarCarrosNovos(anoAtual);
                    break;

                case 9:
                    System.out.print("Informe a placa do carro: ");
                    String placaDesc = sc.nextLine();
                    Carro carroDesc = concessionaria.buscarPorPlaca(placaDesc);
                    if (carroDesc != null) {
                        System.out.print("Informe o percentual de desconto (%): ");
                        double desconto = sc.nextDouble();
                        sc.nextLine();
                        carroDesc.aplicarDesconto(desconto);
                        System.out.printf("Novo valor: R$ %.2f%n", carroDesc.valor);
                    } else {
                        System.out.println("Carro não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
