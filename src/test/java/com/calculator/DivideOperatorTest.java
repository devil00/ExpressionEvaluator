package com.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.calculator.driver.Operand;
import com.calculator.operators.DivideOperator;

public class DivideOperatorTest {

	@Test
	public void testApply_exp1() {
		Operand op1 =  new Operand(6);
		Operand op2 =  new Operand(11);
		DivideOperator dop =  new DivideOperator();
		Operand res = new Operand(dop.apply(op1,op2).getValue());
		assertEquals(0, res.getValue());
	}

	@Test
	public void testApply_exp2() {
		Operand op1 =  new Operand(11);
		Operand op2 =  new Operand(6);
		DivideOperator dp =  new DivideOperator();
		Operand res = new Operand(dp.apply(op1,op2).getValue());
		assertEquals(1, res.getValue());
	}

	@Test
	public void testApply_exp3() {
		Operand op1 =  new Operand(25);
		Operand op2 =  new Operand(5);
		DivideOperator dp =  new DivideOperator();
		Operand res = new Operand(dp.apply(op1,op2).getValue());
		assertEquals(5, res.getValue());
	}

	@Test
	public void testApply_exp4() {
		Operand op1 =  new Operand(25);
		Operand op2 =  new Operand(-5);
		DivideOperator dp =  new DivideOperator();
		Operand res = new Operand(dp.apply(op1,op2).getValue());
		assertEquals(-5, res.getValue());
	}

	@Test
	public void testGetPriority() {
		assertEquals(2, (new DivideOperator().getPriority()));
	}
}
