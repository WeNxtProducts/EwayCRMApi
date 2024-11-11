package com.maan.crm.service.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.maan.crm.dto.CrmDTO;
import com.maan.crm.service.CrmService;

@Lazy
@Service
public class CrmServiceImpl implements CrmService {

	
	@Override
	public ResponseEntity<CrmDTO> getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
