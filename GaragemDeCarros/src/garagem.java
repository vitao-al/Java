
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class garagem {
	
	Scanner entrada;
	ArrayList <Carro> garagemCarro;
	
	public garagem() {
		entrada = new Scanner(System.in);
		this.garagemCarro = new ArrayList<>();
		this.menu();
	}
	
	public void menu() {
		boolean condicao = true;
		while(condicao == true) {
			System.out.println("Bem vindo a sua garagem");
			System.out.println("====menu====");
			System.out.println("1 - Adicionar carro na garagem");
			System.out.println("2 - Listar carros da garagem");
			
			int opcao = entrada.nextInt();
			switch(opcao) {
			case 1:
				this.adicionarCarro();
			break;
			
			case 2:
				this.listarCarros();
			break;
			
			}
		}
	}
	
	public void adicionarCarro() {

		Carro c1 = new Carro();
		
		garagemCarro.add(c1);
	}
	public void listarCarros() {
		System.out.println("Vamos listar os carros da garagem");
		
		for(Carro c : this.garagemCarro) {
			System.out.println("Nome do carro: "+c.getNome());
			System.out.println("Marca do carro: "+c.getMarca());
		}
	}
    public static void main (String[] args){
        garagem g = new garagem();
    }
}