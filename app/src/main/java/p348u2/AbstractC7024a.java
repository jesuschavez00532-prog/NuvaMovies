package p348u2;

import android.view.View;
import android.widget.RelativeLayout;
import ne.AbstractC5868k;
import p244n2.C5735b;

/* renamed from: u2.a */
/* loaded from: classes.dex */
public abstract class AbstractC7024a {
    /* renamed from: a */
    public static final void m27108a(RelativeLayout.LayoutParams layoutParams, View view) {
        AbstractC5868k.m23674f(layoutParams, "<this>");
        AbstractC5868k.m23674f(view, "view");
        int id2 = view.getId();
        if (id2 != -1) {
            layoutParams.addRule(3, id2);
            return;
        }
        throw new C5735b("Id is not set for " + view);
    }
}
