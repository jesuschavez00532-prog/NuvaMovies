package antlr;

/* loaded from: classes.dex */
public class ANTLRHashString {
    private static final int prime = 151;
    private char[] buf;
    private int len;
    private CharScanner lexer;

    /* renamed from: s */
    private String f4230s;

    public ANTLRHashString(char[] cArr, int i10, CharScanner charScanner) {
        this.lexer = charScanner;
        setBuffer(cArr, i10);
    }

    private final char charAt(int i10) {
        String str = this.f4230s;
        if (str != null) {
            return str.charAt(i10);
        }
        return this.buf[i10];
    }

    private final int length() {
        String str = this.f4230s;
        if (str != null) {
            return str.length();
        }
        return this.len;
    }

    public boolean equals(Object obj) {
        ANTLRHashString aNTLRHashString;
        if (!(obj instanceof ANTLRHashString) && !(obj instanceof String)) {
            return false;
        }
        if (obj instanceof String) {
            aNTLRHashString = new ANTLRHashString((String) obj, this.lexer);
        } else {
            aNTLRHashString = (ANTLRHashString) obj;
        }
        int length = length();
        if (aNTLRHashString.length() != length) {
            return false;
        }
        if (this.lexer.getCaseSensitiveLiterals()) {
            for (int i10 = 0; i10 < length; i10++) {
                if (charAt(i10) != aNTLRHashString.charAt(i10)) {
                    return false;
                }
            }
            return true;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (this.lexer.toLower(charAt(i11)) != this.lexer.toLower(aNTLRHashString.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int length = length();
        int i11 = 0;
        if (this.lexer.getCaseSensitiveLiterals()) {
            i10 = 0;
            while (i11 < length) {
                i10 = (i10 * prime) + charAt(i11);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < length) {
                i10 = (i10 * prime) + this.lexer.toLower(charAt(i11));
                i11++;
            }
        }
        return i10;
    }

    public void setBuffer(char[] cArr, int i10) {
        this.buf = cArr;
        this.len = i10;
        this.f4230s = null;
    }

    public void setString(String str) {
        this.f4230s = str;
        this.buf = null;
    }

    public ANTLRHashString(CharScanner charScanner) {
        this.lexer = charScanner;
    }

    public ANTLRHashString(String str, CharScanner charScanner) {
        this.lexer = charScanner;
        setString(str);
    }
}
