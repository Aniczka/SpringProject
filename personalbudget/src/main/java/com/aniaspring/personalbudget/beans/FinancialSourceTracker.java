package com.aniaspring.personalbudget.beans;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FinancialSourceTracker {

	
	@Autowired
	private FinancialTransactionTracker incoming;
	@Autowired
	private FinancialTransactionTracker outgoing;
	@Autowired
	private FinancialSource financialSource;
	private BigDecimal sourceTotal;
	
	
	public FinancialTransactionTracker getIncoming() {
		return incoming;
	}
	public void setIncoming(FinancialTransactionTracker incoming) {
		this.incoming = incoming;
	}
	public FinancialTransactionTracker getOutgoing() {
		return outgoing;
	}
	public void setOutgoing(FinancialTransactionTracker outgoing) {
		this.outgoing = outgoing;
	}
	public BigDecimal getSourceTotal() {
		return sourceTotal;
	}
	public void setSourceTotal(BigDecimal sourceTotal) {
		this.sourceTotal = sourceTotal;
	}
	public FinancialSource getFinancialSource() {
		return financialSource;
	}
	public void setFinancialSource(FinancialSource financialSource) {
		this.financialSource = financialSource;
	}
}
