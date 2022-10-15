package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.StudentDetails;

@WebServlet("/findStudent")
public class FetchStudent extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	StudentDao dao=new StudentDao();
	List<StudentDetails> details=dao.findStudent();
	req.getSession().setAttribute("list", details);
	resp.sendRedirect("display.jsp");
}
}
