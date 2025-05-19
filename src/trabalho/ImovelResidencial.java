package trabalho;

public class ImovelResidencial extends Imovel {
    public ImovelResidencial(int idImovel, String endereco, double valorBaseLocacao, double valorBaseVenda, double iptu) {
        super(idImovel, endereco, valorBaseLocacao, valorBaseVenda, iptu);
    }
    
    public double calcularTaxaAdministracao() {
        return getValorBaseLocacao() * 0.05;
    }
}
