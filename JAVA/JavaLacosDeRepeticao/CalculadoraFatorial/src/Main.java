import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int numeroOriginal = leia.nextInt();
        int soma = 1;


        for (int i = 1; i <= numeroOriginal ; i++) {
            soma *= i;
        }
        System.out.println(soma);
        }
    }