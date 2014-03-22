package aiswa.aispwa_ws.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import aiswa.aispwa_ws.dto.members.MemberDetailsDTO;


@WebService
public interface AispwaDbService {
	
	@WebMethod
	String registerMember(MemberDetailsDTO memberDetailsDTO);

}
