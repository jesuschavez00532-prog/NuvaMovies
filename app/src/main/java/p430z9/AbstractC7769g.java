package p430z9;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ca.InterfaceC1439a;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;

/* renamed from: z9.g */
/* loaded from: classes2.dex */
public abstract class AbstractC7769g<P extends InterfaceC1439a> extends AbstractC7768f<P> {

    /* renamed from: A0 */
    private boolean f28633A0;

    /* renamed from: B0 */
    private boolean f28634B0;

    /* renamed from: C0 */
    public Map f28635C0 = new LinkedHashMap();

    /* renamed from: K9 */
    private final void m30068K9() {
        mo27301M9();
    }

    /* renamed from: L9 */
    private final void m30069L9() {
        if (this.f28633A0) {
            mo27300J9();
        } else {
            mo5463q9();
            this.f28633A0 = true;
        }
    }

    /* renamed from: I9 */
    public final boolean m30070I9() {
        if (this.f28633A0 && this.f28634B0) {
            return true;
        }
        return false;
    }

    /* renamed from: J9 */
    public void mo27300J9() {
    }

    /* renamed from: M9 */
    public void mo27301M9() {
    }

    @Override // p430z9.AbstractC7768f, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        ViewParent viewParent;
        super.mo3123S7();
        View m5479z9 = m5479z9();
        if (m5479z9 != null) {
            viewParent = m5479z9.getParent();
        } else {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            viewGroup.removeView(m5479z9());
        }
        m5475F9(null);
        m30055u9(false);
        m30054t9(true);
        this.f28633A0 = false;
        this.f28634B0 = false;
        mo5459m9();
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: b8 */
    public void mo3149b8() {
        super.mo3149b8();
        this.f28634B0 = false;
        m30068K9();
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        super.mo3164g8();
        this.f28634B0 = true;
        m30069L9();
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        mo5460n9();
        mo5476o9();
    }

    @Override // p430z9.AbstractC7768f, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f28635C0.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    public void mo5463q9() {
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: r9 */
    protected void mo30052r9() {
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: s9 */
    protected void mo30053s9() {
    }
}
