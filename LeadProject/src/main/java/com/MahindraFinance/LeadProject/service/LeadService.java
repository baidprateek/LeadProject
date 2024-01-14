package com.MahindraFinance.LeadProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MahindraFinance.LeadProject.dao.LeadDao;
import com.MahindraFinance.LeadProject.model.ErrorResponse;
import com.MahindraFinance.LeadProject.model.Lead;
import com.MahindraFinance.LeadProject.model.Response;

@Service
public class LeadService {

	@Autowired
	LeadDao dao;

	public Response saveLead(Lead lead) {
		Response res = new Response();
	
		ErrorResponse errorRes = new ErrorResponse();
		List<String> errorMessage = new ArrayList();

		try {
			if (dao.existsById(lead.getLeadId())) {
				errorMessage.add("Lead Already Exists in the database with the lead id");
				errorRes.setCode("E10010");
				errorRes.setMessages(errorMessage);
				res.setErrorResponse(errorRes);
				res.setStatus("error");
			} else {
				dao.save(lead);
				errorMessage.add("Created Leads Successfully");
				res.setData(errorMessage);
				res.setStatus("success");
			}
		} catch (Exception e) {
			errorRes.setCode("TECHERROR001");
			errorMessage.add("Exception:: " + e.getLocalizedMessage());
			errorRes.setMessages(errorMessage);
			res.setErrorResponse(errorRes);
			res.setStatus("error");
			System.out.println("Exception:: " + e.getLocalizedMessage());
		}
		return res;

	}

	public Response fetchLead(String mobileNumber) {
		Response res = new Response();
		ErrorResponse errorRes = new ErrorResponse();
		List<Lead> leadResponse = new ArrayList();
		List<String> errorMessage = new ArrayList();

		try {
			leadResponse = dao.findByMobileNumber(mobileNumber);

			if (leadResponse.size() == 0) {
				errorRes.setCode("E10011");
				errorMessage.add("No Lead found with the Mobile Number");
				errorRes.setMessages(errorMessage);
                res.setErrorResponse(errorRes);
                res.setStatus("error");
			} else {
				res.setData(leadResponse);
				res.setStatus("success");
			}
		} catch (Exception e) {
			errorRes.setCode("TECHERROR001");
			errorMessage.add("Exception:: " + e.getLocalizedMessage());
			errorRes.setMessages(errorMessage);
			res.setErrorResponse(errorRes);
			res.setStatus("error");
			System.out.println("Exception:: " + e.getLocalizedMessage());
		}
		return res;

	}

}
