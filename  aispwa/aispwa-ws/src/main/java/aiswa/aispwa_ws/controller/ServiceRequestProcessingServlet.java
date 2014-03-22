package aiswa.aispwa_ws.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import aiswa.aispwa_ws.soap.handlers.ISoapHandler;
import aiswa.aispwa_ws.soap.handlers.impl.SoapHandlerImpl;

public class ServiceRequestProcessingServlet extends HttpServlet {
	
	static MessageFactory messageFactory;
	static{
		try{
			messageFactory = MessageFactory.newInstance();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		MimeHeaders headers = getHeaders(req);
		// Construct a SOAPMessage from the XML in the request body       
		InputStream is = req.getInputStream(); 
		ISoapHandler igntSoapHandler = new SoapHandlerImpl();
		System.out.println("Remote User Name:"+req.getRemoteUser());
		
		
		 
		try {
			SOAPMessage soapRequest = messageFactory.createMessage(headers, is);
			SOAPMessage soapResponse = igntSoapHandler.handleSoapRequest(soapRequest);
			resp.setStatus(HttpServletResponse.SC_OK);       
			resp.setContentType("text/xml;charset=\"utf-8\"");
			OutputStream os = resp.getOutputStream();      
			soapResponse.writeTo(os);       
			os.flush();
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		doGet(req, resp);
	}
	
	
	@SuppressWarnings("unchecked")   
	static MimeHeaders getHeaders(HttpServletRequest req) { 
		
		Enumeration headerNames = req.getHeaderNames();    
		MimeHeaders headers = new MimeHeaders();    
		while (headerNames.hasMoreElements()) {       
			String headerName = (String) headerNames.nextElement();       
			String headerValue = req.getHeader(headerName);       
			StringTokenizer values = new StringTokenizer(headerValue, ",");       
			while (values.hasMoreTokens()) {         
				headers.addHeader(headerName, values.nextToken().trim());      
				}     
			}    
		return headers;   
		} 

}
