package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.InterfaceC0750d;
import androidx.lifecycle.InterfaceC0752f;
import java.util.Map;

/* loaded from: classes.dex */
class FragmentManager$6 implements InterfaceC0750d {

    /* renamed from: a */
    final /* synthetic */ String f2700a;

    /* renamed from: b */
    final /* synthetic */ AbstractC0749c f2701b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0729o f2702c;

    @Override // androidx.lifecycle.InterfaceC0750d
    public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
        Map map;
        Map map2;
        if (bVar == AbstractC0749c.b.ON_START) {
            map2 = this.f2702c.f2915j;
            if (((Bundle) map2.get(this.f2700a)) != null) {
                throw null;
            }
        }
        if (bVar == AbstractC0749c.b.ON_DESTROY) {
            this.f2701b.mo3705c(this);
            map = this.f2702c.f2916k;
            map.remove(this.f2700a);
        }
    }
}
