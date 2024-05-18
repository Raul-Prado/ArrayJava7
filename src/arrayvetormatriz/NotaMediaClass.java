package arrayvetormatriz;

import java.util.Scanner;

public class NotaMediaClass {

	public static void main(String[] args) {
		// variaveis
		float NotasParticipantes[] = new float[2];
		float NotaMedia;
		float NotaParticipante;
		int Indice;
		
		//ler dados
		Scanner scanner = new Scanner(System.in);
		
		//laco
		for(Indice = 0; Indice <2; Indice++) {
			//Entrada de dados
			System.out.println("Digite sua nota: ");
			NotaParticipante = scanner.nextInt();
			NotaMedia = (NotaParticipante+NotaParticipante)/2;
			

			System.out.println("Sua media: " + NotaMedia);
		}
		
	}

}
