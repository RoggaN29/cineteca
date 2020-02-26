package mx.unam.dgtic.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.unam.dgtic.datos.EntradaDeCine;
import mx.unam.dgtic.negocio.CinetecaService;

/**
 *
 * @author mario
 */
public class EntradasDeCineServlet extends HttpServlet {
    
    @Inject
    CinetecaService personaService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Aqui va la logica del ciclo de vida del contenedor web (Servlet que 
        // ocupa el metodo del EJB y lo manda al jsp)
        List<EntradaDeCine> arrayEntradas = new ArrayList<>();
        arrayEntradas.add(new EntradaDeCine("B", "22"));
        arrayEntradas.add(new EntradaDeCine("A", "4"));
        arrayEntradas.add(new EntradaDeCine("C", "26"));
        arrayEntradas.add(new EntradaDeCine("A", "16"));
        arrayEntradas.add(new EntradaDeCine("B", "22"));
        arrayEntradas.add(new EntradaDeCine("C", "5"));
        arrayEntradas.add(new EntradaDeCine("A", "12"));
        arrayEntradas.add(new EntradaDeCine("B", "10"));
        arrayEntradas.add(new EntradaDeCine("C", "26"));
        
        List<EntradaDeCine> entradas = personaService.LocateDuplicates(arrayEntradas);
        //System.out.println("entradas: " + entradas);
        request.setAttribute("entradas", entradas);
        request.getRequestDispatcher("/listadoDuplicados.jsp").forward(request, response);;
    }

}
