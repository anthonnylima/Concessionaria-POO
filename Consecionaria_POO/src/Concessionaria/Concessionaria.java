public class Concessionaria {

     Carro[] carros;
     int     quantidade;
     String  nome;

    public Concessionaria(String nome) {
        this.nome       = nome;
        this.carros     = new Carro[4];
        this.quantidade = 0;
    }

    void expandir() {
        Carro[] novoArray = new Carro[carros.length * 2];
        for (int i = 0; i < quantidade; i++) {
            novoArray[i] = carros[i];
        }
        carros = novoArray;
        System.out.println("[interno] Array expandido para " + carros.length + " posições.");
    }

    void encolher() {
        if (carros.length <= 4) return;
        int novaCapacidade = carros.length / 2;
        if (novaCapacidade < quantidade) return;
        Carro[] novoArray = new Carro[novaCapacidade];
        for (int i = 0; i < quantidade; i++) {
            novoArray[i] = carros[i];
        }
        carros = novoArray;
        System.out.println("[interno] Array reduzido para " + carros.length + " posições.");
    }

     boolean adicionarCarro(Carro carro) {
        if (buscarPorPlaca(carro.placa) != null) {
            System.out.println("Já existe um carro com a placa " + carro.placa + " cadastrado.");
            return false;
        }
        if (quantidade == carros.length) {
            expandir();
        }
        carros[quantidade] = carro;
        quantidade++;
        System.out.println("Carro adicionado com sucesso!");
        return true;
    }

   void listarCarros() {
        if (quantidade == 0) {
            System.out.println("Nenhum carro cadastrado.");
            return;
        }
        System.out.println("\n===== ESTOQUE: " + nome + " =====");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(carros[i]);
        }
    }


    Carro buscarPorPlaca(String placa) {
        for (int i = 0; i < quantidade; i++) {
            if (carros[i].placa.equalsIgnoreCase(placa)) {
                return carros[i];
            }
        }
        return null;
    }

    boolean removerPorPlaca(String placa) {
        for (int i = 0; i < quantidade; i++) {
            if (carros[i].placa.equalsIgnoreCase(placa)) {
                for (int j = i; j < quantidade - 1; j++) {
                    carros[j] = carros[j + 1];
                }
                carros[quantidade - 1] = null;
                quantidade--;
                if (quantidade > 0 && quantidade <= carros.length / 4) {
                    encolher();
                }
                System.out.println("Carro removido com sucesso!");
                return true;
            }
        }
        System.out.println("Carro com placa " + placa + " não encontrado.");
        return false;
    }

    void buscarPorMarca(String marca) {
        boolean encontrou = false;
        System.out.println("\n== Carros da marca: " + marca + " ==");
        for (int i = 0; i < quantidade; i++) {
            if (carros[i].marca.equalsIgnoreCase(marca)) {
                System.out.println(carros[i]);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum carro encontrado para a marca " + marca + ".");
        }
    }

    void listarPorFaixaDeValor(double minimo, double maximo) {
        boolean encontrou = false;
        System.out.println("\n== Carros entre R$ " + minimo + " e R$ " + maximo + " ==");
        for (int i = 0; i < quantidade; i++) {
            if (carros[i].valor >= minimo && carros[i].valor <= maximo) {
                System.out.println(carros[i]);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum carro encontrado nessa faixa de valor.");
        }
    }


    double calcularValorTotalEstoque() {
        double total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += carros[i].valor;
        }
        return total;
    }

    Carro carroMaisBarato() {
        if (quantidade == 0) return null;
        Carro maisBarato = carros[0];
        for (int i = 1; i < quantidade; i++) {
            if (carros[i].valor < maisBarato.valor) {
                maisBarato = carros[i];
            }
        }
        return maisBarato;
    }

    Carro carroMaisCaro() {
        if (quantidade == 0) return null;
        Carro maisCaro = carros[0];
        for (int i = 1; i < quantidade; i++) {
            if (carros[i].valor > maisCaro.valor) {
                maisCaro = carros[i];
            }
        }
        return maisCaro;
    }

    void listarCarrosNovos(int anoAtual) {
        boolean encontrou = false;
        System.out.println("\n== Carros novos (até 2 anos) ==");
        for (int i = 0; i < quantidade; i++) {
            if (carros[i].isNovo(anoAtual)) {
                System.out.println(carros[i]);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum carro novo no estoque.");
        }
    }

    void exibirResumo() {
        System.out.println("\n===== RESUMO DO ESTOQUE =====");
        System.out.println("Concessionária   : " + nome);
        System.out.println("Capacidade atual : " + carros.length + " (dinâmica)");
        System.out.println("Carros no estoque: " + quantidade);
        System.out.printf ("Valor total      : R$ %.2f%n", calcularValorTotalEstoque());
        if (quantidade > 0) {
            System.out.println("Mais barato: " + carroMaisBarato().modelo
                             + " - R$ " + String.format("%.2f", carroMaisBarato().valor));
            System.out.println("Mais caro  : " + carroMaisCaro().modelo
                             + " - R$ " + String.format("%.2f", carroMaisCaro().valor));
        }
        System.out.println("=============================");
    }
}
