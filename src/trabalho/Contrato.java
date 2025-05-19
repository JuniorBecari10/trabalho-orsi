package trabalho;

public abstract class Contrato {
    private Imovel imovel;
    private String dataInicio;
    private double valorPrincipal;

    public Contrato(Imovel imovel, String dataInicio, double valorPrincipal) {
        this.imovel = imovel;
        this.dataInicio = dataInicio;
        this.valorPrincipal = valorPrincipal;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getValorPrincipal() {
        return valorPrincipal;
    }

    public void setValorPrincipal(double valorPrincipal) {
        this.valorPrincipal = valorPrincipal;
    }
    
    public void mostraDados() {
        System.out.println("Imovel: " + imovel);
        System.out.println("Data Inicio: " + dataInicio);
        System.out.println("Valor Principal: " + valorPrincipal);
    }
    
    public abstract void processarMensalidade();
}
