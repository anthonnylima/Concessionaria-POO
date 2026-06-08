package Concessionaria;

public class Carro {
    String modelo;
    String marca;
    int anoCarro;
    double valor;
    String placa;
    String tipo;

    public Carro(String modelo, int anoCarro, String marca, double valor, String placa, String tipo) {
        this.modelo = modelo;
        this.anoCarro = anoCarro;
        this.marca = marca;
        this.valor = valor;
        this.placa = placa;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo +
            "\nMarca: " + marca +
            "\nAno do carro: " + anoCarro +
            "\nValor: " + valor +
            "\nPlaca: " + placa +
            "\nTipo: " + tipo;
	}
}
