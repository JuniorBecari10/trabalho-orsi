package trabalho;

public class ContratoVenda extends Contrato {
    private Pessoa comprador;
    private Corretor corretor;
    private double percentualImobiliaria;
    private double percentualCorretor;

    public ContratoVenda(Imovel imovel, String dataInicio, double valorPrincipal, Pessoa comprador, Corretor corretor, double percentualImobiliaria, double percentualCorretor) {
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
        double comissaoCorretor = percentualCorretor;
        double comissaoImobiliaria = percentualImobiliaria;
        double valorLiquido = getValorPrincipal() - comissaoCorretor - comissaoImobiliaria;
        
        corretor.setValorComissaoRecebida(valorLiquido);

        Imovel imovel = getImovel();
        
        for (ParticipacaoProprietario p: imovel.participacoes) {
            if (p != null) {
                double valorParticipacao = valorLiquido * p.getPercentual();
                System.out.println("Valor de participação (" + p.getProprietario().getNome() + "): " + valorParticipacao);
            }
        }
    }
}
