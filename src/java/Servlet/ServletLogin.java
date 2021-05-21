package Servlet;

import Logica.Controladora;
import Persistencia.Conexion;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        new Conexion();

        Controladora control = new Controladora();
            


        boolean check = false;

        check = control.comprobarIngreso(request.getParameter("uname"), request.getParameter("psw"));
        if (check == true) {
            HttpSession misesion = request.getSession(true);
            String usuario = request.getParameter("uname");
            String clave = request.getParameter("psw");

            misesion.setAttribute("uname", usuario);
            misesion.setAttribute("control", control);

            response.sendRedirect("Ingreso.jsp");

        } else {
            response.sendRedirect("LoginIncorrecto.jsp");

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
