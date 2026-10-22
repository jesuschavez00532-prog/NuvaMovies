package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p282p5.AbstractC6219f;
import p282p5.C6217d;

/* renamed from: com.google.android.material.internal.e */
/* loaded from: classes.dex */
public class C2587e {

    /* renamed from: c */
    private float f9813c;

    /* renamed from: f */
    private C6217d f9816f;

    /* renamed from: a */
    private final TextPaint f9811a = new TextPaint(1);

    /* renamed from: b */
    private final AbstractC6219f f9812b = new a();

    /* renamed from: d */
    private boolean f9814d = true;

    /* renamed from: e */
    private WeakReference f9815e = new WeakReference(null);

    /* renamed from: com.google.android.material.internal.e$a */
    /* loaded from: classes.dex */
    class a extends AbstractC6219f {
        a() {
        }

        @Override // p282p5.AbstractC6219f
        /* renamed from: a */
        public void mo10295a(int i10) {
            C2587e.this.f9814d = true;
            b bVar = (b) C2587e.this.f9815e.get();
            if (bVar != null) {
                bVar.mo10397a();
            }
        }

        @Override // p282p5.AbstractC6219f
        /* renamed from: b */
        public void mo10296b(Typeface typeface, boolean z10) {
            if (!z10) {
                C2587e.this.f9814d = true;
                b bVar = (b) C2587e.this.f9815e.get();
                if (bVar != null) {
                    bVar.mo10397a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.e$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo10397a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C2587e(b bVar) {
        m10646g(bVar);
    }

    /* renamed from: c */
    private float m10642c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f9811a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C6217d m10643d() {
        return this.f9816f;
    }

    /* renamed from: e */
    public TextPaint m10644e() {
        return this.f9811a;
    }

    /* renamed from: f */
    public float m10645f(String str) {
        if (!this.f9814d) {
            return this.f9813c;
        }
        float m10642c = m10642c(str);
        this.f9813c = m10642c;
        this.f9814d = false;
        return m10642c;
    }

    /* renamed from: g */
    public void m10646g(b bVar) {
        this.f9815e = new WeakReference(bVar);
    }

    /* renamed from: h */
    public void m10647h(C6217d c6217d, Context context) {
        if (this.f9816f != c6217d) {
            this.f9816f = c6217d;
            if (c6217d != null) {
                c6217d.m24806j(context, this.f9811a, this.f9812b);
                b bVar = (b) this.f9815e.get();
                if (bVar != null) {
                    this.f9811a.drawableState = bVar.getState();
                }
                c6217d.m24805i(context, this.f9811a, this.f9812b);
                this.f9814d = true;
            }
            b bVar2 = (b) this.f9815e.get();
            if (bVar2 != null) {
                bVar2.mo10397a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void m10648i(boolean z10) {
        this.f9814d = z10;
    }

    /* renamed from: j */
    public void m10649j(Context context) {
        this.f9816f.m24805i(context, this.f9811a, this.f9812b);
    }
}
