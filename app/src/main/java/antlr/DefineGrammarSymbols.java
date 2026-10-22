package antlr;

import antlr.collections.impl.BitSet;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class DefineGrammarSymbols implements ANTLRGrammarParseBehavior {
    static final String DEFAULT_TOKENMANAGER_NAME = "*default";
    LLkAnalyzer analyzer;
    String[] args;
    protected Grammar grammar;
    protected Tool tool;
    protected Hashtable grammars = new Hashtable();
    protected Hashtable tokenManagers = new Hashtable();
    protected Hashtable headerActions = new Hashtable();
    Token thePreambleAction = new CommonToken(0, "");
    String language = "Java";
    protected int numLexers = 0;
    protected int numParsers = 0;
    protected int numTreeParsers = 0;

    public DefineGrammarSymbols(Tool tool, String[] strArr, LLkAnalyzer lLkAnalyzer) {
        this.tool = tool;
        this.args = strArr;
        this.analyzer = lLkAnalyzer;
    }

    public void _refStringLiteral(Token token, Token token2, int i10, boolean z10) {
        if (!(this.grammar instanceof LexerGrammar)) {
            String text = token.getText();
            if (this.grammar.tokenManager.getTokenSymbol(text) != null) {
                return;
            }
            StringLiteralSymbol stringLiteralSymbol = new StringLiteralSymbol(text);
            stringLiteralSymbol.setTokenType(this.grammar.tokenManager.nextTokenType());
            this.grammar.tokenManager.define(stringLiteralSymbol);
        }
    }

    public void _refToken(Token token, Token token2, Token token3, Token token4, boolean z10, int i10, boolean z11) {
        String text = token2.getText();
        if (!this.grammar.tokenManager.tokenDefined(text)) {
            int nextTokenType = this.grammar.tokenManager.nextTokenType();
            TokenSymbol tokenSymbol = new TokenSymbol(text);
            tokenSymbol.setTokenType(nextTokenType);
            this.grammar.tokenManager.define(tokenSymbol);
        }
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void abortGrammar() {
        Grammar grammar = this.grammar;
        if (grammar != null && grammar.getClassName() != null) {
            this.grammars.remove(this.grammar.getClassName());
        }
        this.grammar = null;
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void beginAlt(boolean z10) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void beginChildList() {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void beginExceptionGroup() {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void beginExceptionSpec(Token token) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void beginSubRule(Token token, Token token2, boolean z10) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void beginTree(Token token) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void defineRuleName(Token token, String str, boolean z10, String str2) {
        RuleSymbol ruleSymbol;
        String text = token.getText();
        if (token.type == 24) {
            text = CodeGenerator.encodeLexerRuleName(text);
            if (!this.grammar.tokenManager.tokenDefined(token.getText())) {
                int nextTokenType = this.grammar.tokenManager.nextTokenType();
                TokenSymbol tokenSymbol = new TokenSymbol(token.getText());
                tokenSymbol.setTokenType(nextTokenType);
                this.grammar.tokenManager.define(tokenSymbol);
            }
        }
        if (this.grammar.isDefined(text)) {
            ruleSymbol = (RuleSymbol) this.grammar.getSymbol(text);
            if (ruleSymbol.isDefined()) {
                Tool tool = this.tool;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("redefinition of rule ");
                stringBuffer.append(text);
                tool.error(stringBuffer.toString(), this.grammar.getFilename(), token.getLine(), token.getColumn());
            }
        } else {
            ruleSymbol = new RuleSymbol(text);
            this.grammar.define(ruleSymbol);
        }
        ruleSymbol.setDefined();
        ruleSymbol.access = str;
        ruleSymbol.comment = str2;
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void defineToken(Token token, Token token2) {
        String str;
        TokenSymbol tokenSymbol;
        String str2 = null;
        if (token != null) {
            str = token.getText();
        } else {
            str = null;
        }
        if (token2 != null) {
            str2 = token2.getText();
        }
        if (str2 != null) {
            StringLiteralSymbol stringLiteralSymbol = (StringLiteralSymbol) this.grammar.tokenManager.getTokenSymbol(str2);
            if (stringLiteralSymbol != null) {
                if (str != null && stringLiteralSymbol.getLabel() == null) {
                    stringLiteralSymbol.setLabel(str);
                    this.grammar.tokenManager.mapToTokenSymbol(str, stringLiteralSymbol);
                } else {
                    Tool tool = this.tool;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Redefinition of literal in tokens {...}: ");
                    stringBuffer.append(str2);
                    tool.warning(stringBuffer.toString(), this.grammar.getFilename(), token2.getLine(), token2.getColumn());
                    return;
                }
            }
            if (str != null && (tokenSymbol = this.grammar.tokenManager.getTokenSymbol(str)) != null) {
                if (tokenSymbol instanceof StringLiteralSymbol) {
                    Tool tool2 = this.tool;
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Redefinition of token in tokens {...}: ");
                    stringBuffer2.append(str);
                    tool2.warning(stringBuffer2.toString(), this.grammar.getFilename(), token2.getLine(), token2.getColumn());
                    return;
                }
                int tokenType = tokenSymbol.getTokenType();
                StringLiteralSymbol stringLiteralSymbol2 = new StringLiteralSymbol(str2);
                stringLiteralSymbol2.setTokenType(tokenType);
                stringLiteralSymbol2.setLabel(str);
                this.grammar.tokenManager.define(stringLiteralSymbol2);
                this.grammar.tokenManager.mapToTokenSymbol(str, stringLiteralSymbol2);
                return;
            }
            StringLiteralSymbol stringLiteralSymbol3 = new StringLiteralSymbol(str2);
            stringLiteralSymbol3.setTokenType(this.grammar.tokenManager.nextTokenType());
            stringLiteralSymbol3.setLabel(str);
            this.grammar.tokenManager.define(stringLiteralSymbol3);
            if (str != null) {
                this.grammar.tokenManager.mapToTokenSymbol(str, stringLiteralSymbol3);
                return;
            }
            return;
        }
        if (this.grammar.tokenManager.tokenDefined(str)) {
            Tool tool3 = this.tool;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Redefinition of token in tokens {...}: ");
            stringBuffer3.append(str);
            tool3.warning(stringBuffer3.toString(), this.grammar.getFilename(), token.getLine(), token.getColumn());
            return;
        }
        int nextTokenType = this.grammar.tokenManager.nextTokenType();
        TokenSymbol tokenSymbol2 = new TokenSymbol(str);
        tokenSymbol2.setTokenType(nextTokenType);
        this.grammar.tokenManager.define(tokenSymbol2);
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void endAlt() {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void endChildList() {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void endExceptionGroup() {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void endExceptionSpec() {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void endGrammar() {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void endOptions() {
        String str;
        Grammar grammar = this.grammar;
        String str2 = grammar.exportVocab;
        if (str2 == null && grammar.importVocab == null) {
            grammar.exportVocab = grammar.getClassName();
            if (this.tokenManagers.containsKey(DEFAULT_TOKENMANAGER_NAME)) {
                this.grammar.exportVocab = DEFAULT_TOKENMANAGER_NAME;
                this.grammar.setTokenManager((TokenManager) this.tokenManagers.get(DEFAULT_TOKENMANAGER_NAME));
                return;
            } else {
                SimpleTokenManager simpleTokenManager = new SimpleTokenManager(this.grammar.exportVocab, this.tool);
                this.grammar.setTokenManager(simpleTokenManager);
                this.tokenManagers.put(this.grammar.exportVocab, simpleTokenManager);
                this.tokenManagers.put(DEFAULT_TOKENMANAGER_NAME, simpleTokenManager);
                return;
            }
        }
        if (str2 == null && grammar.importVocab != null) {
            grammar.exportVocab = grammar.getClassName();
            Grammar grammar2 = this.grammar;
            if (grammar2.importVocab.equals(grammar2.exportVocab)) {
                Tool tool = this.tool;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Grammar ");
                stringBuffer.append(this.grammar.getClassName());
                stringBuffer.append(" cannot have importVocab same as default output vocab (grammar name); ignored.");
                tool.warning(stringBuffer.toString());
                this.grammar.importVocab = null;
                endOptions();
                return;
            }
            if (this.tokenManagers.containsKey(this.grammar.importVocab)) {
                TokenManager tokenManager = (TokenManager) ((TokenManager) this.tokenManagers.get(this.grammar.importVocab)).clone();
                tokenManager.setName(this.grammar.exportVocab);
                tokenManager.setReadOnly(false);
                this.grammar.setTokenManager(tokenManager);
                this.tokenManagers.put(this.grammar.exportVocab, tokenManager);
                return;
            }
            Grammar grammar3 = this.grammar;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(this.grammar.importVocab);
            stringBuffer2.append(CodeGenerator.TokenTypesFileSuffix);
            stringBuffer2.append(CodeGenerator.TokenTypesFileExt);
            ImportVocabTokenManager importVocabTokenManager = new ImportVocabTokenManager(grammar3, stringBuffer2.toString(), this.grammar.exportVocab, this.tool);
            importVocabTokenManager.setReadOnly(false);
            this.tokenManagers.put(this.grammar.exportVocab, importVocabTokenManager);
            this.grammar.setTokenManager(importVocabTokenManager);
            if (!this.tokenManagers.containsKey(DEFAULT_TOKENMANAGER_NAME)) {
                this.tokenManagers.put(DEFAULT_TOKENMANAGER_NAME, importVocabTokenManager);
                return;
            }
            return;
        }
        if (str2 != null && grammar.importVocab == null) {
            if (this.tokenManagers.containsKey(str2)) {
                this.grammar.setTokenManager((TokenManager) this.tokenManagers.get(this.grammar.exportVocab));
                return;
            }
            SimpleTokenManager simpleTokenManager2 = new SimpleTokenManager(this.grammar.exportVocab, this.tool);
            this.grammar.setTokenManager(simpleTokenManager2);
            this.tokenManagers.put(this.grammar.exportVocab, simpleTokenManager2);
            if (!this.tokenManagers.containsKey(DEFAULT_TOKENMANAGER_NAME)) {
                this.tokenManagers.put(DEFAULT_TOKENMANAGER_NAME, simpleTokenManager2);
                return;
            }
            return;
        }
        if (str2 != null && (str = grammar.importVocab) != null) {
            if (str.equals(str2)) {
                Tool tool2 = this.tool;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("exportVocab of ");
                stringBuffer3.append(this.grammar.exportVocab);
                stringBuffer3.append(" same as importVocab; probably not what you want");
                tool2.error(stringBuffer3.toString());
            }
            if (this.tokenManagers.containsKey(this.grammar.importVocab)) {
                TokenManager tokenManager2 = (TokenManager) ((TokenManager) this.tokenManagers.get(this.grammar.importVocab)).clone();
                tokenManager2.setName(this.grammar.exportVocab);
                tokenManager2.setReadOnly(false);
                this.grammar.setTokenManager(tokenManager2);
                this.tokenManagers.put(this.grammar.exportVocab, tokenManager2);
                return;
            }
            Grammar grammar4 = this.grammar;
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(this.grammar.importVocab);
            stringBuffer4.append(CodeGenerator.TokenTypesFileSuffix);
            stringBuffer4.append(CodeGenerator.TokenTypesFileExt);
            ImportVocabTokenManager importVocabTokenManager2 = new ImportVocabTokenManager(grammar4, stringBuffer4.toString(), this.grammar.exportVocab, this.tool);
            importVocabTokenManager2.setReadOnly(false);
            this.tokenManagers.put(this.grammar.exportVocab, importVocabTokenManager2);
            this.grammar.setTokenManager(importVocabTokenManager2);
            if (!this.tokenManagers.containsKey(DEFAULT_TOKENMANAGER_NAME)) {
                this.tokenManagers.put(DEFAULT_TOKENMANAGER_NAME, importVocabTokenManager2);
            }
        }
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void endRule(String str) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void endSubRule() {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void endTree() {
    }

    public String getHeaderAction(String str) {
        Token token = (Token) this.headerActions.get(str);
        if (token == null) {
            return "";
        }
        return token.getText();
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void hasError() {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void noASTSubRule() {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void oneOrMoreSubRule() {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void optionalSubRule() {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refAction(Token token) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refArgAction(Token token) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refCharLiteral(Token token, Token token2, boolean z10, int i10, boolean z11) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refCharRange(Token token, Token token2, Token token3, int i10, boolean z10) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refElementOption(Token token, Token token2) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refExceptionHandler(Token token, Token token2) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refHeaderAction(Token token, Token token2) {
        String stripFrontBack;
        if (token == null) {
            stripFrontBack = "";
        } else {
            stripFrontBack = StringUtils.stripFrontBack(token.getText(), "\"", "\"");
        }
        if (this.headerActions.containsKey(stripFrontBack)) {
            if (stripFrontBack.equals("")) {
                Tool tool = this.tool;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(token2.getLine());
                stringBuffer.append(": header action already defined");
                tool.error(stringBuffer.toString());
            } else {
                Tool tool2 = this.tool;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(token2.getLine());
                stringBuffer2.append(": header action '");
                stringBuffer2.append(stripFrontBack);
                stringBuffer2.append("' already defined");
                tool2.error(stringBuffer2.toString());
            }
        }
        this.headerActions.put(stripFrontBack, token2);
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refInitAction(Token token) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refMemberAction(Token token) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refPreambleAction(Token token) {
        this.thePreambleAction = token;
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refReturnAction(Token token) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refRule(Token token, Token token2, Token token3, Token token4, int i10) {
        String text = token2.getText();
        if (token2.type == 24) {
            text = CodeGenerator.encodeLexerRuleName(text);
        }
        if (!this.grammar.isDefined(text)) {
            this.grammar.define(new RuleSymbol(text));
        }
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refSemPred(Token token) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refStringLiteral(Token token, Token token2, int i10, boolean z10) {
        _refStringLiteral(token, token2, i10, z10);
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refToken(Token token, Token token2, Token token3, Token token4, boolean z10, int i10, boolean z11) {
        _refToken(token, token2, token3, token4, z10, i10, z11);
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refTokenRange(Token token, Token token2, Token token3, int i10, boolean z10) {
        if (token.getText().charAt(0) == '\"') {
            refStringLiteral(token, null, 1, z10);
        } else {
            _refToken(null, token, null, null, false, 1, z10);
        }
        if (token2.getText().charAt(0) == '\"') {
            _refStringLiteral(token2, null, 1, z10);
        } else {
            _refToken(null, token2, null, null, false, 1, z10);
        }
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refTokensSpecElementOption(Token token, Token token2, Token token3) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refTreeSpecifier(Token token) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void refWildcard(Token token, Token token2, int i10) {
    }

    public void reset() {
        this.grammar = null;
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void setArgOfRuleRef(Token token) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void setCharVocabulary(BitSet bitSet) {
        ((LexerGrammar) this.grammar).setCharVocabulary(bitSet);
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void setFileOption(Token token, Token token2, String str) {
        if (token.getText().equals("language")) {
            if (token2.getType() == 6) {
                this.language = StringUtils.stripBack(StringUtils.stripFront(token2.getText(), '\"'), '\"');
                return;
            } else if (token2.getType() != 24 && token2.getType() != 41) {
                this.tool.error("language option must be string or identifier", str, token2.getLine(), token2.getColumn());
                return;
            } else {
                this.language = token2.getText();
                return;
            }
        }
        if (token.getText().equals("mangleLiteralPrefix")) {
            if (token2.getType() == 6) {
                Tool.literalsPrefix = StringUtils.stripFrontBack(token2.getText(), "\"", "\"");
                return;
            } else {
                this.tool.error("mangleLiteralPrefix option must be string", str, token2.getLine(), token2.getColumn());
                return;
            }
        }
        if (token.getText().equals("upperCaseMangledLiterals")) {
            if (token2.getText().equals("true")) {
                Tool.upperCaseMangledLiterals = true;
                return;
            } else if (token2.getText().equals("false")) {
                Tool.upperCaseMangledLiterals = false;
                return;
            } else {
                this.grammar.antlrTool.error("Value for upperCaseMangledLiterals must be true or false", str, token.getLine(), token.getColumn());
                return;
            }
        }
        if (!token.getText().equals("namespaceStd") && !token.getText().equals("namespaceAntlr") && !token.getText().equals("genHashLines")) {
            if (token.getText().equals("namespace")) {
                if (!this.language.equals("Cpp") && !this.language.equals("CSharp")) {
                    Tool tool = this.tool;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(token.getText());
                    stringBuffer.append(" option only valid for C++ and C# (a.k.a CSharp)");
                    tool.error(stringBuffer.toString(), str, token.getLine(), token.getColumn());
                    return;
                }
                if (token2.getType() != 6) {
                    Tool tool2 = this.tool;
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(token.getText());
                    stringBuffer2.append(" option must be a string");
                    tool2.error(stringBuffer2.toString(), str, token2.getLine(), token2.getColumn());
                    return;
                }
                if (token.getText().equals("namespace")) {
                    this.tool.setNameSpace(token2.getText());
                    return;
                }
                return;
            }
            Tool tool3 = this.tool;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Invalid file-level option: ");
            stringBuffer3.append(token.getText());
            tool3.error(stringBuffer3.toString(), str, token.getLine(), token2.getColumn());
            return;
        }
        if (!this.language.equals("Cpp")) {
            Tool tool4 = this.tool;
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(token.getText());
            stringBuffer4.append(" option only valid for C++");
            tool4.error(stringBuffer4.toString(), str, token.getLine(), token.getColumn());
            return;
        }
        if (token.getText().equals("noConstructors")) {
            if (!token2.getText().equals("true") && !token2.getText().equals("false")) {
                this.tool.error("noConstructors option must be true or false", str, token2.getLine(), token2.getColumn());
            }
            this.tool.noConstructors = token2.getText().equals("true");
            return;
        }
        if (token.getText().equals("genHashLines")) {
            if (!token2.getText().equals("true") && !token2.getText().equals("false")) {
                this.tool.error("genHashLines option must be true or false", str, token2.getLine(), token2.getColumn());
            }
            this.tool.genHashLines = token2.getText().equals("true");
            return;
        }
        if (token2.getType() != 6) {
            Tool tool5 = this.tool;
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(token.getText());
            stringBuffer5.append(" option must be a string");
            tool5.error(stringBuffer5.toString(), str, token2.getLine(), token2.getColumn());
            return;
        }
        if (token.getText().equals("namespaceStd")) {
            this.tool.namespaceStd = token2.getText();
        } else if (token.getText().equals("namespaceAntlr")) {
            this.tool.namespaceAntlr = token2.getText();
        }
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void setGrammarOption(Token token, Token token2) {
        if (!token.getText().equals("tokdef") && !token.getText().equals("tokenVocabulary")) {
            if (token.getText().equals("literal")) {
                Grammar grammar = this.grammar;
                if (grammar instanceof LexerGrammar) {
                    this.tool.error("the literal option is invalid >= ANTLR 2.6.0.\n  Use the \"tokens {...}\" mechanism instead.", grammar.getFilename(), token2.getLine(), token2.getColumn());
                    return;
                }
            }
            if (token.getText().equals("exportVocab")) {
                if (token2.getType() != 41 && token2.getType() != 24) {
                    this.tool.error("exportVocab must be an identifier", this.grammar.getFilename(), token2.getLine(), token2.getColumn());
                    return;
                } else {
                    this.grammar.exportVocab = token2.getText();
                    return;
                }
            }
            if (token.getText().equals("importVocab")) {
                if (token2.getType() != 41 && token2.getType() != 24) {
                    this.tool.error("importVocab must be an identifier", this.grammar.getFilename(), token2.getLine(), token2.getColumn());
                    return;
                } else {
                    this.grammar.importVocab = token2.getText();
                    return;
                }
            }
            this.grammar.setOption(token.getText(), token2);
            return;
        }
        this.tool.error("tokdef/tokenVocabulary options are invalid >= ANTLR 2.6.0.\n  Use importVocab/exportVocab instead.  Please see the documentation.\n  The previous options were so heinous that Terence changed the whole\n  vocabulary mechanism; it was better to change the names rather than\n  subtly change the functionality of the known options.  Sorry!", this.grammar.getFilename(), token2.getLine(), token2.getColumn());
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void setRuleOption(Token token, Token token2) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void setSubruleOption(Token token, Token token2) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void setUserExceptions(String str) {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void startLexer(String str, Token token, String str2, String str3) {
        if (this.numLexers > 0) {
            Tool tool = this.tool;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("You may only have one lexer per grammar file: class ");
            stringBuffer.append(token.getText());
            tool.panic(stringBuffer.toString());
        }
        this.numLexers++;
        reset();
        Grammar grammar = (Grammar) this.grammars.get(token);
        if (grammar != null) {
            if (!(grammar instanceof LexerGrammar)) {
                Tool tool2 = this.tool;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("'");
                stringBuffer2.append(token.getText());
                stringBuffer2.append("' is already defined as a non-lexer");
                tool2.panic(stringBuffer2.toString());
                return;
            }
            Tool tool3 = this.tool;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Lexer '");
            stringBuffer3.append(token.getText());
            stringBuffer3.append("' is already defined");
            tool3.panic(stringBuffer3.toString());
            return;
        }
        LexerGrammar lexerGrammar = new LexerGrammar(token.getText(), this.tool, str2);
        lexerGrammar.comment = str3;
        lexerGrammar.processArguments(this.args);
        lexerGrammar.setFilename(str);
        this.grammars.put(lexerGrammar.getClassName(), lexerGrammar);
        lexerGrammar.preambleAction = this.thePreambleAction;
        this.thePreambleAction = new CommonToken(0, "");
        this.grammar = lexerGrammar;
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void startParser(String str, Token token, String str2, String str3) {
        if (this.numParsers > 0) {
            Tool tool = this.tool;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("You may only have one parser per grammar file: class ");
            stringBuffer.append(token.getText());
            tool.panic(stringBuffer.toString());
        }
        this.numParsers++;
        reset();
        Grammar grammar = (Grammar) this.grammars.get(token);
        if (grammar != null) {
            if (!(grammar instanceof ParserGrammar)) {
                Tool tool2 = this.tool;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("'");
                stringBuffer2.append(token.getText());
                stringBuffer2.append("' is already defined as a non-parser");
                tool2.panic(stringBuffer2.toString());
                return;
            }
            Tool tool3 = this.tool;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Parser '");
            stringBuffer3.append(token.getText());
            stringBuffer3.append("' is already defined");
            tool3.panic(stringBuffer3.toString());
            return;
        }
        ParserGrammar parserGrammar = new ParserGrammar(token.getText(), this.tool, str2);
        this.grammar = parserGrammar;
        parserGrammar.comment = str3;
        parserGrammar.processArguments(this.args);
        this.grammar.setFilename(str);
        this.grammars.put(this.grammar.getClassName(), this.grammar);
        this.grammar.preambleAction = this.thePreambleAction;
        this.thePreambleAction = new CommonToken(0, "");
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void startTreeWalker(String str, Token token, String str2, String str3) {
        if (this.numTreeParsers > 0) {
            Tool tool = this.tool;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("You may only have one tree parser per grammar file: class ");
            stringBuffer.append(token.getText());
            tool.panic(stringBuffer.toString());
        }
        this.numTreeParsers++;
        reset();
        Grammar grammar = (Grammar) this.grammars.get(token);
        if (grammar != null) {
            if (!(grammar instanceof TreeWalkerGrammar)) {
                Tool tool2 = this.tool;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("'");
                stringBuffer2.append(token.getText());
                stringBuffer2.append("' is already defined as a non-tree-walker");
                tool2.panic(stringBuffer2.toString());
                return;
            }
            Tool tool3 = this.tool;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Tree-walker '");
            stringBuffer3.append(token.getText());
            stringBuffer3.append("' is already defined");
            tool3.panic(stringBuffer3.toString());
            return;
        }
        TreeWalkerGrammar treeWalkerGrammar = new TreeWalkerGrammar(token.getText(), this.tool, str2);
        this.grammar = treeWalkerGrammar;
        treeWalkerGrammar.comment = str3;
        treeWalkerGrammar.processArguments(this.args);
        this.grammar.setFilename(str);
        this.grammars.put(this.grammar.getClassName(), this.grammar);
        this.grammar.preambleAction = this.thePreambleAction;
        this.thePreambleAction = new CommonToken(0, "");
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void synPred() {
    }

    @Override // antlr.ANTLRGrammarParseBehavior
    public void zeroOrMoreSubRule() {
    }
}
