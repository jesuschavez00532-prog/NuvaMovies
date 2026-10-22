package antlr;

/* loaded from: classes.dex */
public class RecognitionException extends ANTLRException {
    public int column;
    public String fileName;
    public int line;

    public RecognitionException() {
        super("parsing error");
        this.fileName = null;
        this.line = -1;
        this.column = -1;
    }

    public int getColumn() {
        return this.column;
    }

    public String getErrorMessage() {
        return getMessage();
    }

    public String getFilename() {
        return this.fileName;
    }

    public int getLine() {
        return this.line;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(FileLineFormatter.getFormatter().getFormatString(this.fileName, this.line, this.column));
        stringBuffer.append(getMessage());
        return stringBuffer.toString();
    }

    public RecognitionException(String str) {
        super(str);
        this.fileName = null;
        this.line = -1;
        this.column = -1;
    }

    public RecognitionException(String str, String str2, int i10) {
        this(str, str2, i10, -1);
    }

    public RecognitionException(String str, String str2, int i10, int i11) {
        super(str);
        this.fileName = str2;
        this.line = i10;
        this.column = i11;
    }
}
