package aiswa.aispwa_ws.services;

import javax.jws.WebService;

import aiswa.aispwa_ws.dto.members.MemberDetailsDTO;

@WebService(endpointInterface="aiswa.aispwa_ws.services.AispwaDbService")
public class AispwaDbServiceImpl implements AispwaDbService {

	@Override
	public String registerMember(MemberDetailsDTO memberDetailsDTO) {
		// TODO Auto-generated method stub
		return "success";
	}

}
