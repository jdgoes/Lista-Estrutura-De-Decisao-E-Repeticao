/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema14
* Data: 11/05/2023
*/

/* Faça um programa que preencha com zeros todas as posições de 
um vetor de tamanho 50 */

public class Program14 {
    public static void main(String[] args) {
        
        int[] vetor = new int[50];
        int count = 0;

        for(count = 0; count < vetor.length; count++){
            
            vetor[count] = 0;
            System.out.println(vetor[count] + " ");
        }
        
    }
}
