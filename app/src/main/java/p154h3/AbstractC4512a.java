package p154h3;

import android.view.KeyEvent;
import ba.AbstractC1196d;
import be.C1328x;
import ca.InterfaceC1439a;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;

/* renamed from: h3.a */
/* loaded from: classes.dex */
public abstract class AbstractC4512a<P extends InterfaceC1439a> extends AbstractC1196d<P> {

    /* renamed from: y0 */
    private InterfaceC5642a f19523y0;

    /* renamed from: z0 */
    public Map f19524z0 = new LinkedHashMap();

    /* renamed from: G9 */
    public final InterfaceC5642a m18877G9() {
        return this.f19523y0;
    }

    /* renamed from: H9 */
    protected abstract boolean mo18878H9();

    /* renamed from: I9 */
    public final void m18879I9(InterfaceC5642a interfaceC5642a) {
        this.f19523y0 = interfaceC5642a;
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
        this.f19524z0.clear();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        C1328x c1328x = null;
        if (i10 != 4) {
            if (i10 == 21 && mo18878H9()) {
                InterfaceC5642a interfaceC5642a = this.f19523y0;
                if (interfaceC5642a != null) {
                    interfaceC5642a.invoke();
                    c1328x = C1328x.f4998a;
                }
                if (c1328x != null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        InterfaceC5642a interfaceC5642a2 = this.f19523y0;
        if (interfaceC5642a2 != null) {
            interfaceC5642a2.invoke();
            c1328x = C1328x.f4998a;
        }
        if (c1328x != null) {
            return true;
        }
        return false;
    }
}
