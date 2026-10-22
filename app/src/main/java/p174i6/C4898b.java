package p174i6;

/* renamed from: i6.b */
/* loaded from: classes.dex */
public class C4898b implements InterfaceC4900d {

    /* renamed from: a */
    private final int f20408a;

    public C4898b(int i10) {
        this.f20408a = i10;
    }

    @Override // p174i6.InterfaceC4900d
    /* renamed from: a */
    public StackTraceElement[] mo20099a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f20408a;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i12);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i11, stackTraceElementArr2, i12, i11);
        return stackTraceElementArr2;
    }
}
