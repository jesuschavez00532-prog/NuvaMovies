package antlr;

/* loaded from: classes.dex */
public class NoViableAltForCharException extends RecognitionException {
    public char foundChar;

    public NoViableAltForCharException(char c10, CharScanner charScanner) {
        super("NoViableAlt", charScanner.getFilename(), charScanner.getLine(), charScanner.getColumn());
        this.foundChar = c10;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        char c10 = this.foundChar;
        if (c10 >= ' ' && c10 <= '~') {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("unexpected char: ");
            stringBuffer.append('\'');
            String stringBuffer2 = stringBuffer.toString();
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(stringBuffer2);
            stringBuffer3.append(this.foundChar);
            String stringBuffer4 = stringBuffer3.toString();
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(stringBuffer4);
            stringBuffer5.append('\'');
            return stringBuffer5.toString();
        }
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("unexpected char: ");
        stringBuffer6.append("0x");
        stringBuffer6.append(Integer.toHexString(this.foundChar).toUpperCase());
        return stringBuffer6.toString();
    }

    public NoViableAltForCharException(char c10, String str, int i10) {
        this(c10, str, i10, -1);
    }

    public NoViableAltForCharException(char c10, String str, int i10, int i11) {
        super("NoViableAlt", str, i10, i11);
        this.foundChar = c10;
    }
}
