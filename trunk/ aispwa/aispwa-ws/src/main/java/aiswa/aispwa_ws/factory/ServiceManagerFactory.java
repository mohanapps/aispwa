package aiswa.aispwa_ws.factory;

import javax.xml.soap.SOAPElement;

import aiswa.aispwa_ws.enums.ServiceQNameEnum;
import aiswa.aispwa_ws.services.manager.IServiceManager;

public class ServiceManagerFactory {
	
	public static IServiceManager newInstance(SOAPElement soapElement){
		IServiceManager serviceManager=null;
		String qName = soapElement.getElementQName().getLocalPart();
		ServiceQNameEnum qNameEnum = ServiceQNameEnum.getqNameEnum(qName);
		switch (qNameEnum) {
		case REGISTER_USER:
			System.out.println("entered RegisterUserManager factory");
			//serviceManager = new RegisterUserManager(soapElement);
			break;
		default:
			break;
		}
		return serviceManager;
	}

}
