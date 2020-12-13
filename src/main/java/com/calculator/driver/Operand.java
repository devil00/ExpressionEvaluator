package com.calculator.driver;

import com.calculator.operators.Operator;

/**
 * Represent the operand on which {@link Operator} is applied.
 * @author DELL
 *
 */
public class Operand {
	private int operand;

	public Operand(String token) {
		try {
			operand = Integer.parseInt(token);
		} catch (NumberFormatException e) {
			System.out.println("string cannot be parsed into int.");
		}
	}

	public Operand(int value) {
		operand = value;
	}

	public int getValue() {
		return operand;
	}

	public static boolean isValid(String token) {
		try {
			Integer.parseInt(token);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
