public class cdpBrasil implements cdpGeral {
    
    @Override 
    public documentoFiscal criarDocumentoFiscal(){
        documentoFiscal documentoCriado = new documentoFiscalBrasil();
        return documentoCriado;
    }
    @Override 
    public pagamento criarPagamento(){
        pagamento pagamentoCriado = new pagamentoBrasil();
        return pagamentoCriado;
    }
    @Override 
    public etiqueta criarEtiqueta(){
        etiqueta etiquetaCriada = new etiquetaBrasil();
        return etiquetaCriada;
    }
}
