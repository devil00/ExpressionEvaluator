package com.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.calculator.driver.ExpressionEvaluator;

public class ExpressionEvaluatorTest {

	private ExpressionEvaluator ev;

	@Before
	public void setUp() {
		this.ev = new ExpressionEvaluator();
	}

	@Test
	public void testEvaluate_Expression01() {
		String exp = "1+2";
		int res;

		res = ev.evaluate(exp);
		assertEquals(3,res);
	}

	@Test
	public void testEvaluate_Expression02() {
		String exp = "1/2";
		int res;

		res = ev.evaluate(exp);
		assertEquals(0,res);
	}

	@Test
	public void testEvaluate_Expression03() {
		String exp = "1+2*3";
		int res;

		res = ev.evaluate(exp);
		assertEquals(7,res);
	}

	@Test
	public void testEvaluate_Expression04() {
		String exp = "(1+2)*3";
		int res;

		res = ev.evaluate(exp);
		assertEquals(9,res);
	}

	@Test
	public void testEvaluate_Expression05() {
		String exp = "2-(3/10)+2-5";
		int res;

		res = ev.evaluate(exp);
		assertEquals(-1,res);
	}

	@Test
	public void testEvaluate_Expression06() {
		String exp = "(6-12*2)/3";
		int res;

		res = ev.evaluate(exp);
		assertEquals(-6,res);
	}

	@Ignore
	public void testEvaluate_Expression07() {
		String exp = "3^2";
		int res;

		res = ev.evaluate(exp);
		assertEquals(9,res);
	}

	@Ignore
	public void testEvaluate_Expression08() {
		String exp = "3^2/2";
		int res;

		res = ev.evaluate(exp);
		assertEquals(4,res);
	}

	@Ignore
	public void testEvaluate_Expression09() {
		String exp = "3^2/2 +(4+5)";
		int res;

		res = ev.evaluate(exp);
		assertEquals(13,res);
	}

	@Ignore
	public void testEvaluate_Expression10() {
		String exp = "3^2 + (2^4) +(4+5)";
		int res;

		res = ev.evaluate(exp);
		assertEquals(34,res);
	}

	@Test
	public void testEvaluate_Expression11() {
		String exp = "3+2-9+8*2 + (3+9-8/2)";
		int res;

		res = ev.evaluate(exp);
		assertEquals(20,res);
	}

	@Test
	public void testEvaluate_Expression12() {
		String exp = "2+3-5*((2-3)*2-5*2+3*(2-3-5-5*6)+4/2)*2-9";
		int res;

		res = ev.evaluate(exp);
		assertEquals(1176,res);
	}

	@Ignore
	public void testEvaluate_Expression13() {
		String exp = "39+2-4/2+7-4/2*5-78+5*4+6-4/2^2+6-3*6^4/4*5^3+1";
		int res;

		ExpressionEvaluator ev = new ExpressionEvaluator();
		res = ev.evaluate(exp);
		assertEquals(-121510, res);
	}

	@Ignore
	public void testEvaluate_Expression14() {
		String exp = "4!";
		int res;

		ExpressionEvaluator ev = new ExpressionEvaluator();
		res = ev.evaluate(exp);
		assertEquals(24, res);
	}

	@Ignore
	public void testEvaluate_Expression15() {
		String exp = "4!+3-5!+9*3!/2";
		int res;

		ExpressionEvaluator ev = new ExpressionEvaluator();
		res = ev.evaluate(exp);
		assertEquals(-66, res);
	}

	@Ignore
	public void testEvaluate_Expression16() {
		String exp = "5%2";
		int res;

		ExpressionEvaluator ev = new ExpressionEvaluator();
		res = ev.evaluate(exp);
		assertEquals(1, res);
	}

	@Ignore
	public void testEvaluate_Expression17() {
		String exp = "2+3-7*4/(10%4)*4!";
		int res;

		ExpressionEvaluator ev = new ExpressionEvaluator();
		res = ev.evaluate(exp);
		assertEquals(-331, res);
	}

}