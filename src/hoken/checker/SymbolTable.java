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

/**
 * Een symbol table om tijdens de contextuele analyse bij te houden welke
 * identifiers er in welke scope gedefinieerd zijn.
 * 
 */
public class SymbolTable {

	/** De daadwerkelijke symbol table **/
	private Map<String, Stack<DeclarationNode>> symtab;
	/** Stack met lijsten van op dit niveau gedefinieerde identifiers **/
	private Stack<List<String>> scopeStack;

	/**
	 * Maakt een nieuwe en lege <code>SymbolTable</code> aan.
	 */
	public SymbolTable() {
		this.symtab = new HashMap<String, Stack<DeclarationNode>>();
		this.scopeStack = new Stack<List<String>>();
	}

	/**
	 * Opent een nieuwe scope.
	 */
	public void openScope() {
		this.scopeStack.push(new ArrayList<String>());
	}

	/**
	 * Sluit de hoogste (huidige) scope.
	 */
	public void closeScope() {
		for (String id : this.scopeStack.pop()) {
			symtab.get(id).pop();
		}
	}

	/**
	 * Voegt een nieuwe identifier toe aan de symbol table.
	 * 
	 * @param id
	 *            De naam van de identifier
	 * @param attr
	 *            De <code>DeclarationNode</code> waar deze identifier wordt
	 *            gedeclareerd
	 * @throws HokenException
	 *             als de identifier al bestaat op dit niveau
	 */
	public void enter(String id, DeclarationNode attr) throws HokenException {
		if (this.scopeStack.peek().contains(id)) {
			throw new HokenException(attr, "Dubbele declaratie van (" + id
					+ ")!");
		} else {
			if (!this.symtab.containsKey(id)) {
				this.symtab.put(id, new Stack<DeclarationNode>());
			}
			this.symtab.get(id).push(attr);
			this.scopeStack.peek().add(id);
		}
	}

	/**
	 * Geeft op basis van een node uit de AST de node terug waarin deze
	 * identifier is gedeclareerd mits deze bestaat.
	 * 
	 * @param tree
	 *            De AST node waarvoor de declaratie moet worden opgezocht
	 * @return De declaratie voor de gegeven AST node
	 * @throws RecognitionException
	 *             als de opgegeven node verwijst naar een niet bestaande
	 *             identifier
	 */
	public DeclarationNode retrieve(Tree tree) throws HokenException {
		try {
			return this.symtab.get(tree.getText()).peek();
		} catch (EmptyStackException | NullPointerException e) {
			throw new HokenException(tree, "Onbekende identifier: ("
					+ tree.getText() + ")");
		}
	}

}
