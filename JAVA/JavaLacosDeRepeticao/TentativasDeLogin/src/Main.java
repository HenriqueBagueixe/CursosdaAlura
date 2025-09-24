import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        var senha = 1234;
        var resposta = 0;
        int contador = 0;
        var limiteDeTentativas = 2;

        while (contador < 3) {
            System.out.print("Digite sua senha:");
            resposta = leia.nextInt();

            if(contador == 2){
                System.out.println("Conta bloqueada temporariamente.");
            }else if(resposta != senha) {
                System.out.println("Senha incorreta. Você tem mais " + limiteDeTentativas + " tentativas restantes");
                contador++;
                limiteDeTentativas--;
            } else{
                System.out.println("Senha correta. Acesso concedido.");
                contador = 3;
        }
        }
    }
}


