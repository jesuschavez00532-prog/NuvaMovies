package antlr;

import java.io.IOException;

/* loaded from: classes.dex */
public class TokenStreamIOException extends TokenStreamException {

    /* renamed from: io */
    public IOException f4239io;

    public TokenStreamIOException(IOException iOException) {
        super(iOException.getMessage());
        this.f4239io = iOException;
    }
}
