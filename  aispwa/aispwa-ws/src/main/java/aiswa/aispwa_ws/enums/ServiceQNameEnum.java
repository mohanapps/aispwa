package aiswa.aispwa_ws.enums;

public enum ServiceQNameEnum {
	
	REGISTER_USER("registerUser");
	
	private String qName;
	
	public static ServiceQNameEnum getqNameEnum(String enumVal) {
		ServiceQNameEnum[] serviceQNameEnums = values();
		ServiceQNameEnum retval = null;
		for(ServiceQNameEnum serviceQNameEnum : serviceQNameEnums){
			if(enumVal.equals(serviceQNameEnum.qName)){
				retval = serviceQNameEnum;
			}
		}
		return retval;
	}

	private ServiceQNameEnum(String qNameParam){
		this.qName = qNameParam;
		
	}

}
