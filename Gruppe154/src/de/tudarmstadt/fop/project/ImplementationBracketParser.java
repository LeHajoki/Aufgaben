package de.tudarmstadt.fop.project;

import de.tudarmstadt.fop.project.bracket.BracketParser;
import de.tudarmstadt.fop.project.parser.Lexer;
import de.tudarmstadt.fop.project.parser.ParseException;
import de.tudarmstadt.fop.project.parser.Parser;
import de.tudarmstadt.fop.project.parser.tokens.EofToken;
import de.tudarmstadt.fop.project.parser.tokens.LeftBracketToken;
import de.tudarmstadt.fop.project.parser.tokens.RightBracketToken;

public class ImplementationBracketParser extends Parser implements BracketParser {

	public ImplementationBracketParser(Lexer lexer) {
		super(lexer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isCorrectlyNested() throws ParseException {
		int zaehlerfuerklammerauf = 0;
		int zaehlerfuerklammerzu = 0;
		while (!(la instanceof EofToken)) {

			if (la instanceof LeftBracketToken) {
				zaehlerfuerklammerauf++;
			}
			else if (la instanceof RightBracketToken) {
				zaehlerfuerklammerzu++;
				if (zaehlerfuerklammerauf < zaehlerfuerklammerzu) {
					new ParseException("ok");
				}
			} else {
				new ParseException("Ungueltiges Zeichen");
			}
			consume();
		}

		return (zaehlerfuerklammerauf == zaehlerfuerklammerzu);
	}
}
