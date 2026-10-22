package antlr;

/* loaded from: classes.dex */
public class SemanticException extends RecognitionException {
    public SemanticException(String str) {
        super(str);
    }

    public SemanticException(String str, String str2, int i10) {
        this(str, str2, i10, -1);
    }

    public SemanticException(String str, String str2, int i10, int i11) {
        super(str, str2, i10, i11);
    }
}
