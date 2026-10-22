package androidx.activity.result;

import androidx.activity.result.AbstractC0289d;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.InterfaceC0750d;
import androidx.lifecycle.InterfaceC0752f;
import p090d.AbstractC3914a;

/* loaded from: classes.dex */
class ActivityResultRegistry$1 implements InterfaceC0750d {

    /* renamed from: a */
    final /* synthetic */ String f856a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC0287b f857b;

    /* renamed from: c */
    final /* synthetic */ AbstractC3914a f858c;

    /* renamed from: d */
    final /* synthetic */ AbstractC0289d f859d;

    @Override // androidx.lifecycle.InterfaceC0750d
    public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
        if (AbstractC0749c.b.ON_START.equals(bVar)) {
            this.f859d.f867f.put(this.f856a, new AbstractC0289d.b(this.f857b, this.f858c));
            if (this.f859d.f868g.containsKey(this.f856a)) {
                Object obj = this.f859d.f868g.get(this.f856a);
                this.f859d.f868g.remove(this.f856a);
                this.f857b.mo971a(obj);
            }
            C0286a c0286a = (C0286a) this.f859d.f869h.getParcelable(this.f856a);
            if (c0286a != null) {
                this.f859d.f869h.remove(this.f856a);
                this.f857b.mo971a(this.f858c.mo3563c(c0286a.m968b(), c0286a.m967a()));
                return;
            }
            return;
        }
        if (AbstractC0749c.b.ON_STOP.equals(bVar)) {
            this.f859d.f867f.remove(this.f856a);
        } else if (AbstractC0749c.b.ON_DESTROY.equals(bVar)) {
            this.f859d.m984k(this.f856a);
        }
    }
}
