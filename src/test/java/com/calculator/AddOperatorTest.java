package com.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.calculator.driver.Operand;
import com.calculator.operators.AddOperator;

public class AddOperatorTest {

	@Test
	public void testApply_exp1() {
		Operand op1 =  new Operand(12);
		Operand op2 =  new Operand(13);
		AddOperator op =  new AddOperator();
		Operand res = new Operand(op.apply(op1, op2).getValue());
		assertEquals(25, res.getValue());
	}

	@Test
	public void testApply_exp2() {
		Operand op1 =  new Operand(13);
		Operand op2 =  new Operand(12);
		AddOperator op =  new AddOperator();
		Operand res = new Operand(op.apply(op1,op2).getValue());
		assertEquals(25, res.getValue());
	}

	@Test
	public void testApply_exp3() {
		Operand op1 =  new Operand(-20);
		Operand op2 =  new Operand(-5);
		AddOperator op =  new AddOperator();
		Operand res = new Operand(op.apply(op1,op2).getValue());
		assertEquals(-25, res.getValue());
	}

	@Test
	public void testApply_exp4() {
		Operand op1 =  new Operand(-5);
		Operand op2 =  new Operand(-20);
		AddOperator op =  new AddOperator();
		Operand res = new Operand(op.apply(op1,op2).getValue());
		assertEquals(-25, res.getValue());
	}

	@Test
	public void testGetPriority() {
		assertEquals(1, (new AddOperator().getPriority()));
	}
}