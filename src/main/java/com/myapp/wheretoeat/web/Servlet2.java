package com.myapp.wheretoeat.web;

import org.slf4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.slf4j.LoggerFactory.getLogger;

/*
    This file is for testing web page only
*/

public class Servlet2 extends HttpServlet {
    private static final Logger log = getLogger(Servlet2.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.debug("redirect to users");

//        response.sendRedirect("users.jsp");
    }
}
