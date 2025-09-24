import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        var numPositivo = 0;
        var numNegativo = 0;

        while(true){
            System.out.print("Digite um número ou fim para encerrar: ");
            var insercao = leia.nextLine();

            if(insercao.equals("fim")){
                break;
            }

            int numero = Integer.parseInt(insercao);
            if(numero < 0){
                numNegativo++;
            }else{
                numPositivo++;
            }
        }

        System.out.println("Numeros positivos: " + numPositivo);
        System.out.println("Numeros negativos: " + numNegativo);
    }
}