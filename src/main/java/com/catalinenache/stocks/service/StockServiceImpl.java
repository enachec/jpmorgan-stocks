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
public class StockServiceImpl implements StockService {

	@Override
	public BigDecimal calculateDividendYield(Stock stock, BigDecimal price) {
		if (null == stock) {
			throw new IllegalArgumentException("Stock argument can't be null");
		}
		if (null == price) {
			throw new IllegalArgumentException("Price argument can't be null");
		}


		return stock.getDividend().divide(price);
	}

	@Override
	public BigDecimal calculatePERatio(Stock stock, BigDecimal price) {
		return price.divide(stock.getDividend());
	}

}
