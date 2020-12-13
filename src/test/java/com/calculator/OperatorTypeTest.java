package com.calculator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.calculator.driver.Operand;
import com.calculator.operators.AddOperator;
import com.calculator.operators.CloseOperator;
import com.calculator.operators.DivideOperator;
import com.calculator.operators.MultiplyOperator;
import com.calculator.operators.OpenOperator;
import com.calculator.operators.Operator;
import com.calculator.operators.OperatorType;
import com.calculator.operators.SubtractOperator;

public class OperatorTypeTest {

	@Test
	public void testCheck(){
		assertTrue(OperatorType.isValid("+"));
		assertTrue(OperatorType.isValid("*"));
		assertTrue(OperatorType.isValid("-"));
		assertTrue(OperatorType.isValid("/"));
		assertFalse(OperatorType.isValid("156"));
		assertFalse(OperatorType.isValid("156.0"));
		assertFalse(OperatorType.isValid("x"));
		assertFalse(OperatorType.isValid("**"));

		assertTrue(OperatorType.isValid("("));
		assertTrue(OperatorType.isValid(")"));
		assertFalse(OperatorType.isValid("^"));
	}

	@Test
	public void testGetOperator(){
		Operator<Operand> op = OperatorType.getOperator("+");
		assertTrue(op instanceof AddOperator);
		op = OperatorType.getOperator("-");
		assertTrue(op instanceof SubtractOperator);
		op = OperatorType.getOperator("/");
		assertTrue(op instanceof DivideOperator);
		op = OperatorType.getOperator("*");
		assertTrue(op instanceof MultiplyOperator);
		op = OperatorType.getOperator("^");
		op = OperatorType.getOperator("c");
		assertTrue(op == null);

		op = OperatorType.getOperator("(");
		assertTrue(op instanceof OpenOperator);
		op = OperatorType.getOperator(")");
		assertTrue(op instanceof CloseOperator);
	}
}
