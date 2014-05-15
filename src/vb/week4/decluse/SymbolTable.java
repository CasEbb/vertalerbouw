package vb.week4.decluse;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {
	
	private Map<String, Stack<Attribute>> symtab;
	
	private Stack<List<String>> scopeStack;
	
	public SymbolTable() {
		symtab     = new HashMap<String, Stack<Attribute>>();
		scopeStack = new Stack<List<String>>();
	}
	
	public void openScope() {
		scopeStack.push(new ArrayList<String>());
	}
	
	public void closeScope() {
		for(String id : scopeStack.pop()) {
			symtab.get(id).pop();
		}
	}
	
	public void enter(String id, Attribute attr) throws DeclException {
		if(scopeStack.contains(id)) {
			throw new DeclException("(" + id + ")  already declared on level " + currentLevel());
		}
		
		if(symtab.containsKey(id)) {
			symtab.get(id).push(attr);
		} else {
			Stack<Attribute> attrs = new Stack<Attribute>();
			attrs.push(attr);
			symtab.put(id, attrs);
		}
		
		scopeStack.peek().add(id);
	}
	
	public Attribute retrieve(String id) throws DeclException {
		try {
			return symtab.get(id).peek();
		} catch(EmptyStackException e) {
			throw new DeclException("(" + id + ") retrieved but not declared");
		}
	}
	
	public int currentLevel() {
		return scopeStack.size();
	}

}
