package trabalho;

public class Corretor extends Pessoa {
    private double valorComissaoRecebida;

    public Corretor(double valorComissaoRecebida, String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
        this.valorComissaoRecebida = valorComissaoRecebida;
    }

    public double getValorComissaoRecebida() {
        return valorComissaoRecebida;
    }

    public void setValorComissaoRecebida(double valorComissaoRecebida) {
        this.valorComissaoRecebida = valorComissaoRecebida;
    }
}
