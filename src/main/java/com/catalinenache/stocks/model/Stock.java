/**
 * 
 */
package com.catalinenache.stocks.model;

import java.math.BigDecimal;

/**
 * @author Catalin
 *
 */
public class Stock {
	
	private String symbol;
	
	private StockType type;
	
	private BigDecimal price;
	
	private BigDecimal lastDividend;
	
	private BigDecimal fixedDividend;
	
	private BigDecimal dividendYield;
	
	private BigDecimal parValue;
	
	private BigDecimal peRatio;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public StockType getType() {
		return type;
	}

	public void setType(StockType type) {
		this.type = type;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getLastDividend() {
		return lastDividend;
	}

	public void setLastDividend(BigDecimal lastDividend) {
		this.lastDividend = lastDividend;
	}

	public BigDecimal getFixedDividend() {
		return fixedDividend;
	}

	public void setFixedDividend(BigDecimal fixedDividend) {
		this.fixedDividend = fixedDividend;
	}

	public BigDecimal getDividendYield() {
		return dividendYield;
	}

	public void setDividendYield(BigDecimal dividendYield) {
		this.dividendYield = dividendYield;
	}

	public BigDecimal getParValue() {
		return parValue;
	}

	public void setParValue(BigDecimal parValue) {
		this.parValue = parValue;
	}

	public BigDecimal getPeRatio() {
		return peRatio;
	}

	public void setPeRatio(BigDecimal peRatio) {
		this.peRatio = peRatio;
	}
	
	public BigDecimal getDividend() {
		return (type == StockType.COMMON ? lastDividend : fixedDividend.multiply(parValue));
	}

}
