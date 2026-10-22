package p153h2;

import android.util.Log;

/* renamed from: h2.c */
/* loaded from: classes.dex */
class C4510c implements InterfaceC4511d {
    /* renamed from: e */
    private String m18872e(String str, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            return String.format(str, objArr);
        }
        return str;
    }

    @Override // p153h2.InterfaceC4511d
    /* renamed from: a */
    public void mo18873a(String str, String str2, Object... objArr) {
        AbstractC4508a.m18866a(str2);
        Log.i(str, m18872e(str2, objArr));
    }

    @Override // p153h2.InterfaceC4511d
    /* renamed from: b */
    public void mo18874b(String str, Object obj) {
        Log.d(str, AbstractC4508a.m18867b(obj));
    }

    @Override // p153h2.InterfaceC4511d
    /* renamed from: c */
    public void mo18875c(String str, String str2, Object... objArr) {
        AbstractC4508a.m18866a(str2);
        Log.d(str, m18872e(str2, objArr));
    }

    @Override // p153h2.InterfaceC4511d
    /* renamed from: d */
    public void mo18876d(String str, String str2, Object... objArr) {
        AbstractC4508a.m18866a(str2);
        Log.e(str, m18872e(str2, objArr));
    }
}
