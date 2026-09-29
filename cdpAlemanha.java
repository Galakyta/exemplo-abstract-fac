public class cdpAlemanha implements cdpGeral{
    @Override 
    public documentoFiscal criarDocumentoFiscal(){
        documentoFiscal documentoCriado = new documentoFiscalAlemanha();
        return documentoCriado;
    }
    @Override 
    public pagamento criarPagamento(){
        pagamento pagamentoGerado = new pagamentoAlemanha();
        return pagamentoGerado;
    }
    @Override 
    public etiqueta criarEtiqueta(){
        etiqueta etiquetaGerada = new etiquetaAlemanha();
        return etiquetaGerada;
    }
}
