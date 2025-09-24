
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite os números separados por espaço: ");
        String[] numeros = leia.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numStr : numeros) {
            int num = Integer.parseInt(numStr);
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("O maior número é: " + maior);
        leia.close();
        }
    }