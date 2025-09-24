import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        var verdade = 0;

        while (verdade != 1) {
            System.out.print("Digite o nome de usuário: ");
            String nome = leia.nextLine();
            if (nome.length() < 3) {
                System.out.println("Nome inválido. Digite novamente.");

            } else {
                System.out.println("Nome " + nome + " cadastrado com sucesso");
                verdade = 1;
            }
        }
    }
}