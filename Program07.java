/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema7
* Data: 11/05/2023
*/

/* Faça um programa calcula o total de uma hospedagem em um 
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15 */

import java.util.Scanner;

public class Program07 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner (System.in)) {

            double numeroDeDiarias, taxaAserPaga, valorDiaria = 60, precoTotal;

            System.out.printf("Digite o número de diárias desejáveis: ");
            numeroDeDiarias = input.nextDouble();

            if( numeroDeDiarias > 15){
                taxaAserPaga = 5.50;
            }
            else if(numeroDeDiarias == 15){
                taxaAserPaga = 6.00;
            }
             else{
                taxaAserPaga = 8.00;
             }
            
            precoTotal = (valorDiaria + taxaAserPaga) * numeroDeDiarias;
            
            System.out.printf("O número de diárias é %.0f, e o valor a ser pago será: R$ %.2f %n", numeroDeDiarias, precoTotal);
        }

    }
}
