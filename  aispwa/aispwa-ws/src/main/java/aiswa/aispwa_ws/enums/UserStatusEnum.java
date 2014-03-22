package aiswa.aispwa_ws.enums;

public enum UserStatusEnum {
	
	ACTIVE(1),
	PENDING_EMAIL_CONFIRMATION(2);
	
	private UserStatusEnum(int userStatusEnum){
		this.statusEnum = userStatusEnum;
	}
	private int statusEnum;

}
