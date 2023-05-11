/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema20
* Data: 11/05/2023
*/

/* Escreva um programa que, dada a carga máxima de um elevador e 
a quantidade máxima de pessoas digitadas pelo usuário, leia o
peso de cada pessoa, também digitada pelo usuário, que entra 
no elevador até que a carga máxima seja atingida ou o número 
máximo de pessoas seja atingido (utilize do / while). */

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner (System.in)) {
            
            double cargaMaxima, pessoasNoElevador, pesoAtual = 0, quantidadeAtual = 0, pesoPessoa;

            System.out.printf("Digite a carga máxima do elevador: ");
            cargaMaxima = input.nextDouble();

            System.out.print("Digite a quantidade máxima de pessoas: ");
            pessoasNoElevador = input.nextDouble();

            do{
                System.out.printf("%nDigite o peso da pessoa que entrou no elevador: ");
                pesoPessoa = input.nextDouble();

                if(pesoAtual + pesoPessoa <= cargaMaxima){
                    pesoAtual += pesoPessoa;
                    quantidadeAtual += 1;
                }
                else{
                    System.out.println("Limite de carga máxima atingido.");
                    
                }
                
                System.out.printf("O elevador está com %.0f pessoas e %.2f kg de peso.", quantidadeAtual, pesoAtual);
            } while(pesoAtual < cargaMaxima && quantidadeAtual < pessoasNoElevador);

        }

    }
}
