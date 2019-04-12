package by.itacademy.stetsko.servlet;

import by.itacademy.stetsko.service.BookService;
import by.itacademy.stetsko.util.JspPathUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/show-book-details")
public class BookDetailsServlet extends HttpServlet {

    private BookService bookService = BookService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        req.setAttribute("book", bookService.findById(Integer.parseInt(id)));

        getServletContext()
                .getRequestDispatcher(JspPathUtil.get("book-info"))
                .forward(req, resp);
    }
}
