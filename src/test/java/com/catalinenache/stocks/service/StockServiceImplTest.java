/**
 * 
 */
package com.catalinenache.stocks.service;

import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.junit.Test;

import com.catalinenache.stocks.model.Stock;
import com.catalinenache.stocks.model.StockType;

/**
 * @author Catalin
 *
 */
public class StockServiceImplTest extends EasyMockSupport{
	
	private StockServiceImpl classUnderTest = EasyMock.createMock(StockServiceImpl.class);
	
	
	@Test
	public void calculate_dividend(){
		Stock stockMock = EasyMock.createMock(Stock.class);
		stockMock.setType(StockType.COMMON);
		
		replayAll();
		
		verifyAll();
	}

}
