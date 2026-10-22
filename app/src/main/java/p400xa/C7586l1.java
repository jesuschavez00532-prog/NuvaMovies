package p400xa;

import android.app.Activity;
import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.module.R$id;
import com.module.R$layout;
import com.umeng.analytics.pro.C3384f;
import ne.AbstractC5868k;
import p323s2.AbstractC6652a;

/* renamed from: xa.l1 */
/* loaded from: classes2.dex */
public final class C7586l1 {

    /* renamed from: b */
    private static long f27878b;

    /* renamed from: a */
    public static final C7586l1 f27877a = new C7586l1();

    /* renamed from: c */
    private static String f27879c = "";

    private C7586l1() {
    }

    /* renamed from: c */
    public static /* synthetic */ void m29110c(C7586l1 c7586l1, Context context, Spanned spanned, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 17;
        }
        c7586l1.m29113a(context, spanned, i10, i11);
    }

    /* renamed from: d */
    public static /* synthetic */ void m29111d(C7586l1 c7586l1, Context context, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 17;
        }
        c7586l1.m29114b(context, str, i10, i11);
    }

    /* renamed from: f */
    public static /* synthetic */ void m29112f(C7586l1 c7586l1, Context context, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 17;
        }
        c7586l1.m29115e(context, str, i10, i11);
    }

    /* renamed from: a */
    public final void m29113a(Context context, Spanned spanned, int i10, int i11) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(spanned, "text");
        View inflate = LayoutInflater.from(context).inflate(R$layout.layout_common_toast, (ViewGroup) null);
        View findViewById = inflate.findViewById(R$id.mTvContent);
        AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(spanned);
        Toast toast = new Toast(context);
        AbstractC6652a.m25971a(toast);
        toast.setView(inflate);
        toast.setGravity(i11, 0, 0);
        toast.setDuration(i10);
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            toast.show();
        }
    }

    /* renamed from: b */
    public final void m29114b(Context context, String str, int i10, int i11) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "text");
        View inflate = LayoutInflater.from(context).inflate(R$layout.layout_common_toast, (ViewGroup) null);
        View findViewById = inflate.findViewById(R$id.mTvContent);
        AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        Toast toast = new Toast(context);
        AbstractC6652a.m25971a(toast);
        toast.setView(inflate);
        toast.setGravity(i11, 0, 0);
        toast.setDuration(i10);
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            toast.show();
        }
    }

    /* renamed from: e */
    public final void m29115e(Context context, String str, int i10, int i11) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "text");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f27878b < 1000 && AbstractC5868k.m23669a(str, f27879c)) {
            return;
        }
        f27878b = currentTimeMillis;
        View inflate = LayoutInflater.from(context).inflate(R$layout.layout_seach_empty_dialog, (ViewGroup) null);
        View findViewById = inflate.findViewById(R$id.tv_error_msg);
        AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        Toast toast = new Toast(context);
        AbstractC6652a.m25971a(toast);
        toast.setView(inflate);
        toast.setGravity(i11, 0, 0);
        toast.setDuration(i10);
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            toast.show();
        }
        f27879c = str;
    }
}
