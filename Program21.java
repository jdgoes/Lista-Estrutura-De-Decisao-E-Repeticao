/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema21
* Data: 11/05/2023
*/

/* Escreva um programa que, dado um número positivo digitado 
pelo o usuário mostre a tabuada de todos os números de 1 até o 
número digitado. (utilize for) */

import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

        System.out.print("Digite um número positivo: ");
        int numeroDigitado = input.nextInt();

        int tabuada = 0, tabuada2 = 0;

        for(tabuada = 1; tabuada <= numeroDigitado; tabuada++){
            System.out.println();
            System.out.printf("%nTabuada do %d: ", tabuada);

            for(tabuada2 = 1; tabuada2 <= 10; tabuada2++){
                System.out.printf("%n%d x %d = %d", tabuada, tabuada2, (tabuada * tabuada2));
            }

        }

        System.out.println();

        }
    }
}
