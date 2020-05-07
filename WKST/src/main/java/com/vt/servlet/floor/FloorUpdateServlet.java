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

public class FloorUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection con = null;
		PreparedStatement p = null;
		RequestDispatcher rd = null;
		String floorId = request.getParameter("floorId");
		String floorName = request.getParameter("floorName");
		String floorDesc = request.getParameter("floorDesc");
		String sql = "UPDATE WKSTFLOOR SET FLOORNAME=?,FLOORDESC=? WHERE FLOORID=?";
		try {
			con = ConnectionUtil.getConnection();
			p = con.prepareStatement(sql);
			p.setString(1, floorName);
			p.setString(2, floorDesc);
			p.setString(3, floorId);
			p.executeUpdate();
			rd = request.getRequestDispatcher("floorUpdate.jsp");
			request.setAttribute("update"," Data Updated Successfully");
			rd.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
