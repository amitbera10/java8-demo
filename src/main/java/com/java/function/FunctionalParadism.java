package com.java.function;

public class FunctionalParadism {
	public static void main(String[] args) {
		// Calculate price by
		PriceCalculation calculation = (a, b) -> a - b;
		int price1 = calculation.calculate(10, 30);
		System.out.println("Price : " + price1);

		// Variable needs to be Effectively final when we share it in
		// lambda

		int result = 0;

		// how it was for anonymous inner class

		PriceCalculation calculation2 = new PriceCalculation() {

			@Override
			public int calculate(int a, int b) {
				//result = a + b;
				return 0;
			}
		};
        
		//how it works in lambda
		// calculation = (a,b) -> {result = a*b; return result;};

	}
}
