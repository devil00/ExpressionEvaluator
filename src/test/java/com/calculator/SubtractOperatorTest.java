package com.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.calculator.driver.Operand;
import com.calculator.operators.SubtractOperator;

public class SubtractOperatorTest {

	@Test
	public void testApply_Exp1(){
		Operand op1 =  new Operand(60);
		Operand op2 =  new Operand(10);
		SubtractOperator so =  new SubtractOperator();
		Operand res = new Operand(so.apply(op1,op2).getValue());
		assertEquals(50, res.getValue());
	}

	@Test
	public void testApply_Exp2(){
		Operand op1 =  new Operand(11);
		Operand op2 =  new Operand(6);
		SubtractOperator so =  new SubtractOperator();
		Operand res = new Operand(so.apply(op1,op2).getValue());
		assertEquals(5, res.getValue());
	}

	@Test
	public void testApply_Exp3(){
		Operand op1 =  new Operand(-11);
		Operand op2 =  new Operand(6);
		SubtractOperator so =  new SubtractOperator();
		Operand res = new Operand(so.apply(op1,op2).getValue());
		assertEquals(-17, res.getValue());
	}

	@Test
	public void testApply_Exp4(){
		Operand op1 =  new Operand(11);
		Operand op2 =  new Operand(-6);
		SubtractOperator so =  new SubtractOperator();
		Operand res = new Operand(so.apply(op1,op2).getValue());
		assertEquals(17, res.getValue());
	}

	@Test
	public void subtractionPriorityTest(){
		assertEquals(1, (new SubtractOperator().getPriority()));
	}
}