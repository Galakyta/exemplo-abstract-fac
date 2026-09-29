import java.util.Scanner;

public class etiquetaAlemanha implements etiqueta {
    protected String plz;

    Scanner scanner = new Scanner(System.in);

    @Override 
public String gerarEtiqueta(){
    System.out.println("Deutsche Post - ");
        System.out.println("isnira o plz do local de entrega: ");
        plz = scanner.next();
        return "destinatario: " + plz;
}
}
