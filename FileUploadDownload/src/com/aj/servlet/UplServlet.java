package com.aj.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javazoom.upload.MultipartFormDataRequest;
import javazoom.upload.UploadBean;
import javazoom.upload.UploadFile;

public class UplServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = null;
		MultipartFormDataRequest mreq = null;
		UploadBean upb = null;
		Hashtable ht = null;
		Enumeration e = null;
		pw = res.getWriter();
		res.setContentType("text/html");
		try {
			mreq = new MultipartFormDataRequest(req);
			upb = new UploadBean();
			upb.setFolderstore("F:/CArd");
			upb.setOverwrite(false);
			upb.store(mreq);
			pw.println("<h1> The Uploaded Files are </h1>");
			ht = mreq.getFiles();
			e = ht.elements();
			while (e.hasMoreElements()) {
				UploadFile file = (UploadFile) e.nextElement();
				pw.println("<br>" + file.getFileName() + " " + "<br>");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}
}
