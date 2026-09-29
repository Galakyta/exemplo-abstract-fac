import java.util.Scanner;

public class etiquetaBrasil implements etiqueta {
    protected String cep;

    Scanner scanner = new Scanner(System.in);

    @Override 
public String gerarEtiqueta(){
        System.out.println("isnira o cep do local de entrega: ");
        cep = scanner.next();
        return "destinatario: " + cep;
}
}
