package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet encargado del procesamiento
 * de alertas comunitarias.
 */

@WebServlet("/AlertaServlet")
public class AlertaServlet extends HttpServlet {

    /*
     * Método POST:
     * recibe información del formulario.
     */
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // Captura de datos enviados desde JSP
        String nombre = request.getParameter("nombre");
        String tipo = request.getParameter("tipo");
        String descripcion = request.getParameter("descripcion");
        String ubicacion = request.getParameter("ubicacion");

        // Envío de datos hacia resultado.jsp
        request.setAttribute("nombre", nombre);
        request.setAttribute("tipo", tipo);
        request.setAttribute("descripcion", descripcion);
        request.setAttribute("ubicacion", ubicacion);

        // Redireccionamiento
        request.getRequestDispatcher("resultado.jsp")
                .forward(request, response);
    }

    /*
     * Método GET:
     * muestra mensaje de prueba.
     */
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().println("Metodo GET funcionando");
    }
}