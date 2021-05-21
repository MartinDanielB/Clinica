
package Servlet;

import Logica.Controladora;
import Persistencia.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletPaciente", urlPatterns = {"/ServletPaciente"})
public class ServletPaciente extends HttpServlet {

    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String dni = request.getParameter("dni");
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String fecha_nac = request.getParameter("date");
            System.out.println(fecha_nac);
            String direccion = request.getParameter("direccion");
            String telefono = request.getParameter("telefono");
            String tiene_os = request.getParameter("active");
            
            
            
            new Conexion();
            Controladora control = new Controladora();
            control.crearPaciente( false,  null,  dni,  nombre,  apellido,  direccion,  fecha_nac,  telefono);
            
            
            response.sendRedirect("AltaPaciente.jsp");
            
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
