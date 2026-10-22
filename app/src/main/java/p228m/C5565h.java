package p228m;

/* renamed from: m.h */
/* loaded from: classes.dex */
class C5565h implements InterfaceC5564g {

    /* renamed from: a */
    private final Object[] f22553a;

    /* renamed from: b */
    private int f22554b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5565h(int i10) {
        if (i10 > 0) {
            this.f22553a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p228m.InterfaceC5564g
    /* renamed from: a */
    public boolean mo22595a(Object obj) {
        int i10 = this.f22554b;
        Object[] objArr = this.f22553a;
        if (i10 < objArr.length) {
            objArr[i10] = obj;
            this.f22554b = i10 + 1;
            return true;
        }
        return false;
    }

    @Override // p228m.InterfaceC5564g
    /* renamed from: b */
    public Object mo22596b() {
        int i10 = this.f22554b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f22553a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f22554b = i10 - 1;
        return obj;
    }

    @Override // p228m.InterfaceC5564g
    /* renamed from: c */
    public void mo22597c(Object[] objArr, int i10) {
        if (i10 > objArr.length) {
            i10 = objArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            int i12 = this.f22554b;
            Object[] objArr2 = this.f22553a;
            if (i12 < objArr2.length) {
                objArr2[i12] = obj;
                this.f22554b = i12 + 1;
            }
        }
    }
}
