public class Carro {

    public String modelo;
    public String marca;
    public int    ano;
    public double valor;
    public String placa;
    public String tipo;

    public Carro(String modelo, String marca, int ano, double valor, String placa, String tipo) {
        this.modelo = modelo;
        this.marca  = marca;
        this.ano    = ano;
        this.valor  = valor;
        this.placa  = placa;
        this.tipo   = tipo;
    }

    public boolean isNovo(int anoAtual) {
        return (anoAtual - this.ano) <= 2;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual < 100) {
            this.valor = this.valor - (this.valor * percentual / 100);
        } else {
            System.out.println("Percentual de desconto inválido.");
        }
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - this.ano;
    }

    @Override
    public String toString() {
        return "-------------------------------\n"
             + "Modelo : " + modelo + "\n"
             + "Marca  : " + marca  + "\n"
             + "Ano    : " + ano    + "\n"
             + "Valor  : R$ " + String.format("%.2f", valor) + "\n"
             + "Placa  : " + placa  + "\n"
             + "Tipo   : " + tipo   + "\n"
             + "-------------------------------";
    }
}
