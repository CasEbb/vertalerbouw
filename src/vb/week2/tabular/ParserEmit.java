package vb.week2.tabular;

public class ParserEmit extends Parser {
	
	private StringBuilder html;

	public ParserEmit(Scanner scanner) {
		super(scanner);
		this.html = new StringBuilder();
	}

	@Override
	protected void parseLatexTabular() throws SyntaxError {
		html.append("<html><body>\n");
		super.parseLatexTabular();
		html.append("</body></html>\n");
	}
	
	@Override
	protected void parseRow() throws SyntaxError {
		html.append("<tr>\n");
		super.parseRow();
		html.append("</tr>\n");
	}

	@Override
	protected void parseEntry() throws SyntaxError {
		switch(currentToken.getKind()) {
		case NUM:
		case IDENTIFIER:
			html.append("  <td>" + currentToken.getRepr() + "</td>\n");
			acceptIt();
			break;
		default:
			throw new SyntaxError("Lege entry. Ik heb " + currentToken.getRepr());
		}
	}

	@Override
	protected void parseBeginTabular() throws SyntaxError {
		super.parseBeginTabular();
		html.append("<table border='1'>\n");
	}

	@Override
	protected void parseEndTabular() throws SyntaxError {
		super.parseEndTabular();
		html.append("</table>\n");
	}
	
	public String emit() {
		return html.toString();
	}
}
