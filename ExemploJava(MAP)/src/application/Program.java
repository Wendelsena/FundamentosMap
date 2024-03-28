package application;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		// Map é uma maneira conveniente de associar chaves a valores. 
		// Permitite uma rápida recuperação de valores com base em suas chaves.
		Map<String, String> cookies = new TreeMap<>(); // TreeMap ordena os items.
		
		// put adiciona valores e chaves a um Map.
		cookies.put("Username", "Maria");
		cookies.put("Email", "Maria@gmail.com");
		cookies.put("Phone", "(11) 90000-0001");
		cookies.put("Age", "26");
		
		// remove tira do Map a entrada, cuja chave é, no caso abaixo, o email.
		cookies.remove("Email");
		
		// para imprimir o Map.
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) { //KeySet retorna um set com a chave dos Map.
			System.out.println(key + ": " + cookies.get(key));
			
		}
		
		// O Map não aceita repetição de chave, então chaves repetidas são sobrescrevidas.
		System.out.println("--------------------------------------");
		cookies.put("Phone", "(11) 90000-0002");
		System.out.println("Valor Alterado pela Repetição da chave:");
		System.out.println("Phone: "+ cookies.get("Phone"));
		System.out.println("--------------------------------------");
		
		// Verificando se no Map existe alguma determinado chave ou elemento.
		System.out.println("--------------------------------------");
		System.out.println("Contem 'Phone' Key: " + cookies.containsKey("Phone"));
		System.out.println("Contem 'Email' Key: " + cookies.get("Email"));
		System.out.println("--------------------------------------");
		
		// tamanho do Map.
		System.out.println("Tamanho do Map: " + cookies.size());
		//
		//
		//
		//
		//
		// Exemplo de Programa de controle de estoque:
		System.out.println("--------------------------------------");
		Map<Product, Double> stock = new HashMap<>();
		
		System.out.println("Controle de Estoque: ");
		Product p1 = new Product("Tv", 900.00);
		Product p2 = new Product("Notebook", 1200.00);
		Product p3 = new Product("Tablet", 400.00);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		
		// O objeto `ps` não é encontrado no Map `stock` porque o método `containsKey()` compara
		// instâncias de objetos e `ps` é uma nova instância, mesmo com atributos idênticos a uma chave existente.
		Product ps = new Product("Tv", 900.00);
		
		System.out.println("Contains 'ps' Key: " + stock.containsKey(ps));
		System.out.println("--------------------------------------");
	}

}
