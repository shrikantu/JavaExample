package com.example.math;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class BigDecimalForCurrencyIn {
	public static String formatRupees(double value) {
		NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
		format.setMinimumFractionDigits(2);
		format.setMaximumFractionDigits(5);
		return format.format(value);
	}

	public static void main(String[] args) {
		BigDecimal tempBig = new BigDecimal(22.1214);
		System.out.println("tempBig = " + formatRupees(tempBig.doubleValue()));
	}

}
