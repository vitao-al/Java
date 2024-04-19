import java.util.Scanner;

public class Carro{
	public String nome;
    public String cor;
    public int numPortas;

    String marca;
 
	 Scanner leitor = new Scanner(System.in);
 
	 public Carro(){
		 System.out.println("Digite o nome do carro:");
		 String nome2 = leitor.nextLine();
		 this.nome = nome2;
 
		 System.out.println("Digite a cor do carro:");
		 String cor2 = leitor.nextLine();
		 this.cor = cor2;
 
		 System.out.println("Digite a marca do carro:");
		 String marca2 = leitor.nextLine();
		 this.marca = marca2;
 
		 System.out.println("Digite o número de portas do carro:");
		 int numPortas2 = leitor.nextInt();
		 this.numPortas = numPortas2;
 
		 System.out.println("Carro criado com sucesso!\nNome do carro:"+nome+"\nCor:"+cor+"\nMarca:"+marca+"\nNúmero de portas:"+numPortas);
	 }
 
	 public String getNome() {
		 return nome;
	 }
 
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
 
	 public String getCor() {
		 return cor;
	 }
 
	 public void setCor(String cor) {
		 this.cor = cor;
	 }
 
	 public int getNumPortas() {
		 return numPortas;
	 }
 
	 public void setNumPortas(int numPortas) {
		 this.numPortas = numPortas;
	 }
 
	 public String getMarca() {
		 return marca;
	 }
 
	 public void setMarca(String marca) {
		 this.marca = marca;
	 }
 
	 public Scanner getLeitor() {
		 return leitor;
	 }
 
	 public void setLeitor(Scanner leitor) {
		 this.leitor = leitor;
	 }
}