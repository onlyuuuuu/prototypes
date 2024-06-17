/*
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR(S) DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR(S) BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER
 * RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT,
 * NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE
 * USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package com.onlyu.app.servlets;

/**
 * ExplainingHttpServlet Web Application
 *
 * @author Ken Fogel (omniprof@gmail.com)
 *
 * Twitter: omniprof - Blog: www.omnijava.com
 *
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Servlet implementation class ExplainingHttpServlet
 *
 * The WebServlet annotation defines this class as a servlet. The description
 * attribute is informative and this will only appear in the app server's
 * console. The default name of the servlet is the name of the class but with
 * the first letter made lowercase. In this class it would be
 * 'explainingHttpServlet'. You can change this, as I have, in the attribute
 * urlPatterns. You can have more than one name for a servlet. This is used when
 * the name used to access the servlet can act as a selector to determine what
 * is expected of the servlet as it can discover what name was used to call it.
 *
 */
@WebServlet(urlPatterns = "/app")
public class AppServlet extends HttpServlet {

	// All methods log their name just to show the order of calling
    private static final Logger log = LoggerFactory.getLogger(AppServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        log.info(">>> doGet <<<");

    }
}
