package antlr;

import antlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class ANTLRTokdefParser extends LLkParser implements ANTLRTokdefParserTokenTypes {
    public static final String[] _tokenNames = {"<0>", "EOF", "<2>", "NULL_TREE_LOOKAHEAD", "ID", "STRING", "ASSIGN", "LPAREN", "RPAREN", "INT", "WS", "SL_COMMENT", "ML_COMMENT", "ESC", "DIGIT", "XDIGIT"};
    public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
    public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
    private Tool antlrTool;

    protected ANTLRTokdefParser(TokenBuffer tokenBuffer, int i10) {
        super(tokenBuffer, i10);
        this.tokenNames = _tokenNames;
    }

    private static final long[] mk_tokenSet_0() {
        return new long[]{2, 0};
    }

    private static final long[] mk_tokenSet_1() {
        return new long[]{50, 0};
    }

    public final void file(ImportVocabTokenManager importVocabTokenManager) {
        try {
            mo4817LT(1);
            match(4);
            while (true) {
                if (mo4816LA(1) == 4 || mo4816LA(1) == 5) {
                    line(importVocabTokenManager);
                } else {
                    return;
                }
            }
        } catch (RecognitionException e10) {
            reportError(e10);
            consume();
            consumeUntil(_tokenSet_0);
        }
    }

    protected Tool getTool() {
        return this.antlrTool;
    }

    public final void line(ImportVocabTokenManager importVocabTokenManager) {
        Token mo4817LT;
        Token token;
        try {
            Token token2 = null;
            if (mo4816LA(1) == 5) {
                Token mo4817LT2 = mo4817LT(1);
                match(5);
                token = null;
                token2 = mo4817LT2;
                mo4817LT = null;
            } else if (mo4816LA(1) == 4 && mo4816LA(2) == 6 && mo4816LA(3) == 5) {
                mo4817LT = mo4817LT(1);
                match(4);
                match(6);
                Token mo4817LT3 = mo4817LT(1);
                match(5);
                token = null;
                token2 = mo4817LT3;
            } else if (mo4816LA(1) == 4 && mo4816LA(2) == 7) {
                mo4817LT = mo4817LT(1);
                match(4);
                match(7);
                token = mo4817LT(1);
                match(5);
                match(8);
            } else if (mo4816LA(1) == 4 && mo4816LA(2) == 6 && mo4816LA(3) == 9) {
                mo4817LT = mo4817LT(1);
                match(4);
                token = null;
            } else {
                throw new NoViableAltException(mo4817LT(1), getFilename());
            }
            match(6);
            Token mo4817LT4 = mo4817LT(1);
            match(9);
            Integer valueOf = Integer.valueOf(mo4817LT4.getText());
            if (token2 != null) {
                importVocabTokenManager.define(token2.getText(), valueOf.intValue());
                if (mo4817LT != null) {
                    StringLiteralSymbol stringLiteralSymbol = (StringLiteralSymbol) importVocabTokenManager.getTokenSymbol(token2.getText());
                    stringLiteralSymbol.setLabel(mo4817LT.getText());
                    importVocabTokenManager.mapToTokenSymbol(mo4817LT.getText(), stringLiteralSymbol);
                    return;
                }
                return;
            }
            if (mo4817LT != null) {
                importVocabTokenManager.define(mo4817LT.getText(), valueOf.intValue());
                if (token != null) {
                    importVocabTokenManager.getTokenSymbol(mo4817LT.getText()).setParaphrase(token.getText());
                }
            }
        } catch (RecognitionException e10) {
            reportError(e10);
            consume();
            consumeUntil(_tokenSet_1);
        }
    }

    @Override // antlr.Parser
    public void reportError(String str) {
        if (getTool() != null) {
            getTool().error(str, getFilename(), -1, -1);
        } else {
            super.reportError(str);
        }
    }

    @Override // antlr.Parser
    public void reportWarning(String str) {
        if (getTool() != null) {
            getTool().warning(str, getFilename(), -1, -1);
        } else {
            super.reportWarning(str);
        }
    }

    public void setTool(Tool tool) {
        if (this.antlrTool == null) {
            this.antlrTool = tool;
            return;
        }
        throw new IllegalStateException("antlr.Tool already registered");
    }

    public ANTLRTokdefParser(TokenBuffer tokenBuffer) {
        this(tokenBuffer, 3);
    }

    protected ANTLRTokdefParser(TokenStream tokenStream, int i10) {
        super(tokenStream, i10);
        this.tokenNames = _tokenNames;
    }

    @Override // antlr.Parser
    public void reportError(RecognitionException recognitionException) {
        if (getTool() != null) {
            getTool().error(recognitionException.getErrorMessage(), recognitionException.getFilename(), recognitionException.getLine(), recognitionException.getColumn());
        } else {
            super.reportError(recognitionException);
        }
    }

    public ANTLRTokdefParser(TokenStream tokenStream) {
        this(tokenStream, 3);
    }

    public ANTLRTokdefParser(ParserSharedInputState parserSharedInputState) {
        super(parserSharedInputState, 3);
        this.tokenNames = _tokenNames;
    }
}
