package tarefa.Questao4;

/*
        Questão #4
        Valor 200
        Enunciado
        Construa um programa que receba um número como entrada e informe ao usuário se o número é impar ou par.
        Para determinar se o número é impar ou par, você deve criar uma classe que represente este cálculo.
*/

import java.util.Scanner;

public class UseParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        Integer number = scan.nextInt();
        scan.nextLine();

        boolean isPar = ParOuImpar.isPar(number);
        if(isPar){
            System.out.printf("%d é Par",number);
        } else {
            System.out.printf("%d é Impar",number);
        }

        System.out.printf("\n%d é %s",number,ParOuImpar.isImparToString(number));

        scan.close();
    }
}
