package trabalho;

public abstract class Imovel{
    private int idImovel;
    private String endereco;
    private double valorBaseLocacao;
    private double valorBaseVenda;
    private double iptu;
    ParticipacaoProprietario proprietario[] = new ParticipacaoProprietario[10];

    public Imovel(int idImovel, String endereco, double valorBaseLocacao, double valorBaseVenda, double iptu) {
        this.idImovel = idImovel;
        this.endereco = endereco;
        this.valorBaseLocacao = valorBaseLocacao;
        this.valorBaseVenda = valorBaseVenda;
        this.iptu = iptu;
    }

    public int getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(int idImovel) {
        this.idImovel = idImovel;
    }
    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorBaseVenda() {
        return valorBaseVenda;
    }

    public void setValorBaseVenda(double valorBaseVenda) {
        this.valorBaseVenda = valorBaseVenda;
    }

    public double getIptu() {
        return iptu;
    }

    public void setIptu(double iptu) {
        this.iptu = iptu;
    }

    public ParticipacaoProprietario[] getProprietario() {
        return proprietario;
    }

    public void setProprietario(ParticipacaoProprietario[] proprietario) {
        this.proprietario = proprietario;
    }

    public double getValorBaseLocacao() {
        return valorBaseLocacao;
    }

    public void setValorBaseLocacao(double valorBaseLocacao) {
        this.valorBaseLocacao = valorBaseLocacao;
    }
    
    
    public void incluiParticipacaoPropretario(Proprietario prop, double percentual) {
        for (int i = 0; i < proprietario.length; i++) {
             if (proprietario[i] == null) {
                 ParticipacaoProprietario  propretario = new ParticipacaoProprietario(prop, percentual);
                 proprietario[i] = propretario;
                 return;
             }
        }
    }
    
    public void excluiParticipacaoProprietario(Proprietario prop) {
        for (int i = 0; i < proprietario.length ; i++) {
             if (proprietario[i] != null && proprietario[i].getProprietario() == prop) {
                 proprietario[i] = null;
                 return;
             }
        }
    }
   
    public void listarParticipacaoProprietario() {
        for (ParticipacaoProprietario p: proprietario)
            p.mostraDados();
    }
    
    public void mostraDados() {
        System.out.println("Id imovel: " + idImovel);
        System.out.println("Endereco: " +  endereco);
        System.out.println("Valor base locacao: " + valorBaseLocacao);
        System.out.println("Valor base venda: " + valorBaseVenda);
        System.out.println("Iptu: " + iptu);

        listarParticipacaoProprietario();
    }
    
    public abstract double calcularTaxaAdministracao();
}
