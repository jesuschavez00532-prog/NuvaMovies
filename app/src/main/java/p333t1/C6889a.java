package p333t1;

import com.bumptech.glide.load.data.InterfaceC1605e;
import java.nio.ByteBuffer;

/* renamed from: t1.a */
/* loaded from: classes.dex */
public class C6889a implements InterfaceC1605e {

    /* renamed from: a */
    private final ByteBuffer f26199a;

    /* renamed from: t1.a$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC1605e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC1605e.a
        /* renamed from: a */
        public Class mo7415a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1605e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC1605e mo7416b(ByteBuffer byteBuffer) {
            return new C6889a(byteBuffer);
        }
    }

    public C6889a(ByteBuffer byteBuffer) {
        this.f26199a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1605e
    /* renamed from: b */
    public void mo7413b() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1605e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo7412a() {
        this.f26199a.position(0);
        return this.f26199a;
    }
}
