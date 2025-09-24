import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        System.out.println("Digite a quantidade de degraus que você vai subir:");
        int quantidaDeDegraus = leia.nextInt();

        for (int i = 1; i < quantidaDeDegraus + 1 ; i++) {
            System.out.println("Subindo o degrau "+ i );
        }
        System.out.println("Parabéns, você chegou no topo!");
    }
}