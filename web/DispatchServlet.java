package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DispatchServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//HttpsessionでsetAttribute使う事を宣言している
		HttpSession session = request.getSession(true);

		//requestとsessionに値をセット
		request.setAttribute("age",21);
		session.setAttribute("name","たかお");

		//指定したtest.jspに飛ぶ
		RequestDispatcher rd = request.getRequestDispatcher("/test.jsp");
		rd.forward(request, response);


	}

}
