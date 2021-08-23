package questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Colaborador> listaDeColaboares = new ArrayList<>();

        System.out.println("QUANTIDADE DE COLABORADOR? ");
        int quantidade = scanner.nextInt();

        for(int i = 1; i<=quantidade; i++){
            System.out.println("INFORME SEU NOME:");
            String nome = scanner.next();
            Colaborador colaborador = new Colaborador(nome, null,null, null);

            System.out.println("VOCÊ ESTUDOU? (S/N)");
            String respostaEscola = scanner.next();
            System.out.println("NÚMERO DE MATRICULA:");
            String numeroDeMatricula = scanner.next();
            if(respostaEscola.equals("N")){
                colaborador.setMatricula(numeroDeMatricula);
                System.out.println("PROXIMA PERGUNTA");
            }else{
                colaborador.setMatricula(numeroDeMatricula);
                System.out.println("PROXIMA PERGUNTA");
            }

            System.out.println("VOCÊ CONCLUIU O ENSINO BASICO? (S/N)");
            String reopstaEnsinoBasico = scanner.next();
            if(reopstaEnsinoBasico.equals("S")){
                System.out.println("NOME DA ESCOLA:");
                String nomeDaEscola = scanner.next();
                colaborador.setEscola(nomeDaEscola);
                System.out.println("PROXIMA PERGUNTA");
            }else{
                colaborador.setEscola("SEM ESCOLA");
                System.out.println("PROXIMA PERGUNTA");
            }

            System.out.println("VOCÊ CONCLUIU O ENSINO SUPERIOR? (S/N)");
            String respotaEnsinoSuperior = scanner.next();
            if(respotaEnsinoSuperior.equals("S")){
                System.out.println("NOME DA FACULDADE:");
                String nomeDaFaculdade = scanner.next();
                colaborador.setUniversidade(nomeDaFaculdade);
                System.out.println("FIM DAS PERGUNTAS");
            }else{
                colaborador.setUniversidade("SEM FACULDADE");
                System.out.println("FIM DAS PERGUNTAS");
            }
            listaDeColaboares.add(colaborador);
            System.out.println();

        }

        for(Colaborador x :listaDeColaboares){
            System.out.println(x);
        }
        scanner.close();
    }
}
