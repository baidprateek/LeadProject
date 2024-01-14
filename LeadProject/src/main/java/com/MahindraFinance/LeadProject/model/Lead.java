package com.MahindraFinance.LeadProject.model;
//import javax.persistence.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "lead")
public class Lead {

	@Id
	@NotBlank
	@Pattern(regexp="^[0-9]*$")
	private String leadId;
	
	@NotBlank
	@Pattern(regexp="^[a-zA-Z]*$")
	private String firstName;
	
	@Pattern(regexp="^[a-zA-Z]*$")
	private String middleName;
	
	@NotBlank
	@Pattern(regexp="^[a-zA-Z]*$")
	private String lastName;
	
	@NotBlank
	@Pattern(regexp="^[6-9][0-9]*$")
	private String mobileNumber;
	
	@NotBlank
	@Pattern(regexp="(?:Male|Female|Others)$")
	private String gender;
	
	@NotBlank
	//@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
	private String dob;
	
	@NotBlank
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$") 
	private String mail;
	
	@Override
	public String toString() {
		return "Lead [leadId=" + leadId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", dob=" + dob + ", mail=" + mail
				+ "]";
	}

	public String getLeadId() {
		return leadId;
	}

	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}


