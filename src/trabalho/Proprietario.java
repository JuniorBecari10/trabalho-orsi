package trabalho;

public class Proprietario extends Pessoa {
    Imovel imoveis[] = new Imovel[30];

    public Proprietario(String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
    }

    public void incluiImovel(Imovel imo) {
        for (Imovel i : imoveis) {
            if (i != null && i.getIdImovel() == imo.getIdImovel()) {
                System.out.println("Este imóvel já existe.");
                return;
            }
        }

        for (int i = 0; i < imoveis.length; i++) {
            if (imoveis[i] == null) {
                imoveis[i] = imo;

                System.out.println("Imóvel adicionado.");
                return;
            }
        }
        
        System.out.println("Sem espaço para adicionar imóveis.");
    }

    public void excluirImovel(int id) {
        for (int i = 0; i < imoveis.length; i++) {
            if (imoveis[i] != null && imoveis[i].getIdImovel() == id) {
                imoveis[i] = null;
                
                System.out.println("Imóvel excluído.");
                return;
            }
        }
        
        System.out.println("Não foram encontrados imóveis com este ID.");
    }

    public void listarImoveis() {
        for (Imovel i : imoveis) {
            i.mostraDados();
        }
    }

    public Imovel buscarImovel(int id) {
        for (Imovel i : imoveis) {
            if (i != null && i.getIdImovel() == id) {
                return i;
            }
        }

        return null;
    }

    public void mostraDados() {
        super.mostraDados();

        System.out.println("Imóveis: ");
        listarImoveis();
    }
}
