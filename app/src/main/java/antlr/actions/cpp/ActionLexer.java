package antlr.actions.cpp;

import antlr.ActionTransInfo;
import antlr.ByteBuffer;
import antlr.CharBuffer;
import antlr.CharScanner;
import antlr.CharStreamException;
import antlr.CharStreamIOException;
import antlr.CodeGenerator;
import antlr.InputBuffer;
import antlr.LexerSharedInputState;
import antlr.NoViableAltForCharException;
import antlr.RecognitionException;
import antlr.RuleBlock;
import antlr.Token;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.TokenStreamRecognitionException;
import antlr.Tool;
import antlr.collections.impl.BitSet;
import antlr.collections.impl.Vector;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.Hashtable;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes.dex */
public class ActionLexer extends CharScanner implements ActionLexerTokenTypes {
    private Tool antlrTool;
    protected RuleBlock currentRule;
    protected CodeGenerator generator;
    protected int lineOffset;
    ActionTransInfo transInfo;
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
    public static final BitSet _tokenSet_11 = new BitSet(mk_tokenSet_11());
    public static final BitSet _tokenSet_12 = new BitSet(mk_tokenSet_12());
    public static final BitSet _tokenSet_13 = new BitSet(mk_tokenSet_13());
    public static final BitSet _tokenSet_14 = new BitSet(mk_tokenSet_14());
    public static final BitSet _tokenSet_15 = new BitSet(mk_tokenSet_15());
    public static final BitSet _tokenSet_16 = new BitSet(mk_tokenSet_16());
    public static final BitSet _tokenSet_17 = new BitSet(mk_tokenSet_17());
    public static final BitSet _tokenSet_18 = new BitSet(mk_tokenSet_18());
    public static final BitSet _tokenSet_19 = new BitSet(mk_tokenSet_19());
    public static final BitSet _tokenSet_20 = new BitSet(mk_tokenSet_20());
    public static final BitSet _tokenSet_21 = new BitSet(mk_tokenSet_21());
    public static final BitSet _tokenSet_22 = new BitSet(mk_tokenSet_22());
    public static final BitSet _tokenSet_23 = new BitSet(mk_tokenSet_23());
    public static final BitSet _tokenSet_24 = new BitSet(mk_tokenSet_24());
    public static final BitSet _tokenSet_25 = new BitSet(mk_tokenSet_25());
    public static final BitSet _tokenSet_26 = new BitSet(mk_tokenSet_26());

    public ActionLexer(String str, RuleBlock ruleBlock, CodeGenerator codeGenerator, ActionTransInfo actionTransInfo) {
        this(new StringReader(str));
        this.currentRule = ruleBlock;
        this.generator = codeGenerator;
        this.transInfo = actionTransInfo;
    }

    private static final long[] mk_tokenSet_0() {
        long[] jArr = new long[8];
        jArr[0] = -103079215112L;
        for (int i10 = 1; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_1() {
        long[] jArr = new long[8];
        jArr[0] = -145135534866440L;
        for (int i10 = 1; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_10() {
        return new long[]{576188709074894848L, 576460745995190270L, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_11() {
        return new long[]{576208504579171840L, 576460746532061182L, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_12() {
        return new long[]{288230376151711744L, 576460745995190270L, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_13() {
        return new long[]{3747275269732312576L, 671088640, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_14() {
        long[] jArr = new long[8];
        jArr[0] = -4611686018427387912L;
        for (int i10 = 1; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_15() {
        return new long[]{576183181451994624L, 576460746129407998L, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_16() {
        return new long[]{2306051920717948416L, IjkMediaMeta.AV_CH_STEREO_LEFT, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_17() {
        return new long[]{2305843013508670976L, 0, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_18() {
        return new long[]{208911504254464L, IjkMediaMeta.AV_CH_STEREO_LEFT, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_19() {
        return new long[]{288231527202947072L, 576460746129407998L, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_2() {
        long[] jArr = new long[8];
        jArr[0] = -141407503262728L;
        for (int i10 = 1; i10 <= 3; i10++) {
            jArr[i10] = -1;
        }
        return jArr;
    }

    private static final long[] mk_tokenSet_20() {
        return new long[]{189120294954496L, 0, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_21() {
        return new long[]{576370098428716544L, 576460746129407998L, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_22() {
        return new long[]{576315157207066112L, 576460746666278910L, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_23() {
        return new long[]{576190912393127424L, 576460745995190270L, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_24() {
        return new long[]{576188713369871872L, 576460745995190270L, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_25() {
        return new long[]{576459193230304768L, 576460746532061182L, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_26() {
        return new long[]{576388824486127104L, 576460746532061182L, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_3() {
        return new long[]{288230380446688768L, 576460745995190270L, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_4() {
        return new long[]{4294977024L, 0, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_5() {
        return new long[]{1103806604800L, 0, 0, 0, 0};
    }

    private static final long[] mk_tokenSet_6() {
        return new long[]{576189812881499648L, 576460745995190270L, 0, 0, 0};
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
        return new long[]{576179277326712832L, 576460745995190270L, 0, 0, 0};
    }

    public final void mACTION(boolean z10) {
        Token token;
        int length = this.text.length();
        int i10 = 0;
        while (true) {
            char mo4814LA = mo4814LA(1);
            if (mo4814LA != '#') {
                if (mo4814LA != '$') {
                    if (!_tokenSet_0.member(mo4814LA(1))) {
                        break;
                    } else {
                        mSTUFF(false);
                    }
                } else {
                    mTEXT_ITEM(false);
                }
            } else {
                mAST_ITEM(false);
            }
            i10++;
        }
        if (i10 >= 1) {
            if (z10) {
                token = makeToken(4);
                token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
            } else {
                token = null;
            }
            this._returnToken = token;
            return;
        }
        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x015d, code lost:
    
        r2 = makeToken(16);
        r2.setText(new java.lang.String(r16.text.getBuffer(), r1, r16.text.length() - r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void mARG(boolean r17) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.actions.cpp.ActionLexer.mARG(boolean):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x00f8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x00fb. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void mAST_CONSTRUCTOR(boolean r17) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.actions.cpp.ActionLexer.mAST_CONSTRUCTOR(boolean):void");
    }

    protected final void mAST_CTOR_ELEMENT(boolean z10) {
        Token token;
        int length = this.text.length();
        if (mo4814LA(1) == '\"' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255 && mo4814LA(3) >= 3 && mo4814LA(3) <= 255) {
            mSTRING(false);
        } else if (_tokenSet_19.member(mo4814LA(1)) && mo4814LA(2) >= 3 && mo4814LA(2) <= 255) {
            mTREE_ELEMENT(false);
        } else if (mo4814LA(1) >= '0' && mo4814LA(1) <= '9') {
            mINT(false);
        } else {
            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
        }
        if (z10) {
            token = makeToken(11);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x006a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void mAST_ITEM(boolean r9) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.actions.cpp.ActionLexer.mAST_ITEM(boolean):void");
    }

    protected final void mCHAR(boolean z10) {
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
            token = makeToken(22);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mCOMMENT(boolean z10) {
        Token token;
        int length = this.text.length();
        if (mo4814LA(1) == '/' && mo4814LA(2) == '/') {
            mSL_COMMENT(false);
        } else if (mo4814LA(1) == '/' && mo4814LA(2) == '*') {
            mML_COMMENT(false);
        } else {
            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
        }
        if (z10) {
            token = makeToken(19);
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
            token = makeToken(25);
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
                                        if (mo4814LA != 'v') {
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
                                            match('v');
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
            token = makeToken(24);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mID(boolean z10) {
        Token token;
        int length = this.text.length();
        char mo4814LA = mo4814LA(1);
        if (mo4814LA != ':') {
            if (mo4814LA != '_') {
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
                        matchRange('A', 'Z');
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
                                matchRange('a', 'z');
                                break;
                            default:
                                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                        }
                }
            } else {
                match('_');
            }
        } else {
            match("::");
        }
        while (_tokenSet_9.member(mo4814LA(1))) {
            char mo4814LA2 = mo4814LA(1);
            if (mo4814LA2 != '_') {
                switch (mo4814LA2) {
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
                    case ':':
                        match("::");
                        break;
                    default:
                        switch (mo4814LA2) {
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
                                matchRange('A', 'Z');
                                break;
                            default:
                                switch (mo4814LA2) {
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
                                        matchRange('a', 'z');
                                        break;
                                    default:
                                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                                }
                        }
                }
            } else {
                match('_');
            }
        }
        if (z10) {
            token = makeToken(17);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:132:0x0296. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:133:0x0299. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:134:0x029c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x015f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x0162. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b8 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018c A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean mID_ELEMENT(boolean r17) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.actions.cpp.ActionLexer.mID_ELEMENT(boolean):boolean");
    }

    protected final void mINT(boolean z10) {
        Token token;
        int length = this.text.length();
        int i10 = 0;
        while (mo4814LA(1) >= '0' && mo4814LA(1) <= '9') {
            mDIGIT(false);
            i10++;
        }
        if (i10 >= 1) {
            if (z10) {
                token = makeToken(26);
                token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
            } else {
                token = null;
            }
            this._returnToken = token;
            return;
        }
        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (mo4814LA(1) != 'L') goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (antlr.actions.cpp.ActionLexer._tokenSet_26.member(mo4814LA(2)) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        match('L');
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        if (r10 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
    
        r10 = makeToken(27);
        r10.setText(new java.lang.String(r9.text.getBuffer(), r0, r9.text.length() - r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
    
        r9._returnToken = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00af, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (mo4814LA(1) != 'l') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (antlr.actions.cpp.ActionLexer._tokenSet_26.member(mo4814LA(2)) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        match('l');
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (mo4814LA(1) != '.') goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        match('.');
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (mo4814LA(1) < '0') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (mo4814LA(1) > '9') goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        if (antlr.actions.cpp.ActionLexer._tokenSet_26.member(mo4814LA(2)) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        mDIGIT(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (antlr.actions.cpp.ActionLexer._tokenSet_26.member(mo4814LA(1)) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        throw new antlr.NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void mINT_OR_FLOAT(boolean r10) {
        /*
            r9 = this;
            antlr.ANTLRStringBuffer r0 = r9.text
            int r0 = r0.length()
            r1 = 0
            r2 = 0
        L8:
            r3 = 1
            char r4 = r9.mo4814LA(r3)
            r5 = 57
            r6 = 48
            r7 = 2
            if (r4 < r6) goto L2c
            char r4 = r9.mo4814LA(r3)
            if (r4 > r5) goto L2c
            antlr.collections.impl.BitSet r4 = antlr.actions.cpp.ActionLexer._tokenSet_25
            char r8 = r9.mo4814LA(r7)
            boolean r4 = r4.member(r8)
            if (r4 == 0) goto L2c
            r9.mDIGIT(r1)
            int r2 = r2 + 1
            goto L8
        L2c:
            if (r2 < r3) goto Lc9
            char r2 = r9.mo4814LA(r3)
            r4 = 76
            if (r2 != r4) goto L46
            antlr.collections.impl.BitSet r2 = antlr.actions.cpp.ActionLexer._tokenSet_26
            char r8 = r9.mo4814LA(r7)
            boolean r2 = r2.member(r8)
            if (r2 == 0) goto L46
            r9.match(r4)
            goto L91
        L46:
            char r2 = r9.mo4814LA(r3)
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 != r4) goto L5e
            antlr.collections.impl.BitSet r2 = antlr.actions.cpp.ActionLexer._tokenSet_26
            char r8 = r9.mo4814LA(r7)
            boolean r2 = r2.member(r8)
            if (r2 == 0) goto L5e
            r9.match(r4)
            goto L91
        L5e:
            char r2 = r9.mo4814LA(r3)
            r4 = 46
            if (r2 != r4) goto L85
            r9.match(r4)
        L69:
            char r2 = r9.mo4814LA(r3)
            if (r2 < r6) goto L91
            char r2 = r9.mo4814LA(r3)
            if (r2 > r5) goto L91
            antlr.collections.impl.BitSet r2 = antlr.actions.cpp.ActionLexer._tokenSet_26
            char r4 = r9.mo4814LA(r7)
            boolean r2 = r2.member(r4)
            if (r2 == 0) goto L91
            r9.mDIGIT(r1)
            goto L69
        L85:
            antlr.collections.impl.BitSet r1 = antlr.actions.cpp.ActionLexer._tokenSet_26
            char r2 = r9.mo4814LA(r3)
            boolean r1 = r1.member(r2)
            if (r1 == 0) goto Lb3
        L91:
            if (r10 == 0) goto Laf
            r10 = 27
            antlr.Token r10 = r9.makeToken(r10)
            java.lang.String r1 = new java.lang.String
            antlr.ANTLRStringBuffer r2 = r9.text
            char[] r2 = r2.getBuffer()
            antlr.ANTLRStringBuffer r3 = r9.text
            int r3 = r3.length()
            int r3 = r3 - r0
            r1.<init>(r2, r0, r3)
            r10.setText(r1)
            goto Lb0
        Laf:
            r10 = 0
        Lb0:
            r9._returnToken = r10
            return
        Lb3:
            antlr.NoViableAltForCharException r10 = new antlr.NoViableAltForCharException
            char r0 = r9.mo4814LA(r3)
            java.lang.String r1 = r9.getFilename()
            int r2 = r9.getLine()
            int r3 = r9.getColumn()
            r10.<init>(r0, r1, r2, r3)
            throw r10
        Lc9:
            antlr.NoViableAltForCharException r10 = new antlr.NoViableAltForCharException
            char r0 = r9.mo4814LA(r3)
            java.lang.String r1 = r9.getFilename()
            int r2 = r9.getLine()
            int r3 = r9.getColumn()
            r10.<init>(r0, r1, r2, r3)
            goto Le0
        Ldf:
            throw r10
        Le0:
            goto Ldf
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.actions.cpp.ActionLexer.mINT_OR_FLOAT(boolean):void");
    }

    protected final void mML_COMMENT(boolean z10) {
        Token token;
        int length = this.text.length();
        match("/*");
        while (true) {
            if (mo4814LA(1) == '*' && mo4814LA(2) == '/') {
                break;
            }
            if (mo4814LA(1) == '\r' && mo4814LA(2) == '\n' && mo4814LA(3) >= 3 && mo4814LA(3) <= 255) {
                match('\r');
                match('\n');
                newline();
            } else if (mo4814LA(1) == '\r' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255 && mo4814LA(3) >= 3 && mo4814LA(3) <= 255) {
                match('\r');
                newline();
            } else if (mo4814LA(1) == '\n' && mo4814LA(2) >= 3 && mo4814LA(2) <= 255 && mo4814LA(3) >= 3 && mo4814LA(3) <= 255) {
                match('\n');
                newline();
            } else if (mo4814LA(1) < 3 || mo4814LA(1) > 255 || mo4814LA(2) < 3 || mo4814LA(2) > 255 || mo4814LA(3) < 3 || mo4814LA(3) > 255) {
                break;
            } else {
                matchNot(CharScanner.EOF_CHAR);
            }
        }
        match("*/");
        if (z10) {
            token = makeToken(21);
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
        if (mo4814LA(1) == '\r' && mo4814LA(2) == '\n') {
            match("\r\n");
        } else if (mo4814LA(1) == '\n') {
            match('\n');
        } else if (mo4814LA(1) == '\r') {
            match('\r');
        } else {
            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
        }
        newline();
        if (z10) {
            token = makeToken(20);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mSTRING(boolean z10) {
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
            token = makeToken(23);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mSTUFF(boolean z10) {
        Token token;
        int length = this.text.length();
        char mo4814LA = mo4814LA(1);
        if (mo4814LA != '\n') {
            if (mo4814LA != '\"') {
                if (mo4814LA != '\'') {
                    if (mo4814LA(1) == '/' && (mo4814LA(2) == '*' || mo4814LA(2) == '/')) {
                        mCOMMENT(false);
                    } else if (mo4814LA(1) == '\r' && mo4814LA(2) == '\n') {
                        match("\r\n");
                        newline();
                    } else if (mo4814LA(1) == '\\' && mo4814LA(2) == '#') {
                        match('\\');
                        match('#');
                        this.text.setLength(length);
                        this.text.append("#");
                    } else {
                        if (mo4814LA(1) == '/') {
                            BitSet bitSet = _tokenSet_1;
                            if (bitSet.member(mo4814LA(2))) {
                                match('/');
                                match(bitSet);
                            }
                        }
                        if (mo4814LA(1) == '\r') {
                            match('\r');
                            newline();
                        } else {
                            BitSet bitSet2 = _tokenSet_2;
                            if (bitSet2.member(mo4814LA(1))) {
                                match(bitSet2);
                            } else {
                                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                            }
                        }
                    }
                } else {
                    mCHAR(false);
                }
            } else {
                mSTRING(false);
            }
        } else {
            match('\n');
            newline();
        }
        if (z10) {
            token = makeToken(5);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (r9 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
    
        r9 = makeToken(13);
        r9.setText(new java.lang.String(r8.text.getBuffer(), r0, r8.text.length() - r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        r8._returnToken = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void mTEXT_ARG(boolean r9) {
        /*
            r8 = this;
            antlr.ANTLRStringBuffer r0 = r8.text
            int r0 = r0.length()
            r1 = 1
            char r2 = r8.mo4814LA(r1)
            r3 = 9
            r4 = 0
            r5 = 13
            if (r2 == r3) goto L4f
            r3 = 10
            if (r2 == r3) goto L4f
            if (r2 == r5) goto L4f
            r3 = 32
            if (r2 == r3) goto L4f
            r3 = 34
            if (r2 == r3) goto L52
            r3 = 36
            if (r2 == r3) goto L52
            r3 = 39
            if (r2 == r3) goto L52
            r3 = 43
            if (r2 == r3) goto L52
            r3 = 95
            if (r2 == r3) goto L52
            switch(r2) {
                case 48: goto L52;
                case 49: goto L52;
                case 50: goto L52;
                case 51: goto L52;
                case 52: goto L52;
                case 53: goto L52;
                case 54: goto L52;
                case 55: goto L52;
                case 56: goto L52;
                case 57: goto L52;
                case 58: goto L52;
                default: goto L33;
            }
        L33:
            switch(r2) {
                case 65: goto L52;
                case 66: goto L52;
                case 67: goto L52;
                case 68: goto L52;
                case 69: goto L52;
                case 70: goto L52;
                case 71: goto L52;
                case 72: goto L52;
                case 73: goto L52;
                case 74: goto L52;
                case 75: goto L52;
                case 76: goto L52;
                case 77: goto L52;
                case 78: goto L52;
                case 79: goto L52;
                case 80: goto L52;
                case 81: goto L52;
                case 82: goto L52;
                case 83: goto L52;
                case 84: goto L52;
                case 85: goto L52;
                case 86: goto L52;
                case 87: goto L52;
                case 88: goto L52;
                case 89: goto L52;
                case 90: goto L52;
                default: goto L36;
            }
        L36:
            switch(r2) {
                case 97: goto L52;
                case 98: goto L52;
                case 99: goto L52;
                case 100: goto L52;
                case 101: goto L52;
                case 102: goto L52;
                case 103: goto L52;
                case 104: goto L52;
                case 105: goto L52;
                case 106: goto L52;
                case 107: goto L52;
                case 108: goto L52;
                case 109: goto L52;
                case 110: goto L52;
                case 111: goto L52;
                case 112: goto L52;
                case 113: goto L52;
                case 114: goto L52;
                case 115: goto L52;
                case 116: goto L52;
                case 117: goto L52;
                case 118: goto L52;
                case 119: goto L52;
                case 120: goto L52;
                case 121: goto L52;
                case 122: goto L52;
                default: goto L39;
            }
        L39:
            antlr.NoViableAltForCharException r9 = new antlr.NoViableAltForCharException
            char r0 = r8.mo4814LA(r1)
            java.lang.String r1 = r8.getFilename()
            int r2 = r8.getLine()
            int r3 = r8.getColumn()
            r9.<init>(r0, r1, r2, r3)
            throw r9
        L4f:
            r8.mWS(r4)
        L52:
            r2 = 0
        L53:
            antlr.collections.impl.BitSet r3 = antlr.actions.cpp.ActionLexer._tokenSet_10
            char r6 = r8.mo4814LA(r1)
            boolean r3 = r3.member(r6)
            if (r3 == 0) goto Lb3
            r3 = 2
            char r6 = r8.mo4814LA(r3)
            r7 = 3
            if (r6 < r7) goto Lb3
            char r6 = r8.mo4814LA(r3)
            r7 = 255(0xff, float:3.57E-43)
            if (r6 > r7) goto Lb3
            r8.mTEXT_ARG_ELEMENT(r4)
            antlr.collections.impl.BitSet r6 = antlr.actions.cpp.ActionLexer._tokenSet_4
            char r7 = r8.mo4814LA(r1)
            boolean r6 = r6.member(r7)
            if (r6 == 0) goto L8e
            antlr.collections.impl.BitSet r6 = antlr.actions.cpp.ActionLexer._tokenSet_11
            char r3 = r8.mo4814LA(r3)
            boolean r3 = r6.member(r3)
            if (r3 == 0) goto L8e
            r8.mWS(r4)
            goto L9a
        L8e:
            antlr.collections.impl.BitSet r3 = antlr.actions.cpp.ActionLexer._tokenSet_11
            char r6 = r8.mo4814LA(r1)
            boolean r3 = r3.member(r6)
            if (r3 == 0) goto L9d
        L9a:
            int r2 = r2 + 1
            goto L53
        L9d:
            antlr.NoViableAltForCharException r9 = new antlr.NoViableAltForCharException
            char r0 = r8.mo4814LA(r1)
            java.lang.String r1 = r8.getFilename()
            int r2 = r8.getLine()
            int r3 = r8.getColumn()
            r9.<init>(r0, r1, r2, r3)
            throw r9
        Lb3:
            if (r2 < r1) goto Ld5
            if (r9 == 0) goto Ld1
            antlr.Token r9 = r8.makeToken(r5)
            java.lang.String r1 = new java.lang.String
            antlr.ANTLRStringBuffer r2 = r8.text
            char[] r2 = r2.getBuffer()
            antlr.ANTLRStringBuffer r3 = r8.text
            int r3 = r3.length()
            int r3 = r3 - r0
            r1.<init>(r2, r0, r3)
            r9.setText(r1)
            goto Ld2
        Ld1:
            r9 = 0
        Ld2:
            r8._returnToken = r9
            return
        Ld5:
            antlr.NoViableAltForCharException r9 = new antlr.NoViableAltForCharException
            char r0 = r8.mo4814LA(r1)
            java.lang.String r1 = r8.getFilename()
            int r2 = r8.getLine()
            int r3 = r8.getColumn()
            r9.<init>(r0, r1, r2, r3)
            goto Lec
        Leb:
            throw r9
        Lec:
            goto Leb
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.actions.cpp.ActionLexer.mTEXT_ARG(boolean):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0020. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0023. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void mTEXT_ARG_ELEMENT(boolean r6) {
        /*
            r5 = this;
            antlr.ANTLRStringBuffer r0 = r5.text
            int r0 = r0.length()
            r1 = 1
            char r2 = r5.mo4814LA(r1)
            r3 = 34
            r4 = 0
            if (r2 == r3) goto L53
            r3 = 36
            if (r2 == r3) goto L4f
            r3 = 39
            if (r2 == r3) goto L4b
            r3 = 43
            if (r2 == r3) goto L47
            r3 = 95
            if (r2 == r3) goto L43
            switch(r2) {
                case 48: goto L3f;
                case 49: goto L3f;
                case 50: goto L3f;
                case 51: goto L3f;
                case 52: goto L3f;
                case 53: goto L3f;
                case 54: goto L3f;
                case 55: goto L3f;
                case 56: goto L3f;
                case 57: goto L3f;
                case 58: goto L43;
                default: goto L23;
            }
        L23:
            switch(r2) {
                case 65: goto L43;
                case 66: goto L43;
                case 67: goto L43;
                case 68: goto L43;
                case 69: goto L43;
                case 70: goto L43;
                case 71: goto L43;
                case 72: goto L43;
                case 73: goto L43;
                case 74: goto L43;
                case 75: goto L43;
                case 76: goto L43;
                case 77: goto L43;
                case 78: goto L43;
                case 79: goto L43;
                case 80: goto L43;
                case 81: goto L43;
                case 82: goto L43;
                case 83: goto L43;
                case 84: goto L43;
                case 85: goto L43;
                case 86: goto L43;
                case 87: goto L43;
                case 88: goto L43;
                case 89: goto L43;
                case 90: goto L43;
                default: goto L26;
            }
        L26:
            switch(r2) {
                case 97: goto L43;
                case 98: goto L43;
                case 99: goto L43;
                case 100: goto L43;
                case 101: goto L43;
                case 102: goto L43;
                case 103: goto L43;
                case 104: goto L43;
                case 105: goto L43;
                case 106: goto L43;
                case 107: goto L43;
                case 108: goto L43;
                case 109: goto L43;
                case 110: goto L43;
                case 111: goto L43;
                case 112: goto L43;
                case 113: goto L43;
                case 114: goto L43;
                case 115: goto L43;
                case 116: goto L43;
                case 117: goto L43;
                case 118: goto L43;
                case 119: goto L43;
                case 120: goto L43;
                case 121: goto L43;
                case 122: goto L43;
                default: goto L29;
            }
        L29:
            antlr.NoViableAltForCharException r6 = new antlr.NoViableAltForCharException
            char r0 = r5.mo4814LA(r1)
            java.lang.String r1 = r5.getFilename()
            int r2 = r5.getLine()
            int r3 = r5.getColumn()
            r6.<init>(r0, r1, r2, r3)
            throw r6
        L3f:
            r5.mINT_OR_FLOAT(r4)
            goto L56
        L43:
            r5.mTEXT_ARG_ID_ELEMENT(r4)
            goto L56
        L47:
            r5.match(r3)
            goto L56
        L4b:
            r5.mCHAR(r4)
            goto L56
        L4f:
            r5.mTEXT_ITEM(r4)
            goto L56
        L53:
            r5.mSTRING(r4)
        L56:
            if (r6 == 0) goto L74
            r6 = 14
            antlr.Token r6 = r5.makeToken(r6)
            java.lang.String r1 = new java.lang.String
            antlr.ANTLRStringBuffer r2 = r5.text
            char[] r2 = r2.getBuffer()
            antlr.ANTLRStringBuffer r3 = r5.text
            int r3 = r3.length()
            int r3 = r3 - r0
            r1.<init>(r2, r0, r3)
            r6.setText(r1)
            goto L75
        L74:
            r6 = 0
        L75:
            r5._returnToken = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.actions.cpp.ActionLexer.mTEXT_ARG_ELEMENT(boolean):void");
    }

    protected final void mTEXT_ARG_ID_ELEMENT(boolean z10) {
        Token token;
        int length = this.text.length();
        mID(true);
        BitSet bitSet = _tokenSet_4;
        if (bitSet.member(mo4814LA(1)) && _tokenSet_22.member(mo4814LA(2))) {
            int length2 = this.text.length();
            mWS(false);
            this.text.setLength(length2);
        } else if (!_tokenSet_22.member(mo4814LA(1))) {
            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
        }
        char mo4814LA = mo4814LA(1);
        if (mo4814LA != '(') {
            if (mo4814LA != '[') {
                if (mo4814LA != '-') {
                    if (mo4814LA != '.') {
                        if (mo4814LA(1) == ':' && mo4814LA(2) == ':' && _tokenSet_12.member(mo4814LA(3))) {
                            match("::");
                            mTEXT_ARG_ID_ELEMENT(false);
                        } else if (!_tokenSet_11.member(mo4814LA(1))) {
                            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                        }
                    } else {
                        match('.');
                        mTEXT_ARG_ID_ELEMENT(false);
                    }
                } else {
                    match("->");
                    mTEXT_ARG_ID_ELEMENT(false);
                }
            } else {
                int i10 = 0;
                while (mo4814LA(1) == '[') {
                    match('[');
                    if (_tokenSet_4.member(mo4814LA(1)) && _tokenSet_24.member(mo4814LA(2)) && mo4814LA(3) >= 3 && mo4814LA(3) <= 255) {
                        int length3 = this.text.length();
                        mWS(false);
                        this.text.setLength(length3);
                    } else if (!_tokenSet_24.member(mo4814LA(1)) || mo4814LA(2) < 3 || mo4814LA(2) > 255 || mo4814LA(3) < 3 || mo4814LA(3) > 255) {
                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                    }
                    mTEXT_ARG(false);
                    char mo4814LA2 = mo4814LA(1);
                    if (mo4814LA2 != '\t' && mo4814LA2 != '\n' && mo4814LA2 != '\r' && mo4814LA2 != ' ') {
                        if (mo4814LA2 != ']') {
                            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                        }
                    } else {
                        int length4 = this.text.length();
                        mWS(false);
                        this.text.setLength(length4);
                    }
                    match(']');
                    i10++;
                }
                if (i10 < 1) {
                    throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                }
            }
        } else {
            match('(');
            if (bitSet.member(mo4814LA(1)) && _tokenSet_23.member(mo4814LA(2)) && mo4814LA(3) >= 3 && mo4814LA(3) <= 255) {
                int length5 = this.text.length();
                mWS(false);
                this.text.setLength(length5);
            } else if (!_tokenSet_23.member(mo4814LA(1)) || mo4814LA(2) < 3 || mo4814LA(2) > 255) {
                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
            }
            while (_tokenSet_24.member(mo4814LA(1)) && mo4814LA(2) >= 3 && mo4814LA(2) <= 255 && mo4814LA(3) >= 3 && mo4814LA(3) <= 255) {
                mTEXT_ARG(false);
                while (mo4814LA(1) == ',') {
                    match(',');
                    mTEXT_ARG(false);
                }
            }
            char mo4814LA3 = mo4814LA(1);
            if (mo4814LA3 != '\t' && mo4814LA3 != '\n' && mo4814LA3 != '\r' && mo4814LA3 != ' ') {
                if (mo4814LA3 != ')') {
                    throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                }
            } else {
                int length6 = this.text.length();
                mWS(false);
                this.text.setLength(length6);
            }
            match(')');
        }
        if (z10) {
            token = makeToken(15);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mTEXT_ITEM(boolean z10) {
        Token token;
        Token token2;
        Token token3;
        int length = this.text.length();
        if (mo4814LA(1) == '$' && mo4814LA(2) == 'F' && mo4814LA(3) == 'O') {
            match("$FOLLOW");
            if (_tokenSet_5.member(mo4814LA(1)) && _tokenSet_6.member(mo4814LA(2)) && mo4814LA(3) >= 3 && mo4814LA(3) <= 255) {
                char mo4814LA = mo4814LA(1);
                if (mo4814LA != '\t' && mo4814LA != '\n' && mo4814LA != '\r' && mo4814LA != ' ') {
                    if (mo4814LA != '(') {
                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                    }
                } else {
                    mWS(false);
                }
                match('(');
                mTEXT_ARG(true);
                token3 = this._returnToken;
                match(')');
            } else {
                token3 = null;
            }
            String ruleName = this.currentRule.getRuleName();
            if (token3 != null) {
                ruleName = token3.getText();
            }
            String fOLLOWBitSet = this.generator.getFOLLOWBitSet(ruleName, 1);
            if (fOLLOWBitSet == null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("$FOLLOW(");
                stringBuffer.append(ruleName);
                stringBuffer.append(")");
                stringBuffer.append(": unknown rule or bad lookahead computation");
                reportError(stringBuffer.toString());
            } else {
                this.text.setLength(length);
                this.text.append(fOLLOWBitSet);
            }
        } else if (mo4814LA(1) == '$' && mo4814LA(2) == 'F' && mo4814LA(3) == 'I') {
            match("$FIRST");
            if (_tokenSet_5.member(mo4814LA(1)) && _tokenSet_6.member(mo4814LA(2)) && mo4814LA(3) >= 3 && mo4814LA(3) <= 255) {
                char mo4814LA2 = mo4814LA(1);
                if (mo4814LA2 != '\t' && mo4814LA2 != '\n' && mo4814LA2 != '\r' && mo4814LA2 != ' ') {
                    if (mo4814LA2 != '(') {
                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                    }
                } else {
                    mWS(false);
                }
                match('(');
                mTEXT_ARG(true);
                token = this._returnToken;
                match(')');
            } else {
                token = null;
            }
            String ruleName2 = this.currentRule.getRuleName();
            if (token != null) {
                ruleName2 = token.getText();
            }
            String fIRSTBitSet = this.generator.getFIRSTBitSet(ruleName2, 1);
            if (fIRSTBitSet == null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("$FIRST(");
                stringBuffer2.append(ruleName2);
                stringBuffer2.append(")");
                stringBuffer2.append(": unknown rule or bad lookahead computation");
                reportError(stringBuffer2.toString());
            } else {
                this.text.setLength(length);
                this.text.append(fIRSTBitSet);
            }
        } else if (mo4814LA(1) == '$' && mo4814LA(2) == 'a') {
            match("$append");
            char mo4814LA3 = mo4814LA(1);
            if (mo4814LA3 != '\t' && mo4814LA3 != '\n' && mo4814LA3 != '\r' && mo4814LA3 != ' ') {
                if (mo4814LA3 != '(') {
                    throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                }
            } else {
                mWS(false);
            }
            match('(');
            mTEXT_ARG(true);
            Token token4 = this._returnToken;
            match(')');
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("text += ");
            stringBuffer3.append(token4.getText());
            String stringBuffer4 = stringBuffer3.toString();
            this.text.setLength(length);
            this.text.append(stringBuffer4);
        } else if (mo4814LA(1) == '$' && mo4814LA(2) == 's') {
            match("$set");
            if (mo4814LA(1) == 'T' && mo4814LA(2) == 'e') {
                match("Text");
                char mo4814LA4 = mo4814LA(1);
                if (mo4814LA4 != '\t' && mo4814LA4 != '\n' && mo4814LA4 != '\r' && mo4814LA4 != ' ') {
                    if (mo4814LA4 != '(') {
                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                    }
                } else {
                    mWS(false);
                }
                match('(');
                mTEXT_ARG(true);
                Token token5 = this._returnToken;
                match(')');
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("{ text.erase(_begin); text += ");
                stringBuffer5.append(token5.getText());
                stringBuffer5.append("; }");
                String stringBuffer6 = stringBuffer5.toString();
                this.text.setLength(length);
                this.text.append(stringBuffer6);
            } else if (mo4814LA(1) == 'T' && mo4814LA(2) == 'o') {
                match("Token");
                char mo4814LA5 = mo4814LA(1);
                if (mo4814LA5 != '\t' && mo4814LA5 != '\n' && mo4814LA5 != '\r' && mo4814LA5 != ' ') {
                    if (mo4814LA5 != '(') {
                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                    }
                } else {
                    mWS(false);
                }
                match('(');
                mTEXT_ARG(true);
                Token token6 = this._returnToken;
                match(')');
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append("_token = ");
                stringBuffer7.append(token6.getText());
                String stringBuffer8 = stringBuffer7.toString();
                this.text.setLength(length);
                this.text.append(stringBuffer8);
            } else if (mo4814LA(1) == 'T' && mo4814LA(2) == 'y') {
                match("Type");
                char mo4814LA6 = mo4814LA(1);
                if (mo4814LA6 != '\t' && mo4814LA6 != '\n' && mo4814LA6 != '\r' && mo4814LA6 != ' ') {
                    if (mo4814LA6 != '(') {
                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                    }
                } else {
                    mWS(false);
                }
                match('(');
                mTEXT_ARG(true);
                Token token7 = this._returnToken;
                match(')');
                StringBuffer stringBuffer9 = new StringBuffer();
                stringBuffer9.append("_ttype = ");
                stringBuffer9.append(token7.getText());
                String stringBuffer10 = stringBuffer9.toString();
                this.text.setLength(length);
                this.text.append(stringBuffer10);
            } else {
                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
            }
        } else if (mo4814LA(1) == '$' && mo4814LA(2) == 'g') {
            match("$getText");
            this.text.setLength(length);
            this.text.append("text.substr(_begin,text.length()-_begin)");
        } else {
            throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
        }
        if (z10) {
            token2 = makeToken(7);
            token2.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token2 = null;
        }
        this._returnToken = token2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00f1. Please report as an issue. */
    protected final void mTREE(boolean z10) {
        Token token;
        char mo4814LA;
        int length = this.text.length();
        Vector vector = new Vector(10);
        int length2 = this.text.length();
        char c10 = '(';
        match('(');
        this.text.setLength(length2);
        char mo4814LA2 = mo4814LA(1);
        if (mo4814LA2 != '\t' && mo4814LA2 != '\n' && mo4814LA2 != '\r' && mo4814LA2 != ' ') {
            if (mo4814LA2 != '(' && mo4814LA2 != ':' && mo4814LA2 != '_' && mo4814LA2 != '\"' && mo4814LA2 != '#') {
                switch (mo4814LA2) {
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
                    case '[':
                        break;
                    default:
                        switch (mo4814LA2) {
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
                                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                        }
                }
            }
        } else {
            int length3 = this.text.length();
            mWS(false);
            this.text.setLength(length3);
        }
        int length4 = this.text.length();
        mTREE_ELEMENT(true);
        this.text.setLength(length4);
        vector.appendElement(this.generator.processStringForASTConstructor(this._returnToken.getText()));
        char mo4814LA3 = mo4814LA(1);
        if (mo4814LA3 != '\t' && mo4814LA3 != '\n' && mo4814LA3 != '\r' && mo4814LA3 != ' ') {
            if (mo4814LA3 != ')' && mo4814LA3 != ',') {
                throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
            }
        } else {
            int length5 = this.text.length();
            mWS(false);
            this.text.setLength(length5);
        }
        while (mo4814LA(1) == ',') {
            int length6 = this.text.length();
            match(',');
            this.text.setLength(length6);
            char mo4814LA4 = mo4814LA(1);
            if (mo4814LA4 != '\t' && mo4814LA4 != '\n' && mo4814LA4 != '\r' && mo4814LA4 != ' ') {
                if (mo4814LA4 != c10 && mo4814LA4 != ':' && mo4814LA4 != '_' && mo4814LA4 != '\"') {
                    if (mo4814LA4 != '#') {
                        switch (mo4814LA4) {
                            default:
                                switch (mo4814LA4) {
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
                                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
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
                            case '[':
                                int length7 = this.text.length();
                                mTREE_ELEMENT(true);
                                this.text.setLength(length7);
                                vector.appendElement(this.generator.processStringForASTConstructor(this._returnToken.getText()));
                                mo4814LA = mo4814LA(1);
                                if (mo4814LA == '\t' && mo4814LA != '\n' && mo4814LA != '\r' && mo4814LA != ' ') {
                                    if (mo4814LA != ')' && mo4814LA != ',') {
                                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                                    }
                                } else {
                                    int length8 = this.text.length();
                                    mWS(false);
                                    this.text.setLength(length8);
                                }
                                c10 = '(';
                                break;
                        }
                    }
                }
            } else {
                int length9 = this.text.length();
                mWS(false);
                this.text.setLength(length9);
            }
            int length72 = this.text.length();
            mTREE_ELEMENT(true);
            this.text.setLength(length72);
            vector.appendElement(this.generator.processStringForASTConstructor(this._returnToken.getText()));
            mo4814LA = mo4814LA(1);
            if (mo4814LA == '\t') {
            }
            int length82 = this.text.length();
            mWS(false);
            this.text.setLength(length82);
            c10 = '(';
        }
        this.text.setLength(length);
        this.text.append(this.generator.getASTCreateString(vector));
        int length10 = this.text.length();
        match(')');
        this.text.setLength(length10);
        if (z10) {
            token = makeToken(8);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x001d. Please report as an issue. */
    protected final void mTREE_ELEMENT(boolean z10) {
        String mapTreeId;
        int length = this.text.length();
        char mo4814LA = mo4814LA(1);
        Token token = null;
        if (mo4814LA != '\"') {
            if (mo4814LA != '(') {
                if (mo4814LA != ':' && mo4814LA != '_') {
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
                            mAST_CONSTRUCTOR(false);
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
                                default:
                                    if (mo4814LA(1) == '#' && mo4814LA(2) == '(') {
                                        int length2 = this.text.length();
                                        match('#');
                                        this.text.setLength(length2);
                                        mTREE(false);
                                        break;
                                    } else if (mo4814LA(1) == '#' && mo4814LA(2) == '[') {
                                        int length3 = this.text.length();
                                        match('#');
                                        this.text.setLength(length3);
                                        mAST_CONSTRUCTOR(false);
                                        break;
                                    } else if (mo4814LA(1) == '#' && _tokenSet_12.member(mo4814LA(2))) {
                                        int length4 = this.text.length();
                                        match('#');
                                        this.text.setLength(length4);
                                        boolean mID_ELEMENT = mID_ELEMENT(true);
                                        Token token2 = this._returnToken;
                                        if (!mID_ELEMENT && (mapTreeId = this.generator.mapTreeId(token2.getText(), null)) != null) {
                                            this.text.setLength(length);
                                            this.text.append(mapTreeId);
                                            break;
                                        }
                                    } else if (mo4814LA(1) == '#' && mo4814LA(2) == '#') {
                                        match("##");
                                        if (this.currentRule != null) {
                                            StringBuffer stringBuffer = new StringBuffer();
                                            stringBuffer.append(this.currentRule.getRuleName());
                                            stringBuffer.append("_AST");
                                            String stringBuffer2 = stringBuffer.toString();
                                            this.text.setLength(length);
                                            this.text.append(stringBuffer2);
                                            break;
                                        } else {
                                            reportError("\"##\" not valid in this context");
                                            this.text.setLength(length);
                                            this.text.append("##");
                                            break;
                                        }
                                    } else {
                                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
                                    }
                                    break;
                            }
                    }
                }
                mID_ELEMENT(false);
            } else {
                mTREE(false);
            }
        } else {
            mSTRING(false);
        }
        if (z10) {
            token = makeToken(9);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        }
        this._returnToken = token;
    }

    protected final void mVAR_ASSIGN(boolean z10) {
        Token token;
        ActionTransInfo actionTransInfo;
        int length = this.text.length();
        match('=');
        if (mo4814LA(1) != '=' && (actionTransInfo = this.transInfo) != null && actionTransInfo.refRuleRoot != null) {
            actionTransInfo.assignToRoot = true;
        }
        if (z10) {
            token = makeToken(18);
            token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
        } else {
            token = null;
        }
        this._returnToken = token;
    }

    protected final void mWS(boolean z10) {
        Token token;
        int length = this.text.length();
        int i10 = 0;
        while (true) {
            if (mo4814LA(1) == '\r' && mo4814LA(2) == '\n') {
                match('\r');
                match('\n');
                newline();
            } else if (mo4814LA(1) == ' ') {
                match(' ');
            } else if (mo4814LA(1) == '\t') {
                match('\t');
            } else if (mo4814LA(1) == '\r') {
                match('\r');
                newline();
            } else {
                if (mo4814LA(1) != '\n') {
                    break;
                }
                match('\n');
                newline();
            }
            i10++;
        }
        if (i10 >= 1) {
            if (z10) {
                token = makeToken(28);
                token.setText(new String(this.text.getBuffer(), length, this.text.length() - length));
            } else {
                token = null;
            }
            this._returnToken = token;
            return;
        }
        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
    }

    @Override // antlr.TokenStream
    public Token nextToken() {
        Token token;
        do {
            resetText();
            try {
                try {
                    if (mo4814LA(1) >= 3 && mo4814LA(1) <= 255) {
                        mACTION(true);
                    } else if (mo4814LA(1) == 65535) {
                        uponEOF();
                        this._returnToken = makeToken(1);
                    } else {
                        throw new NoViableAltForCharException(mo4814LA(1), getFilename(), getLine(), getColumn());
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

    @Override // antlr.CharScanner
    public void reportError(RecognitionException recognitionException) {
        Tool tool = this.antlrTool;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Syntax error in action: ");
        stringBuffer.append(recognitionException);
        tool.error(stringBuffer.toString(), getFilename(), getLine(), getColumn());
    }

    @Override // antlr.CharScanner
    public void reportWarning(String str) {
        if (getFilename() == null) {
            this.antlrTool.warning(str);
        } else {
            this.antlrTool.warning(str, getFilename(), getLine(), getColumn());
        }
    }

    public void setLineOffset(int i10) {
        setLine(i10);
    }

    public void setTool(Tool tool) {
        this.antlrTool = tool;
    }

    @Override // antlr.CharScanner
    public void reportError(String str) {
        this.antlrTool.error(str, getFilename(), getLine(), getColumn());
    }

    public ActionLexer(InputStream inputStream) {
        this(new ByteBuffer(inputStream));
    }

    public ActionLexer(Reader reader) {
        this(new CharBuffer(reader));
    }

    public ActionLexer(InputBuffer inputBuffer) {
        this(new LexerSharedInputState(inputBuffer));
    }

    public ActionLexer(LexerSharedInputState lexerSharedInputState) {
        super(lexerSharedInputState);
        this.lineOffset = 0;
        this.caseSensitiveLiterals = true;
        setCaseSensitive(true);
        this.literals = new Hashtable();
    }
}
