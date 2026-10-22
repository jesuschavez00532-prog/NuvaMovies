package sc;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import ne.AbstractC5868k;
import p302qc.C6447b;
import p359ue.AbstractC7167u;
import tc.InterfaceC6931a;

/* renamed from: sc.d */
/* loaded from: classes.dex */
public final class C6786d implements InterfaceC6931a {
    /* renamed from: b */
    private final Object m26767b(Object obj, String str) {
        boolean m26772e;
        Object m26774g;
        boolean m27762u;
        Class m26771d;
        String str2;
        Class m26771d2;
        if (obj == null || str == null) {
            return null;
        }
        String name = obj.getClass().getName();
        AbstractC5868k.m23673e(name, "value.javaClass.name");
        m26772e = AbstractC6787e.m26772e(name, str);
        if (m26772e) {
            return obj;
        }
        if (AbstractC5868k.m23669a(obj.getClass().getName(), "java.lang.String") || AbstractC5868k.m23669a(obj.getClass().getName(), "kotlin.String")) {
            try {
                m26774g = AbstractC6787e.m26774g(str, obj.toString());
                return m26774g;
            } catch (NumberFormatException unused) {
            }
        }
        if (!(obj instanceof Serializable) && !(obj instanceof Parcelable)) {
            String name2 = obj.getClass().getName();
            AbstractC5868k.m23673e(name2, "value.javaClass.name");
            boolean z10 = false;
            m27762u = AbstractC7167u.m27762u(name2, '$', false, 2, null);
            if (m27762u) {
                m26771d = AbstractC6787e.m26771d(str);
                if (m26771d != null) {
                    str2 = m26771d.getName();
                } else {
                    str2 = null;
                }
                if (!AbstractC5868k.m23669a(str2, obj.getClass().getName())) {
                    m26771d2 = AbstractC6787e.m26771d(str);
                    if (m26771d2 != null && m26771d2.isAssignableFrom(obj.getClass())) {
                        z10 = true;
                    }
                    if (z10) {
                    }
                }
                return obj;
            }
            return null;
        }
        return obj;
    }

    @Override // tc.InterfaceC6931a
    /* renamed from: a */
    public Object mo26766a(String str, Object obj, C6447b c6447b) {
        Bundle extras;
        boolean z10 = false;
        if (c6447b != null && c6447b.m25232a() == 0) {
            z10 = true;
        }
        Object obj2 = null;
        if (!z10) {
            return null;
        }
        if (obj instanceof Activity) {
            Intent intent = ((Activity) obj).getIntent();
            if (intent != null && (extras = intent.getExtras()) != null) {
                obj2 = extras.get(c6447b.m25233b());
            }
            return m26767b(obj2, str);
        }
        if (obj instanceof Fragment) {
            Bundle arguments = ((Fragment) obj).getArguments();
            if (arguments != null) {
                obj2 = arguments.get(c6447b.m25233b());
            }
            return m26767b(obj2, str);
        }
        if (!(obj instanceof androidx.fragment.app.Fragment)) {
            return null;
        }
        Bundle m3090H6 = ((androidx.fragment.app.Fragment) obj).m3090H6();
        if (m3090H6 != null) {
            obj2 = m3090H6.get(c6447b.m25233b());
        }
        return m26767b(obj2, str);
    }
}
