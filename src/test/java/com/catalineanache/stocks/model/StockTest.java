/**
 * 
 */
package com.catalineanache.stocks.model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.catalinenache.stocks.model.Stock;
import com.catalinenache.stocks.model.StockType;

/**
 * @author Catalin
 *
 */
public class StockTest {

	private Stock classUnderTest;

	@Before
	public void before() {
		classUnderTest = new Stock();
	}

	@Test
	public void getDividendForCommon() {

		classUnderTest.setType(StockType.COMMON);
		classUnderTest.setLastDividend(new BigDecimal("8"));
		classUnderTest.setParValue(new BigDecimal("100"));
		classUnderTest.setFixedDividend(new BigDecimal("0.02"));

		BigDecimal dividend = classUnderTest.getDividend();
		assertEquals(dividend, classUnderTest.getLastDividend());
	}
	
	@Test
	public void getDividendForPreferred() {

		classUnderTest.setType(StockType.PREFERRED);
		classUnderTest.setLastDividend(new BigDecimal("8"));
		classUnderTest.setParValue(new BigDecimal("100"));
		classUnderTest.setFixedDividend(new BigDecimal("0.02"));

		assertEquals(classUnderTest.getDividend(), classUnderTest.getFixedDividend().multiply(classUnderTest.getParValue()));
	}
}
