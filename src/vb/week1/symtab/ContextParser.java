package vb.week1.symtab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContextParser {
	
	private String content;
	private SymbolTable<IdEntry> symbolTable;
	
	public ContextParser(String content) {
		this.content = content;
		this.symbolTable = new SymbolTable<IdEntry>();
	}
	
	public void parse() {
		Scanner sc = new Scanner(this.content);
		List<String> tokens = new ArrayList<String>();
		
		while(sc.hasNext()) {
			tokens.add(sc.next());
		}
	
		sc.close();
		parse(tokens);
	}
	
	public void parse(List<String> tokens) {		
		for(String token : tokens) {
			if(token.equals("(")) {
				symbolTable.openScope();
			} else if (token.equals(")")) {
				symbolTable.closeScope();
			} else {
				while(token.charAt(0) == '(') {
					symbolTable.openScope();
					token = token.substring(1);
				}
				
				int scopeCache = 0;
				while(token.length() > 0 && token.charAt(token.length()-1) == ')') {
					scopeCache++;
					token = token.substring(0, token.length()-1);
				}
				
				if(token.length() > 1) {
					String opCode = token.substring(0, 2);
					if(opCode.equals("D:")) {
						token = token.substring(2);
						try {
							symbolTable.enter(token, new IdEntry());
						} catch (SymbolTableException e) {
							System.err.println(e.getMessage());
						}
					} else if(opCode.equals("U:")) {
						token = token.substring(2);
						symbolTable.retrieve(token);
					} else {
						System.err.println("[ERROR] Unknown token: " + token);
					}
				} else if(token.length() > 0) {
					System.err.println("[ERROR] Unknown token: " + token + token.length());
				}
				
				for(int i = 0; i < scopeCache; i++) {
					symbolTable.closeScope();
				}
			}
		}
		
		if(symbolTable.currentLevel() != -1) {
			System.err.println("Incorrect indentation!");
		}
	}

	public static String readFile(String fileName) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();
	    }
	}

	public static void main(String[] args) throws IOException {
        for (int i = 0; i < args.length; i++) {
            new ContextParser(readFile(args[i])).parse();
        }
	}

}
