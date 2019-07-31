package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimesTable extends HttpServlet{
	
	private static final Logger Logger = LoggerFactory.getLogger(TimesTable.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String method = req.getMethod();
		
		Logger.debug("debug TimesTable doGet() {} {} ", method,method+"test");
		Logger.trace("trace TimesTable doGet()");
		Logger.info("info TimesTable doGet()");
		Logger.warn("warn TimesTable doGet()");
		Logger.error("error TimesTable doGet()");
		
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = resp.getWriter();
		pw.write("<html>");
		pw.write("	<head>");
		pw.write("		<title>구구단</title>");
		pw.write("	</head>");
		pw.write("	<body>");
		pw.write("		<table border='1'>");
		for(int i = 1; i < 10; i++) {
			pw.write("			<tr>");
			for(int j = 2; j < 10; j++) {
				int gugudan = i*j;
				pw.write("<td> " + j + " * " + i + " = " + gugudan + " </td>");
			}
			pw.write("			</tr>");
		}
		pw.write("		</table>");
		pw.write("	</body>");
		pw.write("</html>");
	}
}
