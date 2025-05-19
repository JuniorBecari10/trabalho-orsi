package trabalho;

public class ContratoVenda extends Contrato {
    private Pessoa comprador;
    private Corretor corretor;
    private double percentualImobiliaria;
    private double percentualCorretor;

    public ContratoVenda(Pessoa comprador, Corretor corretor, double percentualImobiliaria, double percentualCorretor, Imovel imovel, String dataInicio, double valorPrincipal) {
        super(imovel, dataInicio, valorPrincipal);
        this.comprador = comprador;
        this.corretor = corretor;
        this.percentualImobiliaria = percentualImobiliaria;
        this.percentualCorretor = percentualCorretor;
    }

    public Pessoa getComprador() {
        return comprador;
    }

    public void setComprador(Pessoa comprador) {
        this.comprador = comprador;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public double getPercentualImobiliaria() {
        return percentualImobiliaria;
    }

    public void setPercentualImobiliaria(double percentualImobiliaria) {
        this.percentualImobiliaria = percentualImobiliaria;
    }

    public double getPercentualCorretor() {
        return percentualCorretor;
    }

    public void setPercentualCorretor(double percentualCorretor) {
        this.percentualCorretor = percentualCorretor;
    }
    
    public void processarMensalidade() {
        double comissaoCorretor = corretor.getValorComissaoRecebida();
        double comissaoImobiliaria = percentualImobiliaria;
        double valorLiquido = getValorPrincipal() - comissaoCorretor - comissaoImobiliaria;
    }
}
