package GenericInterface;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TempServlet implements Servlet {

	private Object config;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
		ServletConfig  config=null;
		config=null;
		System.out.println("Destroy Called");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		ServletConfig config = null;
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		ServletConfig config = null;
		// TODO Auto-generated method stub
		return config.getServletName();
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
		System.out.println("Init Called");
		this.config=config;
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Service Called");
		PrintWriter  out= res.getWriter();
		out.println("This is My Servlet");
		
	}

}
