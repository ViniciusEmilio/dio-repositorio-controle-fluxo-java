package IF_Else_Java;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 2500;

        System.out.println("Digite o valor do Saque que você deseja realizar: ");
        double saque = scanner.nextDouble();

        if (saldo >= saque) {
            saldo = saldo - saque;
            System.out.println("O valor que você deseja Sacar é R$" + saque + " O valor restante da sua conta é de R$" + saldo);
        }
        else {
            System.out.println("O seu saldo é de R$" + saldo + " Não será possível concluir esta operação.");
            System.out.println("Fim");
        }
    }
}
