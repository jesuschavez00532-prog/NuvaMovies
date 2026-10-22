package antlr;

import antlr.collections.impl.BitSet;
import java.io.InputStream;
import java.io.Reader;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class ANTLRLexer extends CharScanner implements ANTLRTokenTypes {
    public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
    public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
    public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
    public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
    public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
    public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());

    public ANTLRLexer(InputStream inputStream) {
        this(new ByteBuffer(inputStream));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0037. Please report as an issue. */
    public static int escapeCharValue(String str) {
        int digit;
        int digit2;
        char charAt;
        char charAt2;
        if (str.charAt(1) != '\\') {
            return 0;
        }
        char charAt3 = str.charAt(2);
        int i10 = 34;
        if (charAt3 != '\"') {
            i10 = 39;
            if (charAt3 != '\'') {
                if (charAt3 == '\\') {
                    return 92;
                }
                if (charAt3 == 'b') {
                    return 8;
                }
                if (charAt3 != 'f') {
                    if (charAt3 != 'n') {
                        if (charAt3 != 'r') {
                            if (charAt3 != 't') {
                                if (charAt3 != 'u') {
                                    switch (charAt3) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                            if (str.length() > 5 && Character.isDigit(str.charAt(4))) {
                                                digit = ((str.charAt(2) - '0') * 8 * 8) + ((str.charAt(3) - '0') * 8);
                                                charAt2 = str.charAt(4);
                                            } else if (str.length() > 4 && Character.isDigit(str.charAt(3))) {
                                                digit = (str.charAt(2) - '0') * 8;
                                                charAt2 = str.charAt(3);
                                            } else {
                                                charAt = str.charAt(2);
                                                return charAt - '0';
                                            }
                                            digit2 = charAt2 - '0';
                                            break;
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                            if (str.length() > 4 && Character.isDigit(str.charAt(3))) {
                                                digit = (str.charAt(2) - '0') * 8;
                                                charAt2 = str.charAt(3);
                                                digit2 = charAt2 - '0';
                                                break;
                                            } else {
                                                charAt = str.charAt(2);
                                                return charAt - '0';
                                            }
                                        default:
                                            return 0;
                                    }
                                } else {
                                    if (str.length() != 8) {
                                        return 0;
                                    }
                                    digit = (Character.digit(str.charAt(3), 16) * 16 * 16 * 16) + (Character.digit(str.charAt(4), 16) * 16 * 16) + (Character.digit(str.charAt(5), 16) * 16);
                                    digit2 = Character.digit(str.charAt(6), 16);
                                }
                                return digit + digit2;
                            }
                            return 9;
                        }
                        return 13;
                    }
                    return 10;
                }
                return 12;
            }
        }
        return i10;
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
        jArr[0] = -549755813896L;
        jArr[1] = -268435457;
        for (int i10 = 2; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_2() {
        long[] jArr = new long[8];
        jArr[0] = -17179869192L;
        jArr[1] = -268435457;
        for (int i10 = 2; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_3() {
        long[] jArr = new long[8];
        jArr[0] = -566935692296L;
        jArr[1] = -671088641;
        for (int i10 = 2; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_4() {
        long[] jArr = new long[8];
        jArr[0] = -549755813896L;
        for (int i10 = 1; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_5() {
        return new long[]{4294977024L, 0, 0, 0, 0};
    }

    public static int tokenTypeForCharLiteral(String str) {
        if (str.length() > 3) {
            return escapeCharValue(str);
        }
        return str.charAt(1);
    }

    public final void mACTION(boolean z10) {
        int i10;
        int length = this.text.length();
        int line = getLine();
        int column = getColumn();
        mNESTED_ACTION(false);
        if (mo4814LA(1) == '?') {
            match('?');
            i10 = 43;
        } else {
            i10 = 7;
        }
        if (i10 == 7) {
            setText(StringUtils.stripFrontBack(getText(), "{", "}"));
        } else {
            setText(StringUtils.stripFrontBack(getText(), "{", "}?"));
        }
        CommonToken commonToken = new CommonToken(i10, new String(this.text.getBuffer(), length, this.text.length() - length));
        commonToken.setLine(line);
        commonToken.setColumn(column);
        this._returnToken = commonToken;
    }

    public final void mARG_ACTION(boolean z10) {
        Token token;
        int length = this.text.length();
        mNESTED_ARG_ACTION(false);
        setText(StringUtils.stripFrontBack(getText(), "[", "]"));
        if (z10) {
            token = makeToken(34);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mASSIGN(boolean z10) {
        Token token;
        int length = this.text.length();
        match('=');
        if (z10) {
            token = makeToken(15);
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
            token = makeToken(33);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mCARET(boolean z10) {
        Token token;
        int length = this.text.length();
        match('^');
        if (z10) {
            token = makeToken(49);
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
        } else if (_tokenSet_1.member(mo4814LA(1))) {
            matchNot('\'');
        } else {
            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
        }
        match('\'');
        if (z10) {
            token = makeToken(19);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mCLOSE_ELEMENT_OPTION(boolean z10) {
        Token token;
        int length = this.text.length();
        match('>');
        if (z10) {
            token = makeToken(26);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mCOLON(boolean z10) {
        Token token;
        int length = this.text.length();
        match(':');
        if (z10) {
            token = makeToken(36);
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
            token = makeToken(38);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mCOMMENT(boolean z10) {
        int type;
        Token token;
        int length = this.text.length();
        if (mo4814LA(1) == '/' && mo4814LA(2) == '/') {
            mSL_COMMENT(false);
            type = 53;
        } else if (mo4814LA(1) == '/' && mo4814LA(2) == '*') {
            mML_COMMENT(true);
            type = this._returnToken.getType();
        } else {
            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
        }
        if (type != 8) {
            type = -1;
        }
        if (z10 && type != -1) {
            token = makeToken(type);
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
            token = makeToken(57);
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
                                                            if (mo4814LA(1) >= '0' && mo4814LA(1) <= '7' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                                                                matchRange('0', '7');
                                                                if (mo4814LA(1) >= '0' && mo4814LA(1) <= '7' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                                                                    matchRange('0', '7');
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
                                                            if (mo4814LA(1) >= '0' && mo4814LA(1) <= '7' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                                                                matchRange('0', '7');
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
            token = makeToken(56);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mIMPLIES(boolean z10) {
        Token token;
        int length = this.text.length();
        match("=>");
        if (z10) {
            token = makeToken(48);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mINT(boolean z10) {
        Token token;
        int length = this.text.length();
        int i10 = 0;
        while (mo4814LA(1) >= '0' && mo4814LA(1) <= '9') {
            matchRange('0', '9');
            i10++;
        }
        if (i10 >= 1) {
            if (z10) {
                token = makeToken(20);
                token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
            } else {
                token = null;
            }
            this._returnToken = token;
            return;
        }
        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0019, code lost:
    
        switch(r3) {
            case 65: goto L20;
            case 66: goto L20;
            case 67: goto L20;
            case 68: goto L20;
            case 69: goto L20;
            case 70: goto L20;
            case 71: goto L20;
            case 72: goto L20;
            case 73: goto L20;
            case 74: goto L20;
            case 75: goto L20;
            case 76: goto L20;
            case 77: goto L20;
            case 78: goto L20;
            case 79: goto L20;
            case 80: goto L20;
            case 81: goto L20;
            case 82: goto L20;
            case 83: goto L20;
            case 84: goto L20;
            case 85: goto L20;
            case 86: goto L20;
            case 87: goto L20;
            case 88: goto L20;
            case 89: goto L20;
            case 90: goto L20;
            default: goto L22;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        matchRange('A', 'Z');
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x001c, code lost:
    
        switch(r3) {
            case 97: goto L14;
            case 98: goto L14;
            case 99: goto L14;
            case 100: goto L14;
            case 101: goto L14;
            case 102: goto L14;
            case 103: goto L14;
            case 104: goto L14;
            case 105: goto L14;
            case 106: goto L14;
            case 107: goto L14;
            case 108: goto L14;
            case 109: goto L14;
            case 110: goto L14;
            case 111: goto L14;
            case 112: goto L14;
            case 113: goto L14;
            case 114: goto L14;
            case 115: goto L14;
            case 116: goto L14;
            case 117: goto L14;
            case 118: goto L14;
            case 119: goto L14;
            case 120: goto L14;
            case 121: goto L14;
            case 122: goto L14;
            default: goto L21;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        matchRange('a', 'z');
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x001f, code lost:
    
        r1 = testLiteralsTable(41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0025, code lost:
    
        if (r6 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0027, code lost:
    
        r6 = makeToken(62);
        r6.setText(new java.lang.String(r5.text.getBuffer(), r0, r5.text.length() - r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r5._returnToken = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int mINTERNAL_RULE_REF(boolean r6) {
        /*
            r5 = this;
            antlr.ANTLRStringBuffer r0 = r5.text
            int r0 = r0.length()
            r1 = 97
            r2 = 122(0x7a, float:1.71E-43)
            r5.matchRange(r1, r2)
        Ld:
            r3 = 1
            char r3 = r5.mo4814LA(r3)
            r4 = 95
            if (r3 == r4) goto L5b
            switch(r3) {
                case 48: goto L53;
                case 49: goto L53;
                case 50: goto L53;
                case 51: goto L53;
                case 52: goto L53;
                case 53: goto L53;
                case 54: goto L53;
                case 55: goto L53;
                case 56: goto L53;
                case 57: goto L53;
                default: goto L19;
            }
        L19:
            switch(r3) {
                case 65: goto L4b;
                case 66: goto L4b;
                case 67: goto L4b;
                case 68: goto L4b;
                case 69: goto L4b;
                case 70: goto L4b;
                case 71: goto L4b;
                case 72: goto L4b;
                case 73: goto L4b;
                case 74: goto L4b;
                case 75: goto L4b;
                case 76: goto L4b;
                case 77: goto L4b;
                case 78: goto L4b;
                case 79: goto L4b;
                case 80: goto L4b;
                case 81: goto L4b;
                case 82: goto L4b;
                case 83: goto L4b;
                case 84: goto L4b;
                case 85: goto L4b;
                case 86: goto L4b;
                case 87: goto L4b;
                case 88: goto L4b;
                case 89: goto L4b;
                case 90: goto L4b;
                default: goto L1c;
            }
        L1c:
            switch(r3) {
                case 97: goto L47;
                case 98: goto L47;
                case 99: goto L47;
                case 100: goto L47;
                case 101: goto L47;
                case 102: goto L47;
                case 103: goto L47;
                case 104: goto L47;
                case 105: goto L47;
                case 106: goto L47;
                case 107: goto L47;
                case 108: goto L47;
                case 109: goto L47;
                case 110: goto L47;
                case 111: goto L47;
                case 112: goto L47;
                case 113: goto L47;
                case 114: goto L47;
                case 115: goto L47;
                case 116: goto L47;
                case 117: goto L47;
                case 118: goto L47;
                case 119: goto L47;
                case 120: goto L47;
                case 121: goto L47;
                case 122: goto L47;
                default: goto L1f;
            }
        L1f:
            r1 = 41
            int r1 = r5.testLiteralsTable(r1)
            if (r6 == 0) goto L43
            r6 = 62
            antlr.Token r6 = r5.makeToken(r6)
            java.lang.String r2 = new java.lang.String
            antlr.ANTLRStringBuffer r3 = r5.text
            char[] r3 = r3.getBuffer()
            antlr.ANTLRStringBuffer r4 = r5.text
            int r4 = r4.length()
            int r4 = r4 - r0
            r2.<init>(r3, r0, r4)
            r6.setText(r2)
            goto L44
        L43:
            r6 = 0
        L44:
            r5._returnToken = r6
            return r1
        L47:
            r5.matchRange(r1, r2)
            goto Ld
        L4b:
            r3 = 65
            r4 = 90
            r5.matchRange(r3, r4)
            goto Ld
        L53:
            r3 = 48
            r4 = 57
            r5.matchRange(r3, r4)
            goto Ld
        L5b:
            r5.match(r4)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.ANTLRLexer.mINTERNAL_RULE_REF(boolean):int");
    }

    public final void mLPAREN(boolean z10) {
        Token token;
        int length = this.text.length();
        match('(');
        if (z10) {
            token = makeToken(27);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mML_COMMENT(boolean z10) {
        int i10;
        Token token;
        int length = this.text.length();
        match("/*");
        if (mo4814LA(1) == '*' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255 && mo4814LA(2) != '/') {
            match('*');
            i10 = 8;
        } else if (mo4814LA(1) >= 3 && mo4814LA(1) <= 255 && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
            i10 = 55;
        } else {
            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
        }
        while (true) {
            if (mo4814LA(1) == '*' && mo4814LA(2) == '/') {
                break;
            }
            if (mo4814LA(1) == '\r' && mo4814LA(2) == '\n') {
                match('\r');
                match('\n');
                newline();
            } else if (mo4814LA(1) == '\r' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                match('\r');
                newline();
            } else {
                BitSet bitSet = _tokenSet_0;
                if (bitSet.member(mo4814LA(1)) && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                    match(bitSet);
                } else {
                    if (mo4814LA(1) != '\n') {
                        break;
                    }
                    match('\n');
                    newline();
                }
            }
        }
        match("*/");
        if (z10 && i10 != -1) {
            token = makeToken(i10);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mNESTED_ACTION(boolean z10) {
        Token token;
        int length = this.text.length();
        match('{');
        while (mo4814LA(1) != '}') {
            if ((mo4814LA(1) == '\n' || mo4814LA(1) == '\r') && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                if (mo4814LA(1) == '\r' && mo4814LA(2) == '\n') {
                    match('\r');
                    match('\n');
                    newline();
                } else if (mo4814LA(1) == '\r' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                    match('\r');
                    newline();
                } else if (mo4814LA(1) == '\n') {
                    match('\n');
                    newline();
                } else {
                    throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                }
            } else if (mo4814LA(1) == '{' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                mNESTED_ACTION(false);
            } else if (mo4814LA(1) == '\'' && _tokenSet_4.member(mo4814LA(2))) {
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
            token = makeToken(60);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mNESTED_ARG_ACTION(boolean z10) {
        Token token;
        int length = this.text.length();
        match('[');
        while (true) {
            char mo4814LA = mo4814LA(1);
            if (mo4814LA != '\n') {
                if (mo4814LA != '\"') {
                    if (mo4814LA != '\'') {
                        if (mo4814LA != '[') {
                            if (mo4814LA(1) == '\r' && mo4814LA(2) == '\n') {
                                match('\r');
                                match('\n');
                                newline();
                            } else if (mo4814LA(1) == '\r' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
                                match('\r');
                                newline();
                            } else if (!_tokenSet_3.member(mo4814LA(1))) {
                                break;
                            } else {
                                matchNot(']');
                            }
                        } else {
                            mNESTED_ARG_ACTION(false);
                        }
                    } else {
                        mCHAR_LITERAL(false);
                    }
                } else {
                    mSTRING_LITERAL(false);
                }
            } else {
                match('\n');
                newline();
            }
        }
        match(']');
        if (z10) {
            token = makeToken(59);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mNOT_OP(boolean z10) {
        Token token;
        int length = this.text.length();
        match('~');
        if (z10) {
            token = makeToken(42);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mOPEN_ELEMENT_OPTION(boolean z10) {
        Token token;
        int length = this.text.length();
        match('<');
        if (z10) {
            token = makeToken(25);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mOR(boolean z10) {
        Token token;
        int length = this.text.length();
        match('|');
        if (z10) {
            token = makeToken(21);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mPLUS(boolean z10) {
        Token token;
        int length = this.text.length();
        match('+');
        if (z10) {
            token = makeToken(47);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mQUESTION(boolean z10) {
        Token token;
        int length = this.text.length();
        match('?');
        if (z10) {
            token = makeToken(45);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mRANGE(boolean z10) {
        Token token;
        int length = this.text.length();
        match("..");
        if (z10) {
            token = makeToken(22);
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
            token = makeToken(17);
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
            token = makeToken(28);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mRULE_REF(boolean z10) {
        Token token;
        int length = this.text.length();
        int mINTERNAL_RULE_REF = mINTERNAL_RULE_REF(false);
        if (mINTERNAL_RULE_REF == 51) {
            mWS_LOOP(false);
            if (mo4814LA(1) == '{') {
                match('{');
                mINTERNAL_RULE_REF = 14;
            }
        } else if (mINTERNAL_RULE_REF == 4) {
            mWS_LOOP(false);
            if (mo4814LA(1) == '{') {
                match('{');
                mINTERNAL_RULE_REF = 23;
            }
        }
        if (z10 && mINTERNAL_RULE_REF != -1) {
            token = makeToken(mINTERNAL_RULE_REF);
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
            token = makeToken(16);
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
        while (true) {
            BitSet bitSet = _tokenSet_0;
            if (!bitSet.member(mo4814LA(1))) {
                break;
            } else {
                match(bitSet);
            }
        }
        if (mo4814LA(1) == '\r' && mo4814LA(2) == '\n') {
            match('\r');
            match('\n');
        } else if (mo4814LA(1) == '\r') {
            match('\r');
        } else if (mo4814LA(1) == '\n') {
            match('\n');
        } else {
            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
        }
        newline();
        if (z10) {
            token = makeToken(54);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mSTAR(boolean z10) {
        Token token;
        int length = this.text.length();
        match('*');
        if (z10) {
            token = makeToken(46);
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
            } else if (!_tokenSet_2.member(mo4814LA(1))) {
                break;
            } else {
                matchNot('\"');
            }
        }
        match('\"');
        if (z10) {
            token = makeToken(6);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0019, code lost:
    
        switch(r3) {
            case 65: goto L22;
            case 66: goto L22;
            case 67: goto L22;
            case 68: goto L22;
            case 69: goto L22;
            case 70: goto L22;
            case 71: goto L22;
            case 72: goto L22;
            case 73: goto L22;
            case 74: goto L22;
            case 75: goto L22;
            case 76: goto L22;
            case 77: goto L22;
            case 78: goto L22;
            case 79: goto L22;
            case 80: goto L22;
            case 81: goto L22;
            case 82: goto L22;
            case 83: goto L22;
            case 84: goto L22;
            case 85: goto L22;
            case 86: goto L22;
            case 87: goto L22;
            case 88: goto L22;
            case 89: goto L22;
            case 90: goto L22;
            default: goto L24;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        matchRange('A', 'Z');
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x001c, code lost:
    
        switch(r3) {
            case 97: goto L16;
            case 98: goto L16;
            case 99: goto L16;
            case 100: goto L16;
            case 101: goto L16;
            case 102: goto L16;
            case 103: goto L16;
            case 104: goto L16;
            case 105: goto L16;
            case 106: goto L16;
            case 107: goto L16;
            case 108: goto L16;
            case 109: goto L16;
            case 110: goto L16;
            case 111: goto L16;
            case 112: goto L16;
            case 113: goto L16;
            case 114: goto L16;
            case 115: goto L16;
            case 116: goto L16;
            case 117: goto L16;
            case 118: goto L16;
            case 119: goto L16;
            case 120: goto L16;
            case 121: goto L16;
            case 122: goto L16;
            default: goto L23;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        matchRange('a', 'z');
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x001f, code lost:
    
        r1 = testLiteralsTable(24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0025, code lost:
    
        if (r6 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0028, code lost:
    
        if (r1 == (-1)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002a, code lost:
    
        r6 = makeToken(r1);
        r6.setText(new java.lang.String(r5.text.getBuffer(), r0, r5.text.length() - r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        r5._returnToken = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0044, code lost:
    
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mTOKEN_REF(boolean r6) {
        /*
            r5 = this;
            antlr.ANTLRStringBuffer r0 = r5.text
            int r0 = r0.length()
            r1 = 65
            r2 = 90
            r5.matchRange(r1, r2)
        Ld:
            r3 = 1
            char r3 = r5.mo4814LA(r3)
            r4 = 95
            if (r3 == r4) goto L5c
            switch(r3) {
                case 48: goto L54;
                case 49: goto L54;
                case 50: goto L54;
                case 51: goto L54;
                case 52: goto L54;
                case 53: goto L54;
                case 54: goto L54;
                case 55: goto L54;
                case 56: goto L54;
                case 57: goto L54;
                default: goto L19;
            }
        L19:
            switch(r3) {
                case 65: goto L50;
                case 66: goto L50;
                case 67: goto L50;
                case 68: goto L50;
                case 69: goto L50;
                case 70: goto L50;
                case 71: goto L50;
                case 72: goto L50;
                case 73: goto L50;
                case 74: goto L50;
                case 75: goto L50;
                case 76: goto L50;
                case 77: goto L50;
                case 78: goto L50;
                case 79: goto L50;
                case 80: goto L50;
                case 81: goto L50;
                case 82: goto L50;
                case 83: goto L50;
                case 84: goto L50;
                case 85: goto L50;
                case 86: goto L50;
                case 87: goto L50;
                case 88: goto L50;
                case 89: goto L50;
                case 90: goto L50;
                default: goto L1c;
            }
        L1c:
            switch(r3) {
                case 97: goto L48;
                case 98: goto L48;
                case 99: goto L48;
                case 100: goto L48;
                case 101: goto L48;
                case 102: goto L48;
                case 103: goto L48;
                case 104: goto L48;
                case 105: goto L48;
                case 106: goto L48;
                case 107: goto L48;
                case 108: goto L48;
                case 109: goto L48;
                case 110: goto L48;
                case 111: goto L48;
                case 112: goto L48;
                case 113: goto L48;
                case 114: goto L48;
                case 115: goto L48;
                case 116: goto L48;
                case 117: goto L48;
                case 118: goto L48;
                case 119: goto L48;
                case 120: goto L48;
                case 121: goto L48;
                case 122: goto L48;
                default: goto L1f;
            }
        L1f:
            r1 = 24
            int r1 = r5.testLiteralsTable(r1)
            if (r6 == 0) goto L44
            r6 = -1
            if (r1 == r6) goto L44
            antlr.Token r6 = r5.makeToken(r1)
            java.lang.String r1 = new java.lang.String
            antlr.ANTLRStringBuffer r2 = r5.text
            char[] r2 = r2.getBuffer()
            antlr.ANTLRStringBuffer r3 = r5.text
            int r3 = r3.length()
            int r3 = r3 - r0
            r1.<init>(r2, r0, r3)
            r6.setText(r1)
            goto L45
        L44:
            r6 = 0
        L45:
            r5._returnToken = r6
            return
        L48:
            r3 = 97
            r4 = 122(0x7a, float:1.71E-43)
            r5.matchRange(r3, r4)
            goto Ld
        L50:
            r5.matchRange(r1, r2)
            goto Ld
        L54:
            r3 = 48
            r4 = 57
            r5.matchRange(r3, r4)
            goto Ld
        L5c:
            r5.match(r4)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.ANTLRLexer.mTOKEN_REF(boolean):void");
    }

    public final void mTREE_BEGIN(boolean z10) {
        Token token;
        int length = this.text.length();
        match("#(");
        if (z10) {
            token = makeToken(44);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    public final void mWILDCARD(boolean z10) {
        Token token;
        int length = this.text.length();
        match('.');
        if (z10) {
            token = makeToken(50);
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
                if (mo4814LA != ' ') {
                    if (mo4814LA(1) == '\r' && mo4814LA(2) == '\n') {
                        match('\r');
                        match('\n');
                        newline();
                    } else if (mo4814LA(1) == '\r') {
                        match('\r');
                        newline();
                    } else {
                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                    }
                } else {
                    match(' ');
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

    protected final void mWS_LOOP(boolean z10) {
        Token token;
        int length = this.text.length();
        while (true) {
            char mo4814LA = mo4814LA(1);
            if (mo4814LA != '\t' && mo4814LA != '\n' && mo4814LA != '\r' && mo4814LA != ' ') {
                if (mo4814LA != '/') {
                    break;
                } else {
                    mCOMMENT(false);
                }
            } else {
                mWS(false);
            }
        }
        if (z10) {
            token = makeToken(61);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mWS_OPT(boolean z10) {
        Token token;
        int length = this.text.length();
        if (_tokenSet_5.member(mo4814LA(1))) {
            mWS(false);
        }
        if (z10) {
            token = makeToken(63);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
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
            token = makeToken(58);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    @Override // antlr.TokenStream
    public Token nextToken() {
        Token token;
        do {
            resetText();
            try {
                try {
                    char mo4814LA = mo4814LA(1);
                    if (mo4814LA != '\t' && mo4814LA != '\n' && mo4814LA != '\r') {
                        if (mo4814LA != '^') {
                            if (mo4814LA != '>') {
                                if (mo4814LA != '?') {
                                    switch (mo4814LA) {
                                        case ' ':
                                            break;
                                        case '!':
                                            mBANG(true);
                                            break;
                                        case '\"':
                                            mSTRING_LITERAL(true);
                                            break;
                                        case '#':
                                            mTREE_BEGIN(true);
                                            break;
                                        default:
                                            switch (mo4814LA) {
                                                case '\'':
                                                    mCHAR_LITERAL(true);
                                                    break;
                                                case '(':
                                                    mLPAREN(true);
                                                    break;
                                                case ')':
                                                    mRPAREN(true);
                                                    break;
                                                case '*':
                                                    mSTAR(true);
                                                    break;
                                                case '+':
                                                    mPLUS(true);
                                                    break;
                                                case ',':
                                                    mCOMMA(true);
                                                    break;
                                                default:
                                                    switch (mo4814LA) {
                                                        case '/':
                                                            mCOMMENT(true);
                                                            break;
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
                                                        case ':':
                                                            mCOLON(true);
                                                            break;
                                                        case ';':
                                                            mSEMI(true);
                                                            break;
                                                        case '<':
                                                            mOPEN_ELEMENT_OPTION(true);
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
                                                                    mTOKEN_REF(true);
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
                                                                            mRULE_REF(true);
                                                                            break;
                                                                        case '{':
                                                                            mACTION(true);
                                                                            break;
                                                                        case '|':
                                                                            mOR(true);
                                                                            break;
                                                                        case '}':
                                                                            mRCURLY(true);
                                                                            break;
                                                                        case '~':
                                                                            mNOT_OP(true);
                                                                            break;
                                                                        default:
                                                                            if (mo4814LA(1) == '=' && mo4814LA(2) == '>') {
                                                                                mIMPLIES(true);
                                                                                break;
                                                                            } else if (mo4814LA(1) == '.' && mo4814LA(2) == '.') {
                                                                                mRANGE(true);
                                                                                break;
                                                                            } else if (mo4814LA(1) == '=') {
                                                                                mASSIGN(true);
                                                                                break;
                                                                            } else if (mo4814LA(1) == '.') {
                                                                                mWILDCARD(true);
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
                                            }
                                    }
                                } else {
                                    mQUESTION(true);
                                }
                            } else {
                                mCLOSE_ELEMENT_OPTION(true);
                            }
                        } else {
                            mCARET(true);
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
        this._returnToken.setType(token.getType());
        return this._returnToken;
    }

    public ANTLRLexer(Reader reader) {
        this(new CharBuffer(reader));
    }

    public ANTLRLexer(InputBuffer inputBuffer) {
        this(new LexerSharedInputState(inputBuffer));
    }

    public ANTLRLexer(LexerSharedInputState lexerSharedInputState) {
        super(lexerSharedInputState);
        this.caseSensitiveLiterals = true;
        setCaseSensitive(true);
        Hashtable hashtable = new Hashtable();
        this.literals = hashtable;
        hashtable.put(new ANTLRHashString("public", this), new Integer(31));
        this.literals.put(new ANTLRHashString("class", this), new Integer(10));
        this.literals.put(new ANTLRHashString("header", this), new Integer(5));
        this.literals.put(new ANTLRHashString("throws", this), new Integer(37));
        this.literals.put(new ANTLRHashString("lexclass", this), new Integer(9));
        this.literals.put(new ANTLRHashString("catch", this), new Integer(40));
        this.literals.put(new ANTLRHashString("private", this), new Integer(32));
        this.literals.put(new ANTLRHashString("options", this), new Integer(51));
        this.literals.put(new ANTLRHashString("extends", this), new Integer(11));
        this.literals.put(new ANTLRHashString("protected", this), new Integer(30));
        this.literals.put(new ANTLRHashString("TreeParser", this), new Integer(13));
        this.literals.put(new ANTLRHashString("Parser", this), new Integer(29));
        this.literals.put(new ANTLRHashString("Lexer", this), new Integer(12));
        this.literals.put(new ANTLRHashString("returns", this), new Integer(35));
        this.literals.put(new ANTLRHashString("charVocabulary", this), new Integer(18));
        this.literals.put(new ANTLRHashString("tokens", this), new Integer(4));
        this.literals.put(new ANTLRHashString("exception", this), new Integer(39));
    }
}
