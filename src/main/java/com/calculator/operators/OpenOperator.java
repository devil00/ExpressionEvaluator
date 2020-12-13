package com.calculator.operators;

import com.calculator.driver.Operand;

public class OpenOperator extends Operator<Operand> {
	@Override
	public Operand apply(Operand op1, Operand op2) {
		return null;
	}

	@Override
	public int getPriority() {
		return OperatorType.OPEN.getPriority();
	}
}
