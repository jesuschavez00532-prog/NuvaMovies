package p126f4;

import android.net.Uri;
import java.util.Map;

/* renamed from: f4.b */
/* loaded from: classes.dex */
final class C4226b extends Thread {

    /* renamed from: a */
    final /* synthetic */ Map f18521a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4226b(C4225a c4225a, Map map) {
        this.f18521a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f18521a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        AbstractC4228d.m17689a(buildUpon.build().toString());
    }
}
