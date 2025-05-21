// Antônio Carlos Becari Júnior
// Thiago Obana

package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private String nome;
    private List<Pessoa> pessoas = new ArrayList<>();
    private List<Imovel> imoveis = new ArrayList<>();
    private List<Contrato> contratos = new ArrayList<>();

    public Imobiliaria(String nome) {
        this.nome = nome;
    }

    public void incluirPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void excluirPessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    public void mostrarPessoas() {
        for (Pessoa pessoa : pessoas)
            pessoa.mostraDados();
    }

    public Pessoa pegarPessoa(Pessoa pessoa) {
        for (Pessoa p: pessoas) {
            if (p.equals(pessoa))
                return p;
        }
        
        return null;
    }

    public void incluirImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public void excluirImovel(Imovel imovel) {
        imoveis.remove(imovel);
    }

    public void mostrarImoveis() {
        for (Imovel imovel : imoveis)
            imovel.mostraDados();
    }

    public Imovel pegarImovel(Imovel imovel) {
        for (Imovel i: imoveis) {
            if (i.equals(imovel))
                return i;
        }
        
        return null;
    }

    public void incluirContrato(Contrato contrato) {
        contratos.add(contrato);
    }

    public void excluirContrato(Contrato contrato) {
        contratos.remove(contrato);
    }

    public void mostrarContratos() {
        for (Contrato contrato : contratos)
            contrato.mostraDados();
    }

    public Contrato pegarContrato(Contrato contrato) {
        for (Contrato c: contratos) {
            if (c.equals(contrato))
                return c;
        }
        
        return null;
    }

    public void processarMensalidades() {
        for (Contrato contrato: contratos)
            contrato.processarMensalidade();
    }
}
