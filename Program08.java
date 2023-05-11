/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema8
* Data: 11/05/2023
*/

/*  Crie um programa que lê um número entre 1 e 12, correspondendo 
a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro. 
Ao final, o programa deve imprimir uma mensagem identificando, 
com base no número digitado, o nome do mês e a estação.
Exemplo para o mês 1: "Mês: Janeiro – Estação: Verão" */


import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner (System.in)) {

            System.out.print("Digite o número do mês: ");
            byte mesesDoAno = input.nextByte();

            if (mesesDoAno == 1){

                System.out.println("Você está em Janeiro, a estação desse mês é o Verão.");

            }   else if( mesesDoAno == 2){
                
                System.out.println("Você está em Fevereiro, a estação desse mês é o Verão.");

            }   else if( mesesDoAno == 3){
                
                System.out.println("Você está em Março, a estação desse mês é o Outono.");

            } 
                else if( mesesDoAno == 4){
                
                System.out.println("Você está em Abril, a estação desse mês é o Outono.");

            }   else if( mesesDoAno == 5){
                
                System.out.println("Você está em Maio, a estação desse mês é o Outono.");

            }
                else if( mesesDoAno == 6){
                
                System.out.println("Você está em Junho, a estação desse mês é o Inverno.");

            }
                else if( mesesDoAno == 7){
                
                System.out.println("Você está em Julho, a estação desse mês é o Inverno.");

            }
                else if( mesesDoAno == 8){
                
                System.out.println("Você está em Agosto, a estação desse mês é o Inverno.");

            }
                else if( mesesDoAno == 9){
                
                System.out.println("Você está em Setembro, a estação desse mês é a Primavera.");

            }
                else if( mesesDoAno == 10){
                
                System.out.println("Você está em Outubro, a estação desse mês é a Primavera.");

            }
                else if( mesesDoAno == 11){
                
                System.out.println("Você está em Novembro, a estação desse mês é a Primavera.");

            }
                else if( mesesDoAno == 12){
                
                System.out.println("Você está em Dezembro, a estação desse mês é o Verão.");

            } else {
                System.out.println("Mês inválido, tente novamente.");
            }




        }
  

    }
}
