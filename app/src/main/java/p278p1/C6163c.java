package p278p1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p109e2.AbstractC4111a;
import p184j1.C4977h;
import p184j1.InterfaceC4973d;

/* renamed from: p1.c */
/* loaded from: classes.dex */
public class C6163c implements InterfaceC4973d {
    @Override // p184j1.InterfaceC4973d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo20315b(ByteBuffer byteBuffer, File file, C4977h c4977h) {
        try {
            AbstractC4111a.m17195f(byteBuffer, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }
}
