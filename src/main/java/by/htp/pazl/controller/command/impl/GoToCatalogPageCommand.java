package by.htp.pazl.controller.command.impl;

import by.htp.pazl.controller.command.Command;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoToCatalogPageCommand implements Command {
   private static final String CATALOG_PAGE_URI = "WEB-INF/jsp/catalog.jsp";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        RequestDispatcher dispatcher = req.getRequestDispatcher(CATALOG_PAGE_URI);
        dispatcher.forward(req, resp);
    }
}
