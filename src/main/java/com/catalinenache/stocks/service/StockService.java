/**
 * 
 */
package com.catalinenache.stocks.service;

import java.math.BigDecimal;

import com.catalinenache.stocks.model.Stock;

/**
 * @author Catalin
 *
 */
public interface StockService {
	
	public BigDecimal calculateDividendYield(Stock stock, BigDecimal price);
	
	public BigDecimal calculatePERatio(Stock stock, BigDecimal price);

}
