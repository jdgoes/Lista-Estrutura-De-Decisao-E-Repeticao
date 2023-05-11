/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema19
* Data: 11/05/2023
*/

/* Um determinado gás duplica seu volume a cada segundo. Dada um
volume inicial, em centímetros cúbicos, digitado pelo usuário
faça um programa que determine o tempo necessário para que 
esse volume se torne maior que 1000 centímetros cúbicos. 
(utilize while) */


import java.util.Scanner;

public class Program19{
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner (System.in)) {

            double volumeInicial, contador = 0;

            System.out.print("Digite o volume inicial em metros cúbicos: ");
            volumeInicial = input.nextDouble();
            
        while(volumeInicial < 1000){

            volumeInicial *= 2;
            contador += 1;

        }

        System.out.printf("O tempo necessário para esse gás ultrapassar 1000 cm³ é %.0f seg. %n", contador);

        }

    }
}
