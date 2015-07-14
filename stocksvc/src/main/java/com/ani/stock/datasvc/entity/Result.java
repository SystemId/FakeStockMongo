package com.ani.stock.datasvc.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	

	
	private List<Stock> quote = new ArrayList<Stock>();

	public List<Stock> getQuote() {
		return quote;
	}

	public void setQuote(List<Stock> quote) {
		this.quote = quote;
	}

	



}
