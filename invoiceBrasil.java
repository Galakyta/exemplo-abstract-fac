import java.util.Scanner;
public class invoiceBrasil implements etiqueta, pagamento, documentoFiscal {

protected double valorDoFrete;
protected String cep;

Scanner scanner = new Scanner(System.in);

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

@Override 
public String gerarDocumento(){
     int opcao = 0;
        System.out.println("Pedido interestadual(1) ou dentro do estado?(2) digite o numero da opcao: ");
        opcao = scanner.nextInt();
        if(opcao == 1){
            System.out.println(" CFOP 5.102");
        }
        if(opcao == 2){
            System.out.println(" CFOP 6.102");
        }
    return "nota fiscal do pedido: destino-BRASIL";
}

@Override 
public String gerarEtiqueta(){
        System.out.println("isnira o cep do local de entrega: ");
        cep = scanner.next();
        return "destinatario: " + cep;
    
}
}
