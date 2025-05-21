// Antônio Carlos Becari Júnior
// Thiago Obana

package trabalho;

public abstract class Imovel {
    private int idImovel;
    private String endereco;
    private double valorBaseLocacao;
    private double valorBaseVenda;
    private double iptu;
    ParticipacaoProprietario[] participacoes = new ParticipacaoProprietario[10];

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
        return participacoes;
    }

    public void setProprietario(ParticipacaoProprietario[] proprietario) {
        this.participacoes = proprietario;
    }

    public double getValorBaseLocacao() {
        return valorBaseLocacao;
    }

    public void setValorBaseLocacao(double valorBaseLocacao) {
        this.valorBaseLocacao = valorBaseLocacao;
    }
    
    
    public void incluiParticipacaoPropretario(Proprietario prop, double percentual) {
        for (int i = 0; i < participacoes.length; i++) {
            if (participacoes[i] == null) {
               ParticipacaoProprietario part = new ParticipacaoProprietario(prop, percentual);
               participacoes[i] = part;
                
               System.out.println("Participação de proprietário adicionada.");
               return;
            }
        }
        
        System.out.println("Sem espaço livre para adicionar participação de proprietário.");
    }
    
    public void excluiParticipacaoProprietario(Proprietario prop) {
        for (int i = 0; i < participacoes.length; i++) {
             if (participacoes[i] != null && participacoes[i].getProprietario() == prop) {
                 participacoes[i] = null;
                 
                 System.out.println("Participação de proprietário excluída.");
                 return;
             }
        }
        
        System.out.println("Participação de proprietário não encontrada.");
    }
   
    public void listarParticipacaoProprietario() {
        for (ParticipacaoProprietario p: participacoes)
            p.mostraDados();
    }
    
    public void mostraDados() {
        System.out.println("ID do imóvel: " + idImovel);
        System.out.println("Endereço: " +  endereco);
        System.out.println("Valor base de locação: " + valorBaseLocacao);
        System.out.println("Valor base de venda: " + valorBaseVenda);
        System.out.println("IPTU: " + iptu);
        
        System.out.println("Participações dos proprietários:");
        listarParticipacaoProprietario();
    }
    
    public abstract double calcularTaxaAdministracao();
}
