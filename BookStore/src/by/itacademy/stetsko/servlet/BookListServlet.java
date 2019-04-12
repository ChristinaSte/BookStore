package by.itacademy.stetsko.servlet;

import by.itacademy.stetsko.entity.Book;
import by.itacademy.stetsko.service.BookService;
import by.itacademy.stetsko.util.JspPathUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/books")
public class BookListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = BookService.getInstance().findAll();
        req.setAttribute("books", books);
        getServletContext()
                .getRequestDispatcher(JspPathUtil.get("books"))
                .forward(req, resp);
    }
}