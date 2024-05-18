package arrayvetormatriz;

import java.util.Scanner;

public class NumerosVetorClass {

	public static void main(String[] args) {
		// varias
		int Indice;
		int CaixaNumeros[] = {2,5,1,3,4,9,7,8,10,6};//
		int NumeroEncontrar;
		boolean NaoEncontrado = false;
		
		//ler dados
		Scanner scanner = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Digite o número que você deseja encontrar: ");
		NumeroEncontrar = scanner.nextInt();
		
		//laço
		for(Indice = 0; Indice <  CaixaNumeros.length; Indice++) {
			
			if(NumeroEncontrar==CaixaNumeros[Indice]) {
				System.out.println("Linha/Dentro da caixa: " + CaixaNumeros[Indice] + " Coluna/Fora da caixa " + Indice);
			
				NaoEncontrado = true;
			}
		}
		if(NaoEncontrado!=true){
			System.out.println("O número " + NumeroEncontrar + " não foi encontrado!");
			
		}
	}

}
