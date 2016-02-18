package de.tudarmstadt.fop.project;

import de.tudarmstadt.fop.project.parser.ParseException;
import de.tudarmstadt.fop.project.parser.Token;
import de.tudarmstadt.fop.project.parser.tokens.*;
import de.tudarmstadt.fop.project.parser.tokens.ArithmeticOperatorToken.Type;

public class ArithmeticLexer extends BracketWithWsLexer {

	public ArithmeticLexer(String input) {
		super(input);
	}

	@Override
	public Token nextToken() throws ParseException {
		try {
			return super.nextToken();
		} catch (ParseException hehe) {

			switch (la) {
			case '+':
				consume();
				return new ArithmeticOperatorToken(Type.PLUS);
			// return nextToken();

			case '-':
				consume();
				return new ArithmeticOperatorToken(Type.MINUS);
			// return nextToken();
			case '/':
				consume();
				return new ArithmeticOperatorToken(Type.DIVISION);
			// return nextToken();
			case '*':
				consume();
				return new ArithmeticOperatorToken(Type.TIMES);
			// return nextToken();

			default:
				if (Character.isDigit(la)) {
					String lol = "";
					while (Character.isDigit(la)) {
						lol = lol + la;
						consume();
					}

					return new DecimalToken(Integer.parseInt(lol));

				} else {
					throw new ParseException("keine Zahl");
				}

			}
		}
	}

}
