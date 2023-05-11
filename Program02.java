/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema2
* Data: 11/05/2023
*/


/* Construa um programa que receba como entrada três valores A, B 
e C e os imprima em ordem crescente.  */

import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner (System.in)) {

            int valor1, valor2, valor3, valorMenor, valorMeio, valorMaior;

            System.out.print("Digite o valor de A: ");
            valor1 = input.nextInt();

            System.out.print("Digite o valor de B: ");
            valor2 = input.nextInt();

            System.out.print("Digite o valor de C: ");
            valor3 = input.nextInt();

            if ( valor1 <= valor2 && valor1 <= valor3 ) {

                valorMenor = valor1;

                if (valor2 <= valor3) {
                    valorMeio = valor2;
                    valorMaior = valor3;
                } else {
                    valorMeio = valor3;
                    valorMaior = valor2;
                }
            } else if ( valor2 <= valor1 && valor2 <= valor3){
                valorMenor = valor2;
                if ( valor2 <= valor3){
                    valorMeio = valor1;
                    valorMaior = valor3;

                } else{
                    valorMeio = valor3;
                    valorMaior = valor1;
                }
            } else{

                valorMenor = valor3;

                if( valor3 <= valor1 ){
                    valorMeio = valor2;
                    valorMaior = valor1;
                } else {
                    valorMeio = valor1;
                    valorMaior = valor2;
                }

             }
    
             
            System.out.printf("Os valores em ordem crescente é: %d , %d, %d %n", valorMenor, valorMeio, valorMaior);


           }
           
        }
    }

