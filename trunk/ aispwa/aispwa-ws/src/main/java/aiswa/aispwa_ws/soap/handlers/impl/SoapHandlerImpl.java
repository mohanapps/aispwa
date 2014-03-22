package aiswa.aispwa_ws.soap.handlers.impl;

import java.util.Iterator;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import aiswa.aispwa_ws.factory.ServiceManagerFactory;
import aiswa.aispwa_ws.services.manager.IServiceManager;
import aiswa.aispwa_ws.soap.handlers.ISoapHandler;

public class SoapHandlerImpl implements ISoapHandler {

	@Override
	public SOAPMessage handleSoapRequest(SOAPMessage soapRequest) {
		Iterator soapElementsItr;
		SOAPMessage soapResponse = null;
		try {
			
			soapElementsItr = soapRequest.getSOAPBody().getChildElements();
			while(soapElementsItr.hasNext()){
				Object soapElementObj = soapElementsItr.next();
				if(soapElementObj instanceof SOAPElement){
				SOAPElement soapElement = (SOAPElement)soapElementObj;
				System.out.println(soapElement.getElementQName().getLocalPart());
				IServiceManager serviceManager = ServiceManagerFactory.newInstance(soapElement);
				soapResponse = serviceManager.invokeService();
				}
			}
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return soapResponse;
	}

}
