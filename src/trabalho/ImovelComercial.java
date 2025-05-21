// Antônio Carlos Becari Júnior
// Thiago Obana

package trabalho;

public class ImovelComercial extends Imovel {
    public ImovelComercial(int idImovel, String endereco, double valorBaseLocacao, double valorBaseVenda, double iptu) {
        super(idImovel, endereco, valorBaseLocacao, valorBaseVenda, iptu);
    }
    
    public double calcularTaxaAdministracao() {
        return getValorBaseLocacao() * 0.06;
    }
}
