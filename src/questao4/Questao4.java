package questao4;

public class Questao4 {

    public static void main(String[] args){

        double desconto = 0.00;
        double valorFinal = 0.0;
        double valorDaCompra = 200.00;
        int descontoValor = 0;

        System.out.println("Valor da Compra" + " - " + "Porcentagem de desconto" + " - " + "Valor Final");
        for(int i = 1; i<=20;i++){
            valorDaCompra += 100.00;
            desconto += 0.01;
            valorFinal = valorDaCompra - (valorDaCompra * desconto);
            descontoValor += 1;
            System.out.println("R$ " + String.format("%.2f", valorDaCompra) + " - " + descontoValor + "% - R$ " + String.format("%.2f", valorFinal));
        }
    }

}
