package antlr;

import antlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class MismatchedCharException extends RecognitionException {
    public static final int CHAR = 1;
    public static final int NOT_CHAR = 2;
    public static final int NOT_RANGE = 4;
    public static final int NOT_SET = 6;
    public static final int RANGE = 3;
    public static final int SET = 5;
    public int expecting;
    public int foundChar;
    public int mismatchType;
    public CharScanner scanner;
    public BitSet set;
    public int upper;

    public MismatchedCharException() {
        super("Mismatched char");
    }

    private void appendCharName(StringBuffer stringBuffer, int i10) {
        if (i10 != 9) {
            if (i10 != 10) {
                if (i10 != 13) {
                    if (i10 != 65535) {
                        stringBuffer.append('\'');
                        stringBuffer.append((char) i10);
                        stringBuffer.append('\'');
                        return;
                    }
                    stringBuffer.append("'<EOF>'");
                    return;
                }
                stringBuffer.append("'\\r'");
                return;
            }
            stringBuffer.append("'\\n'");
            return;
        }
        stringBuffer.append("'\\t'");
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = "NOT ";
        switch (this.mismatchType) {
            case 1:
                stringBuffer.append("expecting ");
                appendCharName(stringBuffer, this.expecting);
                stringBuffer.append(", found ");
                appendCharName(stringBuffer, this.foundChar);
                break;
            case 2:
                stringBuffer.append("expecting anything but '");
                appendCharName(stringBuffer, this.expecting);
                stringBuffer.append("'; got it anyway");
                break;
            case 3:
            case 4:
                stringBuffer.append("expecting token ");
                if (this.mismatchType == 4) {
                    stringBuffer.append("NOT ");
                }
                stringBuffer.append("in range: ");
                appendCharName(stringBuffer, this.expecting);
                stringBuffer.append("..");
                appendCharName(stringBuffer, this.upper);
                stringBuffer.append(", found ");
                appendCharName(stringBuffer, this.foundChar);
                break;
            case 5:
            case 6:
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("expecting ");
                if (this.mismatchType != 6) {
                    str = "";
                }
                stringBuffer2.append(str);
                stringBuffer2.append("one of (");
                stringBuffer.append(stringBuffer2.toString());
                for (int i10 : this.set.toArray()) {
                    appendCharName(stringBuffer, i10);
                }
                stringBuffer.append("), found ");
                appendCharName(stringBuffer, this.foundChar);
                break;
            default:
                stringBuffer.append(super.getMessage());
                break;
        }
        return stringBuffer.toString();
    }

    public MismatchedCharException(char c10, char c11, char c12, boolean z10, CharScanner charScanner) {
        super("Mismatched char", charScanner.getFilename(), charScanner.getLine(), charScanner.getColumn());
        this.mismatchType = z10 ? 4 : 3;
        this.foundChar = c10;
        this.expecting = c11;
        this.upper = c12;
        this.scanner = charScanner;
    }

    public MismatchedCharException(char c10, char c11, boolean z10, CharScanner charScanner) {
        super("Mismatched char", charScanner.getFilename(), charScanner.getLine(), charScanner.getColumn());
        this.mismatchType = z10 ? 2 : 1;
        this.foundChar = c10;
        this.expecting = c11;
        this.scanner = charScanner;
    }

    public MismatchedCharException(char c10, BitSet bitSet, boolean z10, CharScanner charScanner) {
        super("Mismatched char", charScanner.getFilename(), charScanner.getLine(), charScanner.getColumn());
        this.mismatchType = z10 ? 6 : 5;
        this.foundChar = c10;
        this.set = bitSet;
        this.scanner = charScanner;
    }
}
