import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome = "Henrique Pereira Bagueixe";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        boolean epaminondas;
        boolean loop = true;


        String dadosIniciais = String.format("""
                **********************************************************************************************
                Dados iniciais do cliente:
                
                Nome:             %s
                Tipo Conta:       %s
                Saldo Inicial:    %f
                **********************************************************************************************
                
                """, nome, tipoConta, saldoInicial);
        System.out.println(dadosIniciais);
        while (loop) {
            System.out.println("""
                    
                    Operações 
                    1 - Consultar valores
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    
                    Digite a opção desejada: """);
            int opcao = leia.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("O saldo atual é de: " + saldoInicial);
                case 2 -> {
                    System.out.println("Informe o valor que você receberá:" +
                            "");
                    saldoInicial += leia.nextDouble();
                }
                case 3 -> {
                    System.out.println("Informe o valor de transferência:");
                    if (saldoInicial < leia.nextDouble()) {
                        System.out.println("Valor inválido para transferência.");
                        break;

                    } else {
                        saldoInicial -= leia.nextDouble();
                    }
                }
                case 4 -> loop = false;
                default -> System.out.println("Opção Inválida.");
            }
        }
    }
}

