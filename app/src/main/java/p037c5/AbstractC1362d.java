package p037c5;

import com.google.android.gms.common.api.Scope;
import p187j4.C4987a;

/* renamed from: c5.d */
/* loaded from: classes.dex */
public abstract class AbstractC1362d {

    /* renamed from: a */
    public static final C4987a.g f5100a;

    /* renamed from: b */
    public static final C4987a.g f5101b;

    /* renamed from: c */
    public static final C4987a.a f5102c;

    /* renamed from: d */
    static final C4987a.a f5103d;

    /* renamed from: e */
    public static final Scope f5104e;

    /* renamed from: f */
    public static final Scope f5105f;

    /* renamed from: g */
    public static final C4987a f5106g;

    /* renamed from: h */
    public static final C4987a f5107h;

    static {
        C4987a.g gVar = new C4987a.g();
        f5100a = gVar;
        C4987a.g gVar2 = new C4987a.g();
        f5101b = gVar2;
        C1360b c1360b = new C1360b();
        f5102c = c1360b;
        C1361c c1361c = new C1361c();
        f5103d = c1361c;
        f5104e = new Scope("profile");
        f5105f = new Scope("email");
        f5106g = new C4987a("SignIn.API", c1360b, gVar);
        f5107h = new C4987a("SignIn.INTERNAL_API", c1361c, gVar2);
    }
}
