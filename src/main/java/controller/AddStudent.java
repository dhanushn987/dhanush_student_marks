package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.StudentDetails;
@WebServlet("/addStudent")
public class AddStudent extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	int sub1=Integer.parseInt(req.getParameter("sub1"));
	int sub2=Integer.parseInt(req.getParameter("sub2"));
	int sub3=Integer.parseInt(req.getParameter("sub3"));
	int sub4=Integer.parseInt(req.getParameter("sub4"));
	int sub5=Integer.parseInt(req.getParameter("sub5"));
	int sub6=Integer.parseInt(req.getParameter("sub6"));
	
	StudentDetails details=new StudentDetails();
	details.setName(name);
	details.setSub1Marks(sub1);
	details.setSub2Marks(sub2);
	details.setSub3Marks(sub3);
	details.setSub4Marks(sub4);
	details.setSub5Marks(sub5);
	details.setSub6Marks(sub6);
	details.setPercentage((sub1+sub2+sub3+sub4+sub5+sub6)/6.0);
	
	StudentDao dao=new StudentDao();
	dao.addStudent(details);
	
	resp.sendRedirect("option.html");
	
}
}
