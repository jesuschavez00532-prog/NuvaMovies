package p330s9;

import android.content.Context;
import com.mobile.autoupdate.R$string;
import p264o9.C5942a;
import p315r9.InterfaceC6565c;
import p370v9.AbstractC7250a;

/* renamed from: s9.c */
/* loaded from: classes2.dex */
class C6775c implements InterfaceC6565c {

    /* renamed from: a */
    private final Context f26070a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C6775c(Context context) {
        this.f26070a = context.getApplicationContext();
    }

    @Override // p315r9.InterfaceC6565c
    /* renamed from: U */
    public void mo11835U() {
        Context context = this.f26070a;
        AbstractC7250a.m28063a(context, context.getString(R$string.normal_upgrade_downloading), 0);
    }

    @Override // p315r9.InterfaceC6565c
    /* renamed from: f1 */
    public void mo11842f1(long j10, long j11) {
    }

    @Override // p315r9.InterfaceC6565c
    public void onSuccess() {
        C5942a.m24064e().m24071l(this);
    }

    @Override // p315r9.InterfaceC6565c
    /* renamed from: u0 */
    public void mo11850u0(Exception exc) {
        C5942a.m24064e().m24071l(this);
    }
}
