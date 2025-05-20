package trabalho;

public class Proprietario extends Pessoa{
    Imovel imoveis[] = new Imovel[30];

    public Proprietario(String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
    }   

    public void incluiImovel(Imovel imo) {
        // Verifica se há no vetor outro imóvel com o mesmo idImovel.
        for (Imovel i: imoveis) {
            if (i != null && i.getIdImovel() == imo.getIdImovel())
                return;
        }

        // Não há. Podemos adicionar na primeira posição livre.
        for (int i = 0; i < imoveis.length; i++) {
            if (imoveis[i] == null) {
               imoveis[i] = imo;
               return;
            }
        }
    }
    
    public void excluirImovel(int id) {
        for (int i = 0; i < imoveis.length; i++) {
            if (imoveis[i] != null && imoveis[i].getIdImovel() == id) {
                imoveis[i] = null;
                return;
            }
        }
    }

    public void listarImoveis() {
        for (Imovel i: imoveis)
            i.mostraDados();
    }

    public Imovel buscarImovel(int id) {
        for (Imovel i: imoveis) {
            if (i != null && i.getIdImovel() == id)
                return i;
        }

        return null;
    }

    public void mostraDados() {
        super.mostraDados();

        System.out.println("Imoveis: ");
        listarImoveis();
    }
}
