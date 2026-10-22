package antlr.debug;

import antlr.CommonToken;
import antlr.LLkParser;
import antlr.ParseTree;
import antlr.ParseTreeRule;
import antlr.ParseTreeToken;
import antlr.ParserSharedInputState;
import antlr.TokenBuffer;
import antlr.TokenStream;
import antlr.collections.impl.BitSet;
import java.util.Stack;

/* loaded from: classes.dex */
public class ParseTreeDebugParser extends LLkParser {
    protected Stack currentParseTreeRoot;
    protected ParseTreeRule mostRecentParseTreeRoot;
    protected int numberOfDerivationSteps;

    public ParseTreeDebugParser(int i10) {
        super(i10);
        this.currentParseTreeRoot = new Stack();
        this.mostRecentParseTreeRoot = null;
        this.numberOfDerivationSteps = 1;
    }

    protected void addCurrentTokenToParseTree() {
        ParseTreeToken parseTreeToken;
        if (this.inputState.guessing > 0) {
            return;
        }
        ParseTreeRule parseTreeRule = (ParseTreeRule) this.currentParseTreeRoot.peek();
        if (mo4816LA(1) == 1) {
            parseTreeToken = new ParseTreeToken(new CommonToken("EOF"));
        } else {
            parseTreeToken = new ParseTreeToken(mo4817LT(1));
        }
        parseTreeRule.addChild(parseTreeToken);
    }

    public int getNumberOfDerivationSteps() {
        return this.numberOfDerivationSteps;
    }

    public ParseTree getParseTree() {
        return this.mostRecentParseTreeRoot;
    }

    @Override // antlr.Parser
    public void match(int i10) {
        addCurrentTokenToParseTree();
        super.match(i10);
    }

    @Override // antlr.Parser
    public void matchNot(int i10) {
        addCurrentTokenToParseTree();
        super.matchNot(i10);
    }

    @Override // antlr.LLkParser, antlr.Parser
    public void traceIn(String str) {
        if (this.inputState.guessing > 0) {
            return;
        }
        ParseTreeRule parseTreeRule = new ParseTreeRule(str);
        if (this.currentParseTreeRoot.size() > 0) {
            ((ParseTreeRule) this.currentParseTreeRoot.peek()).addChild(parseTreeRule);
        }
        this.currentParseTreeRoot.push(parseTreeRule);
        this.numberOfDerivationSteps++;
    }

    @Override // antlr.LLkParser, antlr.Parser
    public void traceOut(String str) {
        if (this.inputState.guessing > 0) {
            return;
        }
        this.mostRecentParseTreeRoot = (ParseTreeRule) this.currentParseTreeRoot.pop();
    }

    @Override // antlr.Parser
    public void match(BitSet bitSet) {
        addCurrentTokenToParseTree();
        super.match(bitSet);
    }

    public ParseTreeDebugParser(ParserSharedInputState parserSharedInputState, int i10) {
        super(parserSharedInputState, i10);
        this.currentParseTreeRoot = new Stack();
        this.mostRecentParseTreeRoot = null;
        this.numberOfDerivationSteps = 1;
    }

    public ParseTreeDebugParser(TokenBuffer tokenBuffer, int i10) {
        super(tokenBuffer, i10);
        this.currentParseTreeRoot = new Stack();
        this.mostRecentParseTreeRoot = null;
        this.numberOfDerivationSteps = 1;
    }

    public ParseTreeDebugParser(TokenStream tokenStream, int i10) {
        super(tokenStream, i10);
        this.currentParseTreeRoot = new Stack();
        this.mostRecentParseTreeRoot = null;
        this.numberOfDerivationSteps = 1;
    }
}
