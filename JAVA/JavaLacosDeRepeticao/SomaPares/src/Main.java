//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

int soma = 0;

        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                soma += i;
            }
        }
        System.out.println("O valor dos números pares é " + soma);
    }
}