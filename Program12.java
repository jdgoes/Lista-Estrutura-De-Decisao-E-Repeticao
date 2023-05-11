/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema12
* Data: 11/05/2023
*/

/* Faça um programa que exiba todos os números pares a 
partir de 0 até que encontre um múltiplo de 7 (utilize 
do/while) */

public class Program12 {
    public static void main(String[] args) {
        
        int numerosPares = 0;

        do{
            if(numerosPares % 2 == 0){
                System.out.println(numerosPares);
            }

            numerosPares += 2;

        } while(numerosPares % 7 != 0);

        System.out.printf("O Múltiplo é: %d%n ", numerosPares);
    }
}
