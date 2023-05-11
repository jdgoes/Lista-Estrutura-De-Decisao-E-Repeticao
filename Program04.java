/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema4
* Data: 11/05/2023
*/

/* Faça um programa que leia um número inteiro e mostre uma 
mensagem indicando se este número é par ou ímpar e se é 
positivo ou negativo */

import java.util.Scanner;

public class Program04 {
    public static void main(String[] args){

        try (Scanner input = new Scanner (System.in)){

            System.out.print("Digite um valor: ");
            int valorUm = input.nextInt();

            if(valorUm > 0){

                System.out.println("O valor digitado é positivo");
            } 
            else if( valorUm < 0){

                System.out.println("O valor digitado é negativo");
          } else{
            System.out.println("O valor é neutro");
          }
          
          if(valorUm % 2 == 0){

            System.out.println("E o mesmo é par");
          } 

          else{
            System.out.println("E o mesmo é ímpar");
          }

        }
    }
}