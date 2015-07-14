package com.ani.stock.datasvc.test;

import com.ani.stock.datasvc.entity.Stock;
import com.ani.stock.datasvc.service.StockRestCall;

public class StockTest2 {

	public static void main(String[] args) {
		testCallYahooWebSerice();

	}
	
	public static void testCallYahooWebSerice() {
		
		StockRestCall restCall = new StockRestCall();
		String buildURL = restCall.buildURL("2015-02-11", "2015-02-18", "YHOO", true);
		Stock stock = restCall.callYahooWebSerice(buildURL);
	}

}
