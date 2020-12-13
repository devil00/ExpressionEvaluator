package com.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.calculator.driver.Operand;

public class OperandTest {

	@Test
	public void getValueTest(){
		Operand op = new Operand(6);
		assertEquals(6,op.getValue());
	}

	@Test
	public void getValueTypeTest(){
		Operand op = new Operand(6);

		assertTrue(isInt(op.getValue()));
	}

	@Test
	public void checkValueTest(){
		assertTrue(Operand.isValid("13"));
		assertTrue(Operand.isValid("19"));
		assertTrue(Operand.isValid("465465"));
		assertFalse(Operand.isValid("c"));
		assertFalse(Operand.isValid("3.0"));
		assertFalse(Operand.isValid("3."));
		assertFalse(Operand.isValid("343324fd"));
	}

	private boolean isInt(Object o){
		return o instanceof Integer;
	}


}
