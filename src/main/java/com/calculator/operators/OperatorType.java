package com.calculator.operators;

import java.util.HashMap;
import java.util.Map;

import com.calculator.driver.Operand;

public enum OperatorType {
	OPEN("(", 0),
	CLOSE(")", 0),
	ADD("+", 1),
	SUBTRACT("-", 1),
	MULTIPLY("*", 2),
	DIVIDE("/", 2);

	private static final Map<String, Operator<Operand>> OPERATORS = new HashMap<>();

	static {
		OPERATORS.put(ADD.func, new AddOperator());
		OPERATORS.put(SUBTRACT.func, new SubtractOperator());
		OPERATORS.put(MULTIPLY.func, new MultiplyOperator());
		OPERATORS.put(DIVIDE.func, new DivideOperator());
		OPERATORS.put(OPEN.getFunc(), new OpenOperator());
		OPERATORS.put(CLOSE.getFunc(), new CloseOperator());
	}

	private String func;
	private int priority;

	private OperatorType(String func, int priority) {
		this.setFunc(func);
		this.setPriority(priority);
	}

	public static boolean isValid(String token) {
		return OPERATORS.containsKey(token);
	}

	public static Operator<Operand> getOperator(String token) {
		return OPERATORS.get(token);
	}

	public static String getAllOperators() {
		return OPERATORS.keySet().toString();
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getFunc() {
		return func;
	}

	public void setFunc(String func) {
		this.func = func;
	}
}
