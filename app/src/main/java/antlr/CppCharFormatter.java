package antlr;

/* loaded from: classes.dex */
class CppCharFormatter implements CharFormatter {
    @Override // antlr.CharFormatter
    public String escapeChar(int i10, boolean z10) {
        if (i10 != 9) {
            if (i10 != 10) {
                if (i10 != 13) {
                    if (i10 != 34) {
                        if (i10 != 39) {
                            if (i10 != 92) {
                                if (i10 >= 32 && i10 <= 126) {
                                    return String.valueOf((char) i10);
                                }
                                if (i10 > 255) {
                                    String num = Integer.toString(i10, 16);
                                    while (num.length() < 4) {
                                        StringBuffer stringBuffer = new StringBuffer();
                                        stringBuffer.append('0');
                                        stringBuffer.append(num);
                                        num = stringBuffer.toString();
                                    }
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    stringBuffer2.append("\\u");
                                    stringBuffer2.append(num);
                                    return stringBuffer2.toString();
                                }
                                StringBuffer stringBuffer3 = new StringBuffer();
                                stringBuffer3.append("\\");
                                stringBuffer3.append(Integer.toString(i10, 8));
                                return stringBuffer3.toString();
                            }
                            return "\\\\";
                        }
                        if (z10) {
                            return "\\'";
                        }
                        return "'";
                    }
                    if (z10) {
                        return "\"";
                    }
                    return "\\\"";
                }
                return "\\r";
            }
            return "\\n";
        }
        return "\\t";
    }

    @Override // antlr.CharFormatter
    public String escapeString(String str) {
        String str2 = new String();
        for (int i10 = 0; i10 < str.length(); i10++) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str2);
            stringBuffer.append(escapeChar(str.charAt(i10), false));
            str2 = stringBuffer.toString();
        }
        return str2;
    }

    @Override // antlr.CharFormatter
    public String literalChar(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("0x");
        stringBuffer.append(Integer.toString(i10, 16));
        String stringBuffer2 = stringBuffer.toString();
        if (i10 >= 0 && i10 <= 126) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(stringBuffer2);
            stringBuffer3.append(" /* '");
            stringBuffer3.append(escapeChar(i10, true));
            stringBuffer3.append("' */ ");
            return stringBuffer3.toString();
        }
        return stringBuffer2;
    }

    @Override // antlr.CharFormatter
    public String literalString(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\"");
        stringBuffer.append(escapeString(str));
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }
}
