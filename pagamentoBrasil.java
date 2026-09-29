import java.util.Scanner;
public class pagamentoBrasil implements pagamento {
 Scanner scanner = new Scanner(System.in);
 protected double valorDoFrete;
 
@Override 
    public String gerarPagamento(){
         int opcao = 0;
        System.out.println("insira o valor do frete (use virgula): ");
        valorDoFrete = scanner.nextDouble();
        System.out.println("Pedido nacional(1) ou internacional?(2) digite o numero da opcao: ");
        opcao = scanner.nextInt();
        if(opcao == 1){
            valorDoFrete = valorDoFrete * 1.12;
        }
        if(opcao == 2){
            valorDoFrete = valorDoFrete * 1.18;
        }

    return "valor a ser pago: " + valorDoFrete + "ou pagando com pix: " + (valorDoFrete * 0.95);
}
   
}
