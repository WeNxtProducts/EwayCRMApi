package com.maan.crm.service;

import org.springframework.http.ResponseEntity;

import com.maan.crm.dto.CrmDTO;

public interface CrmService {

	ResponseEntity<CrmDTO> getCustomer();

}
