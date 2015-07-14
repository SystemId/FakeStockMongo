package com.ani.stock.datasvc.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Stock {
	
	private String Symbol;
	private String Date;
	private String Open;
	private String High;
	private String Low;
	private String Close;
	private String Volume;
	private String Adj_Close;
	
	public String getSymbol() {
		return Symbol;
	}
	public void setSymbol(String symbol) {
		this.Symbol = symbol;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		this.Date = date;
	}
	public String getOpen() {
		return Open;
	}
	public void setOpen(String open) {
		this.Open = open;
	}
	public String getHigh() {
		return High;
	}
	public void setHigh(String high) {
		this.High = high;
	}
	public String getLow() {
		return Low;
	}
	public void setLow(String low) {
		this.Low = low;
	}
	public String getClose() {
		return Close;
	}
	public void setClose(String close) {
		this.Close = close;
	}
	public String getVolume() {
		return Volume;
	}
	public void setVolume(String volume) {
		this.Volume = volume;
	}
	public String getAdj_Close() {
		return Adj_Close;
	}
	public void setAdj_Close(String adj_Close) {
		this.Adj_Close = adj_Close;
	}
	

}
