package hoken.ast;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;

/**
 * Adaptor voor het genereren van AST nodes voor de taal Høken.
 * 
 */
public class HokenNodeAdaptor extends CommonTreeAdaptor {

	public Object dupNode(Object t) {
		if (t == null)
			return null;
		return create(((HokenNode) t).token);
	}

	public Object create(Token payload) {
		return new HokenNode(payload);
	}

}
