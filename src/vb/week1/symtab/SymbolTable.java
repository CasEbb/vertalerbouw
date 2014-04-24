package vb.week1.symtab;

import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;

public class SymbolTable<Entry extends IdEntry> {
	private int level;
	private Map<String, Stack<Entry>> table;
	
    /**
     * Constructor.
     * @ensures  this.currentLevel() == -1
     */
    public SymbolTable() {
        this.level = -1;
        this.table = new HashMap<>();
    }

    /**
     * Opens a new scope.
     * @ensures this.currentLevel() == old.currentLevel()+1;
     */
    public void openScope()  {
        this.level++;
    }

    /**
     * Closes the current scope. All identifiers in
     * the current scope will be removed from the SymbolTable.
     * @requires old.currentLevel() > -1;
     * @ensures  this.currentLevel() == old.currentLevel()-1;
     */
    public void closeScope() {
        this.level--;
        for(Stack<Entry> entries : table.values()) {
        	Stack<Entry> entriez = new Stack<Entry>();
        	for(Entry e : entries) entriez.add(e);
        	
        	ListIterator<Entry> i = entriez.listIterator();
        	while(i.hasNext()) {
        		Entry e = i.next();
        		if(e.getLevel() > this.level){
        			entries.remove(e);
        		}
        	}
        }
    }

    /** Returns the current scope level. */
    public int currentLevel() {
        return this.level;
    }

    /**
     * Enters an id together with an entry into this SymbolTable
     * using the current scope level. The entry's level is set to
     * currentLevel().
     * @requires id != null && id.length() > 0 && entry != null;
     * @ensures  this.retrieve(id).getLevel() == currentLevel();
     * @throws SymbolTableException when there is no valid
     *    current scope level, or when the id is already declared
     *    on the current level.
     */
    public void enter(String id, Entry entry)
            throws SymbolTableException {
    	if(currentLevel() < 0) {
    		throw new SymbolTableException("no valid current scope level");
    	}
    	
        if(table.containsKey(id)) {
        	Stack<Entry> entries = table.get(id);
        	for(Entry e : entries) {
        		if(e.getLevel() == currentLevel()) {
        			throw new SymbolTableException(id + " already declared on current level");
        		}
        	}
        	entry.setLevel(currentLevel());
        	entries.push(entry);
        } else {
        	Stack<Entry> entries = new Stack<Entry>();
        	table.put(id, entries);
        	entry.setLevel(currentLevel());
        	entries.push(entry);
        }
        
        System.out.println("D:" + id + " on level " + currentLevel());
    }

    /**
     * Get the Entry corresponding with id whose level is
     * the highest; in other words, that is defined last.
     * @return  Entry of this id on the highest level
     *          null if this SymbolTable does not contain id
     */
    public Entry retrieve(String id) {
    	if(table.containsKey(id)) {
    		Stack<Entry> entries = table.get(id);
    		if(entries.size() > 0) {
	    		Entry e = entries.peek();
	    		System.out.println("U:" + id + " on level " + currentLevel() + ", declared on level " + e.getLevel());
	    		return e;
    		} else {
        		System.out.println("U:" + id + " on level " + currentLevel() + ", *undeclared*");
    			return null;
    		}
    	} else {
    		System.out.println("U:" + id + " on level " + currentLevel() + ", *undeclared*");
    		return null;
    	}
    }
}

/** Exception class to signal problems with the SymbolTable */
class SymbolTableException extends Exception {
    /** {@link serialVersionUID} is required for Serializable */
    public static final long serialVersionUID = 24362462L;
    public SymbolTableException(String msg) { super(msg); }
}
