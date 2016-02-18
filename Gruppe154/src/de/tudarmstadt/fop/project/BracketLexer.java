package de.tudarmstadt.fop.project;

import de.tudarmstadt.fop.project.parser.Lexer;
import de.tudarmstadt.fop.project.parser.ParseException;
import de.tudarmstadt.fop.project.parser.Token;
import de.tudarmstadt.fop.project.parser.tokens.EofToken;
import de.tudarmstadt.fop.project.parser.tokens.LeftBracketToken;
import de.tudarmstadt.fop.project.parser.tokens.RightBracketToken;

public class BracketLexer extends Lexer {

	public BracketLexer(String input) {
		super(input);
	}

	@Override
	public Token nextToken() throws ParseException {

		if ('(' == la || ')' == la) {
			if ('(' == la) {
				this.consume();
				return new LeftBracketToken();
			} else {
				this.consume();
				return new RightBracketToken();
			}
		} else {
			if (la == EOF)
				return new EofToken();
			else {
				
					throw new ParseException("Ende des Eingabestrings erreicht");
			}
		}

	}

}
