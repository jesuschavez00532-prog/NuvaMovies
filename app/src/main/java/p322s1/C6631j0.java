package p322s1;

import android.graphics.Bitmap;
import p109e2.AbstractC4122l;
import p184j1.C4977h;
import p184j1.InterfaceC4979j;
import p216l1.InterfaceC5335v;

/* renamed from: s1.j0 */
/* loaded from: classes.dex */
public final class C6631j0 implements InterfaceC4979j {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1.j0$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC5335v {

        /* renamed from: a */
        private final Bitmap f25449a;

        a(Bitmap bitmap) {
            this.f25449a = bitmap;
        }

        @Override // p216l1.InterfaceC5335v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f25449a;
        }

        @Override // p216l1.InterfaceC5335v
        /* renamed from: b */
        public void mo21576b() {
        }

        @Override // p216l1.InterfaceC5335v
        /* renamed from: c */
        public Class mo21577c() {
            return Bitmap.class;
        }

        @Override // p216l1.InterfaceC5335v
        public int getSize() {
            return AbstractC4122l.m17236i(this.f25449a);
        }
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5335v mo20329a(Bitmap bitmap, int i10, int i11, C4977h c4977h) {
        return new a(bitmap);
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo20330b(Bitmap bitmap, C4977h c4977h) {
        return true;
    }
}
