
import tarefa.Questao1.Pessoa;
import tarefa.Questao2.Calculadora;
import tarefa.Questao4.Paridade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String comando = "";
        do {
            System.out.print("Selecione a questão:\n" +
                    "(1) Pessoa;\n" +
                    "(2) Calculadora;\n" +
                    "(3) Paridade;\n" +
                    "(4) Sair\n\n" +
                    "Seleção: ");
            comando = input.nextLine();

            switch (comando) {
                case "1":
                    pessoa(input);
                    break;
                case "2":
                    calculadora(input);
                    break;
                case "3":
                    paridade(input);
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Comando não reconhecido. Digite apenas o número ou \"sair\".");
            }
        } while (!comando.equalsIgnoreCase("4"));
        input.close();
    }

    private static void paridade(Scanner input) {
        System.out.print("Digite o numero: ");
        Integer valor = input.nextInt();
        input.nextLine();

        System.out.printf("O número %d é %s.\n" +
                        "Presisone Enter para continuar.",
                valor, Paridade.ehPar(valor) ? "par" : "impar");
    }

    private static void calculadora(Scanner input) {
        System.out.print("Digite o primeiro valor: ");
        Double valor1 = input.nextDouble();
        input.nextLine();
        System.out.print("Digite o segundo valor: ");
        Double valor2 = input.nextDouble();
        input.nextLine();

        Calculadora calculadora = new Calculadora(valor1, valor2);

        String comando = "";
        do {
            System.out.print("\nSelecione a operação:\n" +
                    "(1) Soma;\n" +
                    "(2) Subtrai;\n" +
                    "(3) Multiplica;\n" +
                    "(4) Divide\n" +
                    "(5) Sair\n\n" +
                    "Seleção: ");
            comando = input.nextLine();

            switch (comando) {
                case "1":
                    System.out.printf("%.2f + %.2f = %.2f", valor1, valor2, calculadora.somar());
                    break;
                case "2":
                    System.out.printf("%.2f - %.2f = %.2f", valor1, valor2, calculadora.subtrair());
                    break;
                case "3":
                    System.out.printf("%.2f * %.2f = %.2f", valor1, valor2, calculadora.multiplicar());
                    break;
                case "4":
                    try {
                        System.out.printf("%.2f / %.2f = %.2f", valor1, valor2, calculadora.dividir());
                    } catch (ArithmeticException e) {
                        System.out.printf("Erro encontrado: %s", e.getMessage());
                    }
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Comando não reconhecido. Digite apenas o número ou \"sair\".");
            }
        } while (!comando.equals("5"));
    }

    private static void pessoa(Scanner input) {
        System.out.print("Digite o nome: ");
        String nome = input.nextLine();
        System.out.print("Digite a idade: ");
        Integer idade = input.nextInt();
        input.nextLine();
        System.out.print("Digite a altura: ");
        Double altura = input.nextDouble();
        input.nextLine();

        Pessoa pessoa = new Pessoa(nome,idade, altura);

        System.out.printf("Objeto criado: %s\n", pessoa);

        System.out.println("Pressione Enter para continuar.");
        input.nextLine();
    }
}
