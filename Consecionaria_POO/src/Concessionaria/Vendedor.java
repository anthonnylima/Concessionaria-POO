package Concessionaria;
import java.util.ArrayList;

public class concessionaria {
	
	ArrayList<Carro> carros;
	
	public concessionaria() {
		this.carros = new ArrayList<>();
	}
	
	public void adicionarCarro(Carro carro) {
		carros.add(carro);
	}
	
	public void listarCarros() {
		for(Carro carro : carros) {
			System.out.println(carro);
		}
	}
	
	public void buscarPlaca(String placaProcurada) {
		for(Carro carro : carros) {
			if(carro.placa.equals(placaProcurada)) {
				System.out.println(carro);
			}
		}
	}
	
	public void removerPlaca(String placaProcurada) {
		for(int i = 0; i < carros.size(); i++) {
			if(carros.get(i).placa.equals(placaProcurada)) {
				carros.remove(i);
				break;
			}
		}
	}
}
