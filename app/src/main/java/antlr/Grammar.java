package antlr;

import antlr.collections.impl.Vector;
import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes.dex */
public abstract class Grammar {
    protected Tool antlrTool;
    protected String className;
    protected CodeGenerator generator;
    protected String superClass;
    protected LLkGrammarAnalyzer theLLkAnalyzer;
    protected TokenManager tokenManager;
    protected boolean buildAST = false;
    protected boolean analyzerDebug = false;
    protected boolean interactive = false;
    protected String exportVocab = null;
    protected String importVocab = null;
    protected Token preambleAction = new CommonToken(0, "");
    protected String fileName = null;
    protected Token classMemberAction = new CommonToken(0, "");
    protected boolean hasSyntacticPredicate = false;
    protected boolean hasUserErrorHandling = false;
    protected int maxk = 1;
    protected boolean traceRules = false;
    protected boolean debuggingOutput = false;
    protected boolean defaultErrorHandler = true;
    protected String comment = null;
    protected Hashtable symbols = new Hashtable();
    protected Hashtable options = new Hashtable();
    protected Vector rules = new Vector(100);

    public Grammar(String str, Tool tool, String str2) {
        this.superClass = null;
        this.className = null;
        this.className = str;
        this.antlrTool = tool;
        this.superClass = str2;
    }

    public void define(RuleSymbol ruleSymbol) {
        this.rules.appendElement(ruleSymbol);
        this.symbols.put(ruleSymbol.getId(), ruleSymbol);
    }

    public abstract void generate();

    /* JADX INFO: Access modifiers changed from: protected */
    public String getClassName() {
        return this.className;
    }

    public boolean getDefaultErrorHandler() {
        return this.defaultErrorHandler;
    }

    public String getFilename() {
        return this.fileName;
    }

    public int getIntegerOption(String str) {
        Token token = (Token) this.options.get(str);
        if (token != null && token.getType() == 20) {
            return Integer.parseInt(token.getText());
        }
        throw new NumberFormatException();
    }

    public Token getOption(String str) {
        return (Token) this.options.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String getSuperClass();

    public GrammarSymbol getSymbol(String str) {
        return (GrammarSymbol) this.symbols.get(str);
    }

    public Enumeration getSymbols() {
        return this.symbols.elements();
    }

    public boolean hasOption(String str) {
        return this.options.containsKey(str);
    }

    public boolean isDefined(String str) {
        return this.symbols.containsKey(str);
    }

    public abstract void processArguments(String[] strArr);

    public void setCodeGenerator(CodeGenerator codeGenerator) {
        this.generator = codeGenerator;
    }

    public void setFilename(String str) {
        this.fileName = str;
    }

    public void setGrammarAnalyzer(LLkGrammarAnalyzer lLkGrammarAnalyzer) {
        this.theLLkAnalyzer = lLkGrammarAnalyzer;
    }

    public boolean setOption(String str, Token token) {
        this.options.put(str, token);
        String text = token.getText();
        if (str.equals("k")) {
            try {
                int integerOption = getIntegerOption("k");
                this.maxk = integerOption;
                if (integerOption <= 0) {
                    Tool tool = this.antlrTool;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("option 'k' must be greater than 0 (was ");
                    stringBuffer.append(token.getText());
                    stringBuffer.append(")");
                    tool.error(stringBuffer.toString(), getFilename(), token.getLine(), token.getColumn());
                    this.maxk = 1;
                }
            } catch (NumberFormatException unused) {
                Tool tool2 = this.antlrTool;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("option 'k' must be an integer (was ");
                stringBuffer2.append(token.getText());
                stringBuffer2.append(")");
                tool2.error(stringBuffer2.toString(), getFilename(), token.getLine(), token.getColumn());
            }
            return true;
        }
        if (str.equals("codeGenMakeSwitchThreshold")) {
            try {
                getIntegerOption("codeGenMakeSwitchThreshold");
            } catch (NumberFormatException unused2) {
                this.antlrTool.error("option 'codeGenMakeSwitchThreshold' must be an integer", getFilename(), token.getLine(), token.getColumn());
            }
            return true;
        }
        if (str.equals("codeGenBitsetTestThreshold")) {
            try {
                getIntegerOption("codeGenBitsetTestThreshold");
            } catch (NumberFormatException unused3) {
                this.antlrTool.error("option 'codeGenBitsetTestThreshold' must be an integer", getFilename(), token.getLine(), token.getColumn());
            }
            return true;
        }
        if (str.equals("defaultErrorHandler")) {
            if (text.equals("true")) {
                this.defaultErrorHandler = true;
            } else if (text.equals("false")) {
                this.defaultErrorHandler = false;
            } else {
                this.antlrTool.error("Value for defaultErrorHandler must be true or false", getFilename(), token.getLine(), token.getColumn());
            }
            return true;
        }
        if (str.equals("analyzerDebug")) {
            if (text.equals("true")) {
                this.analyzerDebug = true;
            } else if (text.equals("false")) {
                this.analyzerDebug = false;
            } else {
                this.antlrTool.error("option 'analyzerDebug' must be true or false", getFilename(), token.getLine(), token.getColumn());
            }
            return true;
        }
        if (str.equals("codeGenDebug")) {
            if (text.equals("true")) {
                this.analyzerDebug = true;
            } else if (text.equals("false")) {
                this.analyzerDebug = false;
            } else {
                this.antlrTool.error("option 'codeGenDebug' must be true or false", getFilename(), token.getLine(), token.getColumn());
            }
            return true;
        }
        if (str.equals("classHeaderSuffix") || str.equals("classHeaderPrefix") || str.equals("namespaceAntlr") || str.equals("namespaceStd") || str.equals("genHashLines") || str.equals("noConstructors")) {
            return true;
        }
        return false;
    }

    public void setTokenManager(TokenManager tokenManager) {
        this.tokenManager = tokenManager;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(20000);
        Enumeration elements = this.rules.elements();
        while (elements.hasMoreElements()) {
            RuleSymbol ruleSymbol = (RuleSymbol) elements.nextElement();
            if (!ruleSymbol.f4237id.equals("mnextToken")) {
                stringBuffer.append(ruleSymbol.getBlock().toString());
                stringBuffer.append("\n\n");
            }
        }
        return stringBuffer.toString();
    }
}
