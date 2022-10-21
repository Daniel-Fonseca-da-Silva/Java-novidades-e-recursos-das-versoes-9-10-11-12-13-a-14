package br.com.alura.switchexpression;

public class Teste {

	// Novidade do Java 14 - Switch 
	public static void main(String[] args) {
		String nome = "Joao";
		switch (nome) {
		case "Renata" -> System.out.println("Acertou: " + nome);
		case "Joao" -> System.out.println("Acertou: " + nome);
		default -> System.out.println("Nenhum nome encontrado!!");
		}
	}
}
