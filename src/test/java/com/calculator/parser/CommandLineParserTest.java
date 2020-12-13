package com.calculator.parser;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CommandLineParserTest {
	private CommandLineParser parser;

	@Before
	public void setUp() {
		parser = new CommandLineParser();
	}

	@Test
	public void testExpressionParse_success() throws IOException {
		String [] args = new String[2];
		args[0] = "-e";
		args[1] = "\"4 + 5 + 6 \"";
		parser.parse(args);
		assertEquals(args[1], parser.getExpression());

	}
}
