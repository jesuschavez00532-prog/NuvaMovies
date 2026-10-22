package antlr;

import java.io.IOException;

/* loaded from: classes.dex */
public class CharStreamIOException extends CharStreamException {

    /* renamed from: io */
    public IOException f4236io;

    public CharStreamIOException(IOException iOException) {
        super(iOException.getMessage());
        this.f4236io = iOException;
    }
}
