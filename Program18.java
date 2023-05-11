/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema18
* Data: 11/05/2023
*/

/* Faça um programa que determine o fatorial de um número. Para 
este problema, tem-se como entrada o valor do número do qual 
se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O 
fatorial de um número N (N!) é definido conforme a seguir 
(utilize for):
i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N */

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args){
        
        try (Scanner input = new Scanner (System.in)) {

            double valorRecebido, calculoDoFatorial = 1, inicializadorFor;

            System.out.print("Digite o número fatorial a ser calculado: ");
            valorRecebido = input.nextDouble();
            
            for(inicializadorFor = 1; inicializadorFor <= valorRecebido; inicializadorFor++){

                calculoDoFatorial = calculoDoFatorial * inicializadorFor;

            }
            
            System.out.printf("Fatorial: %.0f%n", calculoDoFatorial);

        }
    }
}
