package com.dillip.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankDetailsResponse {
	@JsonProperty("MICR")
	private String micr;
	@JsonProperty("BRANCH")
	private String branch;
	@JsonProperty("ADDRESS")
	private String address;
	@JsonProperty("STATE")
	private String state;
	@JsonProperty("CONTACT")
	private String contact;
	@JsonProperty("UPI")
	private boolean upi;
	@JsonProperty("RTGS")
	private boolean rtgs;
	@JsonProperty("CITY")
	private String city;
	@JsonProperty("CENTRE")
	private String centre;
	@JsonProperty("DISTRICT")
	private String district;
	@JsonProperty("NEFT")
	private boolean neft;
	@JsonProperty("IMPS")
	private boolean imps;
	@JsonProperty("SWIFT")
	private Object swift;
	@JsonProperty("ISO3166")
	private String iso3166;
	@JsonProperty("BANK")
	private String bank;
	@JsonProperty("BANKCODE")
	private String bankCode;
	@JsonProperty("IFSC")
	private String ifsc;
}
