package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.StudentDetails;

@WebServlet("/findbyId")
public class StudentByID extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id = Integer.parseInt(req.getParameter("id"));
	
	StudentDao dao=new StudentDao();
	StudentDetails details=dao.findStudent(id);
	List<StudentDetails> list=new ArrayList();
	list.add(details);
	req.getSession().setAttribute("list", list);
	resp.sendRedirect("display.jsp");
	}
}
