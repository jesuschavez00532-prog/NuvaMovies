package p219l4;

import android.util.Log;
import java.util.ArrayList;

/* renamed from: l4.u0 */
/* loaded from: classes.dex */
public abstract class AbstractC5409u0 {

    /* renamed from: a */
    private Object f22043a;

    /* renamed from: b */
    private boolean f22044b = false;

    /* renamed from: c */
    final /* synthetic */ AbstractC5358c f22045c;

    public AbstractC5409u0(AbstractC5358c abstractC5358c, Object obj) {
        this.f22045c = abstractC5358c;
        this.f22043a = obj;
    }

    /* renamed from: a */
    protected abstract void mo21759a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo21760b();

    /* renamed from: c */
    public final void m21816c() {
        Object obj;
        synchronized (this) {
            obj = this.f22043a;
            if (this.f22044b) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            mo21759a(obj);
        }
        synchronized (this) {
            this.f22044b = true;
        }
        m21818e();
    }

    /* renamed from: d */
    public final void m21817d() {
        synchronized (this) {
            this.f22043a = null;
        }
    }

    /* renamed from: e */
    public final void m21818e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m21817d();
        arrayList = this.f22045c.f21913r;
        synchronized (arrayList) {
            arrayList2 = this.f22045c.f21913r;
            arrayList2.remove(this);
        }
    }
}
