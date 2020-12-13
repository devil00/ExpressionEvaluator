package com.calculator.driver;

import java.io.IOException;

import com.calculator.parser.CommandLineParser;

public class EvaluatorDriver {

	public static void main(String[] args) throws IOException {
		CommandLineParser parser = new CommandLineParser();
		ExpressionEvaluator evaluator = new ExpressionEvaluator();
		parser.parse(args);
		System.out.println(evaluator.evaluate(parser.getExpression()));
	}
}
