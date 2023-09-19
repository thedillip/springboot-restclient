package com.dillip.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.dillip.response.BankDetailsResponse;
import com.dillip.service.CommonClientService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommonClientServiceImpl implements CommonClientService {

	private final RestClient restClient;

	@Value("${razorpay.baseurl}")
	private String razorPayBaseUrl;

	@Override
	public BankDetailsResponse findBankDetailsByIfsc(final String ifsc) {
		return restClient.get().uri(razorPayBaseUrl + "/{ifsc}", ifsc).accept(MediaType.APPLICATION_JSON).retrieve()
				.body(BankDetailsResponse.class);
	}

}
