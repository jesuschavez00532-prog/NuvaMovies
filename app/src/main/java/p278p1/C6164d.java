package p278p1;

import android.util.Log;
import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1604d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p093d2.C3923b;
import p109e2.AbstractC4111a;
import p184j1.C4977h;
import p184j1.EnumC4970a;
import p278p1.InterfaceC6175o;

/* renamed from: p1.d */
/* loaded from: classes.dex */
public class C6164d implements InterfaceC6175o {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1.d$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC1604d {

        /* renamed from: a */
        private final File f24235a;

        a(File file) {
            this.f24235a = file;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: a */
        public Class mo7418a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: b */
        public void mo7423b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: d */
        public void mo7425d(EnumC1591h enumC1591h, InterfaceC1604d.a aVar) {
            try {
                aVar.mo7431e(AbstractC4111a.m17190a(this.f24235a));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.mo7430c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public EnumC4970a getDataSource() {
            return EnumC4970a.LOCAL;
        }
    }

    /* renamed from: p1.d$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC6176p {
        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6164d();
        }
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(File file, int i10, int i11, C4977h c4977h) {
        return new InterfaceC6175o.a(new C3923b(file), new a(file));
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(File file) {
        return true;
    }
}
