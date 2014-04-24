package vb.week1.wc;

import java.io.IOException;
import java.util.Scanner;

public class WordCountScanner extends WordCount {

	@Override
	public void count() throws IOException {
        this.nChars = this.nWords = this.nLines = 0;
        Scanner sc = new Scanner(this.reader);
        
        while(sc.hasNextLine()) {
        	String line = sc.nextLine();
        	
        	this.nLines++;
        	this.nChars += line.length();
        	
        	Scanner sc2 = new Scanner(sc.nextLine());
        	while(sc2.hasNext()) {
        		sc2.next();
        		this.nWords++;
        	}
        	sc2.close();
        }
        
        sc.close();
	}

	public static void main(String[] args) {
		wcArgs(args, new WordCount());
	}

}
