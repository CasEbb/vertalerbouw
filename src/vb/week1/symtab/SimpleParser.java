package vb.week1.symtab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleParser {
	
	private int level = -1;
	private String content;
	
	public SimpleParser(String content) {
		this.content = content;
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
				this.level++;
			} else if (token.equals(")")) {
				this.level--;
			} else {
				while(token.charAt(0) == '(') {
					this.level++;
					token = token.substring(1);
				}
				
				int currentLevel = this.level;
				
				while(token.length() > 0 && token.charAt(token.length()-1) == ')') {
					this.level--;
					token = token.substring(0, token.length()-1);
				}
				
				if(token.length() > 1) {
					String opCode = token.substring(0, 2);
					if(opCode.equals("D:")) {
						token = token.substring(2);
						System.out.println("[DECL]  Level " + currentLevel + " declared " + token);
					} else if(opCode.equals("U:")) {
						token = token.substring(2);
						System.out.println("[USE]   Level " + currentLevel + " used " + token);
					} else {
						System.err.println("[ERROR] Unknown token: " + token);
					}
				} else if(token.length() > 0) {
					System.err.println("[ERROR] Unknown token: " + token + token.length());
				}
			}
		}
		
		if(this.level != -1) {
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
            new SimpleParser(readFile(args[i])).parse();
        }
	}

}
