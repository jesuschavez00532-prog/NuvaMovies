package p430z9;

import android.os.Bundle;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p164hd.AbstractC4817b;

/* renamed from: z9.c */
/* loaded from: classes2.dex */
public abstract class AbstractC7765c extends AbstractC4817b {

    /* renamed from: p0 */
    private boolean f28621p0;

    /* renamed from: r0 */
    public Map f28623r0 = new LinkedHashMap();

    /* renamed from: q0 */
    private boolean f28622q0 = true;

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        super.mo3123S7();
        this.f28621p0 = false;
        mo5459m9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g9 */
    public void mo3165g9(boolean z10) {
        super.mo3165g9(z10);
        if (m3180m7()) {
            mo30053s9();
        } else {
            mo30052r9();
        }
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        this.f28621p0 = true;
        mo30053s9();
    }

    /* renamed from: m9 */
    public void mo5459m9() {
        this.f28623r0.clear();
    }

    /* renamed from: n9 */
    public abstract void mo5460n9();

    /* renamed from: o9 */
    public abstract void mo5476o9();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p9 */
    public final boolean m30051p9() {
        return this.f28621p0;
    }

    /* renamed from: q9 */
    protected abstract void mo5463q9();

    /* renamed from: r9 */
    protected void mo30052r9() {
    }

    /* renamed from: s9 */
    protected void mo30053s9() {
        if (this.f28621p0 && m3180m7()) {
            if (this.f28622q0) {
                mo5460n9();
                mo5476o9();
                this.f28622q0 = false;
                return;
            }
            mo5463q9();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t9 */
    public final void m30054t9(boolean z10) {
        this.f28622q0 = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u9 */
    public final void m30055u9(boolean z10) {
        this.f28621p0 = z10;
    }
}
