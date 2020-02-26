package mx.unam.dgtic.negocio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.ejb.Stateless;
import mx.unam.dgtic.datos.EntradaDeCine;

@Stateless
public class CinetecaServiceImpl implements CinetecaService {

    //Aqui va la logica de negocio del contenedor web (EJB)
    @Override
    public List<EntradaDeCine> LocateDuplicates(List<EntradaDeCine> arrayEntradas) {
        List<EntradaDeCine> entradasDuplicadas = new ArrayList<>();
     
        entradasDuplicadas.add(new EntradaDeCine("B", "22"));
        entradasDuplicadas.add(new EntradaDeCine("C", "26"));

        //Obtiene las butacas duplicadas
        System.out.println("array" + arrayEntradas);

        return arrayEntradas;
    }

}
