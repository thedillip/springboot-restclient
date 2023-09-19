package com.dillip.service;

import com.dillip.response.BankDetailsResponse;

public interface CommonClientService {
	BankDetailsResponse findBankDetailsByIfsc(String ifsc);
}
