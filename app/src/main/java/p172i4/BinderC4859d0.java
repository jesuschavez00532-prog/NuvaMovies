package p172i4;

import java.util.Arrays;

/* renamed from: i4.d0 */
/* loaded from: classes.dex */
final class BinderC4859d0 extends AbstractBinderC4857c0 {

    /* renamed from: b */
    private final byte[] f20347b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC4859d0(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f20347b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p172i4.AbstractBinderC4857c0
    /* renamed from: N */
    public final byte[] mo20024N() {
        return this.f20347b;
    }
}
