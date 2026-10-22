package com.open.leanback.widget;

import android.view.View;
import com.open.leanback.widget.AbstractC3053d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.open.leanback.widget.c */
/* loaded from: classes2.dex */
public class C3052c {

    /* renamed from: a */
    private int f12525a = 0;

    /* renamed from: b */
    public final a f12526b;

    /* renamed from: c */
    public final a f12527c;

    /* renamed from: d */
    private a f12528d;

    /* renamed from: e */
    private a f12529e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.open.leanback.widget.c$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC3053d.a {

        /* renamed from: g */
        private int f12530g;

        a(int i10) {
            this.f12530g = i10;
        }

        /* renamed from: i */
        public int m12561i(View view) {
            return AbstractC3054e.m12570a(view, this, this.f12530g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3052c() {
        a aVar = new a(1);
        this.f12526b = aVar;
        a aVar2 = new a(0);
        this.f12527c = aVar2;
        this.f12528d = aVar2;
        this.f12529e = aVar;
    }

    /* renamed from: a */
    public final a m12559a() {
        return this.f12528d;
    }

    /* renamed from: b */
    public final void m12560b(int i10) {
        this.f12525a = i10;
        if (i10 == 0) {
            this.f12528d = this.f12527c;
            this.f12529e = this.f12526b;
        } else {
            this.f12528d = this.f12526b;
            this.f12529e = this.f12527c;
        }
    }
}
