package antlr;

import antlr.collections.impl.Vector;
import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class DiagnosticCodeGenerator extends CodeGenerator {
    protected int syntacticPredLevel = 0;
    protected boolean doingLexRules = false;

    public DiagnosticCodeGenerator() {
        this.charFormatter = new JavaCharFormatter();
    }

    @Override // antlr.CodeGenerator
    public void gen(BlockEndElement blockEndElement) {
    }

    protected void genAlt(Alternative alternative) {
        for (AlternativeElement alternativeElement = alternative.head; !(alternativeElement instanceof BlockEndElement); alternativeElement = alternativeElement.next) {
            alternativeElement.generate();
        }
        if (alternative.getTreeSpecifier() != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("AST will be built as: ");
            stringBuffer.append(alternative.getTreeSpecifier().getText());
            println(stringBuffer.toString());
        }
    }

    protected void genBlockPreamble(AlternativeBlock alternativeBlock) {
        if (alternativeBlock.initAction != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Init action: ");
            stringBuffer.append(alternativeBlock.initAction);
            printAction(stringBuffer.toString());
        }
    }

    public void genCommonBlock(AlternativeBlock alternativeBlock) {
        boolean z10;
        int i10 = 0;
        if (alternativeBlock.alternatives.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        println("Start of an alternative block.");
        this.tabs++;
        println("The lookahead set for this block is:");
        this.tabs++;
        genLookaheadSetForBlock(alternativeBlock);
        this.tabs--;
        if (z10) {
            println("This block has a single alternative");
            if (alternativeBlock.getAlternativeAt(0).synPred != null) {
                println("Warning: you specified a syntactic predicate for this alternative,");
                println("and it is the only alternative of a block and will be ignored.");
            }
        } else {
            println("This block has multiple alternatives:");
            this.tabs++;
        }
        while (i10 < alternativeBlock.alternatives.size()) {
            Alternative alternativeAt = alternativeBlock.getAlternativeAt(i10);
            AlternativeElement alternativeElement = alternativeAt.head;
            println("");
            if (i10 != 0) {
                print("Otherwise, ");
            } else {
                print("");
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Alternate(");
            i10++;
            stringBuffer.append(i10);
            stringBuffer.append(") will be taken IF:");
            _println(stringBuffer.toString());
            println("The lookahead set: ");
            this.tabs++;
            genLookaheadSetForAlt(alternativeAt);
            this.tabs--;
            if (alternativeAt.semPred == null && alternativeAt.synPred == null) {
                println("is matched.");
            } else {
                print("is matched, AND ");
            }
            if (alternativeAt.semPred != null) {
                _println("the semantic predicate:");
                this.tabs++;
                println(alternativeAt.semPred);
                if (alternativeAt.synPred != null) {
                    print("is true, AND ");
                } else {
                    println("is true.");
                }
            }
            if (alternativeAt.synPred != null) {
                _println("the syntactic predicate:");
                this.tabs++;
                genSynPred(alternativeAt.synPred);
                this.tabs--;
                println("is matched.");
            }
            genAlt(alternativeAt);
        }
        println("");
        println("OTHERWISE, a NoViableAlt exception will be thrown");
        println("");
        if (!z10) {
            this.tabs--;
            println("End of alternatives");
        }
        this.tabs--;
        println("End of alternative block.");
    }

    public void genFollowSetForRuleBlock(RuleBlock ruleBlock) {
        printSet(this.grammar.maxk, 1, this.grammar.theLLkAnalyzer.FOLLOW(1, ruleBlock.endNode));
    }

    protected void genHeader() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ANTLR-generated file resulting from grammar ");
        stringBuffer.append(this.antlrTool.grammarFile);
        println(stringBuffer.toString());
        println("Diagnostic output");
        println("");
        println("Terence Parr, MageLang Institute");
        println("with John Lilley, Empathy Software");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("ANTLR Version ");
        stringBuffer2.append(Tool.version);
        stringBuffer2.append("; 1996,1997");
        println(stringBuffer2.toString());
        println("");
        println("*** Header Action.");
        println("This action will appear at the top of all generated files.");
        this.tabs++;
        printAction(this.behavior.getHeaderAction(""));
        this.tabs--;
        println("*** End of Header Action");
        println("");
    }

    protected void genLookaheadSetForAlt(Alternative alternative) {
        if (this.doingLexRules && alternative.cache[1].containsEpsilon()) {
            println("MATCHES ALL");
            return;
        }
        int i10 = alternative.lookaheadDepth;
        if (i10 == Integer.MAX_VALUE) {
            i10 = this.grammar.maxk;
        }
        for (int i11 = 1; i11 <= i10; i11++) {
            printSet(i10, i11, alternative.cache[i11]);
        }
    }

    public void genLookaheadSetForBlock(AlternativeBlock alternativeBlock) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= alternativeBlock.alternatives.size()) {
                break;
            }
            int i12 = alternativeBlock.getAlternativeAt(i10).lookaheadDepth;
            if (i12 == Integer.MAX_VALUE) {
                i11 = this.grammar.maxk;
                break;
            } else {
                if (i11 < i12) {
                    i11 = i12;
                }
                i10++;
            }
        }
        for (int i13 = 1; i13 <= i11; i13++) {
            printSet(i11, i13, this.grammar.theLLkAnalyzer.look(i13, alternativeBlock));
        }
    }

    public void genNextToken() {
        println("");
        println("*** Lexer nextToken rule:");
        println("The lexer nextToken rule is synthesized from all of the user-defined");
        println("lexer rules.  It logically consists of one big alternative block with");
        println("each user-defined rule being an alternative.");
        println("");
        Grammar grammar = this.grammar;
        RuleBlock createNextTokenRule = MakeGrammar.createNextTokenRule(grammar, grammar.rules, "nextToken");
        RuleSymbol ruleSymbol = new RuleSymbol("mnextToken");
        ruleSymbol.setDefined();
        ruleSymbol.setBlock(createNextTokenRule);
        ruleSymbol.access = "private";
        this.grammar.define(ruleSymbol);
        if (!this.grammar.theLLkAnalyzer.deterministic(createNextTokenRule)) {
            println("The grammar analyzer has determined that the synthesized");
            println("nextToken rule is non-deterministic (i.e., it has ambiguities)");
            println("This means that there is some overlap of the character");
            println("lookahead for two or more of your lexer rules.");
        }
        genCommonBlock(createNextTokenRule);
        println("*** End of nextToken lexer rule.");
    }

    public void genRule(RuleSymbol ruleSymbol) {
        String str;
        println("");
        if (this.doingLexRules) {
            str = "Lexer";
        } else {
            str = "Parser";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("*** ");
        stringBuffer.append(str);
        stringBuffer.append(" Rule: ");
        stringBuffer.append(ruleSymbol.getId());
        println(stringBuffer.toString());
        if (!ruleSymbol.isDefined()) {
            println("This rule is undefined.");
            println("This means that the rule was referenced somewhere in the grammar,");
            println("but a definition for the rule was not encountered.");
            println("It is also possible that syntax errors during the parse of");
            println("your grammar file prevented correct processing of the rule.");
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("*** End ");
            stringBuffer2.append(str);
            stringBuffer2.append(" Rule: ");
            stringBuffer2.append(ruleSymbol.getId());
            println(stringBuffer2.toString());
            return;
        }
        this.tabs++;
        if (ruleSymbol.access.length() != 0) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Access: ");
            stringBuffer3.append(ruleSymbol.access);
            println(stringBuffer3.toString());
        }
        RuleBlock block = ruleSymbol.getBlock();
        if (block.returnAction != null) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("Return value(s): ");
            stringBuffer4.append(block.returnAction);
            println(stringBuffer4.toString());
            if (this.doingLexRules) {
                println("Error: you specified return value(s) for a lexical rule.");
                println("\tLexical rules have an implicit return type of 'int'.");
            }
        } else if (this.doingLexRules) {
            println("Return value: lexical rule returns an implicit token type");
        } else {
            println("Return value: none");
        }
        if (block.argAction != null) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("Arguments: ");
            stringBuffer5.append(block.argAction);
            println(stringBuffer5.toString());
        }
        genBlockPreamble(block);
        if (!this.grammar.theLLkAnalyzer.deterministic(block)) {
            println("Error: This rule is non-deterministic");
        }
        genCommonBlock(block);
        ExceptionSpec findExceptionSpec = block.findExceptionSpec("");
        if (findExceptionSpec != null) {
            println("You specified error-handler(s) for this rule:");
            this.tabs++;
            int i10 = 0;
            while (i10 < findExceptionSpec.handlers.size()) {
                if (i10 != 0) {
                    println("");
                }
                ExceptionHandler exceptionHandler = (ExceptionHandler) findExceptionSpec.handlers.elementAt(i10);
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("Error-handler(");
                i10++;
                stringBuffer6.append(i10);
                stringBuffer6.append(") catches [");
                stringBuffer6.append(exceptionHandler.exceptionTypeAndName.getText());
                stringBuffer6.append("] and executes:");
                println(stringBuffer6.toString());
                printAction(exceptionHandler.action.getText());
            }
            this.tabs--;
            println("End error-handlers.");
        } else if (!this.doingLexRules) {
            println("Default error-handling will be generated, which catches all");
            println("parser exceptions and consumes tokens until the follow-set is seen.");
        }
        if (!this.doingLexRules) {
            println("The follow set for this rule is:");
            this.tabs++;
            genFollowSetForRuleBlock(block);
            this.tabs--;
        }
        this.tabs--;
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append("*** End ");
        stringBuffer7.append(str);
        stringBuffer7.append(" Rule: ");
        stringBuffer7.append(ruleSymbol.getId());
        println(stringBuffer7.toString());
    }

    protected void genSynPred(SynPredBlock synPredBlock) {
        this.syntacticPredLevel++;
        gen(synPredBlock);
        this.syntacticPredLevel--;
    }

    protected void genTokenTypes(TokenManager tokenManager) {
        Tool tool = this.antlrTool;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Generating ");
        stringBuffer.append(tokenManager.getName());
        stringBuffer.append(CodeGenerator.TokenTypesFileSuffix);
        stringBuffer.append(CodeGenerator.TokenTypesFileExt);
        tool.reportProgress(stringBuffer.toString());
        Tool tool2 = this.antlrTool;
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(tokenManager.getName());
        stringBuffer2.append(CodeGenerator.TokenTypesFileSuffix);
        stringBuffer2.append(CodeGenerator.TokenTypesFileExt);
        this.currentOutput = tool2.openOutputFile(stringBuffer2.toString());
        this.tabs = 0;
        genHeader();
        println("");
        println("*** Tokens used by the parser");
        println("This is a list of the token numeric values and the corresponding");
        println("token identifiers.  Some tokens are literals, and because of that");
        println("they have no identifiers.  Literals are double-quoted.");
        this.tabs++;
        Vector vocabulary = tokenManager.getVocabulary();
        for (int i10 = 4; i10 < vocabulary.size(); i10++) {
            String str = (String) vocabulary.elementAt(i10);
            if (str != null) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(str);
                stringBuffer3.append(" = ");
                stringBuffer3.append(i10);
                println(stringBuffer3.toString());
            }
        }
        this.tabs--;
        println("*** End of tokens used by the parser");
        this.currentOutput.close();
        this.currentOutput = null;
    }

    @Override // antlr.CodeGenerator
    public String getASTCreateString(Vector vector) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("***Create an AST from a vector here***");
        stringBuffer.append(System.getProperty("line.separator"));
        return stringBuffer.toString();
    }

    @Override // antlr.CodeGenerator
    public String mapTreeId(String str, ActionTransInfo actionTransInfo) {
        return str;
    }

    public void printSet(int i10, int i11, Lookahead lookahead) {
        int[] array = lookahead.fset.toArray();
        if (i10 != 1) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("k==");
            stringBuffer.append(i11);
            stringBuffer.append(": {");
            print(stringBuffer.toString());
        } else {
            print("{ ");
        }
        if (array.length > 5) {
            _println("");
            this.tabs++;
            print("");
        }
        int i12 = 0;
        for (int i13 = 0; i13 < array.length; i13++) {
            i12++;
            if (i12 > 5) {
                _println("");
                print("");
                i12 = 0;
            }
            if (this.doingLexRules) {
                _print(this.charFormatter.literalChar(array[i13]));
            } else {
                _print((String) this.grammar.tokenManager.getVocabulary().elementAt(array[i13]));
            }
            if (i13 != array.length - 1) {
                _print(", ");
            }
        }
        if (array.length > 5) {
            _println("");
            this.tabs--;
            print("");
        }
        _println(" }");
    }

    @Override // antlr.CodeGenerator
    protected String processActionForSpecialSymbols(String str, int i10, RuleBlock ruleBlock, ActionTransInfo actionTransInfo) {
        return str;
    }

    @Override // antlr.CodeGenerator
    public void gen() {
        try {
            Enumeration elements = this.behavior.grammars.elements();
            while (elements.hasMoreElements()) {
                Grammar grammar = (Grammar) elements.nextElement();
                grammar.setGrammarAnalyzer(this.analyzer);
                grammar.setCodeGenerator(this);
                this.analyzer.setGrammar(grammar);
                grammar.generate();
                if (this.antlrTool.hasError()) {
                    this.antlrTool.panic("Exiting due to errors.");
                }
            }
            Enumeration elements2 = this.behavior.tokenManagers.elements();
            while (elements2.hasMoreElements()) {
                TokenManager tokenManager = (TokenManager) elements2.nextElement();
                if (!tokenManager.isReadOnly()) {
                    genTokenTypes(tokenManager);
                }
            }
        } catch (IOException e10) {
            this.antlrTool.reportException(e10, null);
        }
    }

    @Override // antlr.CodeGenerator
    public String getASTCreateString(GrammarAtom grammarAtom, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(str);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    @Override // antlr.CodeGenerator
    public void gen(ActionElement actionElement) {
        if (actionElement.isSemPred) {
            return;
        }
        print("ACTION: ");
        _printAction(actionElement.actionText);
    }

    @Override // antlr.CodeGenerator
    public void gen(AlternativeBlock alternativeBlock) {
        println("Start of alternative block.");
        this.tabs++;
        genBlockPreamble(alternativeBlock);
        if (!this.grammar.theLLkAnalyzer.deterministic(alternativeBlock)) {
            println("Warning: This alternative block is non-deterministic");
        }
        genCommonBlock(alternativeBlock);
        this.tabs--;
    }

    @Override // antlr.CodeGenerator
    public void gen(CharLiteralElement charLiteralElement) {
        print("Match character ");
        if (charLiteralElement.not) {
            _print("NOT ");
        }
        _print(charLiteralElement.atomText);
        if (charLiteralElement.label != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(", label=");
            stringBuffer.append(charLiteralElement.label);
            _print(stringBuffer.toString());
        }
        _println("");
    }

    @Override // antlr.CodeGenerator
    public void gen(CharRangeElement charRangeElement) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Match character range: ");
        stringBuffer.append(charRangeElement.beginText);
        stringBuffer.append("..");
        stringBuffer.append(charRangeElement.endText);
        print(stringBuffer.toString());
        if (charRangeElement.label != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(", label = ");
            stringBuffer2.append(charRangeElement.label);
            _print(stringBuffer2.toString());
        }
        _println("");
    }

    @Override // antlr.CodeGenerator
    public void gen(LexerGrammar lexerGrammar) {
        setGrammar(lexerGrammar);
        Tool tool = this.antlrTool;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Generating ");
        stringBuffer.append(this.grammar.getClassName());
        stringBuffer.append(CodeGenerator.TokenTypesFileExt);
        tool.reportProgress(stringBuffer.toString());
        Tool tool2 = this.antlrTool;
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(this.grammar.getClassName());
        stringBuffer2.append(CodeGenerator.TokenTypesFileExt);
        this.currentOutput = tool2.openOutputFile(stringBuffer2.toString());
        this.tabs = 0;
        this.doingLexRules = true;
        genHeader();
        println("");
        println("*** Lexer Preamble Action.");
        println("This action will appear before the declaration of your lexer class:");
        this.tabs++;
        println(this.grammar.preambleAction.getText());
        this.tabs--;
        println("*** End of Lexer Preamble Action");
        println("");
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("*** Your lexer class is called '");
        stringBuffer3.append(this.grammar.getClassName());
        stringBuffer3.append("' and is a subclass of '");
        stringBuffer3.append(this.grammar.getSuperClass());
        stringBuffer3.append("'.");
        println(stringBuffer3.toString());
        println("");
        println("*** User-defined lexer  class members:");
        println("These are the member declarations that you defined for your class:");
        this.tabs++;
        printAction(this.grammar.classMemberAction.getText());
        this.tabs--;
        println("*** End of user-defined lexer class members");
        println("");
        println("*** String literals used in the parser");
        println("The following string literals were used in the parser.");
        println("An actual code generator would arrange to place these literals");
        println("into a table in the generated lexer, so that actions in the");
        println("generated lexer could match token text against the literals.");
        println("String literals used in the lexer are not listed here, as they");
        println("are incorporated into the mainstream lexer processing.");
        this.tabs++;
        Enumeration symbols = this.grammar.getSymbols();
        while (symbols.hasMoreElements()) {
            GrammarSymbol grammarSymbol = (GrammarSymbol) symbols.nextElement();
            if (grammarSymbol instanceof StringLiteralSymbol) {
                StringLiteralSymbol stringLiteralSymbol = (StringLiteralSymbol) grammarSymbol;
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(stringLiteralSymbol.getId());
                stringBuffer4.append(" = ");
                stringBuffer4.append(stringLiteralSymbol.getTokenType());
                println(stringBuffer4.toString());
            }
        }
        this.tabs--;
        println("*** End of string literals used by the parser");
        genNextToken();
        println("");
        println("*** User-defined Lexer rules:");
        this.tabs++;
        Enumeration elements = this.grammar.rules.elements();
        while (elements.hasMoreElements()) {
            RuleSymbol ruleSymbol = (RuleSymbol) elements.nextElement();
            if (!ruleSymbol.f4237id.equals("mnextToken")) {
                genRule(ruleSymbol);
            }
        }
        this.tabs--;
        println("");
        println("*** End User-defined Lexer rules:");
        this.currentOutput.close();
        this.currentOutput = null;
        this.doingLexRules = false;
    }

    @Override // antlr.CodeGenerator
    public void gen(OneOrMoreBlock oneOrMoreBlock) {
        println("Start ONE-OR-MORE (...)+ block:");
        this.tabs++;
        genBlockPreamble(oneOrMoreBlock);
        if (!this.grammar.theLLkAnalyzer.deterministic(oneOrMoreBlock)) {
            println("Warning: This one-or-more block is non-deterministic");
        }
        genCommonBlock(oneOrMoreBlock);
        this.tabs--;
        println("End ONE-OR-MORE block.");
    }

    @Override // antlr.CodeGenerator
    public void gen(ParserGrammar parserGrammar) {
        setGrammar(parserGrammar);
        Tool tool = this.antlrTool;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Generating ");
        stringBuffer.append(this.grammar.getClassName());
        stringBuffer.append(CodeGenerator.TokenTypesFileExt);
        tool.reportProgress(stringBuffer.toString());
        Tool tool2 = this.antlrTool;
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(this.grammar.getClassName());
        stringBuffer2.append(CodeGenerator.TokenTypesFileExt);
        this.currentOutput = tool2.openOutputFile(stringBuffer2.toString());
        this.tabs = 0;
        genHeader();
        println("");
        println("*** Parser Preamble Action.");
        println("This action will appear before the declaration of your parser class:");
        this.tabs++;
        println(this.grammar.preambleAction.getText());
        this.tabs--;
        println("*** End of Parser Preamble Action");
        println("");
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("*** Your parser class is called '");
        stringBuffer3.append(this.grammar.getClassName());
        stringBuffer3.append("' and is a subclass of '");
        stringBuffer3.append(this.grammar.getSuperClass());
        stringBuffer3.append("'.");
        println(stringBuffer3.toString());
        println("");
        println("*** User-defined parser class members:");
        println("These are the member declarations that you defined for your class:");
        this.tabs++;
        printAction(this.grammar.classMemberAction.getText());
        this.tabs--;
        println("*** End of user-defined parser class members");
        println("");
        println("*** Parser rules:");
        this.tabs++;
        Enumeration elements = this.grammar.rules.elements();
        while (elements.hasMoreElements()) {
            println("");
            GrammarSymbol grammarSymbol = (GrammarSymbol) elements.nextElement();
            if (grammarSymbol instanceof RuleSymbol) {
                genRule((RuleSymbol) grammarSymbol);
            }
        }
        this.tabs--;
        println("");
        println("*** End of parser rules");
        println("");
        println("*** End of parser");
        this.currentOutput.close();
        this.currentOutput = null;
    }

    @Override // antlr.CodeGenerator
    public void gen(RuleRefElement ruleRefElement) {
        RuleSymbol ruleSymbol = (RuleSymbol) this.grammar.getSymbol(ruleRefElement.targetRule);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Rule Reference: ");
        stringBuffer.append(ruleRefElement.targetRule);
        print(stringBuffer.toString());
        if (ruleRefElement.idAssign != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(", assigned to '");
            stringBuffer2.append(ruleRefElement.idAssign);
            stringBuffer2.append("'");
            _print(stringBuffer2.toString());
        }
        if (ruleRefElement.args != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(", arguments = ");
            stringBuffer3.append(ruleRefElement.args);
            _print(stringBuffer3.toString());
        }
        _println("");
        if (ruleSymbol != null && ruleSymbol.isDefined()) {
            if (ruleRefElement.idAssign != null) {
                if (ruleSymbol.block.returnAction == null) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("Error: You assigned from Rule '");
                    stringBuffer4.append(ruleRefElement.targetRule);
                    stringBuffer4.append("', but that rule has no return type.");
                    println(stringBuffer4.toString());
                }
            } else if (!(this.grammar instanceof LexerGrammar) && this.syntacticPredLevel == 0 && ruleSymbol.block.returnAction != null) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("Warning: Rule '");
                stringBuffer5.append(ruleRefElement.targetRule);
                stringBuffer5.append("' returns a value");
                println(stringBuffer5.toString());
            }
            if (ruleRefElement.args == null || ruleSymbol.block.argAction != null) {
                return;
            }
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("Error: Rule '");
            stringBuffer6.append(ruleRefElement.targetRule);
            stringBuffer6.append("' accepts no arguments.");
            println(stringBuffer6.toString());
            return;
        }
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append("Rule '");
        stringBuffer7.append(ruleRefElement.targetRule);
        stringBuffer7.append("' is referenced, but that rule is not defined.");
        println(stringBuffer7.toString());
        println("\tPerhaps the rule is misspelled, or you forgot to define it.");
    }

    @Override // antlr.CodeGenerator
    public void gen(StringLiteralElement stringLiteralElement) {
        print("Match string literal ");
        _print(stringLiteralElement.atomText);
        if (stringLiteralElement.label != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(", label=");
            stringBuffer.append(stringLiteralElement.label);
            _print(stringBuffer.toString());
        }
        _println("");
    }

    @Override // antlr.CodeGenerator
    public void gen(TokenRangeElement tokenRangeElement) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Match token range: ");
        stringBuffer.append(tokenRangeElement.beginText);
        stringBuffer.append("..");
        stringBuffer.append(tokenRangeElement.endText);
        print(stringBuffer.toString());
        if (tokenRangeElement.label != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(", label = ");
            stringBuffer2.append(tokenRangeElement.label);
            _print(stringBuffer2.toString());
        }
        _println("");
    }

    @Override // antlr.CodeGenerator
    public void gen(TokenRefElement tokenRefElement) {
        print("Match token ");
        if (tokenRefElement.not) {
            _print("NOT ");
        }
        _print(tokenRefElement.atomText);
        if (tokenRefElement.label != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(", label=");
            stringBuffer.append(tokenRefElement.label);
            _print(stringBuffer.toString());
        }
        _println("");
    }

    @Override // antlr.CodeGenerator
    public void gen(TreeElement treeElement) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Tree reference: ");
        stringBuffer.append(treeElement);
        print(stringBuffer.toString());
    }

    @Override // antlr.CodeGenerator
    public void gen(TreeWalkerGrammar treeWalkerGrammar) {
        setGrammar(treeWalkerGrammar);
        Tool tool = this.antlrTool;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Generating ");
        stringBuffer.append(this.grammar.getClassName());
        stringBuffer.append(CodeGenerator.TokenTypesFileExt);
        tool.reportProgress(stringBuffer.toString());
        Tool tool2 = this.antlrTool;
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(this.grammar.getClassName());
        stringBuffer2.append(CodeGenerator.TokenTypesFileExt);
        this.currentOutput = tool2.openOutputFile(stringBuffer2.toString());
        this.tabs = 0;
        genHeader();
        println("");
        println("*** Tree-walker Preamble Action.");
        println("This action will appear before the declaration of your tree-walker class:");
        this.tabs++;
        println(this.grammar.preambleAction.getText());
        this.tabs--;
        println("*** End of tree-walker Preamble Action");
        println("");
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("*** Your tree-walker class is called '");
        stringBuffer3.append(this.grammar.getClassName());
        stringBuffer3.append("' and is a subclass of '");
        stringBuffer3.append(this.grammar.getSuperClass());
        stringBuffer3.append("'.");
        println(stringBuffer3.toString());
        println("");
        println("*** User-defined tree-walker class members:");
        println("These are the member declarations that you defined for your class:");
        this.tabs++;
        printAction(this.grammar.classMemberAction.getText());
        this.tabs--;
        println("*** End of user-defined tree-walker class members");
        println("");
        println("*** tree-walker rules:");
        this.tabs++;
        Enumeration elements = this.grammar.rules.elements();
        while (elements.hasMoreElements()) {
            println("");
            GrammarSymbol grammarSymbol = (GrammarSymbol) elements.nextElement();
            if (grammarSymbol instanceof RuleSymbol) {
                genRule((RuleSymbol) grammarSymbol);
            }
        }
        this.tabs--;
        println("");
        println("*** End of tree-walker rules");
        println("");
        println("*** End of tree-walker");
        this.currentOutput.close();
        this.currentOutput = null;
    }

    @Override // antlr.CodeGenerator
    public void gen(WildcardElement wildcardElement) {
        print("Match wildcard");
        if (wildcardElement.getLabel() != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(", label = ");
            stringBuffer.append(wildcardElement.getLabel());
            _print(stringBuffer.toString());
        }
        _println("");
    }

    @Override // antlr.CodeGenerator
    public void gen(ZeroOrMoreBlock zeroOrMoreBlock) {
        println("Start ZERO-OR-MORE (...)+ block:");
        this.tabs++;
        genBlockPreamble(zeroOrMoreBlock);
        if (!this.grammar.theLLkAnalyzer.deterministic(zeroOrMoreBlock)) {
            println("Warning: This zero-or-more block is non-deterministic");
        }
        genCommonBlock(zeroOrMoreBlock);
        this.tabs--;
        println("End ZERO-OR-MORE block.");
    }
}
