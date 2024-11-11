package com.maan.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maan.crm.dto.CrmDTO;
import com.maan.crm.service.CrmService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/crm")
public class CrmController {
	
	@Autowired
	private CrmService crmService;
	
	@PostMapping("/getCustomer")
	public ResponseEntity<CrmDTO> getCustomer(HttpServletRequest http)  {
		return crmService.getCustomer();
	}

}
