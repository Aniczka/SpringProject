package com.aniaspring.personalbudget.beans;

import com.aniaspring.personalbudget.definitions.FinancialSourceType;

public class FinancialSource {

	private String financialSourceName;
	private FinancialSourceType financialSourceType;
	
	public String getFinancialSourceName() {
		return financialSourceName;
	}
	public void setFinancialSourceName(String financialSourceName) {
		this.financialSourceName = financialSourceName;
	}

	public FinancialSourceType getFinancialSourceType() {
		return financialSourceType;
	}
	public void setFinancialSourceType(FinancialSourceType financialSourceType) {
		this.financialSourceType = financialSourceType;
	}
}
