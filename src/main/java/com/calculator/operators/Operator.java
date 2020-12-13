package com.calculator.operators;

/**
 * Generic class for representing operator behavior and the type of operand on operator is applied.
 * As of now only Integer operand is supported but this solution can be extended later to support float operand.
 * @author DELL
 *
 * @param <T>
 */
public abstract class Operator<T> {
	public abstract T apply(T op1, T op2);

	public abstract int getPriority();
}
