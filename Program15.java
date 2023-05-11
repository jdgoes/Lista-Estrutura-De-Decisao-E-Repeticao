/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema15
* Data: 11/05/2023
*/

/* Faça um programa que preencha com zeros todas as posições de 
uma matriz com 10 linha e 10 colunas */

public class Program15 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[10][10];
        int count = 0;
        int count2 = 0;

        for(count = 0; count < matriz.length; count++){
                System.out.println();

            for(count2 = 0; count2 < matriz[0].length; count2++){
                
                System.out.printf(matriz[count][count2] + " ");
                
            }

        }
        System.out.println("\n");
    }
}
