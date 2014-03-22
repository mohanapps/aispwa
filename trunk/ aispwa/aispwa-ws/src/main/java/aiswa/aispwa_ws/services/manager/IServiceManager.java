package aiswa.aispwa_ws.services.manager;

import javax.xml.soap.SOAPMessage;



public interface IServiceManager {
	
	public SOAPMessage invokeService();
	
	SOAPMessage generateSoapResponse(Object serviceOuput);
	
}
