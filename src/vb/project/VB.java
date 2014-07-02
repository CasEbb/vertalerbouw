package vb.project;

import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import vb.project.nodes.VBNode;

public class VB {

	public static void main(String[] args) throws Exception {		
		// Create input
		String inputFile = args.length >= 1 ? args[0] : null;
        InputStream in = inputFile == null ? System.in : new FileInputStream(inputFile);
        
        // Tokenize
        VBLexer lexer = new VBLexer(new ANTLRInputStream(in));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Parse into tree
        VBParser parser = new VBParser(tokens);
        parser.setTreeAdaptor(new VBNodeAdaptor());
		VBParser.program_return result = parser.program();
		CommonTree tree = (CommonTree) result.getTree();
		
		// Output DOT
//        DOTTreeGenerator gen = new DOTTreeGenerator();
//        StringTemplate st = gen.toDOT(tree);
//        System.out.println(st);
        
		// Check
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        VBChecker checker = new VBChecker(nodes);
        checker.setTreeAdaptor(new VBNodeAdaptor());
        checker.program();
	}
}

class VBNodeAdaptor extends CommonTreeAdaptor {
    public Object create(Token t) {
        return new VBNode(t);
    }
}