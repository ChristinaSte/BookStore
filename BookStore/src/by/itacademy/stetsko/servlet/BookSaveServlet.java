package by.itacademy.stetsko.servlet;

import by.itacademy.stetsko.dto.CreateNewBookDto;
import by.itacademy.stetsko.service.BookService;
import by.itacademy.stetsko.service.UserService;
import by.itacademy.stetsko.util.JspPathUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BookSaveServlet extends HttpServlet {
    private BookService bookService = BookService.getInstance();
    private UserService abilityService = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("users", userService.findAll());

        getServletContext()
                .getRequestDispatcher(JspPathUtil.get("save-user"))
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        CreateNewBookDto createNewBookDto = CreateNewBookDto.builder( )
                .title(req.getParameter("title"))
                .author(req.getParameter("author"))
                .genre_name(req.getParameter("genre name"))
                .description(req.getParameter("description"))
                .pages(Integer.parseInt(req.getParameter("pages")))
                .publication_date(Integer.parseInt(req.getParameter("publication date")))
                .price(Double.parseDouble(req.getParameter("price")))
                .build( );
        ViewHeroBasicInfoDto savedHero = bookService.save(createNewBookDto);
        resp.sendRedirect("/show-book-details?id=" + savedBook.getId( ));

    }
