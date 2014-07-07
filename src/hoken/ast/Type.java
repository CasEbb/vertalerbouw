package hoken.ast;

/**
 * Enumeratie van de typen beschikbaar binnen Høken. De typen bestaan uit een
 * interne naam en de notatie zoals ze in de code gebruikt worden.
 * 
 */
public enum Type {
	BOOLEAN("walofneet"), CHARACTER("lettertjen"), INTEGER("getalletjen"), VOID(
			"kroam");

	/** Notatie zoals in de code **/
	private String representation;

	/**
	 * Maakt een Type aan met een representatie voor in de code.
	 * 
	 * @param representation
	 *            representatie in de code
	 */
	private Type(String representation) {
		this.representation = representation;
	}

	/**
	 * Vraagt de coderepresentatie voor dit type op.
	 * 
	 * @return de coderepresentatie voor dit type
	 */
	public String getRepresentation() {
		return this.representation;
	}

	/**
	 * Bepaalt op basis van de gegeven coderepresentatie het bijbehorende
	 * (interne) type.
	 * 
	 * @param value
	 *            tekst waarvan het type bepaald moet worden
	 * @return het bijbehorende interne type van de gegeven coderepresentatie
	 */
	public static Type getType(String value) {
		for (Type t : values()) {
			if (t.getRepresentation().equalsIgnoreCase(value))
				return t;
		}
		throw new IllegalArgumentException();
	}
}
