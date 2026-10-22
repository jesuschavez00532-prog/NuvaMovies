package p266ob;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ob.c */
/* loaded from: classes2.dex */
public final class C5959c extends LinkedHashMap {

    /* renamed from: a */
    private int f23666a;

    public C5959c() {
        this(256);
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.f23666a) {
            return true;
        }
        return false;
    }

    public C5959c(int i10) {
        super(i10, 1.0f, true);
        this.f23666a = i10;
    }
}
