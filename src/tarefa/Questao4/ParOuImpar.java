package tarefa.Questao4;

public class ParOuImpar {
    public static boolean isPar(Integer number){
        return (number % 2 == 0) ? true : false;
    }
    public static boolean isImpar(Integer number){
        return (number % 2 != 0) ? true : false;
    }
    public static String isParToString(Integer number){
        return (number % 2 == 0) ? "Par" : "Impar";
    }
    public static String isImparToString(Integer number){
        return (number % 2 != 0) ? "Impar" : "Par";
    }
}
