/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema3
* Data: 11/05/2023
*/

/* Elabore um programa que lê dois valores A e B e os escreve com 
a mensagem: “São múltiplos” ou “Não são múltiplos”. */

import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Digite o valor de A: ");
            int numeroA = input.nextInt();

            System.out.print("Digite o valor de B: ");
            int numeroB = input.nextInt();

            if(numeroA % numeroB == 0){
                System.out.println("São múltiplos");
            }
            else{
                System.out.println("Não são múltiplos");
            }

    }

    }
}
