package mx.unam.dgtic.negocio;

import java.util.List;
import javax.ejb.Local;
import mx.unam.dgtic.datos.EntradaDeCine;

@Local
public interface CinetecaService {
    public List<EntradaDeCine> LocateDuplicates(List<EntradaDeCine> arrayEntradas);
}
