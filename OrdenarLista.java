package ArrayList;

import java.util.ArrayList;

public class OrdenarLista {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<Integer> ordenados = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int numero = (int) (Math.random() * (50 - (-50) + 1) - 50);

			numeros.add(numero);
		}
		System.out.println(numeros);

		int minimo = numeros.get(0);
		int numero;
		for (int pos = 1; pos < numeros.size(); pos++) {
			numero = numeros.get(pos);

			if (numero < minimo) {
				minimo = numero;
			}
		}

		// System.out.println(minimo);
		ordenados.add(minimo);

		int siguiente_numero = minimo;

		/*
		 * [0,-1,-1,6] minimo = -1 siguiente_numero = 6 [-1,0,6]
		 * 
		 */

		
			siguiente_numero++;

			if (numeros.contains(siguiente_numero)) {
				ordenados.add(siguiente_numero);

			}
			System.out.println(ordenados);

		} 

		
	}

