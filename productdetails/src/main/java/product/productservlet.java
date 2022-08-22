package product;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class productServlet
 */
@WebServlet("/productservlet")
public class productservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productno=Integer.parseInt(request.getParameter("txtproductno"));
		String name=request.getParameter("txtname");
		int price=Integer.parseInt(request.getParameter("txtprice"));
		PrintWriter out=response.getWriter();
		/*out.println(productno);
		out.println(name);
		out.println(price);*/
		
		try {
			//Call Connection Method
				Connection con=DBConnection.getMyConnection();
			//Write sql command
				String str="Insert into productdetails (productno,name,price) values(?,?,?)";
				
				PreparedStatement  ps=con.prepareStatement(str);
				ps.setInt(1, productno );
				ps.setString(2, name);
				ps.setInt(3, price);
				int ans =ps.executeUpdate();
				
				if(ans>0)
					out.println("Record inserted");
				else
					out.println("Record not inserted");
				con.close();
			
		
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}

}
	

}