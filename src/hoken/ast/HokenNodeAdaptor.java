package hoken.ast;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;

public class HokenNodeAdaptor extends CommonTreeAdaptor {

	@Override
	public Object dupNode(Object t) {
		if (t == null)
			return null;
		return create(((HokenNode) t).token);
	}

	@Override
	public Object create(Token payload) {
		return new HokenNode(payload);
	}

}
