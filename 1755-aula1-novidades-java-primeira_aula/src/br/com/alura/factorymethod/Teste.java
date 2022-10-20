package br.com.alura.factorymethod;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {

	// Novidade do java 9 - Factory Method para Collection
	public static void main(String[] args) {
		List<String> nomes = List.of("primeiroNome", "segundoNome");
		Set.of("terceiroNome");
		Map.of("nome", "Daniel");
//		nomes.add("Erro");
		nomes.forEach(nome -> {
			System.out.println(nome);
		});
		
		/*
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);
		*/
	}
}
