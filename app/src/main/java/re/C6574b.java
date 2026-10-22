package re;

import java.util.NoSuchElementException;
import p043ce.AbstractC1513y;

/* renamed from: re.b */
/* loaded from: classes3.dex */
public final class C6574b extends AbstractC1513y {

    /* renamed from: a */
    private final int f25195a;

    /* renamed from: b */
    private final int f25196b;

    /* renamed from: c */
    private boolean f25197c;

    /* renamed from: d */
    private int f25198d;

    public C6574b(int i10, int i11, int i12) {
        this.f25195a = i12;
        this.f25196b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f25197c = z10;
        this.f25198d = z10 ? i10 : i11;
    }

    @Override // p043ce.AbstractC1513y
    /* renamed from: b */
    public int mo7032b() {
        int i10 = this.f25198d;
        if (i10 == this.f25196b) {
            if (this.f25197c) {
                this.f25197c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f25198d = this.f25195a + i10;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f25197c;
    }
}
