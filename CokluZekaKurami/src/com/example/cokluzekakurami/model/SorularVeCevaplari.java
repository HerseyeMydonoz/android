package com.example.cokluzekakurami.model;

import java.math.BigDecimal;

public class SorularVeCevaplari {

	private final int sorular;
	private BigDecimal cevaplar;
	private final String soruTuru;
	


	public SorularVeCevaplari(int sorular, BigDecimal cevaplar, String soruTuru) {
		super();
		this.sorular = sorular;
		this.cevaplar = cevaplar;
		this.soruTuru = soruTuru;
	}

	public int getSorular() {
		return sorular;
	}

	public BigDecimal getCevaplar() {
		return cevaplar;
	}

	public void setCevaplar(BigDecimal cevaplar) {
		this.cevaplar = cevaplar;
	}

	public String getSoruTuru() {
		return soruTuru;
	}

	@Override
	public String toString() {
		return "SorularVeCevaplari [sorular=" + sorular + ", cevaplar=" + cevaplar + ", soruTuru=" + soruTuru + "]";
	}


	
	
	
	
	
	
	
	
}
