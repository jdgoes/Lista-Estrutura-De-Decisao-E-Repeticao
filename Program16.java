/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema16
* Data: 11/05/2023
*/

/* Faça um programa que solicite ao usuário que digite um 
número até que ele digite um número menor que 0 (utilize 
while) */

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int valorDigitado = 0;

        while(valorDigitado >= 0){
            valorDigitado = input.nextInt();
        }

        input.close();

        System.out.println("Programa encerrado. Número abaixo do esperado");
    }

}
