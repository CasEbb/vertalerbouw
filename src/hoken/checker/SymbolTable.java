package hoken.checker;

import hoken.HokenException;
import hoken.ast.DeclarationNode;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

public class SymbolTable {

	private Map<String, Stack<DeclarationNode>> symtab;
	private Stack<List<String>> scopeStack;

	public SymbolTable() {
		this.symtab = new HashMap<String, Stack<DeclarationNode>>();
		this.scopeStack = new Stack<List<String>>();
	}

	public void openScope() {
		this.scopeStack.push(new ArrayList<String>());
	}

	public void closeScope() {
		for (String id : this.scopeStack.pop()) {
			symtab.get(id).pop();
		}
	}

	public void enter(String id, DeclarationNode attr)
			throws RecognitionException {
		if (this.scopeStack.peek().contains(id)) {
			throw new HokenException(attr, "Dubbele declaratie van (" + id + ")!");
		} else {
			if (!this.symtab.containsKey(id)) {
				this.symtab.put(id, new Stack<DeclarationNode>());
			}
			this.symtab.get(id).push(attr);
			this.scopeStack.peek().add(id);
		}
	}

	public DeclarationNode retrieve(Tree tree) throws RecognitionException {
		try {
			return this.symtab.get(tree.getText()).peek();
		} catch (EmptyStackException | NullPointerException e) {
			throw new HokenException(tree, "Onbekende identifier: (" + tree.getText() + ")");
		}
	}

}
