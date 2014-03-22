package aiswa.aispwa_ws.enums;

public enum TypesEnum {
	
	MSG_INCOMING(1),
	MSG_OUTGOING(2),
	REQ_INCOMING(3),
	REQ_OUTGOING(4),
	TRNS_INCOMING(5),
	TRNS_OUTGOING(6);
	
	int type;
	
	private TypesEnum(int inputType){
		this.type = inputType;
	}
	

}
