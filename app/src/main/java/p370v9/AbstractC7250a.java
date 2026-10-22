package p370v9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.mobile.autoupdate.R$id;
import com.mobile.autoupdate.R$layout;
import p323s2.AbstractC6652a;

/* renamed from: v9.a */
/* loaded from: classes2.dex */
public abstract class AbstractC7250a {
    /* renamed from: a */
    public static void m28063a(Context context, String str, int i10) {
        View inflate = LayoutInflater.from(context).inflate(R$layout.layout_upgrade_toast, (ViewGroup) null);
        ((TextView) inflate.findViewById(R$id.tv_upgrade_toast)).setText(str);
        Toast toast = new Toast(context);
        AbstractC6652a.m25971a(toast);
        toast.setView(inflate);
        toast.setDuration(i10);
        toast.setGravity(17, 0, 0);
        toast.show();
    }
}
