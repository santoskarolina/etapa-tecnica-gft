package questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        List<Morador> listaDeMoradores = new ArrayList<>();

        int quantidadeQuePossuiCachorro = 0;
        int quantidadeQueNaoPossuiCachorro = 0;
        int quantidadeImpar = 0;

        System.out.println("QUANTOS MORADORES VOCÊ IRÁ ENTREVISTAR?");
        int quantidade = scanner.nextInt();

        for(int i = 1; i<=quantidade;i++){
            System.out.println("-----NOVA PESQUISA-----");
            System.out.println("TELEFONE:");
            String telefone = scanner.next();
            System.out.println("NUMERO DA CASA:");
            Integer numeroDaCasa = scanner.nextInt();
            Morador morador = new Morador(telefone,numeroDaCasa);
            listaDeMoradores.add(morador);

            System.out.println("NO IMOVEL POSSUI CACHORRO?");
            String resposta = scanner.next();

            if(resposta.equals("S")){
                quantidadeQuePossuiCachorro++;
                System.out.println("Não Entregar a Correspondência”");
            }else if(resposta.equals("N")){
                quantidadeQueNaoPossuiCachorro++;
                System.out.println("Entregar a Correspondência");
                if (morador.getNumeroResidencia() %2 != 0){
                    quantidadeImpar ++;
                }
            }
        }

        System.out.println("---------------------------------");
        System.out.println("CORRESPONDÊNCIAS QUE FORAM ENTREGUES EM CASAS COM NUMERO IMPAR: "
        + quantidadeImpar);

        scanner.close();
    }
}
