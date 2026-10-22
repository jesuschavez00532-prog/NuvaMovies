package com.download.permission;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p232m3.AbstractC5586b;
import p232m3.C5588d;
import p232m3.C5590f;
import p400xa.C7619y;

/* loaded from: classes.dex */
public final class OverlayActivity extends Activity {

    /* renamed from: b */
    public static final C1658a f6980b = new C1658a(null);

    /* renamed from: c */
    private static AbstractC5586b f6981c;

    /* renamed from: a */
    public Map f6982a = new LinkedHashMap();

    /* renamed from: com.download.permission.OverlayActivity$a */
    /* loaded from: classes.dex */
    public static final class C1658a {

        /* renamed from: com.download.permission.OverlayActivity$a$a */
        /* loaded from: classes.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ int f6983a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i10) {
                super(1);
                this.f6983a = i10;
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "it");
                Intent putExtra = intent.putExtra("KEY_TYPE", this.f6983a);
                AbstractC5868k.m23673e(putExtra, "it.putExtra(KEY_TYPE,operation)");
                return putExtra;
            }
        }

        private C1658a() {
        }

        public /* synthetic */ C1658a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final void m7588a(AbstractC5586b abstractC5586b) {
            OverlayActivity.f6981c = abstractC5586b;
        }

        /* renamed from: b */
        public final void m7589b(Context context, int i10) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            C7619y.m29367d(C7619y.f28056a, context, OverlayActivity.class, null, new a(i10), 2, null);
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        AbstractC5586b abstractC5586b = f6981c;
        if (abstractC5586b != null) {
            abstractC5586b.mo22685d();
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("KEY_TYPE", -1);
        if (intExtra != 4) {
            if (intExtra == 5) {
                new C5588d(this).m22696f(5);
                return;
            }
            return;
        }
        new C5590f(this).m22701e(4);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        f6981c = null;
        super.onDestroy();
    }
}
