package p174i6;

/* renamed from: i6.a */
/* loaded from: classes.dex */
public class C4897a implements InterfaceC4900d {

    /* renamed from: a */
    private final int f20405a;

    /* renamed from: b */
    private final InterfaceC4900d[] f20406b;

    /* renamed from: c */
    private final C4898b f20407c;

    public C4897a(int i10, InterfaceC4900d... interfaceC4900dArr) {
        this.f20405a = i10;
        this.f20406b = interfaceC4900dArr;
        this.f20407c = new C4898b(i10);
    }

    @Override // p174i6.InterfaceC4900d
    /* renamed from: a */
    public StackTraceElement[] mo20099a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f20405a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (InterfaceC4900d interfaceC4900d : this.f20406b) {
            if (stackTraceElementArr2.length <= this.f20405a) {
                break;
            }
            stackTraceElementArr2 = interfaceC4900d.mo20099a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f20405a) {
            return this.f20407c.mo20099a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
