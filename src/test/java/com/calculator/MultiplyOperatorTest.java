package com.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.calculator.driver.Operand;
import com.calculator.operators.MultiplyOperator;

public class MultiplyOperatorTest {

	@Test
	public void testApply_Exp1(){
		Operand op1 =  new Operand(10);
		Operand op2 =  new Operand(1);
		MultiplyOperator mp =  new MultiplyOperator();
		Operand res = new Operand(mp.apply(op1,op2).getValue());
		assertEquals(10, res.getValue());
	}

	@Test
	public void testApply_Exp2(){
		Operand op1 =  new Operand(1);
		Operand op2 =  new Operand(10);
		MultiplyOperator mp =  new MultiplyOperator();
		Operand res = new Operand(mp.apply(op1,op2).getValue());
		assertEquals(10, res.getValue());
	}

	@Test
	public void testApply_Exp3(){
		Operand op1 =  new Operand(-5);
		Operand op2 =  new Operand(5);
		MultiplyOperator mp =  new MultiplyOperator();
		Operand res = new Operand(mp.apply(op2,op1).getValue());
		assertEquals(-25, res.getValue());
	}

	@Test
	public void testApply_Exp4(){
		Operand op1 =  new Operand(-5);
		Operand op2 =  new Operand(-5);
		MultiplyOperator mp =  new MultiplyOperator();
		Operand res = new Operand(mp.apply(op2,op1).getValue());
		assertEquals(25, res.getValue());
	}

	@Test
	public void multiplicationPriorityTest(){
		assertEquals(2, (new MultiplyOperator().getPriority()));
	}
}
