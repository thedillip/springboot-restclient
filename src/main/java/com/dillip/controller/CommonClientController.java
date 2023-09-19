package com.dillip.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dillip.response.BankDetailsResponse;
import com.dillip.service.CommonClientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/client")
@RequiredArgsConstructor
public class CommonClientController {
	private final CommonClientService commonClientService;

	@GetMapping(value = "/bank-details/{ifsc}")
	public ResponseEntity<BankDetailsResponse> findBankDetailsByIfsc(@PathVariable(name = "ifsc") final String ifsc) {
		return ResponseEntity.ok(commonClientService.findBankDetailsByIfsc(ifsc));
	}
}
