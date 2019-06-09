package com.example.math;

import java.math.BigDecimal;

public class BigDecimalForCurrency {
	public static void main(String[] args) {
		int scale = 4;
		double value = 0.11111;
		BigDecimal tempBig = new BigDecimal(Double.toString(value));
		tempBig = tempBig.setScale(scale, BigDecimal.ROUND_HALF_EVEN);
		String strValue = tempBig.stripTrailingZeros().toPlainString();
		System.out.println("tempBig = " + strValue);
	}
}
