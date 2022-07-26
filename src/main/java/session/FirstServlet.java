package session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Vladislav Domaniewski
 */

public class FirstServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        Integer count = (Integer) session.getAttribute("count");

//        String name = req.getParameter("name");
//        int quantity = Integer.parseInt(req.getParameter("quantity"));

        if(count == null) {
            session.setAttribute("count", 1);
            count = 1;
        } else {
            session.setAttribute("count", count + 1);
        }
//        session.setAttribute("cart", cart);

        PrintWriter pw = resp.getWriter();

        pw.println("<html>");
        pw.println("<h1> Your count is: " + count + " </h1>");
        pw.println("</html>");
    }
}
