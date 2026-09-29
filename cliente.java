public class cliente {
    public static void main(String[] args) {
        cdpGeral gerenciaAlemanha = new cdpAlemanha();
        documentoFiscal documentoAlemanha = gerenciaAlemanha.criarDocumentoFiscal();
        pagamento pagamentoAlemanha = gerenciaAlemanha.criarPagamento();
        etiqueta etiquetaAlemanha = gerenciaAlemanha.criarEtiqueta();

        System.out.println(documentoAlemanha.gerarDocumento());
        System.out.println(pagamentoAlemanha.gerarPagamento());
        System.out.println(etiquetaAlemanha.gerarEtiqueta());
    }
}
