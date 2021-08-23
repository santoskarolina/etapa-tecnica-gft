package questao02;

import java.util.Locale;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Manu de opções:");
        System.out.println("1 - Idade");
        System.out.println("2 - IMC");
        System.out.println("3 - Sair");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("informe o ano de nascimento: ");
                int anoDeNascimento = scanner.nextInt();
                System.out.println("informe o ano atual: ");
                int anoAtual = scanner.nextInt();

                int idade = anoAtual - anoDeNascimento;
                System.out.println("SUA IDADE É " + idade);
                break;
            case 2:
                System.out.println("INFORME SUA ALTURA: ");
                double altura = scanner.nextDouble();
                System.out.println("INFORME SEU PESO: ");
                double peso = scanner.nextDouble();

                double imc = peso / (altura*altura);
                System.out.println("SEU IMC É: " + String.format("%.2f", imc));
                break;
            case 3:
                System.out.println("SAINDO...");
                break;
            default:
                System.out.println("OPÇÃO INVALIDA");
                break;
        }
        scanner.close();
    }
}
