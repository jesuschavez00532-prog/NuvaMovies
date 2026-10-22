package p433zd;

import android.view.View;
import com.zhy.autolayout.C3913a;
import p419yd.C7706a;

/* renamed from: zd.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7786b {
    /* renamed from: a */
    public static void m30157a(View view) {
        m30161e(view);
        m30160d(view);
        m30159c(view);
        m30162f(view, 3);
    }

    /* renamed from: b */
    public static void m30158b(View view, int i10, int i11) {
        C3913a m16742c = C3913a.m16742c(view, i10, i11);
        if (m16742c != null) {
            m16742c.m16744b(view);
        }
    }

    /* renamed from: c */
    public static void m30159c(View view) {
        m30158b(view, 16, 3);
    }

    /* renamed from: d */
    public static void m30160d(View view) {
        m30158b(view, 8, 3);
    }

    /* renamed from: e */
    public static void m30161e(View view) {
        m30158b(view, 3, 3);
    }

    /* renamed from: f */
    public static void m30162f(View view, int i10) {
        m30158b(view, 4, i10);
    }

    /* renamed from: g */
    public static int m30163g(int i10) {
        return (int) (((i10 * 1.0f) / C7706a.m29774d().m29777b()) * C7706a.m29774d().m29779f());
    }

    /* renamed from: h */
    public static int m30164h(int i10) {
        int m29779f = C7706a.m29774d().m29779f();
        int m29777b = C7706a.m29774d().m29777b();
        int i11 = i10 * m29779f;
        if (i11 % m29777b == 0) {
            return i11 / m29777b;
        }
        return (i11 / m29777b) + 1;
    }

    /* renamed from: i */
    public static float m30165i() {
        return (C7706a.m29774d().m29780g() * 1.0f) / C7706a.m29774d().m29778c();
    }

    /* renamed from: j */
    public static int m30166j(int i10) {
        return (int) (((i10 * 1.0f) / C7706a.m29774d().m29778c()) * C7706a.m29774d().m29780g());
    }

    /* renamed from: k */
    public static int m30167k(int i10) {
        int m29780g = C7706a.m29774d().m29780g();
        int m29778c = C7706a.m29774d().m29778c();
        int i11 = i10 * m29780g;
        if (i11 % m29778c == 0) {
            return i11 / m29778c;
        }
        return (i11 / m29778c) + 1;
    }
}
