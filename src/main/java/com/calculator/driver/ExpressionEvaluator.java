package com.calculator.driver;

import java.util.Stack;
import java.util.StringTokenizer;

import com.calculator.operators.Operator;
import com.calculator.operators.OperatorType;

/**
 * <h1>This is the class responsible for evaluating expression.</h1>
 * <p>For example- expression - 4 * 5 + (93 -2) </p>
 * @author DELL
 *
 */
public class ExpressionEvaluator {
	private Stack<Operand> operandStack = new Stack<>();
	private Stack<Operator<Operand>> operatorStack = new Stack<>();
	private static final String DELIMITERS = OperatorType.getAllOperators();

	/**
	 * @param expression which will be evaluated
	 * @return evaluated value
	 * @throws {@link EvaluationException} when parsed token from expression is not valid.
	 */
	public int evaluate(String expression) {
		StringTokenizer tokenizer = new StringTokenizer(expression, DELIMITERS , true);

		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (" ".equals(token)) {
				continue;
			}
			if (Operand.isValid(token)) {
				operandStack.push(new Operand(token));
			} else {
				if (!OperatorType.isValid(token)) {
					throw new EvaluationException("Operator " + token + " is not supported.");
				}

				Operator<Operand> currOperator = OperatorType.getOperator(token);
				if (token.equals("(")) {
					operatorStack.push(currOperator);
					continue;
				} else if (token.equals(")")) {
					while (operatorStack.peek().getPriority() != 0) {
						process(operatorStack.pop());
					}
					operatorStack.pop();
					continue;
				}

				while (!operatorStack.isEmpty() && operatorStack.peek().getPriority() >= currOperator.getPriority()) {
					process(operatorStack.pop());
				}

				operatorStack.push(currOperator);
			}
		}


		while (!operatorStack .isEmpty()) {
			process(operatorStack.pop());
		}

		return operandStack.pop().getValue();
	}

	/**
	 * Apply the operator op on earlier processed operand and store the result back in operand stack.
	 * @param op operator to be applied on earlier processed operands.
	 * 
	 */
	private void process(Operator<Operand> op) {
		Operand op2 = operandStack.pop();
		operandStack.push(op.apply(operandStack.pop(), op2));
	}
}
