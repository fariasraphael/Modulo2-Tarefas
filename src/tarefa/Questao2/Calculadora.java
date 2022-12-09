package tarefa.Questao2;

/*
Questão #2
Valor 200
Enunciado
Construa um código Java para definir um objeto do tipo “Calculadora” que tem como
características um valor1 e um valor2 e possui os comportamentos de somar,subtrair,multiplicar e dividir.
Cada comportamento deve retornar o valor da operação correspondente.
*/

public class Calculadora {

    private Double valor1;
    private Double valor2;

    public Calculadora(Double valor1, Double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Double somar() {
        return valor1 + valor2;
    }

    public Double subtrair() {
        return valor1 - valor2;
    }

    public Double multiplicar() {
        return valor1 * valor2;
    }

    public Double dividir() throws ArithmeticException {
        if (valor2 == 0) {
            throw new ArithmeticException("Não é permitido dividir por zero.");
        }
        return valor1 / valor2;
    }
}

