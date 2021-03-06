package com.vt.servlet.floor;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vt.utility.ConnectionUtil;

public class FloorInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection con = null;
		PreparedStatement p = null;
		RequestDispatcher rd = null;
		String floorId = request.getParameter("floorId");
		String floorName = request.getParameter("floorName");
		String floorDesc = request.getParameter("floorDesc");
		String sql = "INSERT INTO WKSTFLOOR  VALUES(?,?,?)";
		try {
			con = ConnectionUtil.getConnection();
			p = con.prepareStatement(sql);
			p.setString(1, floorId);
			p.setString(2, floorName);
			p.setString(3, floorDesc);
			p.execute();
			rd = request.getRequestDispatcher("floorInsert.jsp");
			request.setAttribute("insert"," Data Inserted Successfully");
			rd.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
