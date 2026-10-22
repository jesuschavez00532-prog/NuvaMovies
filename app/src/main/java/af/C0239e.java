package af;

import org.greenrobot.eventbus.ThreadMode;

/* renamed from: af.e */
/* loaded from: classes3.dex */
public class C0239e {

    /* renamed from: a */
    final String f754a;

    /* renamed from: b */
    final ThreadMode f755b;

    /* renamed from: c */
    final Class f756c;

    /* renamed from: d */
    final int f757d;

    /* renamed from: e */
    final boolean f758e;

    public C0239e(String str, Class cls, ThreadMode threadMode, int i10, boolean z10) {
        this.f754a = str;
        this.f755b = threadMode;
        this.f756c = cls;
        this.f757d = i10;
        this.f758e = z10;
    }

    public C0239e(String str, Class cls) {
        this(str, cls, ThreadMode.POSTING, 0, false);
    }

    public C0239e(String str, Class cls, ThreadMode threadMode) {
        this(str, cls, threadMode, 0, false);
    }
}
