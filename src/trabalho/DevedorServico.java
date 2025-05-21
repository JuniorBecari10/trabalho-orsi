package trabalho;

import java.util.ArrayList;
import java.util.List;

public class DevedorServico {
    private List<Devedor> devedores = new ArrayList<>();
    
    public void incluirDevedor(Devedor devedor) {
        devedores.add(devedor);
    }
    
    public void excluirDevedor(Devedor devedor) {
        devedores.remove(devedor);
    }
    
    public void mostrarDevedores() {
        for (Devedor devedor: devedores)
            devedor.mostraDados();
    }
    
    public Devedor pegarDevedor(Devedor devedor) {
        for (Devedor d: devedores) {
            if (d.equals(devedor))
                return d;
        }
        
        return null;
    }
}
