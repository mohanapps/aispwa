package aiswa.aispwa_ws.dto.members;

import java.sql.Date;

public class MemberDetailsDTO {
	
	private String firstName;
	
	private String lastName;
	
	private String fatherName;
	
	private Date dob;
	
	private String memberProfession;
	
	private String acheivements;
	
	private Date dateOfRegistration;
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String addressLine3;
	
	private String contactNo;
	
	private String districtOrCity;
	
	private String state;
	
	private Integer pincode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMemberProfession() {
		return memberProfession;
	}

	public void setMemberProfession(String memberProfession) {
		this.memberProfession = memberProfession;
	}

	public String getAcheivements() {
		return acheivements;
	}

	public void setAcheivements(String acheivements) {
		this.acheivements = acheivements;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getDistrictOrCity() {
		return districtOrCity;
	}

	public void setDistrictOrCity(String districtOrCity) {
		this.districtOrCity = districtOrCity;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
}
