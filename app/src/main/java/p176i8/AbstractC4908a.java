package p176i8;

import af.InterfaceC0238d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.live.view.MonitorKeyView;
import com.request.result.ChildColumn;
import com.umeng.analytics.pro.C3384f;
import ne.AbstractC5868k;
import p040c8.C1407f;
import p040c8.C1427v;
import p201k2.AbstractC5085b;
import p217l2.InterfaceC5340a;
import p217l2.InterfaceC5341b;
import p313r7.C6557c;
import p371vb.C7252a;

/* renamed from: i8.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4908a {

    /* renamed from: i8.a$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC5340a {
        a() {
        }

        @Override // p217l2.InterfaceC5340a
        /* renamed from: a */
        public InterfaceC0238d mo20169a() {
            return new C6557c();
        }
    }

    /* renamed from: i8.a$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC5341b {
        b() {
        }

        @Override // p217l2.InterfaceC5341b
        /* renamed from: a */
        public void mo20170a() {
            C1427v.f5519a.m6619D();
        }

        @Override // p217l2.InterfaceC5341b
        /* renamed from: b */
        public void mo20171b(Context context) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            C7252a c7252a = C7252a.f27087a;
            c7252a.m28075j(AbstractC5085b.m20606p(context, c7252a.m28071f()));
            C1427v.f5519a.m6632R(context, c7252a.m28066a());
        }

        @Override // p217l2.InterfaceC5341b
        /* renamed from: c */
        public View mo20172c(Context context, AttributeSet attributeSet) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(attributeSet, "attrs");
            return new MonitorKeyView(context, attributeSet);
        }

        @Override // p217l2.InterfaceC5341b
        /* renamed from: d */
        public void mo20173d(ChildColumn childColumn, int i10) {
            AbstractC5868k.m23674f(childColumn, "column");
            C1407f c1407f = C1407f.f5458a;
            c1407f.m6491P(childColumn);
            c1407f.m6492Q(i10);
        }

        @Override // p217l2.InterfaceC5341b
        /* renamed from: e */
        public void mo20174e() {
            C1407f.f5458a.m6487I();
        }

        @Override // p217l2.InterfaceC5341b
        /* renamed from: f */
        public void mo20175f(ChildColumn childColumn, int i10) {
            AbstractC5868k.m23674f(childColumn, "column");
            C1407f c1407f = C1407f.f5458a;
            c1407f.m6494S(childColumn);
            c1407f.m6495T(i10);
        }
    }

    /* renamed from: a */
    public static final InterfaceC5340a m20167a() {
        return new a();
    }

    /* renamed from: b */
    public static final InterfaceC5341b m20168b() {
        return new b();
    }
}
