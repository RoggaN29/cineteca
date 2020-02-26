package mx.unam.dgtic.negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import mx.unam.dgtic.datos.EntradaDeCine;

@Stateless
public class CinetecaServiceImpl implements CinetecaService {

    //Aqui va la logica de negocio del contenedor web (EJB)
    @Override
    public List<EntradaDeCine> LocateDuplicates(List<EntradaDeCine> arrayEntradas) {
        //Obtiene las butacas duplicadas
        Map<String, String> duplicados = findDuplicates(arrayEntradas);
        List<EntradaDeCine> duplicado = new ArrayList<>();
        
        for (Map.Entry<String, String> entry : duplicados.entrySet()) {
            duplicado.add(new EntradaDeCine(entry.getKey(), entry.getValue()));
        }
        return duplicado;
    }

    public static Map<String, String> findDuplicates(List<EntradaDeCine> entradasDuplicadas) {
        
        Map<String, String> mapaCodigosArchivo = new HashMap<>();
        for (EntradaDeCine d : entradasDuplicadas) {
            int contador = 0;
            //Valida que tanto la sala como el asiento esten duplicados
            for (EntradaDeCine c : entradasDuplicadas) {
                if (d.getSala().equals(c.getSala()) && d.getAsiento().equals(c.getAsiento())) {
                    contador++;
                }
                if (contador > 1) {
                    mapaCodigosArchivo.put(d.getSala(), d.getAsiento());
                }
            }
        }
        return mapaCodigosArchivo;
    }

}
