package com.zenvia.converters.roman.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Roman system domain class
 * @author rcerioli
 *
 */
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
	
	/**
	 * Creates and return a List instance of Sting objects
	 * comprising the letters which compose the roman numeric system
	 * @return List: a list of of Sting object letters for the roman numeric system
	 */
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
