package p172i4;

import java.lang.ref.WeakReference;

/* renamed from: i4.e0 */
/* loaded from: classes.dex */
abstract class AbstractBinderC4861e0 extends AbstractBinderC4857c0 {

    /* renamed from: c */
    private static final WeakReference f20348c = new WeakReference(null);

    /* renamed from: b */
    private WeakReference f20349b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractBinderC4861e0(byte[] bArr) {
        super(bArr);
        this.f20349b = f20348c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p172i4.AbstractBinderC4857c0
    /* renamed from: N */
    public final byte[] mo20024N() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f20349b.get();
            if (bArr == null) {
                bArr = mo20015O();
                this.f20349b = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: O */
    protected abstract byte[] mo20015O();
}
