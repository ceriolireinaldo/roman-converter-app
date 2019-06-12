package com.zenvia.converters.roman.domain;

import java.util.ArrayList;
import java.util.List;

public class RomanDomain {
	
	public RomanDomain(int arabicValue, String romanValue) {
		super();
		this.arabicValue = arabicValue;
		this.romanValue = romanValue;
	}

	private int arabicValue;
	private String romanValue;

	public int getArabicValue() {
		return arabicValue;
	}

	public void setArabicValue(int arabicValue) {
		this.arabicValue = arabicValue;
	}

	public String getRomanValue() {
		return romanValue;
	}

	public void setRomanValue(String romanValue) {
		this.romanValue = romanValue;
	}
	
	public static List<RomanDomain> initDomain() {
		ArrayList<RomanDomain> romanDomain = new ArrayList<RomanDomain>();
		romanDomain.add(new RomanDomain(1000, "M"));
		romanDomain.add(new RomanDomain(500, "D"));
		romanDomain.add(new RomanDomain(100, "C"));
		romanDomain.add(new RomanDomain(90, "XC"));
		romanDomain.add(new RomanDomain(50, "L"));
		romanDomain.add(new RomanDomain(10, "X"));
		romanDomain.add(new RomanDomain(9, "IX"));
		romanDomain.add(new RomanDomain(5, "V"));
		romanDomain.add(new RomanDomain(4, "IV"));
		romanDomain.add(new RomanDomain(1, "I"));
		return romanDomain;
	}

}
