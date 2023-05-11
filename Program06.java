/* Nome do Aluno: José Diogo Oliveira Góes
* RA: 
* Nome do Programa: Problema6
* Data: 11/05/2023
*/

/* Faça um programa para imprimir o conceito de um aluno. O 
conceito é calculado em função da nota do aluno que varia de 0 
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo*/



import java.util.Scanner;

public class Program06 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("De 0 a 100 qual foi a nota do aluno: ");
            byte notaDoAluno = input.nextByte();

            if(notaDoAluno >= 0 && notaDoAluno <= 49){
                System.out.printf("A nota é %d, considerada: Insuficiente. %n", notaDoAluno);
            }
                else if( notaDoAluno >= 50 && notaDoAluno <= 64){
                    System.out.printf("A nota é %d, considerada: Regular. %n", notaDoAluno);
                } 

                else if ( notaDoAluno >= 65 && notaDoAluno <= 84){
                    System.out.printf("A nota é %d, considerada: Bom. %n", notaDoAluno);
                } 

                else if(notaDoAluno >= 85 && notaDoAluno <= 100){
                    System.out.printf("A nota é %d, considerada: Ótimo. %n", notaDoAluno);
                } 
                    else{
                        System.out.println("Nota inválida, tente novamente.");
                    }
                
        }



    }
}
