package p324s3;

import android.content.Context;
import java.io.Closeable;
import p024b4.InterfaceC1055d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s3.u */
/* loaded from: classes.dex */
public abstract class AbstractC6673u implements Closeable {

    /* renamed from: s3.u$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        AbstractC6673u mo26015a();

        /* renamed from: b */
        a mo26016b(Context context);
    }

    /* renamed from: a */
    abstract InterfaceC1055d mo26013a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C6672t mo26014b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        mo26013a().close();
    }
}
