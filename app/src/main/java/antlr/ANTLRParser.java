package antlr;

import anet.channel.request.Request;
import antlr.collections.impl.BitSet;
import com.raizlabs.android.dbflow.sql.language.Operator;

/* loaded from: classes.dex */
public class ANTLRParser extends LLkParser implements ANTLRTokenTypes {
    private static final boolean DEBUG_PARSER = false;
    Tool antlrTool;
    ANTLRGrammarParseBehavior behavior;
    protected int blockNesting;
    public static final String[] _tokenNames = {"<0>", "EOF", "<2>", "NULL_TREE_LOOKAHEAD", "\"tokens\"", "\"header\"", "STRING_LITERAL", "ACTION", "DOC_COMMENT", "\"lexclass\"", "\"class\"", "\"extends\"", "\"Lexer\"", "\"TreeParser\"", Request.Method.OPTION, "ASSIGN", "SEMI", "RCURLY", "\"charVocabulary\"", "CHAR_LITERAL", "INT", Operator.Operation.f12582OR, "RANGE", "TOKENS", "TOKEN_REF", "OPEN_ELEMENT_OPTION", "CLOSE_ELEMENT_OPTION", "LPAREN", "RPAREN", "\"Parser\"", "\"protected\"", "\"public\"", "\"private\"", "BANG", "ARG_ACTION", "\"returns\"", "COLON", "\"throws\"", "COMMA", "\"exception\"", "\"catch\"", "RULE_REF", "NOT_OP", "SEMPRED", "TREE_BEGIN", "QUESTION", "STAR", "PLUS", "IMPLIES", "CARET", "WILDCARD", "\"options\"", "WS", "COMMENT", "SL_COMMENT", "ML_COMMENT", "ESC", "DIGIT", "XDIGIT", "NESTED_ARG_ACTION", "NESTED_ACTION", "WS_LOOP", "INTERNAL_RULE_REF", "WS_OPT"};
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

    public ANTLRParser(TokenBuffer tokenBuffer, ANTLRGrammarParseBehavior aNTLRGrammarParseBehavior, Tool tool) {
        super(tokenBuffer, 1);
        this.blockNesting = -1;
        this.tokenNames = _tokenNames;
        this.behavior = aNTLRGrammarParseBehavior;
        this.antlrTool = tool;
    }

    private void checkForMissingEndRule(Token token) {
        if (token.getColumn() == 1) {
            this.antlrTool.warning("did you forget to terminate previous rule?", getFilename(), token.getLine(), token.getColumn());
        }
    }

    private boolean lastInRule() {
        if (this.blockNesting == 0) {
            if (mo4816LA(1) == 16 || mo4816LA(1) == 39 || mo4816LA(1) == 21) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static final long[] mk_tokenSet_0() {
        return new long[]{2206556225792L, 0};
    }

    private static final long[] mk_tokenSet_1() {
        return new long[]{2472844214400L, 0};
    }

    private static final long[] mk_tokenSet_10() {
        return new long[]{2251345007067328L, 0};
    }

    private static final long[] mk_tokenSet_11() {
        return new long[]{1721861130420416L, 0};
    }

    private static final long[] mk_tokenSet_2() {
        return new long[]{1158885407195328L, 0};
    }

    private static final long[] mk_tokenSet_3() {
        return new long[]{1159461236965568L, 0};
    }

    private static final long[] mk_tokenSet_4() {
        return new long[]{1132497128128576L, 0};
    }

    private static final long[] mk_tokenSet_5() {
        return new long[]{1722479914074304L, 0};
    }

    private static final long[] mk_tokenSet_6() {
        return new long[]{1722411194597568L, 0};
    }

    private static final long[] mk_tokenSet_7() {
        return new long[]{1125899924144192L, 0};
    }

    private static final long[] mk_tokenSet_8() {
        return new long[]{1722411190386880L, 0};
    }

    private static final long[] mk_tokenSet_9() {
        return new long[]{1159444023476416L, 0};
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[LOOP:0: B:30:0x0057->B:32:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void alternative() {
        /*
            r7 = this;
            r0 = 1
            int r1 = r7.mo4816LA(r0)
            r2 = 6
            r3 = 28
            r4 = 39
            r5 = 21
            r6 = 16
            if (r1 == r2) goto L4b
            r2 = 7
            if (r1 == r2) goto L4b
            if (r1 == r6) goto L4b
            r2 = 19
            if (r1 == r2) goto L4b
            if (r1 == r5) goto L4b
            r2 = 24
            if (r1 == r2) goto L4b
            r2 = 33
            if (r1 == r2) goto L40
            if (r1 == r4) goto L4b
            r2 = 50
            if (r1 == r2) goto L4b
            r2 = 27
            if (r1 == r2) goto L4b
            if (r1 == r3) goto L4b
            switch(r1) {
                case 41: goto L4b;
                case 42: goto L4b;
                case 43: goto L4b;
                case 44: goto L4b;
                default: goto L32;
            }
        L32:
            antlr.NoViableAltException r1 = new antlr.NoViableAltException
            antlr.Token r0 = r7.mo4817LT(r0)
            java.lang.String r2 = r7.getFilename()
            r1.<init>(r0, r2)
            throw r1
        L40:
            r7.match(r2)
            antlr.ParserSharedInputState r1 = r7.inputState
            int r1 = r1.guessing
            if (r1 != 0) goto L4b
            r1 = 0
            goto L4c
        L4b:
            r1 = 1
        L4c:
            antlr.ParserSharedInputState r2 = r7.inputState
            int r2 = r2.guessing
            if (r2 != 0) goto L57
            antlr.ANTLRGrammarParseBehavior r2 = r7.behavior
            r2.beginAlt(r1)
        L57:
            antlr.collections.impl.BitSet r1 = antlr.ANTLRParser._tokenSet_2
            int r2 = r7.mo4816LA(r0)
            boolean r1 = r1.member(r2)
            if (r1 == 0) goto L67
            r7.element()
            goto L57
        L67:
            int r1 = r7.mo4816LA(r0)
            if (r1 == r6) goto L85
            if (r1 == r5) goto L85
            if (r1 == r3) goto L85
            if (r1 != r4) goto L77
            r7.exceptionSpecNoLabel()
            goto L85
        L77:
            antlr.NoViableAltException r1 = new antlr.NoViableAltException
            antlr.Token r0 = r7.mo4817LT(r0)
            java.lang.String r2 = r7.getFilename()
            r1.<init>(r0, r2)
            throw r1
        L85:
            antlr.ParserSharedInputState r0 = r7.inputState
            int r0 = r0.guessing
            if (r0 != 0) goto L90
            antlr.ANTLRGrammarParseBehavior r0 = r7.behavior
            r0.endAlt()
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.ANTLRParser.alternative():void");
    }

    public final int ast_type_spec() {
        int mo4816LA = mo4816LA(1);
        if (mo4816LA == 6 || mo4816LA == 7 || mo4816LA == 16 || mo4816LA == 19 || mo4816LA == 21 || mo4816LA == 39 || mo4816LA == 24 || mo4816LA == 25 || mo4816LA == 27 || mo4816LA == 28) {
            return 1;
        }
        if (mo4816LA != 33) {
            if (mo4816LA == 34) {
                return 1;
            }
            if (mo4816LA != 49) {
                if (mo4816LA != 50) {
                    switch (mo4816LA) {
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                            return 1;
                        default:
                            throw new NoViableAltException(mo4817LT(1), getFilename());
                    }
                }
                return 1;
            }
            match(49);
            if (this.inputState.guessing != 0) {
                return 1;
            }
            return 2;
        }
        match(33);
        if (this.inputState.guessing != 0) {
            return 1;
        }
        return 3;
    }

    public final void block() {
        if (this.inputState.guessing == 0) {
            this.blockNesting++;
        }
        alternative();
        while (mo4816LA(1) == 21) {
            match(21);
            alternative();
        }
        if (this.inputState.guessing == 0) {
            this.blockNesting--;
        }
    }

    public final BitSet charSet() {
        BitSet blockElement = setBlockElement();
        while (mo4816LA(1) == 21) {
            match(21);
            BitSet blockElement2 = setBlockElement();
            if (this.inputState.guessing == 0) {
                blockElement.orInPlace(blockElement2);
            }
        }
        return blockElement;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:19|20|(4:24|(1:26)(3:32|(1:56)(5:38|39|40|41|42)|(1:44)(2:45|(2:52|53)(1:51)))|27|(2:29|30)(1:31))|62|63|64|(1:(1:67)(2:70|71))(1:72)|68|69|(0)(0)|27|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009b, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x002a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8 A[Catch: RecognitionException -> 0x0137, TryCatch #2 {RecognitionException -> 0x0137, blocks: (B:3:0x0008, B:4:0x000c, B:5:0x000f, B:6:0x012b, B:7:0x0136, B:9:0x0013, B:11:0x0021, B:12:0x0026, B:13:0x002a, B:14:0x002d, B:15:0x011f, B:16:0x012a, B:17:0x0031, B:19:0x003e, B:20:0x0044, B:22:0x0051, B:26:0x00a8, B:27:0x0101, B:29:0x010a, B:32:0x00ac, B:34:0x00b2, B:36:0x00b8, B:38:0x00be, B:42:0x00da, B:44:0x00e8, B:45:0x00ec, B:47:0x00f2, B:49:0x00f8, B:51:0x00fe, B:52:0x0111, B:53:0x011e, B:57:0x0057, B:59:0x005d, B:62:0x0066, B:69:0x009c), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a A[Catch: RecognitionException -> 0x0137, TryCatch #2 {RecognitionException -> 0x0137, blocks: (B:3:0x0008, B:4:0x000c, B:5:0x000f, B:6:0x012b, B:7:0x0136, B:9:0x0013, B:11:0x0021, B:12:0x0026, B:13:0x002a, B:14:0x002d, B:15:0x011f, B:16:0x012a, B:17:0x0031, B:19:0x003e, B:20:0x0044, B:22:0x0051, B:26:0x00a8, B:27:0x0101, B:29:0x010a, B:32:0x00ac, B:34:0x00b2, B:36:0x00b8, B:38:0x00be, B:42:0x00da, B:44:0x00e8, B:45:0x00ec, B:47:0x00f2, B:49:0x00f8, B:51:0x00fe, B:52:0x0111, B:53:0x011e, B:57:0x0057, B:59:0x005d, B:62:0x0066, B:69:0x009c), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[Catch: RecognitionException -> 0x0137, TryCatch #2 {RecognitionException -> 0x0137, blocks: (B:3:0x0008, B:4:0x000c, B:5:0x000f, B:6:0x012b, B:7:0x0136, B:9:0x0013, B:11:0x0021, B:12:0x0026, B:13:0x002a, B:14:0x002d, B:15:0x011f, B:16:0x012a, B:17:0x0031, B:19:0x003e, B:20:0x0044, B:22:0x0051, B:26:0x00a8, B:27:0x0101, B:29:0x010a, B:32:0x00ac, B:34:0x00b2, B:36:0x00b8, B:38:0x00be, B:42:0x00da, B:44:0x00e8, B:45:0x00ec, B:47:0x00f2, B:49:0x00f8, B:51:0x00fe, B:52:0x0111, B:53:0x011e, B:57:0x0057, B:59:0x005d, B:62:0x0066, B:69:0x009c), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void classDef() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.ANTLRParser.classDef():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x00ff. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ebnf(antlr.Token r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.ANTLRParser.ebnf(antlr.Token, boolean):void");
    }

    public final void element() {
        elementNoOptionSpec();
        int mo4816LA = mo4816LA(1);
        if (mo4816LA != 6 && mo4816LA != 7 && mo4816LA != 16 && mo4816LA != 19 && mo4816LA != 21 && mo4816LA != 39 && mo4816LA != 50 && mo4816LA != 24) {
            if (mo4816LA != 25) {
                if (mo4816LA == 27 || mo4816LA == 28) {
                    return;
                }
                switch (mo4816LA) {
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        return;
                    default:
                        throw new NoViableAltException(mo4817LT(1), getFilename());
                }
            }
            elementOptionSpec();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void elementNoOptionSpec() {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.ANTLRParser.elementNoOptionSpec():void");
    }

    public final void elementOptionSpec() {
        match(25);
        Token m4813id = m4813id();
        match(15);
        Token optionValue = optionValue();
        if (this.inputState.guessing == 0) {
            this.behavior.refElementOption(m4813id, optionValue);
        }
        while (mo4816LA(1) == 16) {
            match(16);
            Token m4813id2 = m4813id();
            match(15);
            Token optionValue2 = optionValue();
            if (this.inputState.guessing == 0) {
                this.behavior.refElementOption(m4813id2, optionValue2);
            }
        }
        match(26);
    }

    public final void exceptionGroup() {
        if (this.inputState.guessing == 0) {
            this.behavior.beginExceptionGroup();
        }
        int i10 = 0;
        while (mo4816LA(1) == 39) {
            exceptionSpec();
            i10++;
        }
        if (i10 >= 1) {
            if (this.inputState.guessing == 0) {
                this.behavior.endExceptionGroup();
                return;
            }
            return;
        }
        throw new NoViableAltException(mo4817LT(1), getFilename());
    }

    public final void exceptionHandler() {
        match(40);
        Token mo4817LT = mo4817LT(1);
        match(34);
        Token mo4817LT2 = mo4817LT(1);
        match(7);
        if (this.inputState.guessing == 0) {
            this.behavior.refExceptionHandler(mo4817LT, mo4817LT2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r3.inputState.guessing == 0) goto L17;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0014. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0017. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d A[LOOP:0: B:19:0x0045->B:21:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void exceptionSpec() {
        /*
            r3 = this;
            r0 = 39
            r3.match(r0)
            r0 = 1
            int r1 = r3.mo4816LA(r0)
            if (r1 == r0) goto L39
            r2 = 24
            if (r1 == r2) goto L39
            r2 = 34
            if (r1 == r2) goto L2b
            switch(r1) {
                case 7: goto L39;
                case 8: goto L39;
                case 9: goto L39;
                case 10: goto L39;
                default: goto L17;
            }
        L17:
            switch(r1) {
                case 30: goto L39;
                case 31: goto L39;
                case 32: goto L39;
                default: goto L1a;
            }
        L1a:
            switch(r1) {
                case 39: goto L39;
                case 40: goto L39;
                case 41: goto L39;
                default: goto L1d;
            }
        L1d:
            antlr.NoViableAltException r1 = new antlr.NoViableAltException
            antlr.Token r0 = r3.mo4817LT(r0)
            java.lang.String r2 = r3.getFilename()
            r1.<init>(r0, r2)
            throw r1
        L2b:
            antlr.Token r1 = r3.mo4817LT(r0)
            r3.match(r2)
            antlr.ParserSharedInputState r2 = r3.inputState
            int r2 = r2.guessing
            if (r2 != 0) goto L39
            goto L3a
        L39:
            r1 = 0
        L3a:
            antlr.ParserSharedInputState r2 = r3.inputState
            int r2 = r2.guessing
            if (r2 != 0) goto L45
            antlr.ANTLRGrammarParseBehavior r2 = r3.behavior
            r2.beginExceptionSpec(r1)
        L45:
            int r1 = r3.mo4816LA(r0)
            r2 = 40
            if (r1 != r2) goto L51
            r3.exceptionHandler()
            goto L45
        L51:
            antlr.ParserSharedInputState r0 = r3.inputState
            int r0 = r0.guessing
            if (r0 != 0) goto L5c
            antlr.ANTLRGrammarParseBehavior r0 = r3.behavior
            r0.endExceptionSpec()
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.ANTLRParser.exceptionSpec():void");
    }

    public final void exceptionSpecNoLabel() {
        match(39);
        if (this.inputState.guessing == 0) {
            this.behavior.beginExceptionSpec(null);
        }
        while (mo4816LA(1) == 40) {
            exceptionHandler();
        }
        if (this.inputState.guessing == 0) {
            this.behavior.endExceptionSpec();
        }
    }

    public final void fileOptionsSpec() {
        match(14);
        while (true) {
            if (mo4816LA(1) != 24 && mo4816LA(1) != 41) {
                match(17);
                return;
            }
            Token m4813id = m4813id();
            match(15);
            Token optionValue = optionValue();
            if (this.inputState.guessing == 0) {
                this.behavior.setFileOption(m4813id, optionValue, getInputState().filename);
            }
            match(16);
        }
    }

    public final void grammar() {
        Token token = null;
        while (mo4816LA(1) == 5) {
            try {
                if (this.inputState.guessing == 0) {
                    token = null;
                }
                match(5);
                int mo4816LA = mo4816LA(1);
                if (mo4816LA != 6) {
                    if (mo4816LA != 7) {
                        throw new NoViableAltException(mo4817LT(1), getFilename());
                    }
                } else {
                    token = mo4817LT(1);
                    match(6);
                }
                Token mo4817LT = mo4817LT(1);
                match(7);
                if (this.inputState.guessing == 0) {
                    this.behavior.refHeaderAction(token, mo4817LT);
                }
            } catch (RecognitionException e10) {
                if (this.inputState.guessing == 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("rule grammar trapped:\n");
                    stringBuffer.append(e10.toString());
                    reportError(e10, stringBuffer.toString());
                    consumeUntil(1);
                    return;
                }
                throw e10;
            }
        }
        int mo4816LA2 = mo4816LA(1);
        if (mo4816LA2 != 1) {
            if (mo4816LA2 != 14) {
                switch (mo4816LA2) {
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        throw new NoViableAltException(mo4817LT(1), getFilename());
                }
            } else {
                fileOptionsSpec();
            }
        }
        while (mo4816LA(1) >= 7 && mo4816LA(1) <= 10) {
            classDef();
        }
        match(1);
    }

    /* renamed from: id */
    public final Token m4813id() {
        int mo4816LA = mo4816LA(1);
        if (mo4816LA != 24) {
            if (mo4816LA == 41) {
                Token mo4817LT = mo4817LT(1);
                match(41);
                if (this.inputState.guessing == 0) {
                    return mo4817LT;
                }
            } else {
                throw new NoViableAltException(mo4817LT(1), getFilename());
            }
        } else {
            Token mo4817LT2 = mo4817LT(1);
            match(24);
            if (this.inputState.guessing == 0) {
                return mo4817LT2;
            }
        }
        return null;
    }

    public final void lexerOptionsSpec() {
        match(14);
        while (true) {
            int mo4816LA = mo4816LA(1);
            if (mo4816LA != 18) {
                if (mo4816LA != 24 && mo4816LA != 41) {
                    match(17);
                    return;
                }
                Token m4813id = m4813id();
                match(15);
                Token optionValue = optionValue();
                if (this.inputState.guessing == 0) {
                    this.behavior.setGrammarOption(m4813id, optionValue);
                }
                match(16);
            } else {
                match(18);
                match(15);
                BitSet charSet = charSet();
                match(16);
                if (this.inputState.guessing == 0) {
                    this.behavior.setCharVocabulary(charSet);
                }
            }
        }
    }

    public final void lexerSpec(String str) {
        Token token;
        int mo4816LA = mo4816LA(1);
        String str2 = null;
        if (mo4816LA != 9) {
            if (mo4816LA == 10) {
                match(10);
                token = m4813id();
                match(11);
                match(12);
                int mo4816LA2 = mo4816LA(1);
                if (mo4816LA2 != 16) {
                    if (mo4816LA2 == 27) {
                        str2 = superClass();
                    } else {
                        throw new NoViableAltException(mo4817LT(1), getFilename());
                    }
                }
            } else {
                throw new NoViableAltException(mo4817LT(1), getFilename());
            }
        } else {
            Token mo4817LT = mo4817LT(1);
            match(9);
            Token m4813id = m4813id();
            if (this.inputState.guessing == 0) {
                this.antlrTool.warning("lexclass' is deprecated; use 'class X extends Lexer'", getFilename(), mo4817LT.getLine(), mo4817LT.getColumn());
            }
            token = m4813id;
        }
        if (this.inputState.guessing == 0) {
            this.behavior.startLexer(getFilename(), token, str2, str);
        }
        match(16);
        int mo4816LA3 = mo4816LA(1);
        if (mo4816LA3 != 7 && mo4816LA3 != 8) {
            if (mo4816LA3 != 14) {
                if (mo4816LA3 != 41 && mo4816LA3 != 23 && mo4816LA3 != 24) {
                    switch (mo4816LA3) {
                        case 30:
                        case 31:
                        case 32:
                            break;
                        default:
                            throw new NoViableAltException(mo4817LT(1), getFilename());
                    }
                }
            } else {
                lexerOptionsSpec();
            }
        }
        if (this.inputState.guessing == 0) {
            this.behavior.endOptions();
        }
        int mo4816LA4 = mo4816LA(1);
        if (mo4816LA4 != 7 && mo4816LA4 != 8) {
            if (mo4816LA4 != 23) {
                if (mo4816LA4 != 24 && mo4816LA4 != 41) {
                    switch (mo4816LA4) {
                        case 30:
                        case 31:
                        case 32:
                            break;
                        default:
                            throw new NoViableAltException(mo4817LT(1), getFilename());
                    }
                }
            } else {
                tokensSpec();
            }
        }
        int mo4816LA5 = mo4816LA(1);
        if (mo4816LA5 != 7) {
            if (mo4816LA5 == 8 || mo4816LA5 == 24 || mo4816LA5 == 41) {
                return;
            }
            switch (mo4816LA5) {
                case 30:
                case 31:
                case 32:
                    return;
                default:
                    throw new NoViableAltException(mo4817LT(1), getFilename());
            }
        }
        Token mo4817LT2 = mo4817LT(1);
        match(7);
        if (this.inputState.guessing == 0) {
            this.behavior.refMemberAction(mo4817LT2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void notTerminal(antlr.Token r13) {
        /*
            r12 = this;
            r0 = 1
            int r1 = r12.mo4816LA(r0)
            r2 = 24
            r3 = 19
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L2d
            antlr.Token r6 = r12.mo4817LT(r0)
            r12.match(r2)
            int r10 = r12.ast_type_spec()
            antlr.ParserSharedInputState r0 = r12.inputState
            int r0 = r0.guessing
            if (r0 != 0) goto La0
            antlr.ANTLRGrammarParseBehavior r4 = r12.behavior
            r5 = 0
            r8 = 0
            r9 = 1
            boolean r11 = r12.lastInRule()
            r7 = r13
            r4.refToken(r5, r6, r7, r8, r9, r10, r11)
            goto La0
        L2d:
            antlr.NoViableAltException r13 = new antlr.NoViableAltException
            antlr.Token r0 = r12.mo4817LT(r0)
            java.lang.String r1 = r12.getFilename()
            r13.<init>(r0, r1)
            throw r13
        L3b:
            antlr.Token r1 = r12.mo4817LT(r0)
            r12.match(r3)
            int r4 = r12.mo4816LA(r0)
            r5 = 6
            if (r4 == r5) goto L8d
            r5 = 7
            if (r4 == r5) goto L8d
            r5 = 16
            if (r4 == r5) goto L8d
            if (r4 == r3) goto L8d
            r3 = 21
            if (r4 == r3) goto L8d
            r3 = 33
            if (r4 == r3) goto L81
            r3 = 39
            if (r4 == r3) goto L8d
            r3 = 50
            if (r4 == r3) goto L8d
            if (r4 == r2) goto L8d
            r2 = 25
            if (r4 == r2) goto L8d
            r2 = 27
            if (r4 == r2) goto L8d
            r2 = 28
            if (r4 == r2) goto L8d
            switch(r4) {
                case 41: goto L8d;
                case 42: goto L8d;
                case 43: goto L8d;
                case 44: goto L8d;
                default: goto L73;
            }
        L73:
            antlr.NoViableAltException r13 = new antlr.NoViableAltException
            antlr.Token r0 = r12.mo4817LT(r0)
            java.lang.String r1 = r12.getFilename()
            r13.<init>(r0, r1)
            throw r13
        L81:
            r12.match(r3)
            antlr.ParserSharedInputState r2 = r12.inputState
            int r2 = r2.guessing
            if (r2 != 0) goto L8d
            r0 = 3
            r6 = 3
            goto L8e
        L8d:
            r6 = 1
        L8e:
            antlr.ParserSharedInputState r0 = r12.inputState
            int r0 = r0.guessing
            if (r0 != 0) goto La0
            antlr.ANTLRGrammarParseBehavior r2 = r12.behavior
            r5 = 1
            boolean r7 = r12.lastInRule()
            r3 = r1
            r4 = r13
            r2.refCharLiteral(r3, r4, r5, r6, r7)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.ANTLRParser.notTerminal(antlr.Token):void");
    }

    public final Token optionValue() {
        int mo4816LA = mo4816LA(1);
        if (mo4816LA != 6) {
            if (mo4816LA != 24 && mo4816LA != 41) {
                if (mo4816LA != 19) {
                    if (mo4816LA == 20) {
                        Token mo4817LT = mo4817LT(1);
                        match(20);
                        if (this.inputState.guessing == 0) {
                            return mo4817LT;
                        }
                    } else {
                        throw new NoViableAltException(mo4817LT(1), getFilename());
                    }
                } else {
                    Token mo4817LT2 = mo4817LT(1);
                    match(19);
                    if (this.inputState.guessing == 0) {
                        return mo4817LT2;
                    }
                }
            } else {
                return qualifiedID();
            }
        } else {
            Token mo4817LT3 = mo4817LT(1);
            match(6);
            if (this.inputState.guessing == 0) {
                return mo4817LT3;
            }
        }
        return null;
    }

    public final void parserOptionsSpec() {
        match(14);
        while (true) {
            if (mo4816LA(1) != 24 && mo4816LA(1) != 41) {
                match(17);
                return;
            }
            Token m4813id = m4813id();
            match(15);
            Token optionValue = optionValue();
            if (this.inputState.guessing == 0) {
                this.behavior.setGrammarOption(m4813id, optionValue);
            }
            match(16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void parserSpec(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.ANTLRParser.parserSpec(java.lang.String):void");
    }

    public final Token qualifiedID() {
        StringBuffer stringBuffer = new StringBuffer(30);
        Token m4813id = m4813id();
        if (this.inputState.guessing == 0) {
            stringBuffer.append(m4813id.getText());
        }
        while (mo4816LA(1) == 50) {
            match(50);
            m4813id = m4813id();
            if (this.inputState.guessing == 0) {
                stringBuffer.append('.');
                stringBuffer.append(m4813id.getText());
            }
        }
        if (this.inputState.guessing == 0) {
            CommonToken commonToken = new CommonToken(24, stringBuffer.toString());
            commonToken.setLine(m4813id.getLine());
            return commonToken;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        if (r13.inputState.guessing == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
    
        if (r13.inputState.guessing == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f9, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f7, code lost:
    
        if (r13.inputState.guessing == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c2, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c0, code lost:
    
        if (r13.inputState.guessing == 0) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void range(antlr.Token r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.ANTLRParser.range(antlr.Token):void");
    }

    @Override // antlr.Parser
    public void reportError(String str) {
        this.antlrTool.error(str, getFilename(), -1, -1);
    }

    @Override // antlr.Parser
    public void reportWarning(String str) {
        this.antlrTool.warning(str, getFilename(), -1, -1);
    }

    public final void rootNode() {
        Token m4813id;
        if ((mo4816LA(1) == 24 || mo4816LA(1) == 41) && mo4816LA(2) == 36) {
            m4813id = m4813id();
            match(36);
            if (this.inputState.guessing == 0) {
                checkForMissingEndRule(m4813id);
            }
        } else if (_tokenSet_7.member(mo4816LA(1)) && _tokenSet_11.member(mo4816LA(2))) {
            m4813id = null;
        } else {
            throw new NoViableAltException(mo4817LT(1), getFilename());
        }
        terminal(m4813id);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0040. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x009e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00bc A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rule() {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.ANTLRParser.rule():void");
    }

    public final void ruleOptionsSpec() {
        match(14);
        while (true) {
            if (mo4816LA(1) != 24 && mo4816LA(1) != 41) {
                match(17);
                return;
            }
            Token m4813id = m4813id();
            match(15);
            Token optionValue = optionValue();
            if (this.inputState.guessing == 0) {
                this.behavior.setRuleOption(m4813id, optionValue);
            }
            match(16);
        }
    }

    public final void rules() {
        int i10 = 0;
        while (_tokenSet_0.member(mo4816LA(1)) && _tokenSet_1.member(mo4816LA(2))) {
            rule();
            i10++;
        }
        if (i10 >= 1) {
        } else {
            throw new NoViableAltException(mo4817LT(1), getFilename());
        }
    }

    public final BitSet setBlockElement() {
        BitSet bitSet;
        int i10;
        Token mo4817LT = mo4817LT(1);
        match(19);
        if (this.inputState.guessing == 0) {
            i10 = ANTLRLexer.tokenTypeForCharLiteral(mo4817LT.getText());
            bitSet = BitSet.m4822of(i10);
        } else {
            bitSet = null;
            i10 = 0;
        }
        int mo4816LA = mo4816LA(1);
        if (mo4816LA != 16 && mo4816LA != 21) {
            if (mo4816LA == 22) {
                match(22);
                Token mo4817LT2 = mo4817LT(1);
                match(19);
                if (this.inputState.guessing == 0) {
                    int i11 = ANTLRLexer.tokenTypeForCharLiteral(mo4817LT2.getText());
                    if (i11 < i10) {
                        this.antlrTool.error("Malformed range line ", getFilename(), mo4817LT.getLine(), mo4817LT.getColumn());
                    }
                    for (int i12 = i10 + 1; i12 <= i11; i12++) {
                        bitSet.add(i12);
                    }
                }
            } else {
                throw new NoViableAltException(mo4817LT(1), getFilename());
            }
        }
        return bitSet;
    }

    public final void subruleOptionsSpec() {
        match(14);
        while (true) {
            if (mo4816LA(1) != 24 && mo4816LA(1) != 41) {
                match(17);
                return;
            }
            Token m4813id = m4813id();
            match(15);
            Token optionValue = optionValue();
            if (this.inputState.guessing == 0) {
                this.behavior.setSubruleOption(m4813id, optionValue);
            }
            match(16);
        }
    }

    public final String superClass() {
        String str;
        match(27);
        if (this.inputState.guessing == 0) {
            str = StringUtils.stripFrontBack(mo4817LT(1).getText(), "\"", "\"");
        } else {
            str = null;
        }
        match(6);
        match(28);
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r17.inputState.guessing == 0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void terminal(antlr.Token r18) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.ANTLRParser.terminal(antlr.Token):void");
    }

    public final void throwsSpec() {
        String str;
        match(37);
        Token m4813id = m4813id();
        if (this.inputState.guessing == 0) {
            str = m4813id.getText();
        } else {
            str = null;
        }
        while (mo4816LA(1) == 38) {
            match(38);
            Token m4813id2 = m4813id();
            if (this.inputState.guessing == 0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(",");
                stringBuffer.append(m4813id2.getText());
                str = stringBuffer.toString();
            }
        }
        if (this.inputState.guessing == 0) {
            this.behavior.setUserExceptions(str);
        }
    }

    public final void tokensSpec() {
        match(23);
        int i10 = 0;
        Token token = null;
        while (true) {
            if (mo4816LA(1) != 6 && mo4816LA(1) != 24) {
                if (i10 >= 1) {
                    match(17);
                    return;
                }
                throw new NoViableAltException(mo4817LT(1), getFilename());
            }
            int mo4816LA = mo4816LA(1);
            if (mo4816LA != 6) {
                if (mo4816LA == 24) {
                    if (this.inputState.guessing == 0) {
                        token = null;
                    }
                    Token mo4817LT = mo4817LT(1);
                    match(24);
                    int mo4816LA2 = mo4816LA(1);
                    if (mo4816LA2 != 15) {
                        if (mo4816LA2 != 16 && mo4816LA2 != 25) {
                            throw new NoViableAltException(mo4817LT(1), getFilename());
                        }
                    } else {
                        match(15);
                        token = mo4817LT(1);
                        match(6);
                    }
                    if (this.inputState.guessing == 0) {
                        this.behavior.defineToken(mo4817LT, token);
                    }
                    int mo4816LA3 = mo4816LA(1);
                    if (mo4816LA3 == 16) {
                        continue;
                    } else if (mo4816LA3 == 25) {
                        tokensSpecOptions(mo4817LT);
                    } else {
                        throw new NoViableAltException(mo4817LT(1), getFilename());
                    }
                } else {
                    throw new NoViableAltException(mo4817LT(1), getFilename());
                }
            } else {
                Token mo4817LT2 = mo4817LT(1);
                match(6);
                if (this.inputState.guessing == 0) {
                    this.behavior.defineToken(null, mo4817LT2);
                }
                int mo4816LA4 = mo4816LA(1);
                if (mo4816LA4 == 16) {
                    continue;
                } else if (mo4816LA4 == 25) {
                    tokensSpecOptions(mo4817LT2);
                } else {
                    throw new NoViableAltException(mo4817LT(1), getFilename());
                }
            }
            match(16);
            i10++;
        }
    }

    public final void tokensSpecOptions(Token token) {
        match(25);
        Token m4813id = m4813id();
        match(15);
        Token optionValue = optionValue();
        if (this.inputState.guessing == 0) {
            this.behavior.refTokensSpecElementOption(token, m4813id, optionValue);
        }
        while (mo4816LA(1) == 16) {
            match(16);
            Token m4813id2 = m4813id();
            match(15);
            Token optionValue2 = optionValue();
            if (this.inputState.guessing == 0) {
                this.behavior.refTokensSpecElementOption(token, m4813id2, optionValue2);
            }
        }
        match(26);
    }

    public final void tree() {
        Token mo4817LT = mo4817LT(1);
        match(44);
        if (this.inputState.guessing == 0) {
            this.behavior.beginTree(mo4817LT);
        }
        rootNode();
        if (this.inputState.guessing == 0) {
            this.behavior.beginChildList();
        }
        int i10 = 0;
        while (_tokenSet_2.member(mo4816LA(1))) {
            element();
            i10++;
        }
        if (i10 >= 1) {
            if (this.inputState.guessing == 0) {
                this.behavior.endChildList();
            }
            match(28);
            if (this.inputState.guessing == 0) {
                this.behavior.endTree();
                return;
            }
            return;
        }
        throw new NoViableAltException(mo4817LT(1), getFilename());
    }

    public final void treeParserOptionsSpec() {
        match(14);
        while (true) {
            if (mo4816LA(1) != 24 && mo4816LA(1) != 41) {
                match(17);
                return;
            }
            Token m4813id = m4813id();
            match(15);
            Token optionValue = optionValue();
            if (this.inputState.guessing == 0) {
                this.behavior.setGrammarOption(m4813id, optionValue);
            }
            match(16);
        }
    }

    public final void treeParserSpec(String str) {
        String str2;
        match(10);
        Token m4813id = m4813id();
        match(11);
        match(13);
        int mo4816LA = mo4816LA(1);
        if (mo4816LA != 16) {
            if (mo4816LA == 27) {
                str2 = superClass();
            } else {
                throw new NoViableAltException(mo4817LT(1), getFilename());
            }
        } else {
            str2 = null;
        }
        if (this.inputState.guessing == 0) {
            this.behavior.startTreeWalker(getFilename(), m4813id, str2, str);
        }
        match(16);
        int mo4816LA2 = mo4816LA(1);
        if (mo4816LA2 != 7 && mo4816LA2 != 8) {
            if (mo4816LA2 != 14) {
                if (mo4816LA2 != 41 && mo4816LA2 != 23 && mo4816LA2 != 24) {
                    switch (mo4816LA2) {
                        case 30:
                        case 31:
                        case 32:
                            break;
                        default:
                            throw new NoViableAltException(mo4817LT(1), getFilename());
                    }
                }
            } else {
                treeParserOptionsSpec();
            }
        }
        if (this.inputState.guessing == 0) {
            this.behavior.endOptions();
        }
        int mo4816LA3 = mo4816LA(1);
        if (mo4816LA3 != 7 && mo4816LA3 != 8) {
            if (mo4816LA3 != 23) {
                if (mo4816LA3 != 24 && mo4816LA3 != 41) {
                    switch (mo4816LA3) {
                        case 30:
                        case 31:
                        case 32:
                            break;
                        default:
                            throw new NoViableAltException(mo4817LT(1), getFilename());
                    }
                }
            } else {
                tokensSpec();
            }
        }
        int mo4816LA4 = mo4816LA(1);
        if (mo4816LA4 != 7) {
            if (mo4816LA4 == 8 || mo4816LA4 == 24 || mo4816LA4 == 41) {
                return;
            }
            switch (mo4816LA4) {
                case 30:
                case 31:
                case 32:
                    return;
                default:
                    throw new NoViableAltException(mo4817LT(1), getFilename());
            }
        }
        Token mo4817LT = mo4817LT(1);
        match(7);
        if (this.inputState.guessing == 0) {
            this.behavior.refMemberAction(mo4817LT);
        }
    }

    @Override // antlr.Parser
    public void reportError(RecognitionException recognitionException) {
        reportError(recognitionException, recognitionException.getErrorMessage());
    }

    public void reportError(RecognitionException recognitionException, String str) {
        this.antlrTool.error(str, recognitionException.getFilename(), recognitionException.getLine(), recognitionException.getColumn());
    }

    protected ANTLRParser(TokenBuffer tokenBuffer, int i10) {
        super(tokenBuffer, i10);
        this.blockNesting = -1;
        this.tokenNames = _tokenNames;
    }

    public ANTLRParser(TokenBuffer tokenBuffer) {
        this(tokenBuffer, 2);
    }

    protected ANTLRParser(TokenStream tokenStream, int i10) {
        super(tokenStream, i10);
        this.blockNesting = -1;
        this.tokenNames = _tokenNames;
    }

    public ANTLRParser(TokenStream tokenStream) {
        this(tokenStream, 2);
    }

    public ANTLRParser(ParserSharedInputState parserSharedInputState) {
        super(parserSharedInputState, 2);
        this.blockNesting = -1;
        this.tokenNames = _tokenNames;
    }
}
