package br.com.alura.inferenciavariavel;

import java.util.HashMap;

public class Teste {
	
//	var idade = 29; não pode

	// Novidade do Java 10 - Inferência de variável
	public static void main(String[] args) {
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("Joao", "04813189");
		System.out.println(cpfPorNomes);
	}
}
