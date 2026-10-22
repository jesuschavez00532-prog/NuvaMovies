package antlr;

/* loaded from: classes.dex */
class JavaCharFormatter implements CharFormatter {
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
                                if (i10 >= 0 && i10 <= 15) {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    stringBuffer.append("\\u000");
                                    stringBuffer.append(Integer.toString(i10, 16));
                                    return stringBuffer.toString();
                                }
                                if (16 <= i10 && i10 <= 255) {
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    stringBuffer2.append("\\u00");
                                    stringBuffer2.append(Integer.toString(i10, 16));
                                    return stringBuffer2.toString();
                                }
                                if (256 <= i10 && i10 <= 4095) {
                                    StringBuffer stringBuffer3 = new StringBuffer();
                                    stringBuffer3.append("\\u0");
                                    stringBuffer3.append(Integer.toString(i10, 16));
                                    return stringBuffer3.toString();
                                }
                                StringBuffer stringBuffer4 = new StringBuffer();
                                stringBuffer4.append("\\u");
                                stringBuffer4.append(Integer.toString(i10, 16));
                                return stringBuffer4.toString();
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
        stringBuffer.append("'");
        stringBuffer.append(escapeChar(i10, true));
        stringBuffer.append("'");
        return stringBuffer.toString();
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
