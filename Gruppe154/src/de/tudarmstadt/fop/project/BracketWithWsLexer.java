package de.tudarmstadt.fop.project;

import de.tudarmstadt.fop.project.parser.ParseException;
import de.tudarmstadt.fop.project.parser.Token;

public class BracketWithWsLexer extends BracketLexer {

	public BracketWithWsLexer(String input) {
		super(input);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Token nextToken() throws ParseException {
		try {
			return super.nextToken();

		} catch (ParseException lol) {
			if (la == ' ') {
				consume();
			} else {
				if (la == '\t') {
					consume();
				} else {
					if (la == '\r') {
						consume();
					} else {
						if (la == '\n') {
							consume();
						} else {
							throw new ParseException("F");
						}
					}
				}
			}
		}
		return nextToken();
	}

}
