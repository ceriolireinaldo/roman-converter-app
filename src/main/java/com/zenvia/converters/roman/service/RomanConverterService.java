package com.zenvia.converters.roman.service;

import java.util.List;

import com.zenvia.converters.roman.domain.RomanDomain;

/**
 * Utility class for arabic numeric into roman system translation
 * 
 * @author rcerioli
 *
 */
public class RomanConverterService {
	private static String result;

	/**
	 * translate the received arabic number into it's corresponding roman value
	 * 
	 * @param number the arabic integer value
	 * @return the roman value as String
	 */
	public static String translate(int number) {
		result = "";
		int initialValue = number;
		List<RomanDomain> romanValues = RomanDomain.initDomain();
		for (RomanDomain roman : romanValues) {
			number = reduce(number, roman);
		}
		System.out.println("O valor romano para o arábico [" + initialValue + "] é: " + result);
		return result;
	}

	private static int reduce(int number, RomanDomain roman) {
		while (number >= roman.getArabicValue()) {
			result += roman.getRomanValue();
			number -= roman.getArabicValue();
		}
		return number;
	}

}
