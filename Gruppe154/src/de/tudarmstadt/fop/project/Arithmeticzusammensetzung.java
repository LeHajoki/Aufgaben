package de.tudarmstadt.fop.project;

import java.math.BigDecimal;

import de.tudarmstadt.fop.project.arithmetic.ArithmeticExpression;
import de.tudarmstadt.fop.project.arithmetic.ArithmeticOperand;
import de.tudarmstadt.fop.project.parser.tokens.ArithmeticOperatorToken;

public class Arithmeticzusammensetzung extends ArithmeticExpression implements ArithmeticOperand {

	public Arithmeticzusammensetzung(ArithmeticOperatorToken operator, ArithmeticOperand left,
			ArithmeticOperand right) {
		super(operator, left, right);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public BigDecimal getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
