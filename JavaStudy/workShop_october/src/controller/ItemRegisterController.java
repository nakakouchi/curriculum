package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ShohinBean;
import service.ItemRegisterService;

/**
 * Servlet implementation class ItemRegisterController
 */
@WebServlet("/ItemRegisterController")
public class ItemRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	HttpServletRequest request;
	HttpServletResponse response;


	ShohinBean bean;

    public ItemRegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException,ServletException {
		try {

			String itemName = request.getParameter("itemName");
			int price = Integer.parseInt("price");
			String img =  request.getParameter("img");
			String kategori = request.getParameter("kategori");

			ItemRegisterService itemRegister = new ItemRegisterService();
			itemRegister.insert(itemName, price, img, kategori);

		} catch (Exception e) {
			e.printStackTrace();
	    } finally {
	        ServletContext context = this.getServletContext();
	        RequestDispatcher dispatcher = context.getRequestDispatcher("/login.jsp");
	        try {
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	}
