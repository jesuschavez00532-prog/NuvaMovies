package p232m3;

import android.content.Context;
import com.umeng.ccg.C3417a;
import ne.AbstractC5868k;

/* renamed from: m3.b */
/* loaded from: classes.dex */
public abstract class AbstractC5586b {

    /* renamed from: a */
    private Context f22616a;

    /* renamed from: b */
    private InterfaceC5585a f22617b;

    /* renamed from: c */
    private InterfaceC5585a f22618c;

    public AbstractC5586b(Context context) {
        AbstractC5868k.m23674f(context, "mContext");
        this.f22616a = context;
    }

    /* renamed from: a */
    public final void m22682a() {
        InterfaceC5585a interfaceC5585a = this.f22618c;
        if (interfaceC5585a != null) {
            interfaceC5585a.mo22681a();
        }
    }

    /* renamed from: b */
    public final void m22683b() {
        InterfaceC5585a interfaceC5585a = this.f22617b;
        if (interfaceC5585a != null) {
            interfaceC5585a.mo22681a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final Context m22684c() {
        return this.f22616a;
    }

    /* renamed from: d */
    public abstract void mo22685d();

    /* renamed from: e */
    public final AbstractC5586b m22686e(InterfaceC5585a interfaceC5585a) {
        AbstractC5868k.m23674f(interfaceC5585a, C3417a.f15001w);
        this.f22618c = interfaceC5585a;
        return this;
    }

    /* renamed from: f */
    public final AbstractC5586b m22687f(InterfaceC5585a interfaceC5585a) {
        AbstractC5868k.m23674f(interfaceC5585a, C3417a.f15001w);
        this.f22617b = interfaceC5585a;
        return this;
    }

    /* renamed from: g */
    public abstract void mo22688g();
}
