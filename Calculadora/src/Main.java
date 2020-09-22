import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        float n1 = ler.nextFloat();
        System.out.println("Informe o segundo número: ");
        float n2 = ler.nextFloat();
        Ops calcula = new Ops();
        float mostrar = calcula.soma(n1, n2);
        System.out.println("A soma deu: " + mostrar);
        mostrar = calcula.subtrai(n1, n2);
        System.out.println("A subtração deu: " + mostrar);
        mostrar = calcula.divide(n1, n2);
        System.out.println("A divisão deu: " + mostrar);
        mostrar = calcula.multiplica(n1, n2);
        System.out.println("A multiplicação deu :" + mostrar);
    }
}
