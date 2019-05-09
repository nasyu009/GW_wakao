package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TriServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 送信されてくるパラメーターにエンコーディングの指定
		req.setCharacterEncoding("UTF-8");

		//送信したパラメータの取得
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String[] language = req.getParameterValues("language");
		String other = req.getParameter("other");

		resp.setContentType("text/html; charset = UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		//名前
		out.println("<h1>お名前</h1>");
		out.println("<p>"+name+"</p>");
		//年齢
		out.println("<h1>年齢</h1>");
		out.println("<p>"+age+"</p>");
		//性別
		out.println("<h1>性別</h1>");
		out.println("<p>"+gender+"</p>");
		//興味ある言語
		out.println("<h1>興味ある言語</h1>");
		for(String lang : language) {
		out.println("<p>"+lang+"</p>");
		}

		out.println("<h1>一言</h1>");
		out.println("<p>"+other+"</p>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
		out.close();

	}

}
