package p007a6;

import java.io.File;
import java.io.IOException;
import p128f6.C4270f;
import p395x5.C7503f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.n */
/* loaded from: classes.dex */
public class C0088n {

    /* renamed from: a */
    private final String f297a;

    /* renamed from: b */
    private final C4270f f298b;

    public C0088n(String str, C4270f c4270f) {
        this.f297a = str;
        this.f298b = c4270f;
    }

    /* renamed from: b */
    private File m383b() {
        return this.f298b.m17795e(this.f297a);
    }

    /* renamed from: a */
    public boolean m384a() {
        try {
            return m383b().createNewFile();
        } catch (IOException e10) {
            C7503f.m28716f().m28720e("Error creating marker: " + this.f297a, e10);
            return false;
        }
    }

    /* renamed from: c */
    public boolean m385c() {
        return m383b().exists();
    }

    /* renamed from: d */
    public boolean m386d() {
        return m383b().delete();
    }
}
