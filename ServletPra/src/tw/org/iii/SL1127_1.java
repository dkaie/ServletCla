package tw.org.iii;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SL1127_1
 */
@WebServlet("/SL1127_1")
public class SL1127_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SL1127_1() {
    	System.out.println("建構子 已執行");
        //super();
    }

	@Override
	public void init() throws ServletException {
		System.out.println("init() 已執行");
		//super.init();
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service() 已執行");
		//super.service(request, response);
		
		String key1 = request.getParameter("key1");
		System.out.println("key1 = " + key1);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 已執行");
		//response.getWriter().append("Served at@: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() 已執行");
		//doGet(request, response);
	}

}
