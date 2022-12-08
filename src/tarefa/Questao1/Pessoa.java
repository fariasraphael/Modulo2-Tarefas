package tarefa.Questao1;

/*Questão #1
Valor 100
Enunciado
//Construa um código Java para definir um objeto do tipo pessoa que possui as seguintes características (nome,idade,altura).*/

public class Pessoa {
    private String nome;
    private String idade;
    private String altura;

    public Pessoa (String nome, String idade, String altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String idade () {
        return idade;
    }

    public void setIdade () {
        this.idade = idade;
    }

    public String getAltura () {
        return altura;
    }

    public void setAltura () {
        this.altura = altura;
    }
}
