package antlr;

/* loaded from: classes.dex */
public class TokenStreamRecognitionException extends TokenStreamException {
    public RecognitionException recog;

    public TokenStreamRecognitionException(RecognitionException recognitionException) {
        super(recognitionException.getMessage());
        this.recog = recognitionException;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.recog.toString();
    }
}
