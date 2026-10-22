package antlr;

/* loaded from: classes.dex */
public class DefaultFileLineFormatter extends FileLineFormatter {
    @Override // antlr.FileLineFormatter
    public String getFormatString(String str, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(str);
            stringBuffer2.append(":");
            stringBuffer.append(stringBuffer2.toString());
        }
        if (i10 != -1) {
            if (str == null) {
                stringBuffer.append("line ");
            }
            stringBuffer.append(i10);
            if (i11 != -1) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(":");
                stringBuffer3.append(i11);
                stringBuffer.append(stringBuffer3.toString());
            }
            stringBuffer.append(":");
        }
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
