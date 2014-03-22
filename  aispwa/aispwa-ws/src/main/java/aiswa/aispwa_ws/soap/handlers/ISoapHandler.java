package aiswa.aispwa_ws.soap.handlers;

import javax.xml.soap.SOAPMessage;

public interface ISoapHandler {
	
	public SOAPMessage handleSoapRequest(SOAPMessage request);

}
