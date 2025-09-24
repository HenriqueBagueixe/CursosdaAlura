import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número: ");
        var nFinal = leia.nextInt() + 1;
        int inicial = 1;


        for (inicial = 1; inicial < nFinal; inicial++) {
            var verificar = inicial%10;
            if(verificar == 5){
                System.out.print("");
            }else{
                System.out.print(inicial+" ");
            }
        }
        }

    }
