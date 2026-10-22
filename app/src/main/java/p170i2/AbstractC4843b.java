package p170i2;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import ne.AbstractC5864g;
import org.android.agoo.message.MessageService;
import p201k2.C5096m;

/* renamed from: i2.b */
/* loaded from: classes.dex */
public abstract class AbstractC4843b {

    /* renamed from: a */
    public static final a f20332a = new a(null);

    /* renamed from: i2.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: A */
    public boolean m19924A() {
        return true;
    }

    /* renamed from: B */
    public abstract boolean mo19925B();

    /* renamed from: C */
    public boolean m19926C() {
        return mo19944U();
    }

    /* renamed from: D */
    public boolean m19927D() {
        return true;
    }

    /* renamed from: E */
    public abstract boolean mo19928E();

    /* renamed from: F */
    public abstract boolean mo19929F();

    /* renamed from: G */
    public boolean m19930G() {
        return true;
    }

    /* renamed from: H */
    public boolean m19931H() {
        return true;
    }

    /* renamed from: I */
    public boolean m19932I() {
        return false;
    }

    /* renamed from: J */
    public boolean m19933J() {
        return false;
    }

    /* renamed from: K */
    public abstract boolean mo19934K();

    /* renamed from: L */
    public boolean m19935L(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: M */
    public abstract boolean mo19936M();

    /* renamed from: N */
    public abstract boolean mo19937N();

    /* renamed from: O */
    public boolean m19938O() {
        return false;
    }

    /* renamed from: P */
    public abstract boolean mo19939P();

    /* renamed from: Q */
    public abstract boolean mo19940Q();

    /* renamed from: R */
    public boolean m19941R() {
        return false;
    }

    /* renamed from: S */
    public boolean m19942S() {
        return false;
    }

    /* renamed from: T */
    public abstract boolean mo19943T();

    /* renamed from: U */
    public abstract boolean mo19944U();

    /* renamed from: V */
    public boolean m19945V() {
        return false;
    }

    /* renamed from: W */
    public abstract boolean mo19946W();

    /* renamed from: X */
    public boolean m19947X() {
        return false;
    }

    /* renamed from: Y */
    public boolean m19948Y() {
        return false;
    }

    /* renamed from: Z */
    public abstract String mo19949Z(String str);

    /* renamed from: a */
    public String m19950a(String str) {
        if (str == null) {
            if (C5096m.f20979a.m20692c()) {
                return "1";
            }
            return MessageService.MSG_DB_READY_REPORT;
        }
        return str;
    }

    /* renamed from: a0 */
    public int m19951a0(int i10, int i11) {
        return i11 - i10;
    }

    /* renamed from: b */
    public String m19952b(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: b0 */
    public boolean m19953b0() {
        return false;
    }

    /* renamed from: c */
    public abstract String mo19954c();

    /* renamed from: d */
    public abstract String mo19955d();

    /* renamed from: e */
    public abstract List mo19956e();

    /* renamed from: f */
    public abstract String mo19957f();

    /* renamed from: g */
    public abstract String mo19958g();

    /* renamed from: h */
    public abstract String mo19959h();

    /* renamed from: i */
    public abstract String mo19960i(Context context);

    /* renamed from: j */
    public abstract String mo19961j();

    /* renamed from: k */
    public abstract String mo19962k();

    /* renamed from: l */
    public abstract String mo19963l();

    /* renamed from: m */
    public abstract String mo19964m();

    /* renamed from: n */
    public abstract int mo19965n();

    /* renamed from: o */
    public abstract String mo19966o();

    /* renamed from: p */
    public abstract String mo19967p();

    /* renamed from: q */
    public abstract boolean mo19968q();

    /* renamed from: r */
    public boolean m19969r() {
        return false;
    }

    /* renamed from: s */
    public abstract boolean mo19970s();

    /* renamed from: t */
    public abstract boolean mo19971t();

    /* renamed from: u */
    public abstract boolean mo19972u(String str);

    /* renamed from: v */
    public abstract boolean mo19973v();

    /* renamed from: w */
    public abstract boolean mo19974w();

    /* renamed from: x */
    public abstract boolean mo19975x();

    /* renamed from: y */
    public boolean m19976y() {
        return false;
    }

    /* renamed from: z */
    public abstract boolean mo19977z();
}
