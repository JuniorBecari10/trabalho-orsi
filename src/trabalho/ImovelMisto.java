package trabalho;

public class ImovelMisto extends Imovel {
    public ImovelMisto(int idImovel, String endereco, double valorBaseLocacao, double valorBaseVenda, double iptu) {
        super(idImovel, endereco, valorBaseLocacao, valorBaseVenda, iptu);
    }
   
    public double calcularTaxaAdministracao() {
        return getValorBaseLocacao() * 0.07;
    }
}
