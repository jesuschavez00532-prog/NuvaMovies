package p251n9;

import android.view.KeyEvent;
import ba.AbstractC1196d;
import be.C1328x;
import ca.InterfaceC1439a;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;

/* renamed from: n9.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5774c<P extends InterfaceC1439a> extends AbstractC1196d<P> {

    /* renamed from: A0 */
    public Map f23131A0 = new LinkedHashMap();

    /* renamed from: y0 */
    private InterfaceC5642a f23132y0;

    /* renamed from: z0 */
    private InterfaceC5642a f23133z0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G9 */
    public final InterfaceC5642a m23274G9() {
        return this.f23132y0;
    }

    /* renamed from: H9 */
    protected abstract boolean mo23232H9();

    /* renamed from: I9 */
    public boolean mo23265I9() {
        return false;
    }

    /* renamed from: J9 */
    public boolean mo23244J9() {
        return false;
    }

    /* renamed from: K9 */
    public boolean mo23275K9() {
        return false;
    }

    /* renamed from: L9 */
    public boolean mo23233L9() {
        return false;
    }

    /* renamed from: M9 */
    public boolean mo23276M9() {
        return false;
    }

    /* renamed from: N9 */
    public void mo23277N9() {
    }

    /* renamed from: O9 */
    public void mo23245O9() {
    }

    /* renamed from: P9 */
    public final void m23278P9(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "listener");
        this.f23132y0 = interfaceC5642a;
    }

    /* renamed from: Q9 */
    public final void m23279Q9(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "listener");
        this.f23133z0 = interfaceC5642a;
    }

    /* renamed from: R9 */
    public void mo23280R9(int i10, boolean z10) {
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23131A0.clear();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        C1328x c1328x = null;
        if (i10 != 19) {
            if (i10 == 21 && mo23232H9()) {
                InterfaceC5642a interfaceC5642a = this.f23132y0;
                if (interfaceC5642a != null) {
                    interfaceC5642a.invoke();
                    c1328x = C1328x.f4998a;
                }
                if (c1328x != null) {
                    return true;
                }
                return false;
            }
        } else if (mo23265I9()) {
            InterfaceC5642a interfaceC5642a2 = this.f23133z0;
            if (interfaceC5642a2 != null) {
                interfaceC5642a2.invoke();
                c1328x = C1328x.f4998a;
            }
            if (c1328x != null) {
                return true;
            }
            return false;
        }
        return false;
    }
}
