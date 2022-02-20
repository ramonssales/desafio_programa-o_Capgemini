import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Desafio da escada de asterisco para a direita 
public class Questao_1 {

	public static void main(String[] args) {

		// Chamando o valor de degraus da escada (n) pelo usuario

		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o valor de n:");
		int n = entrada.nextInt();
		entrada.close();

		// Instanciar

		Questao_1 questao_1 = new Questao_1();
		questao_1.algoritmo(n);

	}

	// Montando a matriz

	public void algoritmo(int nDegraus) {
		List<String> degraus = new ArrayList<>();

		for (int i = 0; i < nDegraus; i++) {
			degraus.add(String.join("", Collections.nCopies(nDegraus - i, " "))
					+ String.join("", Collections.nCopies(i + 1, "*")));
		}

		for (String d : degraus) {
			System.out.println(d);
		}

	}

}
