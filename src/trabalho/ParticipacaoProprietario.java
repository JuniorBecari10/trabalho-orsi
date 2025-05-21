// Antônio Carlos Becari Júnior
// Thiago Obana

package trabalho;

class ParticipacaoProprietario {
    private Proprietario proprietario;
    private double percentual;
      
    public ParticipacaoProprietario(Proprietario proprietario, double percentual) {
        this.proprietario = proprietario;
        this.percentual = percentual;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void set(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    
    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }    
    
    public void mostraDados() {
        System.out.println("Propretário:");
        proprietario.mostraDados();
        
        System.out.println("Percentual: " + percentual);
    }
}
