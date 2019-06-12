package com.zenvia.converters.roman.service;

import java.util.List;

import com.zenvia.converters.roman.domain.RomanDomain;

public class RomanConverterService {
	static String result;

	public static String translate(int number) {
		result = "";
		int initialValue = number;
		List<RomanDomain> romanValues = RomanDomain.initDomain();
		for (RomanDomain roman : romanValues) {
			number = reduce(number, roman);
		}
		System.out.println("O valor romano para o arábico [" + initialValue +  "] é: " + result);
		return result;
	}

	private static int reduce(int number, RomanDomain roman) {
		int arabicValue = roman.getArabicValue();
		String romanValue = roman.getRomanValue();
		while (number >= arabicValue ) {
			result += romanValue;
			number -= arabicValue;
		}
		return number;
	}

}
