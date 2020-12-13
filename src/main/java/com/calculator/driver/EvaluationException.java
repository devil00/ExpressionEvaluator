package com.calculator.driver;

public class EvaluationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1653155702830044030L;

	public EvaluationException(String msg) {
		super(msg);
	}

	public EvaluationException(String msg, Throwable cause)  {
		super(msg, cause);
	}
}
