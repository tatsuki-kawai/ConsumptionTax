package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CalcConsumptionTax;
import model.Value;

/**
 * Servlet implementation class ConsumptionTax
 */
@WebServlet("/ConsumptionTax")
public class ConsumptionTax extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConsumptionTax() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		//リクエストパラメータの文字コードの指定
		request.setCharacterEncoding("UTF-8");

		//リクエストパラメータの取得
		String valueString = request.getParameter("value");

		double valueDouble = Double.parseDouble(valueString);
		Value value = new Value();
		value.setValue(valueDouble);

		CalcConsumptionTax calcConsumptionTax = new CalcConsumptionTax();
		calcConsumptionTax.execute(value);

		//リクエストスコープに保存する
		request.setAttribute("Value", value);

		//フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
		dispatcher.forward(request, response);
	}

}
