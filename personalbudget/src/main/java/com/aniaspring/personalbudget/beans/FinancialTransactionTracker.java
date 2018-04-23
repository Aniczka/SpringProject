package com.aniaspring.personalbudget.beans;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aniaspring.personalbudget.definitions.FinancialTransactionType;

@Component
public class FinancialTransactionTracker {
	
	private FinancialTransactionType transactionType;
	private BigDecimal total;
	
	@Autowired
	private List<FinancialTransaction> financialTransactions;
	
	public FinancialTransactionType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(FinancialTransactionType transactionType) {
		this.transactionType = transactionType;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public List<FinancialTransaction> getFinancialTransactions() {
		return financialTransactions;
	}
	public void setFinancialTransactions(List<FinancialTransaction> financialTransactions) {
		this.financialTransactions = financialTransactions;
	}

}
