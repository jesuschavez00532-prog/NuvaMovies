package p430z9;

import android.content.Context;
import android.os.Bundle;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import java.util.LinkedHashMap;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5642a;
import ne.AbstractC5869l;
import p164hd.AbstractActivityC4816a;

/* renamed from: z9.a */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC7763a extends AbstractActivityC4816a {

    /* renamed from: t */
    private final InterfaceC1312h f28617t;

    /* renamed from: u */
    public Map f28618u = new LinkedHashMap();

    /* renamed from: z9.a$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractActivityC7763a invoke() {
            return AbstractActivityC7763a.this;
        }
    }

    public AbstractActivityC7763a() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f28617t = m5965b;
    }

    /* renamed from: S4 */
    public final Context m30049S4() {
        return (Context) this.f28617t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, androidx.activity.ComponentActivity, androidx.core.app.AbstractActivityC0511i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5634i.m22852n(this);
    }
}
