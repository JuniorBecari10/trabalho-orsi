// Antônio Carlos Becari Júnior
// Thiago Obana

package trabalho;

public class ImovelIndustrial extends Imovel {
    public ImovelIndustrial(int idImovel, String endereco, double valorBaseLocacao, double valorBaseVenda, double iptu) {
        super(idImovel, endereco, valorBaseLocacao, valorBaseVenda, iptu);
    }
    
    public double calcularTaxaAdministracao() {
        return getValorBaseLocacao() * 0.08;
    }
}
