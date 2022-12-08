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
    private Integer valor1;
    private Integer valor2;

    public Calculadora (Integer valor1, Integer valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void somar (Integer valor1, Integer valor2){
        System.out.println(valor1 + valor2);
    }

    public void subtrair (Integer valor1, Integer valor2) {
        System.out.println(valor1 - valor2);
    }

    public void multiplicar (Integer valor1, Integer valor2){
        System.out.println(valor1 * valor2);
    }
    public void dividir (Integer valor1, Integer valor2) {
        System.out.print(valor1/valor2);
    }

    public Integer getValor1 () {
        return valor1;
    }

    public void setValor1 (Integer valor1) {
        this.valor1 = valor1;
    }

    public Integer getValor2 () {
        return valor2;
    }

    public void setValor2 (Integer valor2) {
        this.valor2 = valor2;
    }
}
