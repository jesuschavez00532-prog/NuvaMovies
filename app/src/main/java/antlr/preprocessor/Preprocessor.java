package antlr.preprocessor;

import antlr.LLkParser;
import antlr.NoViableAltException;
import antlr.ParserSharedInputState;
import antlr.RecognitionException;
import antlr.SemanticException;
import antlr.Token;
import antlr.TokenBuffer;
import antlr.TokenStream;
import antlr.collections.impl.BitSet;
import antlr.collections.impl.IndexedVector;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes.dex */
public class Preprocessor extends LLkParser implements PreprocessorTokenTypes {
    public static final String[] _tokenNames = {"<0>", "EOF", "<2>", "NULL_TREE_LOOKAHEAD", "\"tokens\"", "HEADER_ACTION", "SUBRULE_BLOCK", "ACTION", "\"class\"", "ID", "\"extends\"", "SEMI", "TOKENS_SPEC", "OPTIONS_START", "ASSIGN_RHS", "RCURLY", "\"protected\"", "\"private\"", "\"public\"", "BANG", "ARG_ACTION", "\"returns\"", "RULE_BLOCK", "\"throws\"", "COMMA", "\"exception\"", "\"catch\"", "ALT", "ELEMENT", "LPAREN", "RPAREN", "ID_OR_KEYWORD", "CURLY_BLOCK_SCARF", "WS", "NEWLINE", "COMMENT", "SL_COMMENT", "ML_COMMENT", "CHAR_LITERAL", "STRING_LITERAL", "ESC", "DIGIT", "XDIGIT"};
    public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
    public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
    public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
    public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
    public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
    public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
    public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
    public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
    public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
    private antlr.Tool antlrTool;

    protected Preprocessor(TokenBuffer tokenBuffer, int i10) {
        super(tokenBuffer, i10);
        this.tokenNames = _tokenNames;
    }

    private static final long[] mk_tokenSet_0() {
        return new long[]{2, 0};
    }

    private static final long[] mk_tokenSet_1() {
        return new long[]{4658050, 0};
    }

    private static final long[] mk_tokenSet_2() {
        return new long[]{459264, 0};
    }

    private static final long[] mk_tokenSet_3() {
        return new long[]{386, 0};
    }

    private static final long[] mk_tokenSet_4() {
        return new long[]{IjkMediaMeta.AV_CH_TOP_CENTER, 0};
    }

    private static final long[] mk_tokenSet_5() {
        return new long[]{459650, 0};
    }

    private static final long[] mk_tokenSet_6() {
        return new long[]{4202624, 0};
    }

    private static final long[] mk_tokenSet_7() {
        return new long[]{34014082, 0};
    }

    private static final long[] mk_tokenSet_8() {
        return new long[]{101122946, 0};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [antlr.preprocessor.Grammar] */
    /* JADX WARN: Type inference failed for: r9v2, types: [antlr.preprocessor.Grammar] */
    public final Grammar class_def(String str, Hierarchy hierarchy) {
        Token mo4817LT;
        String superClass;
        Grammar grammar;
        IndexedVector indexedVector = new IndexedVector(100);
        IndexedVector indexedVector2 = null;
        try {
            int mo4816LA = mo4816LA(1);
            if (mo4816LA != 7) {
                if (mo4816LA == 8) {
                    mo4817LT = null;
                } else {
                    throw new NoViableAltException(mo4817LT(1), getFilename());
                }
            } else {
                mo4817LT = mo4817LT(1);
                match(7);
            }
            match(8);
            Token mo4817LT2 = mo4817LT(1);
            match(9);
            match(10);
            Token mo4817LT3 = mo4817LT(1);
            match(9);
            int mo4816LA2 = mo4816LA(1);
            if (mo4816LA2 != 6) {
                if (mo4816LA2 == 11) {
                    superClass = null;
                } else {
                    throw new NoViableAltException(mo4817LT(1), getFilename());
                }
            } else {
                superClass = superClass();
            }
            match(11);
            ?? grammar2 = hierarchy.getGrammar(mo4817LT2.getText());
            if (grammar2 == 0) {
                try {
                    grammar = new Grammar(hierarchy.getTool(), mo4817LT2.getText(), mo4817LT3.getText(), indexedVector);
                } catch (RecognitionException e10) {
                    e = e10;
                    indexedVector2 = grammar2;
                }
                try {
                    grammar.superClass = superClass;
                    if (mo4817LT != null) {
                        grammar.setPreambleAction(mo4817LT.getText());
                    }
                    int mo4816LA3 = mo4816LA(1);
                    if (mo4816LA3 != 7 && mo4816LA3 != 9 && mo4816LA3 != 12) {
                        if (mo4816LA3 != 13) {
                            switch (mo4816LA3) {
                                case 16:
                                case 17:
                                case 18:
                                    break;
                                default:
                                    throw new NoViableAltException(mo4817LT(1), getFilename());
                            }
                        } else {
                            indexedVector2 = optionSpec(grammar);
                        }
                    }
                    grammar.setOptions(indexedVector2);
                    int mo4816LA4 = mo4816LA(1);
                    if (mo4816LA4 != 7 && mo4816LA4 != 9) {
                        if (mo4816LA4 != 12) {
                            switch (mo4816LA4) {
                                case 16:
                                case 17:
                                case 18:
                                    break;
                                default:
                                    throw new NoViableAltException(mo4817LT(1), getFilename());
                            }
                        } else {
                            Token mo4817LT4 = mo4817LT(1);
                            match(12);
                            grammar.setTokenSection(mo4817LT4.getText());
                        }
                    }
                    int mo4816LA5 = mo4816LA(1);
                    if (mo4816LA5 != 7) {
                        if (mo4816LA5 != 9) {
                            switch (mo4816LA5) {
                                case 16:
                                case 17:
                                case 18:
                                    break;
                                default:
                                    throw new NoViableAltException(mo4817LT(1), getFilename());
                            }
                        }
                    } else {
                        Token mo4817LT5 = mo4817LT(1);
                        match(7);
                        grammar.setMemberAction(mo4817LT5.getText());
                    }
                    int i10 = 0;
                    while (_tokenSet_2.member(mo4816LA(1))) {
                        rule(grammar);
                        i10++;
                    }
                    if (i10 < 1) {
                        throw new NoViableAltException(mo4817LT(1), getFilename());
                    }
                    return grammar;
                } catch (RecognitionException e11) {
                    indexedVector2 = grammar;
                    e = e11;
                    reportError(e);
                    consume();
                    consumeUntil(_tokenSet_3);
                    return indexedVector2;
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("redefinition of grammar ");
            stringBuffer.append(mo4817LT2.getText());
            throw new SemanticException(stringBuffer.toString(), str, mo4817LT2.getLine(), mo4817LT2.getColumn());
        } catch (RecognitionException e12) {
            e = e12;
        }
    }

    public final String exceptionGroup() {
        String str = "";
        while (mo4816LA(1) == 25) {
            try {
                String exceptionSpec = exceptionSpec();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(exceptionSpec);
                str = stringBuffer.toString();
            } catch (RecognitionException e10) {
                reportError(e10);
                consume();
                consumeUntil(_tokenSet_5);
            }
        }
        return str;
    }

    public final String exceptionHandler() {
        try {
            match(26);
            Token mo4817LT = mo4817LT(1);
            match(20);
            Token mo4817LT2 = mo4817LT(1);
            match(7);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(System.getProperty("line.separator"));
            stringBuffer.append("catch ");
            stringBuffer.append(mo4817LT.getText());
            stringBuffer.append(" ");
            stringBuffer.append(mo4817LT2.getText());
            return stringBuffer.toString();
        } catch (RecognitionException e10) {
            reportError(e10);
            consume();
            consumeUntil(_tokenSet_8);
            return null;
        }
    }

    public final String exceptionSpec() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("exception ");
        String stringBuffer2 = stringBuffer.toString();
        try {
            match(25);
            int mo4816LA = mo4816LA(1);
            if (mo4816LA != 1) {
                if (mo4816LA != 20) {
                    if (mo4816LA != 7 && mo4816LA != 8 && mo4816LA != 9 && mo4816LA != 25 && mo4816LA != 26) {
                        switch (mo4816LA) {
                            case 16:
                            case 17:
                            case 18:
                                break;
                            default:
                                throw new NoViableAltException(mo4817LT(1), getFilename());
                        }
                    }
                } else {
                    Token mo4817LT = mo4817LT(1);
                    match(20);
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(stringBuffer2);
                    stringBuffer3.append(mo4817LT.getText());
                    stringBuffer2 = stringBuffer3.toString();
                }
            }
            while (mo4816LA(1) == 26) {
                String exceptionHandler = exceptionHandler();
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(stringBuffer2);
                stringBuffer4.append(exceptionHandler);
                stringBuffer2 = stringBuffer4.toString();
            }
        } catch (RecognitionException e10) {
            reportError(e10);
            consume();
            consumeUntil(_tokenSet_7);
        }
        return stringBuffer2;
    }

    protected antlr.Tool getTool() {
        return this.antlrTool;
    }

    public final void grammarFile(Hierarchy hierarchy, String str) {
        while (mo4816LA(1) == 5) {
            try {
                Token mo4817LT = mo4817LT(1);
                match(5);
                hierarchy.getFile(str).addHeaderAction(mo4817LT.getText());
            } catch (RecognitionException e10) {
                reportError(e10);
                consume();
                consumeUntil(_tokenSet_0);
                return;
            }
        }
        int mo4816LA = mo4816LA(1);
        IndexedVector indexedVector = null;
        if (mo4816LA != 1) {
            if (mo4816LA != 13) {
                if (mo4816LA != 7 && mo4816LA != 8) {
                    throw new NoViableAltException(mo4817LT(1), getFilename());
                }
            } else {
                indexedVector = optionSpec(null);
            }
        }
        while (true) {
            if (mo4816LA(1) != 7 && mo4816LA(1) != 8) {
                match(1);
                return;
            }
            Grammar class_def = class_def(str, hierarchy);
            if (class_def != null && indexedVector != null) {
                hierarchy.getFile(str).setOptions(indexedVector);
            }
            if (class_def != null) {
                class_def.setFileName(str);
                hierarchy.addGrammar(class_def);
            }
        }
    }

    public final IndexedVector optionSpec(Grammar grammar) {
        IndexedVector indexedVector = new IndexedVector();
        try {
            match(13);
            while (mo4816LA(1) == 9) {
                Token mo4817LT = mo4817LT(1);
                match(9);
                Token mo4817LT2 = mo4817LT(1);
                match(14);
                Option option = new Option(mo4817LT.getText(), mo4817LT2.getText(), grammar);
                indexedVector.appendElement(option.getName(), option);
                if (grammar != null && mo4817LT.getText().equals("importVocab")) {
                    grammar.specifiedVocabulary = true;
                    grammar.importVocab = mo4817LT2.getText();
                } else if (grammar != null && mo4817LT.getText().equals("exportVocab")) {
                    String substring = mo4817LT2.getText().substring(0, mo4817LT2.getText().length() - 1);
                    grammar.exportVocab = substring;
                    grammar.exportVocab = substring.trim();
                }
            }
            match(15);
        } catch (RecognitionException e10) {
            reportError(e10);
            consume();
            consumeUntil(_tokenSet_1);
        }
        return indexedVector;
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[Catch: RecognitionException -> 0x015f, TryCatch #0 {RecognitionException -> 0x015f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x000d, B:7:0x001a, B:9:0x001b, B:10:0x0034, B:13:0x0046, B:14:0x0049, B:15:0x0056, B:16:0x0057, B:17:0x005f, B:20:0x0069, B:21:0x006c, B:22:0x0079, B:23:0x007a, B:24:0x0083, B:27:0x008b, B:28:0x008e, B:29:0x009b, B:30:0x009c, B:31:0x00aa, B:37:0x00ba, B:38:0x00cf, B:43:0x00da, B:44:0x00e7, B:45:0x00e8, B:46:0x00ee, B:50:0x010c, B:52:0x0138, B:54:0x0141, B:56:0x014a, B:58:0x0153, B:59:0x0156, B:61:0x015b, B:64:0x00f7, B:65:0x0104, B:66:0x0105, B:68:0x00bf, B:69:0x00cc, B:74:0x0023, B:75:0x002b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a A[Catch: RecognitionException -> 0x015f, TryCatch #0 {RecognitionException -> 0x015f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x000d, B:7:0x001a, B:9:0x001b, B:10:0x0034, B:13:0x0046, B:14:0x0049, B:15:0x0056, B:16:0x0057, B:17:0x005f, B:20:0x0069, B:21:0x006c, B:22:0x0079, B:23:0x007a, B:24:0x0083, B:27:0x008b, B:28:0x008e, B:29:0x009b, B:30:0x009c, B:31:0x00aa, B:37:0x00ba, B:38:0x00cf, B:43:0x00da, B:44:0x00e7, B:45:0x00e8, B:46:0x00ee, B:50:0x010c, B:52:0x0138, B:54:0x0141, B:56:0x014a, B:58:0x0153, B:59:0x0156, B:61:0x015b, B:64:0x00f7, B:65:0x0104, B:66:0x0105, B:68:0x00bf, B:69:0x00cc, B:74:0x0023, B:75:0x002b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[Catch: RecognitionException -> 0x015f, TryCatch #0 {RecognitionException -> 0x015f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x000d, B:7:0x001a, B:9:0x001b, B:10:0x0034, B:13:0x0046, B:14:0x0049, B:15:0x0056, B:16:0x0057, B:17:0x005f, B:20:0x0069, B:21:0x006c, B:22:0x0079, B:23:0x007a, B:24:0x0083, B:27:0x008b, B:28:0x008e, B:29:0x009b, B:30:0x009c, B:31:0x00aa, B:37:0x00ba, B:38:0x00cf, B:43:0x00da, B:44:0x00e7, B:45:0x00e8, B:46:0x00ee, B:50:0x010c, B:52:0x0138, B:54:0x0141, B:56:0x014a, B:58:0x0153, B:59:0x0156, B:61:0x015b, B:64:0x00f7, B:65:0x0104, B:66:0x0105, B:68:0x00bf, B:69:0x00cc, B:74:0x0023, B:75:0x002b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[Catch: RecognitionException -> 0x015f, TryCatch #0 {RecognitionException -> 0x015f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x000d, B:7:0x001a, B:9:0x001b, B:10:0x0034, B:13:0x0046, B:14:0x0049, B:15:0x0056, B:16:0x0057, B:17:0x005f, B:20:0x0069, B:21:0x006c, B:22:0x0079, B:23:0x007a, B:24:0x0083, B:27:0x008b, B:28:0x008e, B:29:0x009b, B:30:0x009c, B:31:0x00aa, B:37:0x00ba, B:38:0x00cf, B:43:0x00da, B:44:0x00e7, B:45:0x00e8, B:46:0x00ee, B:50:0x010c, B:52:0x0138, B:54:0x0141, B:56:0x014a, B:58:0x0153, B:59:0x0156, B:61:0x015b, B:64:0x00f7, B:65:0x0104, B:66:0x0105, B:68:0x00bf, B:69:0x00cc, B:74:0x0023, B:75:0x002b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138 A[Catch: RecognitionException -> 0x015f, TryCatch #0 {RecognitionException -> 0x015f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x000d, B:7:0x001a, B:9:0x001b, B:10:0x0034, B:13:0x0046, B:14:0x0049, B:15:0x0056, B:16:0x0057, B:17:0x005f, B:20:0x0069, B:21:0x006c, B:22:0x0079, B:23:0x007a, B:24:0x0083, B:27:0x008b, B:28:0x008e, B:29:0x009b, B:30:0x009c, B:31:0x00aa, B:37:0x00ba, B:38:0x00cf, B:43:0x00da, B:44:0x00e7, B:45:0x00e8, B:46:0x00ee, B:50:0x010c, B:52:0x0138, B:54:0x0141, B:56:0x014a, B:58:0x0153, B:59:0x0156, B:61:0x015b, B:64:0x00f7, B:65:0x0104, B:66:0x0105, B:68:0x00bf, B:69:0x00cc, B:74:0x0023, B:75:0x002b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141 A[Catch: RecognitionException -> 0x015f, TryCatch #0 {RecognitionException -> 0x015f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x000d, B:7:0x001a, B:9:0x001b, B:10:0x0034, B:13:0x0046, B:14:0x0049, B:15:0x0056, B:16:0x0057, B:17:0x005f, B:20:0x0069, B:21:0x006c, B:22:0x0079, B:23:0x007a, B:24:0x0083, B:27:0x008b, B:28:0x008e, B:29:0x009b, B:30:0x009c, B:31:0x00aa, B:37:0x00ba, B:38:0x00cf, B:43:0x00da, B:44:0x00e7, B:45:0x00e8, B:46:0x00ee, B:50:0x010c, B:52:0x0138, B:54:0x0141, B:56:0x014a, B:58:0x0153, B:59:0x0156, B:61:0x015b, B:64:0x00f7, B:65:0x0104, B:66:0x0105, B:68:0x00bf, B:69:0x00cc, B:74:0x0023, B:75:0x002b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a A[Catch: RecognitionException -> 0x015f, TryCatch #0 {RecognitionException -> 0x015f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x000d, B:7:0x001a, B:9:0x001b, B:10:0x0034, B:13:0x0046, B:14:0x0049, B:15:0x0056, B:16:0x0057, B:17:0x005f, B:20:0x0069, B:21:0x006c, B:22:0x0079, B:23:0x007a, B:24:0x0083, B:27:0x008b, B:28:0x008e, B:29:0x009b, B:30:0x009c, B:31:0x00aa, B:37:0x00ba, B:38:0x00cf, B:43:0x00da, B:44:0x00e7, B:45:0x00e8, B:46:0x00ee, B:50:0x010c, B:52:0x0138, B:54:0x0141, B:56:0x014a, B:58:0x0153, B:59:0x0156, B:61:0x015b, B:64:0x00f7, B:65:0x0104, B:66:0x0105, B:68:0x00bf, B:69:0x00cc, B:74:0x0023, B:75:0x002b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153 A[Catch: RecognitionException -> 0x015f, TryCatch #0 {RecognitionException -> 0x015f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x000d, B:7:0x001a, B:9:0x001b, B:10:0x0034, B:13:0x0046, B:14:0x0049, B:15:0x0056, B:16:0x0057, B:17:0x005f, B:20:0x0069, B:21:0x006c, B:22:0x0079, B:23:0x007a, B:24:0x0083, B:27:0x008b, B:28:0x008e, B:29:0x009b, B:30:0x009c, B:31:0x00aa, B:37:0x00ba, B:38:0x00cf, B:43:0x00da, B:44:0x00e7, B:45:0x00e8, B:46:0x00ee, B:50:0x010c, B:52:0x0138, B:54:0x0141, B:56:0x014a, B:58:0x0153, B:59:0x0156, B:61:0x015b, B:64:0x00f7, B:65:0x0104, B:66:0x0105, B:68:0x00bf, B:69:0x00cc, B:74:0x0023, B:75:0x002b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b A[Catch: RecognitionException -> 0x015f, TRY_LEAVE, TryCatch #0 {RecognitionException -> 0x015f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x000d, B:7:0x001a, B:9:0x001b, B:10:0x0034, B:13:0x0046, B:14:0x0049, B:15:0x0056, B:16:0x0057, B:17:0x005f, B:20:0x0069, B:21:0x006c, B:22:0x0079, B:23:0x007a, B:24:0x0083, B:27:0x008b, B:28:0x008e, B:29:0x009b, B:30:0x009c, B:31:0x00aa, B:37:0x00ba, B:38:0x00cf, B:43:0x00da, B:44:0x00e7, B:45:0x00e8, B:46:0x00ee, B:50:0x010c, B:52:0x0138, B:54:0x0141, B:56:0x014a, B:58:0x0153, B:59:0x0156, B:61:0x015b, B:64:0x00f7, B:65:0x0104, B:66:0x0105, B:68:0x00bf, B:69:0x00cc, B:74:0x0023, B:75:0x002b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0105 A[Catch: RecognitionException -> 0x015f, TryCatch #0 {RecognitionException -> 0x015f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x000d, B:7:0x001a, B:9:0x001b, B:10:0x0034, B:13:0x0046, B:14:0x0049, B:15:0x0056, B:16:0x0057, B:17:0x005f, B:20:0x0069, B:21:0x006c, B:22:0x0079, B:23:0x007a, B:24:0x0083, B:27:0x008b, B:28:0x008e, B:29:0x009b, B:30:0x009c, B:31:0x00aa, B:37:0x00ba, B:38:0x00cf, B:43:0x00da, B:44:0x00e7, B:45:0x00e8, B:46:0x00ee, B:50:0x010c, B:52:0x0138, B:54:0x0141, B:56:0x014a, B:58:0x0153, B:59:0x0156, B:61:0x015b, B:64:0x00f7, B:65:0x0104, B:66:0x0105, B:68:0x00bf, B:69:0x00cc, B:74:0x0023, B:75:0x002b), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rule(antlr.preprocessor.Grammar r13) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.preprocessor.Preprocessor.rule(antlr.preprocessor.Grammar):void");
    }

    public void setTool(antlr.Tool tool) {
        if (this.antlrTool == null) {
            this.antlrTool = tool;
            return;
        }
        throw new IllegalStateException("antlr.Tool already registered");
    }

    public final String superClass() {
        String text = mo4817LT(1).getText();
        try {
            match(6);
        } catch (RecognitionException e10) {
            reportError(e10);
            consume();
            consumeUntil(_tokenSet_4);
        }
        return text;
    }

    public final String throwsSpec() {
        String str = "throws ";
        try {
            match(23);
            Token mo4817LT = mo4817LT(1);
            match(9);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("throws ");
            stringBuffer.append(mo4817LT.getText());
            str = stringBuffer.toString();
            while (mo4816LA(1) == 24) {
                match(24);
                Token mo4817LT2 = mo4817LT(1);
                match(9);
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(str);
                stringBuffer2.append(",");
                stringBuffer2.append(mo4817LT2.getText());
                str = stringBuffer2.toString();
            }
        } catch (RecognitionException e10) {
            reportError(e10);
            consume();
            consumeUntil(_tokenSet_6);
        }
        return str;
    }

    public Preprocessor(TokenBuffer tokenBuffer) {
        this(tokenBuffer, 1);
    }

    protected Preprocessor(TokenStream tokenStream, int i10) {
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

    public Preprocessor(TokenStream tokenStream) {
        this(tokenStream, 1);
    }

    public Preprocessor(ParserSharedInputState parserSharedInputState) {
        super(parserSharedInputState, 1);
        this.tokenNames = _tokenNames;
    }
}
