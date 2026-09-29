import java.util.Scanner;
public class pagamentoAlemanha implements pagamento {
 Scanner scanner = new Scanner(System.in);
 protected double valorDoFrete;
 
@Override 
    public String gerarPagamento(){
         int opcao = 0;
        System.out.println("insira o valor do frete (use virgula): ");
        valorDoFrete = scanner.nextDouble();
        System.out.println("o produto é considerado essencial? sim(1) não (2) digite o numero da opcao: ");
        opcao = scanner.nextInt();
        if(opcao == 1){
            valorDoFrete = valorDoFrete * 1.07;
        }
        if(opcao == 2){
            valorDoFrete = valorDoFrete * 1.19;
        }

    return "valor a ser pago, sepa direct debit: " + valorDoFrete;
}
   
}
