/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema5
* Data: 11/05/2023
*/

/* Faça um programa que leia o nome, o sobrenome, a idade, em 
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja 
visualizar dados completos?”. Se o caractere digitado pelo 
usuário for ‘S’ o programa deve imprimir na tela Nome, 
Sobrenome, idade e naturalidade. Se o caractere digitado pelo 
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se 
o caractere não for nenhuma das outras opções acima o programa 
deve imprimir “Digitação errada. Tente Novamente”. */

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner (System.in)) {

            System.out.print("Digite o seu primeiro nome: ");
            String nome = input.next();

            System.out.print("Digite o seu sobrenome: ");
            String sobrenome = input.next();

            System.out.print("Quantos anos você tem?  ");
            byte idade = input.nextByte();
            input.nextLine();

            System.out.print("Qual a sua naturalidade ? ");
            String naturalidade = input.nextLine();

            System.out.printf("%nOk, agora que possuo seus dados, você deseja visualizar os mesmos ? \nResponda Sim ou Não: ");
            String simOuNao = input.next();
            char resposta = simOuNao.toUpperCase().charAt(0);

            if(resposta == 'S'){
                System.out.println("Nome: " + nome
            + "\nSobrenome: " + sobrenome 
            + "\nNaturalidade: " + naturalidade
            + "\nIdade: " + idade);
            } 
            else if(resposta == 'N') {
                System.out.printf("O seu nome é %s, a sua idade é %d ", nome, idade);
            }
                else{
                    System.out.println("Os dados inseridos são inválidos, tente novamente.");
                }

        }
    }
}
