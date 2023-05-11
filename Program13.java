/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema13
* Data: 11/05/2023
*/

/* Faça um programa que some os números de 1 a 100 e imprima 
somente o valor total da soma */

public class Program13 {
    public static void main(String[] args) {
        
        int somarNumeros = 0, valorDesconhecido;

        for(valorDesconhecido = 1; valorDesconhecido <= 100; valorDesconhecido++){

            somarNumeros += valorDesconhecido;
            System.out.println(somarNumeros);
            
        }

        
    }
}
