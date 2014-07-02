package vb.project;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.antlr.runtime.RecognitionException;

import vb.project.nodes.DeclarationNode;

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
		for(String id : this.scopeStack.pop()) {
			symtab.get(id).pop();
		}
	}
	
	public void enter(String id, DeclarationNode attr) throws RecognitionException {
		if(this.scopeStack.peek().contains(id)) {
			throw new VBException("Dubbele declaratie van (" + id + ")!");
		} else {
			if(!this.symtab.containsKey(id)) {
				this.symtab.put(id, new Stack<DeclarationNode>());
			}
			this.symtab.get(id).push(attr);
			this.scopeStack.peek().add(id);
		}
	}
	
	public DeclarationNode retrieve(String id) throws RecognitionException {
		try {
			return this.symtab.get(id).peek();
		} catch(EmptyStackException | NullPointerException e) {
			throw new VBException("Onbekende identifier: (" + id + ")");
		}
	}

}
