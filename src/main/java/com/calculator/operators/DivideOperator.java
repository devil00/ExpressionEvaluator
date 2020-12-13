package com.calculator.operators;

import com.calculator.driver.Operand;

public class DivideOperator extends Operator<Operand> {

	@Override
	public Operand apply(Operand op1, Operand op2) {
		return new Operand(op1.getValue() / op2.getValue());
	}

	@Override
	public int getPriority() {
		return OperatorType.DIVIDE.getPriority();
	}

}
