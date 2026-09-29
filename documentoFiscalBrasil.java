import java.util.Scanner;
public class documentoFiscalBrasil implements documentoFiscal {

 Scanner scanner = new Scanner(System.in);

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
}
