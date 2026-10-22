package antlr;

import antlr.collections.impl.Vector;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class DocBookCodeGenerator extends CodeGenerator {
    protected boolean firstElementInAlt;
    protected int syntacticPredLevel = 0;
    protected boolean doingLexRules = false;
    protected AlternativeElement prevAltElem = null;

    public DocBookCodeGenerator() {
        this.charFormatter = new JavaCharFormatter();
    }

    static String HTMLEncode(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '&') {
                stringBuffer.append("&amp;");
            } else if (charAt == '\"') {
                stringBuffer.append("&quot;");
            } else if (charAt == '\'') {
                stringBuffer.append("&#039;");
            } else if (charAt == '<') {
                stringBuffer.append("&lt;");
            } else if (charAt == '>') {
                stringBuffer.append("&gt;");
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    static String QuoteForId(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '_') {
                stringBuffer.append(".");
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    @Override // antlr.CodeGenerator
    public void gen(ActionElement actionElement) {
    }

    protected void genAlt(Alternative alternative) {
        if (alternative.getTreeSpecifier() != null) {
            _print(alternative.getTreeSpecifier().getText());
        }
        this.prevAltElem = null;
        for (AlternativeElement alternativeElement = alternative.head; !(alternativeElement instanceof BlockEndElement); alternativeElement = alternativeElement.next) {
            alternativeElement.generate();
            this.firstElementInAlt = false;
            this.prevAltElem = alternativeElement;
        }
    }

    public void genCommonBlock(AlternativeBlock alternativeBlock) {
        if (alternativeBlock.alternatives.size() > 1) {
            println("<itemizedlist mark=\"none\">");
        }
        for (int i10 = 0; i10 < alternativeBlock.alternatives.size(); i10++) {
            Alternative alternativeAt = alternativeBlock.getAlternativeAt(i10);
            AlternativeElement alternativeElement = alternativeAt.head;
            if (alternativeBlock.alternatives.size() > 1) {
                print("<listitem><para>");
            }
            if (i10 > 0 && alternativeBlock.alternatives.size() > 1) {
                _print("| ");
            }
            boolean z10 = this.firstElementInAlt;
            this.firstElementInAlt = true;
            this.tabs++;
            genAlt(alternativeAt);
            this.tabs--;
            this.firstElementInAlt = z10;
            if (alternativeBlock.alternatives.size() > 1) {
                _println("</para></listitem>");
            }
        }
        if (alternativeBlock.alternatives.size() > 1) {
            println("</itemizedlist>");
        }
    }

    public void genFollowSetForRuleBlock(RuleBlock ruleBlock) {
        printSet(this.grammar.maxk, 1, this.grammar.theLLkAnalyzer.FOLLOW(1, ruleBlock.endNode));
    }

    protected void genGenericBlock(AlternativeBlock alternativeBlock, String str) {
        if (alternativeBlock.alternatives.size() > 1) {
            _println("");
            if (!this.firstElementInAlt) {
                _println("(");
            } else {
                _print("(");
            }
        } else {
            _print("( ");
        }
        genCommonBlock(alternativeBlock);
        if (alternativeBlock.alternatives.size() > 1) {
            _println("");
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(")");
            stringBuffer.append(str);
            stringBuffer.append(" ");
            print(stringBuffer.toString());
            if (!(alternativeBlock.next instanceof BlockEndElement)) {
                _println("");
                print("");
                return;
            }
            return;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(")");
        stringBuffer2.append(str);
        stringBuffer2.append(" ");
        _print(stringBuffer2.toString());
    }

    protected void genHeader() {
        println("<?xml version=\"1.0\" standalone=\"no\"?>");
        println("<!DOCTYPE book PUBLIC \"-//OASIS//DTD DocBook V3.1//EN\">");
        println("<book lang=\"en\">");
        println("<bookinfo>");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<title>Grammar ");
        stringBuffer.append(this.grammar.getClassName());
        stringBuffer.append("</title>");
        println(stringBuffer.toString());
        println("  <author>");
        println("    <firstname></firstname>");
        println("    <othername></othername>");
        println("    <surname></surname>");
        println("    <affiliation>");
        println("     <address>");
        println("     <email></email>");
        println("     </address>");
        println("    </affiliation>");
        println("  </author>");
        println("  <othercredit>");
        println("    <contrib>");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("    Generated by <ulink url=\"http://www.ANTLR.org/\">ANTLR</ulink>");
        stringBuffer2.append(Tool.version);
        println(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("    from ");
        stringBuffer3.append(this.antlrTool.grammarFile);
        println(stringBuffer3.toString());
        println("    </contrib>");
        println("  </othercredit>");
        println("  <pubdate></pubdate>");
        println("  <abstract>");
        println("  <para>");
        println("  </para>");
        println("  </abstract>");
        println("</bookinfo>");
        println("<chapter>");
        println("<title></title>");
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
        println("/** Lexer nextToken rule:");
        println(" *  The lexer nextToken rule is synthesized from all of the user-defined");
        println(" *  lexer rules.  It logically consists of one big alternative block with");
        println(" *  each user-defined rule being an alternative.");
        println(" */");
        Grammar grammar = this.grammar;
        RuleBlock createNextTokenRule = MakeGrammar.createNextTokenRule(grammar, grammar.rules, "nextToken");
        RuleSymbol ruleSymbol = new RuleSymbol("mnextToken");
        ruleSymbol.setDefined();
        ruleSymbol.setBlock(createNextTokenRule);
        ruleSymbol.access = "private";
        this.grammar.define(ruleSymbol);
        genCommonBlock(createNextTokenRule);
    }

    public void genRule(RuleSymbol ruleSymbol) {
        if (ruleSymbol != null && ruleSymbol.isDefined()) {
            println("");
            if (ruleSymbol.access.length() != 0 && !ruleSymbol.access.equals("public")) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("<para>");
                stringBuffer.append(ruleSymbol.access);
                stringBuffer.append(" </para>");
                _print(stringBuffer.toString());
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("<section id=\"");
            stringBuffer2.append(QuoteForId(ruleSymbol.getId()));
            stringBuffer2.append("\">");
            println(stringBuffer2.toString());
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("<title>");
            stringBuffer3.append(ruleSymbol.getId());
            stringBuffer3.append("</title>");
            println(stringBuffer3.toString());
            if (ruleSymbol.comment != null) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("<para>");
                stringBuffer4.append(HTMLEncode(ruleSymbol.comment));
                stringBuffer4.append("</para>");
                _println(stringBuffer4.toString());
            }
            println("<para>");
            RuleBlock block = ruleSymbol.getBlock();
            _println("");
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(ruleSymbol.getId());
            stringBuffer5.append(":\t");
            print(stringBuffer5.toString());
            this.tabs++;
            genCommonBlock(block);
            _println("");
            this.tabs--;
            _println("</para>");
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("</section><!-- section \"");
            stringBuffer6.append(ruleSymbol.getId());
            stringBuffer6.append("\" -->");
            _println(stringBuffer6.toString());
        }
    }

    protected void genSynPred(SynPredBlock synPredBlock) {
    }

    public void genTail() {
        println("</chapter>");
        println("</book>");
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
    public String getASTCreateString(GrammarAtom grammarAtom, String str) {
        return null;
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
    public void gen(BlockEndElement blockEndElement) {
    }

    @Override // antlr.CodeGenerator
    public String getASTCreateString(Vector vector) {
        return null;
    }

    @Override // antlr.CodeGenerator
    public void gen() {
        try {
            Enumeration elements = this.behavior.grammars.elements();
            while (elements.hasMoreElements()) {
                Grammar grammar = (Grammar) elements.nextElement();
                grammar.setCodeGenerator(this);
                grammar.generate();
                if (this.antlrTool.hasError()) {
                    this.antlrTool.fatalError("Exiting due to errors.");
                }
            }
        } catch (IOException e10) {
            this.antlrTool.reportException(e10, null);
        }
    }

    @Override // antlr.CodeGenerator
    public void gen(AlternativeBlock alternativeBlock) {
        genGenericBlock(alternativeBlock, "");
    }

    @Override // antlr.CodeGenerator
    public void gen(CharLiteralElement charLiteralElement) {
        if (charLiteralElement.not) {
            _print("~");
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(HTMLEncode(charLiteralElement.atomText));
        stringBuffer.append(" ");
        _print(stringBuffer.toString());
    }

    @Override // antlr.CodeGenerator
    public void gen(CharRangeElement charRangeElement) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(charRangeElement.beginText);
        stringBuffer.append("..");
        stringBuffer.append(charRangeElement.endText);
        stringBuffer.append(" ");
        print(stringBuffer.toString());
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
        String str = this.grammar.comment;
        if (str != null) {
            _println(HTMLEncode(str));
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("<para>Definition of lexer ");
        stringBuffer3.append(this.grammar.getClassName());
        stringBuffer3.append(", which is a subclass of ");
        stringBuffer3.append(this.grammar.getSuperClass());
        stringBuffer3.append(".</para>");
        println(stringBuffer3.toString());
        genNextToken();
        Enumeration elements = this.grammar.rules.elements();
        while (elements.hasMoreElements()) {
            RuleSymbol ruleSymbol = (RuleSymbol) elements.nextElement();
            if (!ruleSymbol.f4237id.equals("mnextToken")) {
                genRule(ruleSymbol);
            }
        }
        this.currentOutput.close();
        this.currentOutput = null;
        this.doingLexRules = false;
    }

    @Override // antlr.CodeGenerator
    public void gen(OneOrMoreBlock oneOrMoreBlock) {
        genGenericBlock(oneOrMoreBlock, Operator.Operation.PLUS);
    }

    @Override // antlr.CodeGenerator
    public void gen(ParserGrammar parserGrammar) {
        setGrammar(parserGrammar);
        Tool tool = this.antlrTool;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Generating ");
        stringBuffer.append(this.grammar.getClassName());
        stringBuffer.append(".sgml");
        tool.reportProgress(stringBuffer.toString());
        Tool tool2 = this.antlrTool;
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(this.grammar.getClassName());
        stringBuffer2.append(".sgml");
        this.currentOutput = tool2.openOutputFile(stringBuffer2.toString());
        this.tabs = 0;
        genHeader();
        println("");
        String str = this.grammar.comment;
        if (str != null) {
            _println(HTMLEncode(str));
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("<para>Definition of parser ");
        stringBuffer3.append(this.grammar.getClassName());
        stringBuffer3.append(", which is a subclass of ");
        stringBuffer3.append(this.grammar.getSuperClass());
        stringBuffer3.append(".</para>");
        println(stringBuffer3.toString());
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
        genTail();
        this.currentOutput.close();
        this.currentOutput = null;
    }

    @Override // antlr.CodeGenerator
    public void gen(RuleRefElement ruleRefElement) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<link linkend=\"");
        stringBuffer.append(QuoteForId(ruleRefElement.targetRule));
        stringBuffer.append("\">");
        _print(stringBuffer.toString());
        _print(ruleRefElement.targetRule);
        _print("</link>");
        _print(" ");
    }

    @Override // antlr.CodeGenerator
    public void gen(StringLiteralElement stringLiteralElement) {
        if (stringLiteralElement.not) {
            _print("~");
        }
        _print(HTMLEncode(stringLiteralElement.atomText));
        _print(" ");
    }

    @Override // antlr.CodeGenerator
    public void gen(TokenRangeElement tokenRangeElement) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(tokenRangeElement.beginText);
        stringBuffer.append("..");
        stringBuffer.append(tokenRangeElement.endText);
        stringBuffer.append(" ");
        print(stringBuffer.toString());
    }

    @Override // antlr.CodeGenerator
    public void gen(TokenRefElement tokenRefElement) {
        if (tokenRefElement.not) {
            _print("~");
        }
        _print(tokenRefElement.atomText);
        _print(" ");
    }

    @Override // antlr.CodeGenerator
    public void gen(TreeElement treeElement) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(treeElement);
        stringBuffer.append(" ");
        print(stringBuffer.toString());
    }

    @Override // antlr.CodeGenerator
    public void gen(TreeWalkerGrammar treeWalkerGrammar) {
        setGrammar(treeWalkerGrammar);
        Tool tool = this.antlrTool;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Generating ");
        stringBuffer.append(this.grammar.getClassName());
        stringBuffer.append(".sgml");
        tool.reportProgress(stringBuffer.toString());
        Tool tool2 = this.antlrTool;
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(this.grammar.getClassName());
        stringBuffer2.append(".sgml");
        this.currentOutput = tool2.openOutputFile(stringBuffer2.toString());
        this.tabs = 0;
        genHeader();
        println("");
        println("");
        String str = this.grammar.comment;
        if (str != null) {
            _println(HTMLEncode(str));
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("<para>Definition of tree parser ");
        stringBuffer3.append(this.grammar.getClassName());
        stringBuffer3.append(", which is a subclass of ");
        stringBuffer3.append(this.grammar.getSuperClass());
        stringBuffer3.append(".</para>");
        println(stringBuffer3.toString());
        println("");
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
        this.currentOutput.close();
        this.currentOutput = null;
    }

    @Override // antlr.CodeGenerator
    public void gen(WildcardElement wildcardElement) {
        _print(". ");
    }

    @Override // antlr.CodeGenerator
    public void gen(ZeroOrMoreBlock zeroOrMoreBlock) {
        genGenericBlock(zeroOrMoreBlock, Operator.Operation.MULTIPLY);
    }
}
