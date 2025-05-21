// Antônio Carlos Becari Júnior
// Thiago Obana

package trabalho;

public class ContratoLocacao extends Contrato {
    private Locatario locatario;
    private boolean encerrado;
    private DevedorServico devServ;
    private double multaAtraso;
    private double multaRescisao;
    private boolean atraso;
    private boolean vistoriaAprovada;

    public ContratoLocacao(Locatario locatario, boolean encerrado, DevedorServico devServ, double multaAtraso, double multaRescisao, boolean atraso, boolean vistoriaAprovada, Imovel imovel, String dataInicio, double valorPrincipal) {
        super(imovel, dataInicio, valorPrincipal);

        this.locatario = locatario;
        this.encerrado = encerrado;
        this.devServ = devServ;
        this.multaAtraso = multaAtraso;
        this.multaRescisao = multaRescisao;
        this.atraso = atraso;
        this.vistoriaAprovada = vistoriaAprovada;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public boolean isEncerrado() {
        return encerrado;
    }

    public void setEncerrado(boolean encerrado) {
        this.encerrado = encerrado;
    }

    public DevedorServico getDevServ() {
        return devServ;
    }

    public void setDevServ(DevedorServico devServ) {
        this.devServ = devServ;
    }

    public double getMultaAtraso() {
        return multaAtraso;
    }

    public void setMultaAtraso(double multaAtraso) {
        this.multaAtraso = multaAtraso;
    }

    public double getMultaRescisao() {
        return multaRescisao;
    }

    public void setMultaRescisao(double multaRescisao) {
        this.multaRescisao = multaRescisao;
    }

    public boolean isAtraso() {
        return atraso;
    }

    public void setAtraso(boolean atraso) {
        this.atraso = atraso;
    }

    public boolean isVistoriaAprovada() {
        return vistoriaAprovada;
    }

    public void setVistoriaAprovada(boolean vistoriaAprovada) {
        this.vistoriaAprovada = vistoriaAprovada;
    }
    
    public void registrarAtraso() {
        atraso = true;
        
        Devedor devedor = new Devedor(locatario, getValorPrincipal() + multaAtraso);
        devServ.incluirDevedor(devedor);
    }
            
    public void encerrarComVistoria(boolean vistoriaAprovada) {
        this.vistoriaAprovada = vistoriaAprovada;
        encerrado = true;

        if (vistoriaAprovada)
            System.out.println("Vistoria aprovada. Contrato encerrado.");
        else
            System.out.println("Vistoria reprovada! Inquilino deve realizar os reparos.");
    }
    
    @Override
    public void processarMensalidade() {
        if (encerrado)
            return;

        Imovel imovel = getImovel();
        double valorAluguel = getValorPrincipal() + imovel.getIptu();
        
        double taxaAdministracao = imovel.calcularTaxaAdministracao();
        double valorLiquido = getValorPrincipal() - taxaAdministracao;
        
        System.out.println("Valor do aluguel: " + valorAluguel);
        System.out.println("Taxa de administração: " + taxaAdministracao);
        System.out.println("Valor líquido: " + valorLiquido);
        
        for (ParticipacaoProprietario p: imovel.participacoes) {
            if (p != null) {
                double valorParticipacao = valorLiquido * p.getPercentual();
                System.out.println("Valor de participação (" + p.getProprietario().getNome() + "): " + valorParticipacao);
            }
        }
    }
}
