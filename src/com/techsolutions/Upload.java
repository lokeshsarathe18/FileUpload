package com.techsolutions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

@WebServlet("/Upload")
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			System.out.println(request.getParameter("name"));
			ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
			List<FileItem> files = sf.parseRequest(new ServletRequestContext(request));
			
			for (FileItem file : files) {
				file.write(new File("/home/lokesh/A Projects/photoupload/Images/" + file.getName()));
			}
			response.getWriter().print("<script>alert('Images uploaded to server')</script>");
		} catch (Exception e) {
			System.out.println("Exception :" + e);
		}
	}
}
