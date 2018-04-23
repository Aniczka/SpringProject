package com.aniaspring.personalbudget.beans;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class FinancialTransaction 
{
	private Date transactionDate;
	private BigDecimal transactionValue;
	private String transactionDescription;
	
	public BigDecimal getTransactionValue() {
		return transactionValue;
	}
	public void setTransactionValue(BigDecimal transactionValue) {
		this.transactionValue = transactionValue;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionDescription() {
		return transactionDescription;
	}
	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

}
