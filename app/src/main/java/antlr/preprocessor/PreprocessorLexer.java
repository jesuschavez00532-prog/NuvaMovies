package antlr.preprocessor;

import antlr.ANTLRHashString;
import antlr.ByteBuffer;
import antlr.CharBuffer;
import antlr.CharScanner;
import antlr.CharStreamException;
import antlr.CharStreamIOException;
import antlr.InputBuffer;
import antlr.LexerSharedInputState;
import antlr.NoViableAltForCharException;
import antlr.RecognitionException;
import antlr.Token;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.TokenStreamRecognitionException;
import antlr.collections.impl.BitSet;
import java.io.InputStream;
import java.io.Reader;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class PreprocessorLexer extends CharScanner implements PreprocessorTokenTypes {
    public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
    public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
    public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
    public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
    public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
    public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
    public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
    public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
    public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
    public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
    public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());

    public PreprocessorLexer(InputStream inputStream) {
        this(new ByteBuffer(inputStream));
    }

    private static final long[] mk_tokenSet_0() {
        long[] jArr = new long[8];
        jArr[0] = -576460752303423496L;
        for (int i10 = 1; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_1() {
        return new long[]{4294977024L, 0, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_10() {
        return new long[]{140741783332352L, 576460752303423488L, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_2() {
        long[] jArr = new long[8];
        jArr[0] = -2199023255560L;
        for (int i10 = 1; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_3() {
        long[] jArr = new long[8];
        jArr[0] = -576462951326679048L;
        for (int i10 = 1; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_4() {
        return new long[]{4294977024L, 1152921504606846976L, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_5() {
        long[] jArr = new long[8];
        jArr[0] = -576605355262354440L;
        jArr[1] = -576460752303423489L;
        for (int i10 = 2; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_6() {
        long[] jArr = new long[8];
        jArr[0] = -549755813896L;
        for (int i10 = 1; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_7() {
        long[] jArr = new long[8];
        jArr[0] = -17179869192L;
        jArr[1] = -268435457;
        for (int i10 = 2; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_8() {
        long[] jArr = new long[8];
        jArr[0] = -549755813896L;
        jArr[1] = -268435457;
        for (int i10 = 2; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_9() {
        return new long[]{140758963201536L, 576460752303423488L, 0, 0, 0};
    }

    public final void mACTION(boolean z10) {
        Token token;
        int length = this.text.length();
        match('{');
        while (mo4814LA(1) != '}') {
            if ((mo4814LA(1) == '\n' || mo4814LA(1) == '\r') && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                mNEWLINE(false);
            } else if (mo4814LA(1) == '{' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                mACTION(false);
            } else if (mo4814LA(1) == '\'' && _tokenSet_6.member(mo4814LA(2))) {
                mCHAR_LITERAL(false);
            } else if (mo4814LA(1) == '/' && (mo4814LA(2) == '*' || mo4814LA(2) == '/')) {
                mCOMMENT(false);
            } else if (mo4814LA(1) == '\"' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                mSTRING_LITERAL(false);
            } else if (mo4814LA(1) < 3 || mo4814LA(1) > 255 || mo4814LA(2) < 3 || mo4814LA(2) > 255) {
                break;
            } else {
                matchNot(CharScanner.EOF_CHAR);
            }
        }
        match('}');
        if (z10) {
            token = makeToken(7);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r5 = makeToken(27);
        r5.setText(new java.lang.String(r4.text.getBuffer(), r0, r4.text.length() - r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void mALT(boolean r5) {
        /*
            r4 = this;
            antlr.ANTLRStringBuffer r0 = r4.text
            int r0 = r0.length()
        L6:
            antlr.collections.impl.BitSet r1 = antlr.preprocessor.PreprocessorLexer._tokenSet_3
            r2 = 1
            char r2 = r4.mo4814LA(r2)
            boolean r1 = r1.member(r2)
            if (r1 == 0) goto L28
            r1 = 2
            char r2 = r4.mo4814LA(r1)
            r3 = 3
            if (r2 < r3) goto L28
            char r1 = r4.mo4814LA(r1)
            r2 = 255(0xff, float:3.57E-43)
            if (r1 > r2) goto L28
            r1 = 0
            r4.mELEMENT(r1)
            goto L6
        L28:
            if (r5 == 0) goto L46
            r5 = 27
            antlr.Token r5 = r4.makeToken(r5)
            java.lang.String r1 = new java.lang.String
            antlr.ANTLRStringBuffer r2 = r4.text
            char[] r2 = r2.getBuffer()
            antlr.ANTLRStringBuffer r3 = r4.text
            int r3 = r3.length()
            int r3 = r3 - r0
            r1.<init>(r2, r0, r3)
            r5.setText(r1)
            goto L47
        L46:
            r5 = 0
        L47:
            r4._returnToken = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.preprocessor.PreprocessorLexer.mALT(boolean):void");
    }

    public final void mARG_ACTION(boolean z10) {
        Token token;
        int length = this.text.length();
        match('[');
        while (mo4814LA(1) != ']') {
            if (mo4814LA(1) == '[' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                mARG_ACTION(false);
            } else if ((mo4814LA(1) == '\n' || mo4814LA(1) == '\r') && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                mNEWLINE(false);
            } else if (mo4814LA(1) == '\'' && _tokenSet_6.member(mo4814LA(2))) {
                mCHAR_LITERAL(false);
            } else if (mo4814LA(1) == '\"' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                mSTRING_LITERAL(false);
            } else if (mo4814LA(1) < 3 || mo4814LA(1) > 255 || mo4814LA(2) < 3 || mo4814LA(2) > 255) {
                break;
            } else {
                matchNot(CharScanner.EOF_CHAR);
            }
        }
        match(']');
        if (z10) {
            token = makeToken(20);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mASSIGN_RHS(boolean z10) {
        Token token;
        int length = this.text.length();
        int length2 = this.text.length();
        match('=');
        this.text.setLength(length2);
        while (mo4814LA(1) != ';') {
            if (mo4814LA(1) == '\"' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                mSTRING_LITERAL(false);
            } else if (mo4814LA(1) == '\'' && _tokenSet_6.member(mo4814LA(2))) {
                mCHAR_LITERAL(false);
            } else if ((mo4814LA(1) == '\n' || mo4814LA(1) == '\r') && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                mNEWLINE(false);
            } else if (mo4814LA(1) < 3 || mo4814LA(1) > 255 || mo4814LA(2) < 3 || mo4814LA(2) > 255) {
                break;
            } else {
                matchNot(CharScanner.EOF_CHAR);
            }
        }
        match(';');
        if (z10) {
            token = makeToken(14);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mBANG(boolean z10) {
        Token token;
        int length = this.text.length();
        match('!');
        if (z10) {
            token = makeToken(19);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mCHAR_LITERAL(boolean z10) {
        Token token;
        int length = this.text.length();
        match('\'');
        if (mo4814LA(1) == '\\') {
            mESC(false);
        } else if (_tokenSet_8.member(mo4814LA(1))) {
            matchNot('\'');
        } else {
            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
        }
        match('\'');
        if (z10) {
            token = makeToken(38);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mCOMMA(boolean z10) {
        Token token;
        int length = this.text.length();
        match(',');
        if (z10) {
            token = makeToken(24);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mCOMMENT(boolean z10) {
        this.text.length();
        if (mo4814LA(1) == '/' && mo4814LA(2) == '/') {
            mSL_COMMENT(false);
        } else if (mo4814LA(1) == '/' && mo4814LA(2) == '*') {
            mML_COMMENT(false);
        } else {
            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
        }
        this._returnToken = null;
    }

    protected final void mCURLY_BLOCK_SCARF(boolean z10) {
        Token token;
        int length = this.text.length();
        match('{');
        while (mo4814LA(1) != '}') {
            if ((mo4814LA(1) == '\n' || mo4814LA(1) == '\r') && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                mNEWLINE(false);
            } else if (mo4814LA(1) == '\"' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                mSTRING_LITERAL(false);
            } else if (mo4814LA(1) == '\'' && _tokenSet_6.member(mo4814LA(2))) {
                mCHAR_LITERAL(false);
            } else if (mo4814LA(1) == '/' && (mo4814LA(2) == '*' || mo4814LA(2) == '/')) {
                mCOMMENT(false);
            } else if (mo4814LA(1) < 3 || mo4814LA(1) > 255 || mo4814LA(2) < 3 || mo4814LA(2) > 255) {
                break;
            } else {
                matchNot(CharScanner.EOF_CHAR);
            }
        }
        match('}');
        if (z10) {
            token = makeToken(32);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mDIGIT(boolean z10) {
        Token token;
        int length = this.text.length();
        matchRange('0', '9');
        if (z10) {
            token = makeToken(41);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mELEMENT(boolean z10) {
        Token token;
        int length = this.text.length();
        char mo4814LA = mo4814LA(1);
        if (mo4814LA != '\n' && mo4814LA != '\r') {
            if (mo4814LA != '\"') {
                if (mo4814LA != '/') {
                    if (mo4814LA != '{') {
                        if (mo4814LA != '\'') {
                            if (mo4814LA != '(') {
                                BitSet bitSet = _tokenSet_5;
                                if (bitSet.member(mo4814LA(1))) {
                                    match(bitSet);
                                } else {
                                    throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                                }
                            } else {
                                mSUBRULE_BLOCK(false);
                            }
                        } else {
                            mCHAR_LITERAL(false);
                        }
                    } else {
                        mACTION(false);
                    }
                } else {
                    mCOMMENT(false);
                }
            } else {
                mSTRING_LITERAL(false);
            }
        } else {
            mNEWLINE(false);
        }
        if (z10) {
            token = makeToken(28);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mESC(boolean z10) {
        Token token;
        int length = this.text.length();
        match('\\');
        char mo4814LA = mo4814LA(1);
        if (mo4814LA != '\"') {
            if (mo4814LA != '\'') {
                if (mo4814LA != '\\') {
                    if (mo4814LA != 'f') {
                        if (mo4814LA != 'n') {
                            if (mo4814LA != 'r') {
                                if (mo4814LA != 'w') {
                                    if (mo4814LA != 'a') {
                                        if (mo4814LA != 'b') {
                                            if (mo4814LA != 't') {
                                                if (mo4814LA != 'u') {
                                                    switch (mo4814LA) {
                                                        case '0':
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                            matchRange('0', '3');
                                                            if (mo4814LA(1) >= '0' && mo4814LA(1) <= '9' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                                                                mDIGIT(false);
                                                                if (mo4814LA(1) >= '0' && mo4814LA(1) <= '9' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                                                                    mDIGIT(false);
                                                                    break;
                                                                } else if (mo4814LA(1) < 3 || mo4814LA(1) > 255) {
                                                                    throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                                                                }
                                                            } else if (mo4814LA(1) < 3 || mo4814LA(1) > 255) {
                                                                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                                                            }
                                                            break;
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                            matchRange('4', '7');
                                                            if (mo4814LA(1) >= '0' && mo4814LA(1) <= '9' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                                                                mDIGIT(false);
                                                                break;
                                                            } else if (mo4814LA(1) < 3 || mo4814LA(1) > 255) {
                                                                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                                                            }
                                                            break;
                                                        default:
                                                            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                                                    }
                                                } else {
                                                    match('u');
                                                    mXDIGIT(false);
                                                    mXDIGIT(false);
                                                    mXDIGIT(false);
                                                    mXDIGIT(false);
                                                }
                                            } else {
                                                match('t');
                                            }
                                        } else {
                                            match('b');
                                        }
                                    } else {
                                        match('a');
                                    }
                                } else {
                                    match('w');
                                }
                            } else {
                                match('r');
                            }
                        } else {
                            match('n');
                        }
                    } else {
                        match('f');
                    }
                } else {
                    match('\\');
                }
            } else {
                match('\'');
            }
        } else {
            match('\"');
        }
        if (z10) {
            token = makeToken(40);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        switch(r2) {
            case 65: goto L26;
            case 66: goto L26;
            case 67: goto L26;
            case 68: goto L26;
            case 69: goto L26;
            case 70: goto L26;
            case 71: goto L26;
            case 72: goto L26;
            case 73: goto L26;
            case 74: goto L26;
            case 75: goto L26;
            case 76: goto L26;
            case 77: goto L26;
            case 78: goto L26;
            case 79: goto L26;
            case 80: goto L26;
            case 81: goto L26;
            case 82: goto L26;
            case 83: goto L26;
            case 84: goto L26;
            case 85: goto L26;
            case 86: goto L26;
            case 87: goto L26;
            case 88: goto L26;
            case 89: goto L26;
            case 90: goto L26;
            default: goto L30;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        matchRange('A', 'Z');
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        switch(r2) {
            case 97: goto L22;
            case 98: goto L22;
            case 99: goto L22;
            case 100: goto L22;
            case 101: goto L22;
            case 102: goto L22;
            case 103: goto L22;
            case 104: goto L22;
            case 105: goto L22;
            case 106: goto L22;
            case 107: goto L22;
            case 108: goto L22;
            case 109: goto L22;
            case 110: goto L22;
            case 111: goto L22;
            case 112: goto L22;
            case 113: goto L22;
            case 114: goto L22;
            case 115: goto L22;
            case 116: goto L22;
            case 117: goto L22;
            case 118: goto L22;
            case 119: goto L22;
            case 120: goto L22;
            case 121: goto L22;
            case 122: goto L22;
            default: goto L27;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        matchRange('a', 'z');
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        r1 = testLiteralsTable(new java.lang.String(r9.text.getBuffer(), r0, r9.text.length() - r0), 9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r10 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        if (r1 == (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        r10 = makeToken(r1);
        r10.setText(new java.lang.String(r9.text.getBuffer(), r0, r9.text.length() - r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        r9._returnToken = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        r10 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void mID(boolean r10) {
        /*
            r9 = this;
            antlr.ANTLRStringBuffer r0 = r9.text
            int r0 = r0.length()
            r1 = 1
            char r2 = r9.mo4814LA(r1)
            r3 = 122(0x7a, float:1.71E-43)
            r4 = 97
            r5 = 90
            r6 = 65
            r7 = 95
            switch(r2) {
                case 65: goto L36;
                case 66: goto L36;
                case 67: goto L36;
                case 68: goto L36;
                case 69: goto L36;
                case 70: goto L36;
                case 71: goto L36;
                case 72: goto L36;
                case 73: goto L36;
                case 74: goto L36;
                case 75: goto L36;
                case 76: goto L36;
                case 77: goto L36;
                case 78: goto L36;
                case 79: goto L36;
                case 80: goto L36;
                case 81: goto L36;
                case 82: goto L36;
                case 83: goto L36;
                case 84: goto L36;
                case 85: goto L36;
                case 86: goto L36;
                case 87: goto L36;
                case 88: goto L36;
                case 89: goto L36;
                case 90: goto L36;
                case 91: goto L18;
                case 92: goto L18;
                case 93: goto L18;
                case 94: goto L18;
                case 95: goto L32;
                case 96: goto L18;
                case 97: goto L2e;
                case 98: goto L2e;
                case 99: goto L2e;
                case 100: goto L2e;
                case 101: goto L2e;
                case 102: goto L2e;
                case 103: goto L2e;
                case 104: goto L2e;
                case 105: goto L2e;
                case 106: goto L2e;
                case 107: goto L2e;
                case 108: goto L2e;
                case 109: goto L2e;
                case 110: goto L2e;
                case 111: goto L2e;
                case 112: goto L2e;
                case 113: goto L2e;
                case 114: goto L2e;
                case 115: goto L2e;
                case 116: goto L2e;
                case 117: goto L2e;
                case 118: goto L2e;
                case 119: goto L2e;
                case 120: goto L2e;
                case 121: goto L2e;
                case 122: goto L2e;
                default: goto L18;
            }
        L18:
            antlr.NoViableAltForCharException r10 = new antlr.NoViableAltForCharException
            char r0 = r9.mo4814LA(r1)
            java.lang.String r1 = r9.getFilename()
            int r2 = r9.getLine()
            int r3 = r9.getColumn()
            r10.<init>(r0, r1, r2, r3)
            throw r10
        L2e:
            r9.matchRange(r4, r3)
            goto L39
        L32:
            r9.match(r7)
            goto L39
        L36:
            r9.matchRange(r6, r5)
        L39:
            char r2 = r9.mo4814LA(r1)
            if (r2 == r7) goto L93
            switch(r2) {
                case 48: goto L8b;
                case 49: goto L8b;
                case 50: goto L8b;
                case 51: goto L8b;
                case 52: goto L8b;
                case 53: goto L8b;
                case 54: goto L8b;
                case 55: goto L8b;
                case 56: goto L8b;
                case 57: goto L8b;
                default: goto L42;
            }
        L42:
            switch(r2) {
                case 65: goto L87;
                case 66: goto L87;
                case 67: goto L87;
                case 68: goto L87;
                case 69: goto L87;
                case 70: goto L87;
                case 71: goto L87;
                case 72: goto L87;
                case 73: goto L87;
                case 74: goto L87;
                case 75: goto L87;
                case 76: goto L87;
                case 77: goto L87;
                case 78: goto L87;
                case 79: goto L87;
                case 80: goto L87;
                case 81: goto L87;
                case 82: goto L87;
                case 83: goto L87;
                case 84: goto L87;
                case 85: goto L87;
                case 86: goto L87;
                case 87: goto L87;
                case 88: goto L87;
                case 89: goto L87;
                case 90: goto L87;
                default: goto L45;
            }
        L45:
            switch(r2) {
                case 97: goto L83;
                case 98: goto L83;
                case 99: goto L83;
                case 100: goto L83;
                case 101: goto L83;
                case 102: goto L83;
                case 103: goto L83;
                case 104: goto L83;
                case 105: goto L83;
                case 106: goto L83;
                case 107: goto L83;
                case 108: goto L83;
                case 109: goto L83;
                case 110: goto L83;
                case 111: goto L83;
                case 112: goto L83;
                case 113: goto L83;
                case 114: goto L83;
                case 115: goto L83;
                case 116: goto L83;
                case 117: goto L83;
                case 118: goto L83;
                case 119: goto L83;
                case 120: goto L83;
                case 121: goto L83;
                case 122: goto L83;
                default: goto L48;
            }
        L48:
            java.lang.String r1 = new java.lang.String
            antlr.ANTLRStringBuffer r2 = r9.text
            char[] r2 = r2.getBuffer()
            antlr.ANTLRStringBuffer r3 = r9.text
            int r3 = r3.length()
            int r3 = r3 - r0
            r1.<init>(r2, r0, r3)
            r2 = 9
            int r1 = r9.testLiteralsTable(r1, r2)
            if (r10 == 0) goto L7f
            r10 = -1
            if (r1 == r10) goto L7f
            antlr.Token r10 = r9.makeToken(r1)
            java.lang.String r1 = new java.lang.String
            antlr.ANTLRStringBuffer r2 = r9.text
            char[] r2 = r2.getBuffer()
            antlr.ANTLRStringBuffer r3 = r9.text
            int r3 = r3.length()
            int r3 = r3 - r0
            r1.<init>(r2, r0, r3)
            r10.setText(r1)
            goto L80
        L7f:
            r10 = 0
        L80:
            r9._returnToken = r10
            return
        L83:
            r9.matchRange(r4, r3)
            goto L39
        L87:
            r9.matchRange(r6, r5)
            goto L39
        L8b:
            r2 = 48
            r8 = 57
            r9.matchRange(r2, r8)
            goto L39
        L93:
            r9.match(r7)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.preprocessor.PreprocessorLexer.mID(boolean):void");
    }

    public final void mID_OR_KEYWORD(boolean z10) {
        Token token;
        int length = this.text.length();
        mID(true);
        Token token2 = this._returnToken;
        int type = token2.getType();
        BitSet bitSet = _tokenSet_9;
        if (bitSet.member(mo4814LA(1)) && mo4814LA(2) >= 3 && mo4814LA(2) <= 255 && token2.getText().equals("header")) {
            if (_tokenSet_1.member(mo4814LA(1)) && bitSet.member(mo4814LA(2))) {
                mWS(false);
            } else if (!bitSet.member(mo4814LA(1)) || mo4814LA(2) < 3 || mo4814LA(2) > 255) {
                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
            }
            char mo4814LA = mo4814LA(1);
            if (mo4814LA != '\t' && mo4814LA != '\n' && mo4814LA != '\r' && mo4814LA != ' ') {
                if (mo4814LA != '\"') {
                    if (mo4814LA != '/' && mo4814LA != '{') {
                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                    }
                } else {
                    mSTRING_LITERAL(false);
                }
            }
            while (true) {
                char mo4814LA2 = mo4814LA(1);
                if (mo4814LA2 != '\t' && mo4814LA2 != '\n' && mo4814LA2 != '\r' && mo4814LA2 != ' ') {
                    if (mo4814LA2 != '/') {
                        break;
                    } else {
                        mCOMMENT(false);
                    }
                } else {
                    mWS(false);
                }
            }
            mACTION(false);
            type = 5;
        } else {
            BitSet bitSet2 = _tokenSet_10;
            if (bitSet2.member(mo4814LA(1)) && mo4814LA(2) >= 3 && mo4814LA(2) <= 255 && token2.getText().equals("tokens")) {
                while (true) {
                    char mo4814LA3 = mo4814LA(1);
                    if (mo4814LA3 != '\t' && mo4814LA3 != '\n' && mo4814LA3 != '\r' && mo4814LA3 != ' ') {
                        if (mo4814LA3 != '/') {
                            break;
                        } else {
                            mCOMMENT(false);
                        }
                    } else {
                        mWS(false);
                    }
                }
                mCURLY_BLOCK_SCARF(false);
                type = 12;
            } else if (bitSet2.member(mo4814LA(1)) && token2.getText().equals("options")) {
                while (true) {
                    char mo4814LA4 = mo4814LA(1);
                    if (mo4814LA4 != '\t' && mo4814LA4 != '\n' && mo4814LA4 != '\r' && mo4814LA4 != ' ') {
                        if (mo4814LA4 != '/') {
                            break;
                        } else {
                            mCOMMENT(false);
                        }
                    } else {
                        mWS(false);
                    }
                }
                match('{');
                type = 13;
            }
        }
        if (z10 && type != -1) {
            token = makeToken(type);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mLPAREN(boolean z10) {
        Token token;
        int length = this.text.length();
        match('(');
        if (z10) {
            token = makeToken(29);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mML_COMMENT(boolean z10) {
        Token token;
        int length = this.text.length();
        match("/*");
        while (true) {
            if (mo4814LA(1) != '*' || mo4814LA(2) != '/') {
                if ((mo4814LA(1) == '\n' || mo4814LA(1) == '\r') && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                    mNEWLINE(false);
                } else if (mo4814LA(1) < 3 || mo4814LA(1) > 255 || mo4814LA(2) < 3 || mo4814LA(2) > 255) {
                    break;
                } else {
                    matchNot(CharScanner.EOF_CHAR);
                }
            } else {
                break;
            }
        }
        match("*/");
        if (z10) {
            token = makeToken(37);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mNEWLINE(boolean z10) {
        Token token;
        int length = this.text.length();
        if (mo4814LA(1) == '\r' && mo4814LA(2) == '\n') {
            match('\r');
            match('\n');
            newline();
        } else if (mo4814LA(1) == '\r') {
            match('\r');
            newline();
        } else if (mo4814LA(1) == '\n') {
            match('\n');
            newline();
        } else {
            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
        }
        if (z10) {
            token = makeToken(34);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mRCURLY(boolean z10) {
        Token token;
        int length = this.text.length();
        match('}');
        if (z10) {
            token = makeToken(15);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mRPAREN(boolean z10) {
        Token token;
        int length = this.text.length();
        match(')');
        if (z10) {
            token = makeToken(30);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mRULE_BLOCK(boolean z10) {
        Token token;
        int length = this.text.length();
        match(':');
        if (_tokenSet_1.member(mo4814LA(1)) && _tokenSet_2.member(mo4814LA(2))) {
            int length2 = this.text.length();
            mWS(false);
            this.text.setLength(length2);
        } else if (!_tokenSet_2.member(mo4814LA(1))) {
            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
        }
        mALT(false);
        char mo4814LA = mo4814LA(1);
        if (mo4814LA != '\t' && mo4814LA != '\n' && mo4814LA != '\r' && mo4814LA != ' ') {
            if (mo4814LA != ';' && mo4814LA != '|') {
                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
            }
        } else {
            int length3 = this.text.length();
            mWS(false);
            this.text.setLength(length3);
        }
        while (mo4814LA(1) == '|') {
            match('|');
            if (_tokenSet_1.member(mo4814LA(1)) && _tokenSet_2.member(mo4814LA(2))) {
                int length4 = this.text.length();
                mWS(false);
                this.text.setLength(length4);
            } else if (!_tokenSet_2.member(mo4814LA(1))) {
                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
            }
            mALT(false);
            char mo4814LA2 = mo4814LA(1);
            if (mo4814LA2 != '\t' && mo4814LA2 != '\n' && mo4814LA2 != '\r' && mo4814LA2 != ' ') {
                if (mo4814LA2 != ';' && mo4814LA2 != '|') {
                    throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                }
            } else {
                int length5 = this.text.length();
                mWS(false);
                this.text.setLength(length5);
            }
        }
        match(';');
        if (z10) {
            token = makeToken(22);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mSEMI(boolean z10) {
        Token token;
        int length = this.text.length();
        match(';');
        if (z10) {
            token = makeToken(11);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mSL_COMMENT(boolean z10) {
        Token token;
        int length = this.text.length();
        match("//");
        while (mo4814LA(1) != '\n' && mo4814LA(1) != '\r' && mo4814LA(1) >= 3 && mo4814LA(1) <= 255 && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
            matchNot(CharScanner.EOF_CHAR);
        }
        mNEWLINE(false);
        if (z10) {
            token = makeToken(36);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mSTRING_LITERAL(boolean z10) {
        Token token;
        int length = this.text.length();
        match('\"');
        while (true) {
            if (mo4814LA(1) == '\\') {
                mESC(false);
            } else if (!_tokenSet_7.member(mo4814LA(1))) {
                break;
            } else {
                matchNot('\"');
            }
        }
        match('\"');
        if (z10) {
            token = makeToken(39);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mSUBRULE_BLOCK(boolean z10) {
        Token token;
        int length = this.text.length();
        match('(');
        if (_tokenSet_1.member(mo4814LA(1)) && _tokenSet_0.member(mo4814LA(2))) {
            mWS(false);
        } else if (!_tokenSet_0.member(mo4814LA(1))) {
            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
        }
        mALT(false);
        while (_tokenSet_4.member(mo4814LA(1))) {
            BitSet bitSet = _tokenSet_0;
            if (!bitSet.member(mo4814LA(2))) {
                break;
            }
            char mo4814LA = mo4814LA(1);
            if (mo4814LA != '\t' && mo4814LA != '\n' && mo4814LA != '\r' && mo4814LA != ' ') {
                if (mo4814LA != '|') {
                    throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                }
            } else {
                mWS(false);
            }
            match('|');
            if (_tokenSet_1.member(mo4814LA(1)) && bitSet.member(mo4814LA(2))) {
                mWS(false);
            } else if (!bitSet.member(mo4814LA(1))) {
                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
            }
            mALT(false);
        }
        char mo4814LA2 = mo4814LA(1);
        if (mo4814LA2 != '\t' && mo4814LA2 != '\n' && mo4814LA2 != '\r' && mo4814LA2 != ' ') {
            if (mo4814LA2 != ')') {
                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
            }
        } else {
            mWS(false);
        }
        match(')');
        if (mo4814LA(1) == '=' && mo4814LA(2) == '>') {
            match("=>");
        } else if (mo4814LA(1) == '*') {
            match('*');
        } else if (mo4814LA(1) == '+') {
            match('+');
        } else if (mo4814LA(1) == '?') {
            match('?');
        }
        if (z10) {
            token = makeToken(6);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mWS(boolean z10) {
        this.text.length();
        int i10 = 0;
        while (true) {
            if (mo4814LA(1) == ' ') {
                match(' ');
            } else if (mo4814LA(1) == '\t') {
                match('\t');
            } else if (mo4814LA(1) != '\n' && mo4814LA(1) != '\r') {
                break;
            } else {
                mNEWLINE(false);
            }
            i10++;
        }
        if (i10 >= 1) {
            this._returnToken = null;
            return;
        }
        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
    }

    protected final void mXDIGIT(boolean z10) {
        Token token;
        int length = this.text.length();
        char mo4814LA = mo4814LA(1);
        switch (mo4814LA) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                matchRange('0', '9');
                break;
            default:
                switch (mo4814LA) {
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                        matchRange('A', 'F');
                        break;
                    default:
                        switch (mo4814LA) {
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                matchRange('a', 'f');
                                break;
                            default:
                                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                        }
                }
        }
        if (z10) {
            token = makeToken(42);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0038. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x003b. Please report as an issue. */
    @Override // antlr.TokenStream
    public Token nextToken() {
        Token token;
        do {
            resetText();
            try {
                try {
                    char mo4814LA = mo4814LA(1);
                    if (mo4814LA != '\t' && mo4814LA != '\n' && mo4814LA != '\r') {
                        if (mo4814LA != '\'') {
                            if (mo4814LA != ')') {
                                if (mo4814LA != ',') {
                                    if (mo4814LA != '/') {
                                        if (mo4814LA != '=') {
                                            if (mo4814LA != '_') {
                                                if (mo4814LA != '}') {
                                                    if (mo4814LA != ':') {
                                                        if (mo4814LA != ';') {
                                                            switch (mo4814LA) {
                                                                case ' ':
                                                                    break;
                                                                case '!':
                                                                    mBANG(true);
                                                                    break;
                                                                case '\"':
                                                                    mSTRING_LITERAL(true);
                                                                    break;
                                                                default:
                                                                    switch (mo4814LA) {
                                                                        case 'A':
                                                                        case 'B':
                                                                        case 'C':
                                                                        case 'D':
                                                                        case 'E':
                                                                        case 'F':
                                                                        case 'G':
                                                                        case 'H':
                                                                        case 'I':
                                                                        case 'J':
                                                                        case 'K':
                                                                        case 'L':
                                                                        case 'M':
                                                                        case 'N':
                                                                        case 'O':
                                                                        case 'P':
                                                                        case 'Q':
                                                                        case 'R':
                                                                        case 'S':
                                                                        case 'T':
                                                                        case 'U':
                                                                        case 'V':
                                                                        case 'W':
                                                                        case 'X':
                                                                        case 'Y':
                                                                        case 'Z':
                                                                            break;
                                                                        case '[':
                                                                            mARG_ACTION(true);
                                                                            break;
                                                                        default:
                                                                            switch (mo4814LA) {
                                                                                case 'a':
                                                                                case 'b':
                                                                                case 'c':
                                                                                case 'd':
                                                                                case 'e':
                                                                                case 'f':
                                                                                case 'g':
                                                                                case 'h':
                                                                                case 'i':
                                                                                case 'j':
                                                                                case 'k':
                                                                                case 'l':
                                                                                case 'm':
                                                                                case 'n':
                                                                                case 'o':
                                                                                case 'p':
                                                                                case 'q':
                                                                                case 'r':
                                                                                case 's':
                                                                                case 't':
                                                                                case 'u':
                                                                                case 'v':
                                                                                case 'w':
                                                                                case 'x':
                                                                                case 'y':
                                                                                case 'z':
                                                                                    break;
                                                                                case '{':
                                                                                    mACTION(true);
                                                                                    break;
                                                                                default:
                                                                                    if (mo4814LA(1) == '(' && _tokenSet_0.member(mo4814LA(2))) {
                                                                                        mSUBRULE_BLOCK(true);
                                                                                        break;
                                                                                    } else if (mo4814LA(1) == '(') {
                                                                                        mLPAREN(true);
                                                                                        break;
                                                                                    } else if (mo4814LA(1) == 65535) {
                                                                                        uponEOF();
                                                                                        this._returnToken = makeToken(1);
                                                                                        break;
                                                                                    } else {
                                                                                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                                                                                    }
                                                                                    break;
                                                                            }
                                                                    }
                                                            }
                                                        } else {
                                                            mSEMI(true);
                                                        }
                                                    } else {
                                                        mRULE_BLOCK(true);
                                                    }
                                                } else {
                                                    mRCURLY(true);
                                                }
                                            }
                                            mID_OR_KEYWORD(true);
                                        } else {
                                            mASSIGN_RHS(true);
                                        }
                                    } else {
                                        mCOMMENT(true);
                                    }
                                } else {
                                    mCOMMA(true);
                                }
                            } else {
                                mRPAREN(true);
                            }
                        } else {
                            mCHAR_LITERAL(true);
                        }
                        token = this._returnToken;
                    }
                    mWS(true);
                    token = this._returnToken;
                } catch (RecognitionException e10) {
                    throw new TokenStreamRecognitionException(e10);
                }
            } catch (CharStreamException e11) {
                if (e11 instanceof CharStreamIOException) {
                    throw new TokenStreamIOException(((CharStreamIOException) e11).f4236io);
                }
                throw new TokenStreamException(e11.getMessage());
            }
        } while (token == null);
        this._returnToken.setType(testLiteralsTable(token.getType()));
        return this._returnToken;
    }

    public PreprocessorLexer(Reader reader) {
        this(new CharBuffer(reader));
    }

    public PreprocessorLexer(InputBuffer inputBuffer) {
        this(new LexerSharedInputState(inputBuffer));
    }

    public PreprocessorLexer(LexerSharedInputState lexerSharedInputState) {
        super(lexerSharedInputState);
        this.caseSensitiveLiterals = true;
        setCaseSensitive(true);
        Hashtable hashtable = new Hashtable();
        this.literals = hashtable;
        hashtable.put(new ANTLRHashString("public", this), new Integer(18));
        this.literals.put(new ANTLRHashString("class", this), new Integer(8));
        this.literals.put(new ANTLRHashString("throws", this), new Integer(23));
        this.literals.put(new ANTLRHashString("catch", this), new Integer(26));
        this.literals.put(new ANTLRHashString("private", this), new Integer(17));
        this.literals.put(new ANTLRHashString("extends", this), new Integer(10));
        this.literals.put(new ANTLRHashString("protected", this), new Integer(16));
        this.literals.put(new ANTLRHashString("returns", this), new Integer(21));
        this.literals.put(new ANTLRHashString("tokens", this), new Integer(4));
        this.literals.put(new ANTLRHashString("exception", this), new Integer(25));
    }
}
