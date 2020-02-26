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
    public List<EntradaDeCine> LocateDuplicates() {

        List<EntradaDeCine> entradas = new ArrayList<>();
        List<EntradaDeCine> entradasDuplicadas = new ArrayList<>();
        entradas.add(new EntradaDeCine("B", "22"));
        entradas.add(new EntradaDeCine("A", "4"));
        entradas.add(new EntradaDeCine("C", "26"));
        entradas.add(new EntradaDeCine("A", "16"));
        entradas.add(new EntradaDeCine("B", "22"));
        entradas.add(new EntradaDeCine("C", "5"));
        entradas.add(new EntradaDeCine("A", "12"));
        entradas.add(new EntradaDeCine("B", "10"));
        entradas.add(new EntradaDeCine("C", "26"));

        entradasDuplicadas.add(new EntradaDeCine("B", "22"));
        entradasDuplicadas.add(new EntradaDeCine("C", "26"));

        //Obtiene las butacas duplicadas
        for (EntradaDeCine entrada : entradas) { 		      
           System.out.println(entrada); 		
      }

        return entradasDuplicadas;
    }

}
