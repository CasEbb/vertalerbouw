package hoken.ast;

public enum Type {
	BOOLEAN("walofneet"), CHARACTER("lettertjen"), INTEGER("getalletjen"), VOID(
			"kroam");

	private String representation;

	private Type(String representation) {
		this.representation = representation;
	}

	public String getRepresentation() {
		return this.representation;
	}

	public static Type getType(String value) {
		for (Type t : values()) {
			if (t.getRepresentation().equalsIgnoreCase(value))
				return t;
		}
		throw new IllegalArgumentException();
	}
}
