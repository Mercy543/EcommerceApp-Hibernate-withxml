package com.simplilearn.ecomappservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.simplilearn.hibernate.util.HibernateUtil;
import com.simplilearn.model.EProduct;

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/product-detail")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetails() {
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//print writer
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//Open a connection
		try {
			SessionFactory sFactory = HibernateUtil.buildSessionFactory();
			Session session = sFactory.openSession();
			
			session.beginTransaction();
			
			List<EProduct> products = session.createQuery("from EProduct").list();
			
			//
			out.println("<h1>Product details :</h1>");
			
			for(EProduct p:products) {
				out.println("<br><p>Id :-> " +p.getpId() +" , Name :-> "+p.getName() + ", Price :-> "+p.getPrice() +" , creation_date :-> " +p.getCreationDate() +"</p><br/>");
			}
		session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
