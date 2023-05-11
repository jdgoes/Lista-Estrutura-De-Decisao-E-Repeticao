/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema17
* Data: 11/05/2023
*/

/* Faça um programa que imprima os múltiplos negativos de 7, 
superiores a -1000. (utilize do / while) */

public class Program17 {
    public static void main(String[] args) {
        
        int numerosNegativos = -7;
        do{
            System.out.println(numerosNegativos);

            numerosNegativos -= 7;
        }while(numerosNegativos > -1000);
    }
}
