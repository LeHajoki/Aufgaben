package de.tudarmstadt.fop.project;

import de.tudarmstadt.fop.project.arithmetic.ArithmeticExpression;
import de.tudarmstadt.fop.project.arithmetic.ArithmeticOperand;
import de.tudarmstadt.fop.project.arithmetic.ArithmeticParser;
import de.tudarmstadt.fop.project.bracket.BracketParser;
import de.tudarmstadt.fop.project.expression.ExpressionParser;
import de.tudarmstadt.fop.project.parser.Lexer;
import de.tudarmstadt.fop.project.parser.tokens.DecimalToken;
import de.tudarmstadt.fop.project.parser.tokens.IntegerToken;
import de.tudarmstadt.fop.project.soccer.parser.SoccerParser;

public class FactoryIM implements Factory {

	@Override
	public Lexer instantiateBracketLexer(String input) {
		return new BracketLexer(input);
	}

	@Override
	public BracketParser instantiateBracketParser(Lexer lexer) {
		return new ImplementationBracketParser(lexer);
	}

	@Override
	public Lexer instantiateBracketWithWsLexer(String input) {
		return new BracketWithWsLexer(input);
	}

	@Override
	public Lexer instantiateIntegerArithmeticLexer(String input) {
		// TODO Auto-generated method stub
		return new ArithmeticLexer(input);
	}

	@Override
	public ArithmeticOperand instantiateIntegerOperand(IntegerToken token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArithmeticOperand instantiateCompositeOperand(ArithmeticExpression expr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArithmeticParser instantiateIntegerArithmeticParser(Lexer lexer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArithmeticOperand instantiateDecimalOperand(DecimalToken token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lexer instantiateDecimalArithmeticLexer(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArithmeticParser instantiateDecimalArithmeticParser(Lexer lexer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lexer instantiateExpressionLexer(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExpressionParser instantiateExpressionParser(Lexer lexer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SoccerParser instantiateSoccerParser(Lexer lexer) {
		// TODO Auto-generated method stub
		return null;
	}

}
