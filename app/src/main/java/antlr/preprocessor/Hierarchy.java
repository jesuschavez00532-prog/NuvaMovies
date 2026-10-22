package antlr.preprocessor;

import antlr.ANTLRException;
import antlr.TokenStreamException;
import antlr.collections.impl.IndexedVector;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class Hierarchy {
    protected Grammar LexerRoot;
    protected Grammar ParserRoot;
    protected Grammar TreeParserRoot;
    protected antlr.Tool antlrTool;
    protected Hashtable symbols = new Hashtable(10);
    protected Hashtable files = new Hashtable(10);

    public Hierarchy(antlr.Tool tool) {
        this.LexerRoot = null;
        this.ParserRoot = null;
        this.TreeParserRoot = null;
        this.antlrTool = tool;
        this.LexerRoot = new Grammar(tool, "Lexer", null, null);
        this.ParserRoot = new Grammar(tool, "Parser", null, null);
        this.TreeParserRoot = new Grammar(tool, "TreeParser", null, null);
        this.LexerRoot.setPredefined(true);
        this.ParserRoot.setPredefined(true);
        this.TreeParserRoot.setPredefined(true);
        this.symbols.put(this.LexerRoot.getName(), this.LexerRoot);
        this.symbols.put(this.ParserRoot.getName(), this.ParserRoot);
        this.symbols.put(this.TreeParserRoot.getName(), this.TreeParserRoot);
    }

    public static String optionsToString(IndexedVector indexedVector) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("options {");
        stringBuffer.append(System.getProperty("line.separator"));
        String stringBuffer2 = stringBuffer.toString();
        Enumeration elements = indexedVector.elements();
        while (elements.hasMoreElements()) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(stringBuffer2);
            stringBuffer3.append((Option) elements.nextElement());
            stringBuffer3.append(System.getProperty("line.separator"));
            stringBuffer2 = stringBuffer3.toString();
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(stringBuffer2);
        stringBuffer4.append("}");
        stringBuffer4.append(System.getProperty("line.separator"));
        stringBuffer4.append(System.getProperty("line.separator"));
        return stringBuffer4.toString();
    }

    public void addGrammar(Grammar grammar) {
        grammar.setHierarchy(this);
        this.symbols.put(grammar.getName(), grammar);
        getFile(grammar.getFileName()).addGrammar(grammar);
    }

    public void addGrammarFile(GrammarFile grammarFile) {
        this.files.put(grammarFile.getName(), grammarFile);
    }

    public void expandGrammarsInFile(String str) {
        Enumeration elements = getFile(str).getGrammars().elements();
        while (elements.hasMoreElements()) {
            ((Grammar) elements.nextElement()).expandInPlace();
        }
    }

    public Grammar findRoot(Grammar grammar) {
        if (grammar.getSuperGrammarName() == null) {
            return grammar;
        }
        Grammar superGrammar = grammar.getSuperGrammar();
        if (superGrammar == null) {
            return grammar;
        }
        return findRoot(superGrammar);
    }

    public GrammarFile getFile(String str) {
        return (GrammarFile) this.files.get(str);
    }

    public Grammar getGrammar(String str) {
        return (Grammar) this.symbols.get(str);
    }

    public antlr.Tool getTool() {
        return this.antlrTool;
    }

    public void readGrammarFile(String str) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
        addGrammarFile(new GrammarFile(this.antlrTool, str));
        PreprocessorLexer preprocessorLexer = new PreprocessorLexer(bufferedReader);
        preprocessorLexer.setFilename(str);
        Preprocessor preprocessor = new Preprocessor(preprocessorLexer);
        preprocessor.setTool(this.antlrTool);
        preprocessor.setFilename(str);
        try {
            preprocessor.grammarFile(this, str);
        } catch (TokenStreamException e10) {
            antlr.Tool tool = this.antlrTool;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Token stream error reading grammar(s):\n");
            stringBuffer.append(e10);
            tool.toolError(stringBuffer.toString());
        } catch (ANTLRException e11) {
            antlr.Tool tool2 = this.antlrTool;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("error reading grammar(s):\n");
            stringBuffer2.append(e11);
            tool2.toolError(stringBuffer2.toString());
        }
    }

    public void setTool(antlr.Tool tool) {
        this.antlrTool = tool;
    }

    public boolean verifyThatHierarchyIsComplete() {
        Enumeration elements = this.symbols.elements();
        boolean z10 = true;
        while (elements.hasMoreElements()) {
            Grammar grammar = (Grammar) elements.nextElement();
            if (grammar.getSuperGrammarName() != null && grammar.getSuperGrammar() == null) {
                antlr.Tool tool = this.antlrTool;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("grammar ");
                stringBuffer.append(grammar.getSuperGrammarName());
                stringBuffer.append(" not defined");
                tool.toolError(stringBuffer.toString());
                this.symbols.remove(grammar.getName());
                z10 = false;
            }
        }
        if (!z10) {
            return false;
        }
        Enumeration elements2 = this.symbols.elements();
        while (elements2.hasMoreElements()) {
            Grammar grammar2 = (Grammar) elements2.nextElement();
            if (grammar2.getSuperGrammarName() != null) {
                grammar2.setType(findRoot(grammar2).getName());
            }
        }
        return true;
    }
}
