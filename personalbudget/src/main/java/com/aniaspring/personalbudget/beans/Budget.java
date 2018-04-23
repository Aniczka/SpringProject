package com.aniaspring.personalbudget.beans;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aniaspring.personalbudget.definitions.BudgetCycleType;

@Component
public class Budget {
	
	private String budgetName;
	private BigDecimal budgetTotal;
	private BudgetCycleType budgetCycleType;
	@Autowired
	private List<FinancialSourceTracker> financialSourceTrackers;
	
	public String getBudgetName() {
		return budgetName;
	}
	public void setBudgetName(String budgetName) {
		this.budgetName = budgetName;
	}
	public BigDecimal getBudgetTotal() {
		return budgetTotal;
	}
	public void setBudgetTotal(BigDecimal budgetTotal) {
		this.budgetTotal = budgetTotal;
	}
	public BudgetCycleType getBudgetCycleType() {
		return budgetCycleType;
	}
	public void setBudgetCycleType(BudgetCycleType budgetCycleType) {
		this.budgetCycleType = budgetCycleType;
	}
	public List<FinancialSourceTracker> getFinancialSourceTrackers() {
		return financialSourceTrackers;
	}
	public void setFinancialSourceTrackers(List<FinancialSourceTracker> financialSourceTrackers) {
		this.financialSourceTrackers = financialSourceTrackers;
	}
	

}
