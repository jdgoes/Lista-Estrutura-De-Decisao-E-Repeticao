/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema9
* Data: 11/05/2023
*/

/* Faça um programa que receba o valor da venda, escolha a 
condição de pagamento no menu e mostre o total da venda final 
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7% */

import java.util.Scanner;

public class Program09{
    public static void main(String[] args) {

        try (Scanner input = new Scanner (System.in)){

            double valorDaVenda, vendaAvista, vendaAprazo30, vendaAprazo60, vendaAprazo90, vendaCartaoDebito, vendaCartaoCredito, opcaoDePagamento;

            System.out.print("Digite o valor da venda realizada: R$ ");
            valorDaVenda = input.nextDouble();
            

            System.out.println("\n1 - Venda à vista\t\t(Desconto de 10%)");
            System.out.println("2 - Venda a prazo 30 dias\t(Desconto de 5%)");
            System.out.println("3 - Venda a prazo 60 dias\t(Sem descontos / Acréscimos)");
            System.out.println("4 - Venda a prazo 90 dias\t(Acréscimo de 5%)");
            System.out.println("5 - Venda com cartão de débito\t(Desconto de 8%)");
            System.out.println("6 - Venda com cartão de crédito\t(Desconto de 7%)");

            System.out.print("\n Por favor, selecione o número correspondente à forma de pagamento desejada: ");
            opcaoDePagamento = input.nextDouble();

            vendaAvista = valorDaVenda - ((valorDaVenda * 10)/100);

            vendaAprazo30 = valorDaVenda - ((valorDaVenda * 5)/100);
            vendaAprazo60 = valorDaVenda;
            vendaAprazo90 = valorDaVenda + ((valorDaVenda * 5)/100);

            vendaCartaoDebito =  valorDaVenda - ((valorDaVenda * 8)/100);
            vendaCartaoCredito = valorDaVenda - ((valorDaVenda * 7)/100);

            if(opcaoDePagamento == 1){
                System.out.printf("O valor à vista será: R$ %.2f %n", vendaAvista);
            }
            else if(opcaoDePagamento == 2){
                System.out.printf("%nO valor para a opção de pagamento \"Venda a Prazo 30 dias\" será: R$ %.2f %n", vendaAprazo30);
            }
            else if(opcaoDePagamento == 3){
                System.out.printf("%nO valor para a opção de pagamento \"Venda a Prazo 60 dias\" será: R$ %.2f %n", vendaAprazo60);
            }
            else if(opcaoDePagamento == 4){
                System.out.printf("%nO valor para a opção de pagamento \"Venda a Prazo 90 dias\" será: R$ %.2f %n", vendaAprazo90);
            }
            else if(opcaoDePagamento == 5){
                System.out.printf("%nO valor para a opção de pagamento \"Cartão de Débito\" será: R$ %.2f %n", vendaCartaoDebito);
            }
            else if(opcaoDePagamento == 6){
                System.out.printf("%nO valor para a opção de pagamento \"Cartão de Crédito\" será: R$ %.2f %n", vendaCartaoCredito);
            }
                else{
                    System.out.println("\nDesculpe, o valor inserido não é válido. Por favor, insira um valor numérico válido.");
                }

        }
    }
}
