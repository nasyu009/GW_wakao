package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	// dogetと入力後Ctrl+Spaceキー同時
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		//エンコーディングとMIMEタイプの設定
				resp.setContentType("text/html; charset = UTF-8");

				PrintWriter out = resp.getWriter();

				//HTMLのようなプログラムかける
				out.println("<html>");
				out.println("<<herd><title>サンプルページ</title></herd>>");
				out.println("<body>");
				out.println("<h1>HelloWorld!</h1>");
				out.println("</body>");
				out.println("</html>");
				out.close();
	}


}
