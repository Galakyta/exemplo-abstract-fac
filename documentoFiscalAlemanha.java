import java.util.Scanner;
public class documentoFiscalAlemanha implements documentoFiscal {

 Scanner scanner = new Scanner(System.in);

@Override 
public String gerarDocumento(){
     String idDoVendedor = "000000";
        System.out.println("INSIRA O ID DO VENDEDOR:");
        idDoVendedor = scanner.next();
        System.out.println("VAT INVOICE - ID DO VENDEDOR: " + idDoVendedor);
    return "nota fiscal do pedido: destino-ALEMANHA";
}
}
