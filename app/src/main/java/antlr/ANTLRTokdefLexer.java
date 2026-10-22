package antlr;

import antlr.collections.impl.BitSet;
import java.io.InputStream;
import java.io.Reader;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class ANTLRTokdefLexer extends CharScanner implements ANTLRTokdefParserTokenTypes {
    public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
    public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
    public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
    public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());

    public ANTLRTokdefLexer(InputStream inputStream) {
        this(new ByteBuffer(inputStream));
    }

    private static final long[] mk_tokenSet_0() {
        long[] jArr = new long[8];
        jArr[0] = -9224;
        for (int i10 = 1; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_1() {
        long[] jArr = new long[8];
        jArr[0] = -140737488355336L;
        for (int i10 = 1; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_2() {
        long[] jArr = new long[8];
        jArr[0] = -4398046512136L;
        for (int i10 = 1; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_3() {
        long[] jArr = new long[8];
        jArr[0] = -17179869192L;
        jArr[1] = -268435457;
        for (int i10 = 2; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    public final void mASSIGN(boolean z10) {
        Token token;
        int length = this.text.length();
        match('=');
        if (z10) {
            token = makeToken(6);
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
            token = makeToken(14);
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
                    if (mo4814LA != 'b') {
                        if (mo4814LA != 'f') {
                            if (mo4814LA != 'n') {
                                if (mo4814LA != 'r') {
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
                                    match('r');
                                }
                            } else {
                                match('n');
                            }
                        } else {
                            match('f');
                        }
                    } else {
                        match('b');
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
            token = makeToken(13);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        switch(r2) {
            case 65: goto L23;
            case 66: goto L23;
            case 67: goto L23;
            case 68: goto L23;
            case 69: goto L23;
            case 70: goto L23;
            case 71: goto L23;
            case 72: goto L23;
            case 73: goto L23;
            case 74: goto L23;
            case 75: goto L23;
            case 76: goto L23;
            case 77: goto L23;
            case 78: goto L23;
            case 79: goto L23;
            case 80: goto L23;
            case 81: goto L23;
            case 82: goto L23;
            case 83: goto L23;
            case 84: goto L23;
            case 85: goto L23;
            case 86: goto L23;
            case 87: goto L23;
            case 88: goto L23;
            case 89: goto L23;
            case 90: goto L23;
            default: goto L27;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        matchRange('A', 'Z');
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        switch(r2) {
            case 97: goto L19;
            case 98: goto L19;
            case 99: goto L19;
            case 100: goto L19;
            case 101: goto L19;
            case 102: goto L19;
            case 103: goto L19;
            case 104: goto L19;
            case 105: goto L19;
            case 106: goto L19;
            case 107: goto L19;
            case 108: goto L19;
            case 109: goto L19;
            case 110: goto L19;
            case 111: goto L19;
            case 112: goto L19;
            case 113: goto L19;
            case 114: goto L19;
            case 115: goto L19;
            case 116: goto L19;
            case 117: goto L19;
            case 118: goto L19;
            case 119: goto L19;
            case 120: goto L19;
            case 121: goto L19;
            case 122: goto L19;
            default: goto L24;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        matchRange('a', 'z');
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        if (r9 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        r9 = makeToken(4);
        r9.setText(new java.lang.String(r8.text.getBuffer(), r0, r8.text.length() - r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        r8._returnToken = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mID(boolean r9) {
        /*
            r8 = this;
            antlr.ANTLRStringBuffer r0 = r8.text
            int r0 = r0.length()
            r1 = 1
            char r2 = r8.mo4814LA(r1)
            r3 = 122(0x7a, float:1.71E-43)
            r4 = 97
            r5 = 90
            r6 = 65
            switch(r2) {
                case 65: goto L33;
                case 66: goto L33;
                case 67: goto L33;
                case 68: goto L33;
                case 69: goto L33;
                case 70: goto L33;
                case 71: goto L33;
                case 72: goto L33;
                case 73: goto L33;
                case 74: goto L33;
                case 75: goto L33;
                case 76: goto L33;
                case 77: goto L33;
                case 78: goto L33;
                case 79: goto L33;
                case 80: goto L33;
                case 81: goto L33;
                case 82: goto L33;
                case 83: goto L33;
                case 84: goto L33;
                case 85: goto L33;
                case 86: goto L33;
                case 87: goto L33;
                case 88: goto L33;
                case 89: goto L33;
                case 90: goto L33;
                default: goto L16;
            }
        L16:
            switch(r2) {
                case 97: goto L2f;
                case 98: goto L2f;
                case 99: goto L2f;
                case 100: goto L2f;
                case 101: goto L2f;
                case 102: goto L2f;
                case 103: goto L2f;
                case 104: goto L2f;
                case 105: goto L2f;
                case 106: goto L2f;
                case 107: goto L2f;
                case 108: goto L2f;
                case 109: goto L2f;
                case 110: goto L2f;
                case 111: goto L2f;
                case 112: goto L2f;
                case 113: goto L2f;
                case 114: goto L2f;
                case 115: goto L2f;
                case 116: goto L2f;
                case 117: goto L2f;
                case 118: goto L2f;
                case 119: goto L2f;
                case 120: goto L2f;
                case 121: goto L2f;
                case 122: goto L2f;
                default: goto L19;
            }
        L19:
            antlr.NoViableAltForCharException r9 = new antlr.NoViableAltForCharException
            char r0 = r8.mo4814LA(r1)
            java.lang.String r1 = r8.getFilename()
            int r2 = r8.getLine()
            int r3 = r8.getColumn()
            r9.<init>(r0, r1, r2, r3)
            throw r9
        L2f:
            r8.matchRange(r4, r3)
            goto L36
        L33:
            r8.matchRange(r6, r5)
        L36:
            char r2 = r8.mo4814LA(r1)
            r7 = 95
            if (r2 == r7) goto L78
            switch(r2) {
                case 48: goto L70;
                case 49: goto L70;
                case 50: goto L70;
                case 51: goto L70;
                case 52: goto L70;
                case 53: goto L70;
                case 54: goto L70;
                case 55: goto L70;
                case 56: goto L70;
                case 57: goto L70;
                default: goto L41;
            }
        L41:
            switch(r2) {
                case 65: goto L6c;
                case 66: goto L6c;
                case 67: goto L6c;
                case 68: goto L6c;
                case 69: goto L6c;
                case 70: goto L6c;
                case 71: goto L6c;
                case 72: goto L6c;
                case 73: goto L6c;
                case 74: goto L6c;
                case 75: goto L6c;
                case 76: goto L6c;
                case 77: goto L6c;
                case 78: goto L6c;
                case 79: goto L6c;
                case 80: goto L6c;
                case 81: goto L6c;
                case 82: goto L6c;
                case 83: goto L6c;
                case 84: goto L6c;
                case 85: goto L6c;
                case 86: goto L6c;
                case 87: goto L6c;
                case 88: goto L6c;
                case 89: goto L6c;
                case 90: goto L6c;
                default: goto L44;
            }
        L44:
            switch(r2) {
                case 97: goto L68;
                case 98: goto L68;
                case 99: goto L68;
                case 100: goto L68;
                case 101: goto L68;
                case 102: goto L68;
                case 103: goto L68;
                case 104: goto L68;
                case 105: goto L68;
                case 106: goto L68;
                case 107: goto L68;
                case 108: goto L68;
                case 109: goto L68;
                case 110: goto L68;
                case 111: goto L68;
                case 112: goto L68;
                case 113: goto L68;
                case 114: goto L68;
                case 115: goto L68;
                case 116: goto L68;
                case 117: goto L68;
                case 118: goto L68;
                case 119: goto L68;
                case 120: goto L68;
                case 121: goto L68;
                case 122: goto L68;
                default: goto L47;
            }
        L47:
            if (r9 == 0) goto L64
            r9 = 4
            antlr.Token r9 = r8.makeToken(r9)
            java.lang.String r1 = new java.lang.String
            antlr.ANTLRStringBuffer r2 = r8.text
            char[] r2 = r2.getBuffer()
            antlr.ANTLRStringBuffer r3 = r8.text
            int r3 = r3.length()
            int r3 = r3 - r0
            r1.<init>(r2, r0, r3)
            r9.setText(r1)
            goto L65
        L64:
            r9 = 0
        L65:
            r8._returnToken = r9
            return
        L68:
            r8.matchRange(r4, r3)
            goto L36
        L6c:
            r8.matchRange(r6, r5)
            goto L36
        L70:
            r2 = 48
            r7 = 57
            r8.matchRange(r2, r7)
            goto L36
        L78:
            r8.match(r7)
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.ANTLRTokdefLexer.mID(boolean):void");
    }

    public final void mINT(boolean z10) {
        Token token;
        int length = this.text.length();
        int i10 = 0;
        while (mo4814LA(1) >= '0' && mo4814LA(1) <= '9') {
            mDIGIT(false);
            i10++;
        }
        if (i10 >= 1) {
            if (z10) {
                token = makeToken(9);
                token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
            } else {
                token = null;
            }
            this._returnToken = token;
            return;
        }
        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
    }

    public final void mLPAREN(boolean z10) {
        Token token;
        int length = this.text.length();
        match('(');
        if (z10) {
            token = makeToken(7);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mML_COMMENT(boolean z10) {
        this.text.length();
        match("/*");
        while (true) {
            if (mo4814LA(1) == '*' && _tokenSet_1.member(mo4814LA(2))) {
                match('*');
                matchNot('/');
            } else if (mo4814LA(1) == '\n') {
                match('\n');
                newline();
            } else if (_tokenSet_2.member(mo4814LA(1))) {
                matchNot('*');
            } else {
                match("*/");
                this._returnToken = null;
                return;
            }
        }
    }

    public final void mRPAREN(boolean z10) {
        Token token;
        int length = this.text.length();
        match(')');
        if (z10) {
            token = makeToken(8);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mSL_COMMENT(boolean z10) {
        this.text.length();
        match("//");
        while (true) {
            BitSet bitSet = _tokenSet_0;
            if (!bitSet.member(mo4814LA(1))) {
                break;
            } else {
                match(bitSet);
            }
        }
        char mo4814LA = mo4814LA(1);
        if (mo4814LA != '\n') {
            if (mo4814LA == '\r') {
                match('\r');
                if (mo4814LA(1) == '\n') {
                    match('\n');
                }
            } else {
                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
            }
        } else {
            match('\n');
        }
        newline();
        this._returnToken = null;
    }

    public final void mSTRING(boolean z10) {
        Token token;
        int length = this.text.length();
        match('\"');
        while (true) {
            if (mo4814LA(1) == '\\') {
                mESC(false);
            } else if (!_tokenSet_3.member(mo4814LA(1))) {
                break;
            } else {
                matchNot('\"');
            }
        }
        match('\"');
        if (z10) {
            token = makeToken(5);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mWS(boolean z10) {
        this.text.length();
        char mo4814LA = mo4814LA(1);
        if (mo4814LA != '\t') {
            if (mo4814LA != '\n') {
                if (mo4814LA != '\r') {
                    if (mo4814LA == ' ') {
                        match(' ');
                    } else {
                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                    }
                } else {
                    match('\r');
                    if (mo4814LA(1) == '\n') {
                        match('\n');
                    }
                    newline();
                }
            } else {
                match('\n');
                newline();
            }
        } else {
            match('\t');
        }
        this._returnToken = null;
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
            token = makeToken(15);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x002b. Please report as an issue. */
    @Override // antlr.TokenStream
    public Token nextToken() {
        Token token;
        do {
            resetText();
            try {
                try {
                    char mo4814LA = mo4814LA(1);
                    if (mo4814LA != '\t' && mo4814LA != '\n' && mo4814LA != '\r' && mo4814LA != ' ') {
                        if (mo4814LA != '\"') {
                            if (mo4814LA != '=') {
                                if (mo4814LA != '(') {
                                    if (mo4814LA != ')') {
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
                                                mINT(true);
                                                break;
                                            default:
                                                switch (mo4814LA) {
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
                                                            default:
                                                                if (mo4814LA(1) == '/' && mo4814LA(2) == '/') {
                                                                    mSL_COMMENT(true);
                                                                    break;
                                                                } else if (mo4814LA(1) == '/' && mo4814LA(2) == '*') {
                                                                    mML_COMMENT(true);
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
                                                        mID(true);
                                                        break;
                                                }
                                        }
                                    } else {
                                        mRPAREN(true);
                                    }
                                } else {
                                    mLPAREN(true);
                                }
                            } else {
                                mASSIGN(true);
                            }
                        } else {
                            mSTRING(true);
                        }
                    } else {
                        mWS(true);
                    }
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
        this._returnToken.setType(token.getType());
        return this._returnToken;
    }

    public ANTLRTokdefLexer(Reader reader) {
        this(new CharBuffer(reader));
    }

    public ANTLRTokdefLexer(InputBuffer inputBuffer) {
        this(new LexerSharedInputState(inputBuffer));
    }

    public ANTLRTokdefLexer(LexerSharedInputState lexerSharedInputState) {
        super(lexerSharedInputState);
        this.caseSensitiveLiterals = true;
        setCaseSensitive(true);
        this.literals = new Hashtable();
    }
}
