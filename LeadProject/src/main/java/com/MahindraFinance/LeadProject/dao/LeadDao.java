package com.MahindraFinance.LeadProject.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MahindraFinance.LeadProject.model.Lead;

@Repository
public interface LeadDao extends JpaRepository<Lead, String>  {
	
	List<Lead> findByMobileNumber(String mobNum);

}
