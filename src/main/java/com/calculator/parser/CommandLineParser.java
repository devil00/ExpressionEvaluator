package com.calculator.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

public class CommandLineParser {
	@Option(name="-e", usage="Input expression to evaluate")
	private String expression;

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	@Argument
	private List<String> arguments = new ArrayList<>();

	public void parse(String[] args) throws IOException {
		CmdLineParser parser = new CmdLineParser(this);

		try {
			// parse the arguments.
			parser.parseArgument(args);
		} catch( CmdLineException e ) {
			//System.err.println(e.getMessage());
			System.err.println("java ExpressionCalculator [options...] arguments...");
			parser.printUsage(System.err);
			return;
		}
	} 
}
