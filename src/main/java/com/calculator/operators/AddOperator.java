package com.calculator.operators;

import com.calculator.driver.Operand;

public class AddOperator extends Operator<Operand> {

	@Override
	public Operand apply(Operand op1, Operand op2) {
		// TODO Auto-generated method stub
		return new Operand(op1.getValue() + op2.getValue());
	}


	@Override
	public int getPriority() {
		return OperatorType.ADD.getPriority();
	}

}
