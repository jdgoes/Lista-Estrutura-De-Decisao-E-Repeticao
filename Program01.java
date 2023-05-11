/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema1
* Data: 11/05/2023
*/


/* Faça um programa que leia dois números A e B e imprima o maior 
deles.  */


import java.util.Scanner;

public class Program01{
    public static void main(String[] args) {
        
    try (Scanner input = new Scanner (System.in)) {
        
        int valorUm, valorDois;
        System.out.print("Digite um valor: ");
        valorUm = input.nextInt();

        System.out.printf("Digite um outro valor: ");
        valorDois = input.nextInt();

        if(valorUm > valorDois){
            System.out.printf("O maior número é: %d %n", valorUm);           
        } else{
            System.out.printf("O maior número é: %d %n", valorDois);
        }
        
        }

    }
}