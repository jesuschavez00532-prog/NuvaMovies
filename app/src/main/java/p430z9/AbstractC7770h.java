package p430z9;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import be.C1328x;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p164hd.AbstractC4817b;

/* renamed from: z9.h */
/* loaded from: classes2.dex */
public abstract class AbstractC7770h extends AbstractC4817b {

    /* renamed from: p0 */
    private boolean f28636p0;

    /* renamed from: q0 */
    private View f28637q0;

    /* renamed from: s0 */
    public Map f28639s0 = new LinkedHashMap();

    /* renamed from: r0 */
    private boolean f28638r0 = true;

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        if (this.f28637q0 == null) {
            this.f28637q0 = layoutInflater.inflate(mo22272p9(), viewGroup, false);
            C1328x c1328x = C1328x.f4998a;
        }
        return this.f28637q0;
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        super.mo3123S7();
        if (this.f28638r0) {
            this.f28637q0 = null;
        }
        mo22348u9();
        this.f28636p0 = false;
        mo22268m9();
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: b8 */
    public void mo3149b8() {
        super.mo3149b8();
        mo27339r9();
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        super.mo3164g8();
        if (!this.f28636p0) {
            this.f28636p0 = true;
            mo22273q9();
        } else {
            mo27340s9();
        }
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        mo22270o9();
        mo22269n9();
    }

    /* renamed from: m9 */
    public void mo22268m9() {
        this.f28639s0.clear();
    }

    /* renamed from: n9 */
    public abstract void mo22269n9();

    /* renamed from: o9 */
    public abstract void mo22270o9();

    /* renamed from: p9 */
    public abstract int mo22272p9();

    /* renamed from: q9 */
    public abstract void mo22273q9();

    /* renamed from: r9 */
    public void mo27339r9() {
    }

    /* renamed from: s9 */
    public void mo27340s9() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t9 */
    public final void m30071t9(boolean z10) {
        this.f28638r0 = z10;
    }

    /* renamed from: u9 */
    public void mo22348u9() {
    }
}
