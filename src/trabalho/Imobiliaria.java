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

    public Pessoa pegarPessoa(int indice) {
        return pessoas.get(indice);
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

    public Imovel pegarImovel(int indice) {
        return imoveis.get(indice);
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

    public Contrato pegarContrato(int indice) {
        return contratos.get(indice);
    }

    public void processarMensalidades() {
        contrato.processarMensalidade();
    }
}
