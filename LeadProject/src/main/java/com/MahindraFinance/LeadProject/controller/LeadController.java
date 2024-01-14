package com.MahindraFinance.LeadProject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MahindraFinance.LeadProject.model.Lead;
import com.MahindraFinance.LeadProject.model.Response;
import com.MahindraFinance.LeadProject.service.LeadService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/")
public class LeadController {
	
	@Autowired
	LeadService leadService;
	
	@PostMapping("/saveLead")
    public Response addLead(@RequestBody @Valid Lead lead) {
      return leadService.saveLead(lead);
    }
	
	@GetMapping("/fetchLead")
    public Response getLead(@RequestParam String mobileNumber) {
		return leadService.fetchLead(mobileNumber);
       
    }
	
	

}
